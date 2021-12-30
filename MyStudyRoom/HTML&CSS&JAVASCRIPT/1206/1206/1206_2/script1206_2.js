const box = document.getElementById('box')
const moves = [ //객체들의 배열을 사용하여 각각의 움직임을 정의
    {pos: 'left', length: 100}, //오른쪽 100px 이동
    {pos: 'top', length:100}, //아래로 100px  이동
    {pos: 'left', length: 0}, //왼쪽 100px 이동
    {pos: 'top', length: 0} //위로 100px 이동
]
let select = 0 //특정 움직임을 선택하기 위하여 select 변수를 선언

function moveBox(){
    const pos = moves[select].pos//moves[0].pos을 pos에 넣음 
    const length = moves[select].length //길이는 4
    box.style[pos] = length + 'px' //box 가 움직임
    select++
    if(select > moves.length -1){ //select값이 moves 배열의 크기를 벗어나면
        select =0  //select 값을 초기화 
    }
}

function startMove(){
    setInterval(moveBox, 1000) //1초 간격으로 moveBox함수 실행 
    //setInterval 일정시간 간격을 두고 함수 실행 
    //setTimeout 일정시간 지난 후 함수 실행 
}

window.addEventListener('load', startMove) //윈도우가 로드할 때 startMove 함수 호출