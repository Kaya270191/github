const fileInput = document.getElementById('file-input')
const imgBox = document.getElementById('img-box')

function isValid(type){
    console.log(type.split('/')[0]) // '/' 기준으로 나눠서 배열에 저장. 배열의[0]번째
    return type.split('/')[0] === 'image'
}

function displayImg(e){
    console.log(e.target.files) // 사용자가 업로드한 파일 데이터로 접근 
    const file = e.target.files[0]

    //file.type: 'image/jpeg' 
    //이미지가 아닌 경우 아무것도 안하고 반환해줌 -> 데이터 유효성 검증
    if(!isValid(file.type)){
        imgBox.innerHTML = 'File is not valid'
        return;
    }


    const img = document.createElement('img') //img dom 객체생성 
    img.src = URL.createObjectURL(file) //이미지 경로를 생성해줌 
    imgBox.appendChild(img) //imgBox에 img 붙이기 
}

fileInput.addEventListener('change', displayImg)