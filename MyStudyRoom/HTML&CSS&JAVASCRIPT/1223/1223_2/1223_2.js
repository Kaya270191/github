const box = document.getElementById('box')
const gravity =5 //떨어지는 힘
const FPS = 30 //초당 프레임수
const limitBottom = 500 //땅 위 근처에 도달하면 멈추게 하기 위함
const limitLeft = 700
const limitTop = 300 //점프 높이에 제한을 두기위한 변수 

let vx = 100
let vy = 0
let isJumping = true
let isDead = false

// 처음에 isJumping 을 true 로 설정해서 점핑 가능하게 함
// 점핑 가능하면 계속 점프하다가 vy 가 0 보다 작아지면 isJumping 이 false 가 되면서 더이상 점핑이 불가능함
// 중력은 계속 작용하니까 중력에 의해서 아래로 내려오다가 limit 에 닿으면 isJumping 이 다시 true 가 되면서 점핑이 가능하게 됨

// 캐릭터가 limitLeft 값을 넘어가면, 즉, 땅을 벗어나면 죽었으므로 isDead 가 true 가 되고 isDead 가 true 이면 계속 아래로 떨어짐

function down(){
    const topStyle = window.getComputedStyle(box).top
    let top = parseInt(topStyle)


    // 중력이 계속 작용하고 있는중
    vy += gravity //중력이 계속 추가 
    top += vy
   

    // 캐릭터가 땅에 있는 동안에는 죽지 않았으므로 더이상 아래로 떨어지지 않음
    if(!isDead && top >= limitBottom){
        top = limitBottom
        isJumping = true
    }

    box.style.top = `${top.toString()}px`
}
const timerId = setInterval(down ,1000/FPS)


function move(e){
   // getComputedStyle 위치값을 알려줌 
    const leftStyle = window.getComputedStyle(box).left
    const topStyle = window.getComputedStyle(box).top
    let left = parseInt(leftStyle)
    let top = parseInt(topStyle)

    // 여러 키의 동작이 동시에 적용되려면 if 문을 사용하면 됨 (예: spacebar + arrow key)
    if(e.keyCode === 39){ //오른쪽 방향키 
        box.style.backgroundImage = "url('dog1.png')";
        left += vx
        if(left > limitLeft){ //limitLeft 700보다 커지면 죽음 
            isDead = true
        }
    }
    else if(e.keyCode === 37){ //왼쪽 방향키
        box.style.backgroundImage = "url('ikon.png')";
        if(left > 0){
            left -= vx
        }
    }
    else if(e.keyCode === 32 || e.keyCode === 38){
        if(isJumping && top >= limitTop){  // 점프 높이에 제한을 둠
            vy -= gravity
            top -= vy
        }
        if(vy <= 0){ 
            isJumping = false
        }
    }

    box.style.left = `${left}px` 
    box.style.top = `${top}px` 
}
window.addEventListener('keydown', move)