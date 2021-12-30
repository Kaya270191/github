//마우스 이벤트. 클릭한 곳에 원이 찍히도록하기 

// const circle = document.getElementById('circle')

// function movingCircle(e){
//     console.log(e.clientX, e.clientY)
//     const mouseX = e.clientX //클릭한 마우스 포인트 x좌표
//     const mouseY = e.clientY//클릭한 마우스 포인트 y좌표 

//     circle.style.left = mouseX +'px'
//     circle.style.top = mouseY + 'px'
// }

// window.addEventListener('mousemove', movingCircle)

//웹화면이 처음 보여질때 led 가 자동으로 깜빡이게 하기
let index =0  //led를 선택할 수 있게 index변수 선언 
const ledContainer = document.getElementById('led-container')
const leds = document.querySelectorAll('.led')

function lighton1(e){
    
    const led = document.querySelectorAll('.led')[index]//첫번째 led에 
    led.classList.add('on') //led에 스타일의 on 적용 
    index++ //index증가 

    if(index > 2){//인덱스가 2보다 크면 
        index = 0 //다시 처음 인덱스로 돌아가게 0으로 지정 
    }
    setTimeout(lightoff1,1000) //1초 뒤에 lightoff1함수가 실행되게 함 
}

function lightoff1(e){
    const led = document.querySelectorAll('.led')[index] //첫번째 led에 
    led.classList.remove('on')//led에 스타일 on 제거
}

function startEffect1(){
    setInterval(lighton1, 1000) //1초마다 lighton1 함수가 실행 
}

window.addEventListener('load', startEffect1) //윈도우가 로드될 때 startEffect1 함수호출 

//윈도우 로드-> startEffect1()-> lighton1()->lightoff1() 함수로 연결 



//버튼에 마우스 포인트가 놓여질때 사이드바 메뉴가 열리게 하려면  
const openBtn = document.getElementById('open-btn')
const sideBar = document.querySelector('.sidebar')
const menus = document.querySelectorAll('.menu')

function openBar(){
    sideBar.classList.add('show')
}

openBtn.addEventListener('mouseenter', openBar)
