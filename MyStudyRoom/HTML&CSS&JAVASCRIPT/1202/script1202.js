//이벤트(클릭이나 사용자 입력) 처리하기 
//이벤트 핸들러 함수: 이벤트 발생시 처리하는 함수 

//이벤트 핸들러 함수 연결하는 세 가지 방법
//1. 인라인 방식: 해킹에 취약함 
function popup(){
    alert('팝업창')
}
//2. 요소의 프로퍼티 방식
const popup1 = document.getElementById('popup1')
popup1.onclick = function (){
    alert('팝업창')
}
//3. 요소의 메서드 방식
//요소.addEventListener('이벤트 이름', 이벤트핸들러 함수)

//색상을 변경하는 이벤트 핸들러함수 
function popup2(){
    alert('팝업창')
}
function setBtnColor(){
    popupBtn.style.background = 'skyblue'
}
function unsetBtnColor(){
    popupBtn.style.background = ''
}
function popup2(){ //팝업 해제 함수 
    alert('팝업창')
    popupBtn.removeEventListener('click', popup2)
}

const popupBtn = document.getElementById('popup2')
popupBtn.addEventListener('click', popup2)
popupBtn.addEventListener('mouseover', setBtnColor)
popupBtn.addEventListener('mouseout', unsetBtnColor)

//이벤트 핸들러 함수를 해제하는 방법
popupBtn.addEventListener('click', popup2)

//이벤트 객체(이벤트핸들러 함수의 매개변수)
function popup3(e){
    console.log(e) //이벤트객체
    console.log(e.target)

    e.target.classList.add('circle') //circle:변경할 스타일의 클래스명 

    //스타일시트로 이동 
    // const target = e.target.style

    // target.all = 'unset'
    // target.position = 'absolute'
    // target.left = '500px'
    // target.width = '200px'
    // target.height = '70px'
    // target.textAlign = 'center'
    // target.background = 'skyblue'
    // target.borderRadius = '50%'
    // target.transition = 'all ease 2.5s' //2.5초 동안 모양,위치 바꾸기
}
const popupBtn1 = document.getElementById('popup3')
popupBtn1.addEventListener('click', popup3)


//기본적인 이벤트 동작 제한하기 
const form = document.querySelector('form')
const id = document.querySelector('#user-id')
const password = document.querySelector('#user-password')
const p = document.querySelector('p')

function login(evt){    
    if(id.value===''|| password.value===''){
        evt.preventDefault()
        p.innerText = '아이디나 비밀번호가 입력되지 않았습니다'
    }
    else{
        alert('login is processing')
    }
}
form.addEventListener('submit', login)



//setTimeout 메서드 setTimeout(함수, 실행될 특정시각)
const instantMsg = document.querySelector('.instant-msg')

function showMsg(){
    instantMsg.classList.add('show')
}
function hideMsg(){
    instantMsg.classList.remove('show')
}
setTimeout(showMsg, 1000)
setTimeout(hideMsg, 3000)


//setInterval 메서드  setInterval(함수, 시간간격)  
const clock = document.getElementById('clock')

function changeFormat(t){ //10보다 작으면 0을 붙여주기
    return t < 10 ? `0${t}`:t
}

function getTime(){
    const time = new Date() //자바스크립트 내장함수: 현재시간 불러옴 
    const hours = time.getHours() //시
    const minutes = time.getMinutes() //분
    const seconds = time.getSeconds() //초

    clock.innerText = `${changeFormat(hours)}:${changeFormat(minutes)}:${changeFormat(seconds)}`
}
setInterval(getTime, 1000) //getTime : 현재 시각을 가져옴


//마우스 클릭이벤트 
const circle = document.getElementById('circle') //돔 객체 circle 지정 

function moveCircle(e){ //moveCircle(e) 함수
    console.log(e.clientX, e.clientY)
    const mouseX = e.clientX //마우스 포인트의 x좌표
    const mouseY = e.clientY //마우스 포인트의 y좌표
    circle.style.left = mouseX + 'px' // px단위
    circle.style.top = mouseY + 'px'
}
//window.addEventListener('click', moveCircle) //클릭했을 때 moveCircle 함수가 실행

//window.addEventListener('mousemove', moveCircle) //마우스를 움직일때 원이 따라다님


//led 만들기
const ledContainer = document.getElementById('led-container')
const leds = document.querySelectorAll('.led')

function lighton(e){ //led에 불 들어오기 
    console.log(e.target)
    console.log(e.target.className)
    if(e.target.className === 'led'){
        e.target.classList.add('on')
    }
}

function lightoff(e){ //led 불 끄기
    console.log(e.target.className)
    if(e.target.className === 'led on'){
        e.target.classList.remove('on')
    }
}

ledContainer.addEventListener('mouseover', lighton)//마우스를 올리면 lighton함수 실행

for(let led of leds){
    led.addEventListener('mouseleave', lightoff)
}

//light가 깜빡거리게 
let index = 0

function lightoff(){
    const led = document.querySelectorAll('.led')[index]
    led.classList.remove('on')
}

function lighton(){
    const led = document.querySelectorAll('.led')[index]
    led.classList.add('on')
    index++
    if(index > 2){
        index=0
    }
    setTimeout(lightoff, 1000)
}

function startEffect(){
    console.log('load')
    setInterval(lighton, 1000) //1초마다 led가 깜빡이게 함
}
window.addEventListener('load', startEffect)


//버튼을 클릭했을 때 사이드바 메뉴가 열리게
const openBtn = document.getElementById('open-btn')
const sidebar = document.querySelector('.sidebar')

function openSidebar(){
    sidebar.classList.add('show')
}

openBtn.addEventListener('click', openSidebar)