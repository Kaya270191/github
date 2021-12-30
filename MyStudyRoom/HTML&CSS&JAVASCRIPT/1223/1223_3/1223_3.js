const imgBox = document.getElementById('img-box')

function isValid(type){
    return type.split('/')[0] === 'image'
}

//`<img src='${src}'/>` : src가 변수이기 때문에 ``이 변수값을 가지고 있도록 하게 함 
function displayImg(src){
    imgBox.innerHTML = `<img src='${src}'/>`
}

//JSON: JavaScript Object Notation의 약자로, 브라우저와 서버사이에서 오고가는 데이터의 형식이다.
//JSON.stringify() JSON 문자열로 변환할 값이다.(배열, 객체, 또는 숫자, 문자 등이 될 수 있다.)
function rememberImg(e){ //세션스토리지에 저장 
    console.log(e.target.result) // reader 객체로 읽어온 데이터  (이미지 경로)
    localStorage.setItem('file', JSON.stringify(e.target.result)) 
}

function uploadImg(e){
    const file = e.target.files[0]
    const reader = new FileReader() // 사용자가 업로로드한 파일 데이터를 읽어오기 위한 파일 객체

    if(!isValid(file.type)){
        imgBox.innerHTML = 'File type is not valid !'
        return;
    }

        //URL.createObjectURL
    //특정 파일 객체나 로컬 파일 또는 데이터의 참조를 가리키는 새로운 객체 URL을 생성한다.
    //생성한 값은 현재 창이나, 객체를 생성한 문서 내에서만 유효하다
    const src = URL.createObjectURL(file) //객체 생성 
    displayImg(src) // 화면에 생성한 객체 이미지를 보여주기

    reader.onload = rememberImg // 파일 읽기가 끝나면 rememberImg 를 실행함
    reader.readAsDataURL(file) // reader 객체가 파일을 읽어오기
}

// 화면이 처음 로딩될때 세션스토리지에 저장된 이미지를 보여주기
//JSON.parse () 메소드는 문자열을 JSON으로 구문 분석하여 선택적으로 생성 된 값을 변환합니다
function renderImg(){
    const fileStored = JSON.parse(localStorage.getItem('file'))
    if(fileStored){
        displayImg(fileStored)
    }
}

fileInput.addEventListener('change', uploadImg)
window.addEventListener('load', renderImg)