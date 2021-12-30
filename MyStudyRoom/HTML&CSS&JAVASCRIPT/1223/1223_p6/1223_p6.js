//* 자바스크립트 문법 5 이벤트 처리하기 3 연습과제 6
//로컬 스토리지 예제에서 다수의 이미지 파일을 업로드하고 로컬 스토리지에 저장하여 새로고침하더라도 업로드한 사진이 남아있도록 해보자!
//0) 사용자가 업로드한 이미지 데이터를 로컬 스토리지에 저장하기
//1) 로컬 스토리지에서 이미지 데이터를 읽어오기 (배열)
//2) 배열에 현재 사용자가 업로드한 파일 데이터를 추가하기 => 배열의 push 메서드 사용하기
//3) 로컬 스토리지에 변경한 배열을 저장하기 

const fileInput = document.getElementById('file-input')
const imgBox = document.getElementById('img-box')

function isValid(type){
    return type.split('/')[0] === 'image'
}

function displayImg(src){
    console.log(src.split(':')[0])
    const srcPrefix = src.split(':')[0]

    //Blob(Binary Large Object, 블랍)은 이미지, 사운드, 비디오와 같은 멀티미디어 데이터를 다룰 때 사용할 수 있습니다.
    //대개 데이터의 크기(Byte) 및 MIME 타입을 알아내거나, 데이터를 송수신을 위한 작은 Blob 객체로 나누는 등의 작업에 사용
    //const newBlob = new Blob(array, options);

    if(srcPrefix === 'blob' ){ //창에서 처음 파일을 올렸을 때 
        console.log(src)
        imgBox.innerHTML += `<div class='img-item'><img src='${src}'/></div>`
    }else{ //스토리지에 저장되어있는 데이터를 불렀을 때 (이미 떠있는 이미지들)
        imgBox.innerHTML += `<div class='img-item'><img src=${src}/></div>`
    }
    
}
function upload(file){
    const reader = new FileReader() // 사용자가 업로로드한 파일 데이터를 읽어오기 위한 파일 객체

    if(!isValid(file.type)){ //파일 타입이 이미지가 아니면 
        imgBox.innerHTML = 'File type is not valid !'
        return;
    }

    ////특정 파일 객체나 로컬 파일 또는 데이터의 참조를 가리키는 새로운 객체 URL을 생성한다.
    const src = URL.createObjectURL(file)
    displayImg(src) // 화면에 이미지를 보여주기
    

    reader.onload = rememberImg // 파일 읽기가 끝나면 rememberImg 를 실행함
    reader.readAsDataURL(file) // reader 객체가 파일을 읽어오기
}

function rememberImg(e){
    console.log(e.target.result) // reader 객체로 읽어온 데이터  (이미지 경로)
    const files = JSON.parse(localStorage.getItem('files')) || []
    if(files){
        const file = JSON.stringify(e.target.result)
        files.push(file)
    }
    localStorage.setItem('files', JSON.stringify(files))
}

function uploadImg(e){
    const files = e.target.files //업로드하는 여러 파일들
    for(let file of files){ //파일 하나씩 업로드하기 
        upload(file)
    }
}

// 화면이 처음 로딩될때 로컬스토리지에 저장된 이미지를 보여주기
function renderImg(){
    imgBox.innerHTML = ''
    const files = JSON.parse(localStorage.getItem('files')) || []
  
    if(files.length > 0){
        for(let file of files){
            displayImg(file)
        }
    }
}

fileInput.addEventListener('change', uploadImg)
window.addEventListener('load', renderImg)