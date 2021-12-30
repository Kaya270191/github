//1. 타일을 클릭하면 랜덤으로 타일색상 변경하기

const container = document.getElementById('container')
const children = document.querySelectorAll('.child')

function randomColor(e){
    var r = Math.floor(Math.random()*256)
    var g = Math.floor(Math.random()*256)
    var b = Math.floor(Math.random()*256)
    console.log(e.target)
    //return `rgb(${r},${g},${b})`
    e.target.style.background = `rgb(${r},${g},${b})`
}
for(let child of children){
    child.addEventListener('click', randomColor) //마우스 클릭하면 색이 변하도록
}
 

//2. 마우스 클릭될때마다 마우스 포인트 위치에 똑같은 이미지가 추가

const body = document.querySelector('body')

function iconCircle(e){
    const circle = document.createElement('div')
    circle.className = 'circle'
    body.append(circle)

    console.log(e.clientX, e.clientY)
    const mouseX = e.clientX
    const mouseY = e.clientY
    circle.style.left = mouseX + 'px'
    circle.style.top = mouseY + 'px' 
}

window.addEventListener('click', iconCircle)


//3. setTimeout 메서드를 사용해서 사진이 1초 뒤에 나타났다가 3초 뒤에 사라지게 해보자!

const photoDisappear = document.createElement('div')
photoDisappear.className ="photoDisappear"
body.append(photoDisappear)

function showPhoto(){
    console.log('showPhoto')
    photoDisappear.classList.add('show') //css의 show 실행 
    setTimeout(hidePhoto, 3000) //3초뒤에 hidePhoto 실행 
    
}
function hidePhoto(){
    console.log('hidePhoto')
    photoDisappear.classList.remove('show') //css의 show 지우기 
}
setTimeout(showPhoto, 1000) //1초뒤에 showPhoto함수 실행 




//4. setInterval 메서드를 사용해서 화면에 1초마다 숫자가 카운팅되도록 해보자!
const num = document.createElement('div')
num.className ="num"
body.append(num)

function countNum(){
    console.log('countNum')
    const time = new Date()
    const seconds = time.getSeconds()

    num.innerText = seconds
}
setInterval(countNum,1000)


//5. setInterval 메서드를 사용해서 화면에 1초마다 문장의 단어 한글자씩 디스플레이되도록 해보자



// const textBox = document.querySelector(#textBox p)
// let index =0
// let timerID = null

// function displayCharacter(){
//     textBox.innerHTML += textBox.innerText[index]
//     index++
//     if(index >text.length -1){
//         clearInterval(timerID)
//     }
// }

// function startTextAnimation(){
//     setInterval(displayCharacter, 500);
// }

// window.addEventListener('load', startTextAnimation)

// function displayText(){
//     for(let i=0; i<text.innerText.length; i++){
//         console.log('displayText')
//         text.innerText[i].classList.add('showText')
//     }
// }

// let timerID=null
// function startText(){
//     timerID = setInterval(displayText, 1000)
// }

// //clearInterval(timerId)
// window.addEventListener('load', startText)


//11. 버튼을 누르면 왼쪽에서 사이드바 생김 , 3초뒤에 사라지게 
const openBtn = document.getElementById('open-btn')
const sidebar = document.querySelector('.sidebar')

let timerID = null

function hideSidebar(){
    sidebar.classList.remove('show1')
    clearTimeout(timerID)
}

function openSidebar(){
    sidebar.classList.add('show1')

    timerID = setTimeout(hideSidebar,3000) //set
}

openBtn.addEventListener('click', openSidebar)