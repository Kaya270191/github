//연습과제 1
//동적으로 생성한 2차원 배열과 동일하게 반복문을 한번만 사용해서 구현

const _2dArray = []

// for(let i=0; i<5; i++){
//     const element = []
//     for(let j=2*i; j<2*i+2; j++){
//         element.push(j+1)
//     }
//     _2dArray.push(element)
// }

// console.log(_2dArray)


for(let i=0; i<5;i++){
    const element = []   
    element[0] = 2*i+1
    element[1] = 2*i+2
    //console.log(element)
    _2dArray.push(element)
}
console.log(_2dArray)


//연습과제 2
//Array 생성자 함수를 사용하여 행과 열에 대한 입력값이 주어지면 
//아래와 같이 해당 크기의 2차원 배열을 생성하는 함수를 완성해보자!

function build2DArray(rows, columns){
  
    const _2dArray = new Array(rows) //1차원 배열
    for(let i=0; i<rows; i++){ 
        const element = new Array(columns).fill(0) //배열생성
        _2dArray[i] = element// 만든 배열을 큰 배열의 i번째에 넣기
    }
    return _2dArray
}

console.log(build2DArray(7, 3))


//연습과제 3 
//2차원 배열-> 객체 배열로 바꾸기 
// 과일 데이터를 객체들을 요소로 가진 배열로 변경해보자!
const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]

for(let i in fruits){
    fruits[i] = {name: fruits[i][0], price: fruits[i][1]}
}

console.log(fruits)

//* 연습과제 4
//
//2차원 배열 데이터의 각 요소는 순서대로 과일의 이름, 단가, 수량
//단가와 수량을 이용하여 해당 과일의 최종 가격을 계산한 새로운 2차원 배열을 구현해보자!
//프로퍼티로 추가된 객체들의 배열로 데이터를 변환

const fruits1 = [['apple', 570, 32], ['orange', 270, 65], ['strawberry', 30, 120]]

for(let i in fruits){
    fruits1[i] = {name: fruits1[i][0], totalPrice: fruits1[i][1]*fruits1[i][2]}
}
console.log(fruits1)

//* 연습과제 5
//실시간으로 업데이트되는 사인 그래프를 그려보자!
//setInterval 메서드를 사용하여 포인트를 계속 추가
//포인트 갯수가 360개를 넘어가면 360개만 추출하여 화면에 보여준다. 
//추출시작점(offset)과 추출범위(range)에 대한 변수를 추가하고, 
// 아래와 같이 실시간 사인 그래프를 구현해보자!


//1. sin 값을 계산해서 포인트값을 추가하기
//2. points 배열에 360개가 넘어가는지 안 넘어가는지에 따라서 그려주는 걸 다르게 하기
//if(points 배열<360)  points 배열을 가지고 그려주기
//else points 배열에서 offset과 range값을 가지고 360개 추출한 다음에 그려주기
//3. offset값 증가 시키기
//4. 다시 1번으로 돌아가서 반복하기
// 그려줄 떄 그래프가 움직임-> offset값만큼 x축 좌표 이동 

const graph = document.getElementById('graph')

let points = [] // 포인트 배열
let x = 0 // degree
let offset = 0 // 추출 시작점

function degreeToRad(x){ //degree(0~360도) -> radian(0~2파이)
    return x * (Math.PI / 180)
}
function calSinVal(x){ //radian 값으로 sin 구하기
    return Math.sin(x)
}
function clearWindow(el){
    el.innerHTML = '' //초기화
}
function getPoint(x){
    return [x, calSinVal(degreeToRad(x))] //배열을 리턴 (점의 좌표)
}
function isArrayFull(len){ 
    return len > 360 //배열의 길이가 360다 큰지 확인 
}

function displayPoint(point){
    const [x, y] = point
    const xScale = 2, yScale = 100, yShift = 100 //y 좌표 이동

    const pointEl = document.createElement('div')
    pointEl.className = 'dot'
    pointEl.style.left = `${(x - offset) * xScale}px` // x-scale: 2배 (offset 만큼 좌표이동)
    pointEl.style.top = `${(y* yScale) * -1 + yShift}px` // y-scale : 100배 (반전 + 좌표이동)
    graph.appendChild(pointEl)
}

function redraw(){
    clearWindow(graph) //초기화 
    
    points.push(getPoint(x)) // 포인츠 배열에 포인트 추가
    x++ // 그 다음 포인트를 가져오기 위해 x 좌표 변경

    if(isArrayFull(points.length)){
        points.shift() // 첫번째 요소를 제거함으로써 360개 유지
        offset++ //  offset 증가
    }
    points.forEach(displayPoint) // 화면에 그래프 그리기
  
}

setInterval(redraw, 5) 



//* 연습과제 6
//2차원 배열로 생성한 sign1, sign2, sign3, sign4, sign5 를 
//1초마다 순서대로 화면에 보여주도록 구현해보자!
//(단, sign5 를 보여준 다음에는 다시 sign1을 보여줘야 한다.)

const signDiv = document.getElementById('sign')

const sign1 = [
    [0, 0, 0, 1, 1, 1, 1, 0, 0, 0],
    [0, 0, 1, 0, 0, 0, 0, 1, 0, 0],
    [0, 0, 1, 0, 0, 0, 0, 1, 0, 0],
    [0, 0, 1, 0, 0, 0, 0, 1, 0, 0],
    [0, 0, 1, 0, 0, 0, 0, 1, 0, 0],
    [0, 0, 0, 1, 1, 1, 1, 0, 0, 0],
    [0, 0, 0, 0, 1, 1, 0, 0, 0, 0],
    [0, 0, 0, 0, 1, 1, 0, 0, 0, 0],
    [0, 1, 1, 1, 1, 1, 1, 1, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
]
const sign2 = [
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 1, 1, 1, 1, 1, 0, 0, 1, 0],
    [0, 0, 0, 0, 1, 0, 0, 0, 1, 0],
    [0, 0, 0, 1, 0, 0, 0, 0, 1, 0],
    [0, 0, 1, 0, 1, 0, 0, 0, 1, 0],
    [0, 1, 0, 0, 0, 1, 0, 0, 1, 0],
    [0, 0, 0, 1, 1, 1, 1, 1, 0, 0],
    [0, 0, 1, 0, 0, 0, 0, 0, 1, 0],
    [0, 0, 1, 0, 0, 0, 0, 0, 1, 0],
    [0, 0, 0, 1, 1, 1, 1, 1, 0, 0],
]
const sign3 = [
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 1, 0],
    [0, 0, 1, 1, 1, 0, 0, 0, 1, 0],
    [0, 1, 0, 0, 0, 1, 0, 0, 1, 0],
    [0, 1, 0, 0, 0, 1, 1, 1, 1, 0],
    [0, 1, 0, 0, 0, 1, 1, 1, 1, 0],
    [0, 1, 0, 0, 0, 1, 0, 0, 1, 0],
    [0, 0, 1, 1, 1, 1, 0, 0, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
]
const sign4 = [
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 0, 0, 0, 0, 1, 0, 1, 0],
    [0, 1, 1, 1, 0, 0, 1, 0, 1, 0],
    [0, 0, 0, 1, 1, 1, 1, 0, 1, 0],
    [0, 0, 0, 1, 1, 1, 1, 0, 1, 0],
    [0, 0, 0, 1, 0, 0, 1, 0, 1, 0],
    [0, 1, 1, 0, 0, 0, 1, 0, 1, 0],
    [0, 0, 0, 0, 0, 0, 1, 0, 1, 0],
    [0, 0, 0, 0, 0, 0, 1, 0, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
]
const sign5 = [
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 1, 1, 1, 0, 0, 1, 1, 0],
    [0, 1, 0, 0, 0, 1, 0, 1, 1, 0],
    [0, 1, 0, 0, 0, 1, 0, 1, 1, 0],
    [0, 1, 0, 0, 0, 1, 0, 1, 1, 0],
    [0, 0, 1, 1, 1, 0, 0, 1, 1, 0],
    [0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
    [0, 0, 0, 1, 1, 1, 1, 1, 1, 0],
    [0, 0, 0, 1, 0, 0, 0, 0, 1, 0],
    [0, 0, 0, 1, 1, 1, 1, 1, 1, 0],
]

const signs = [sign1, sign2, sign3, sign4, sign5]
let index = 0


function displayCell(value){ //div 생성 함수 
    const cellEl = document.createElement('div')
    cellEl.className = value === 0 ? 'cell' : 'cell bright'
    signDiv.appendChild(cellEl)
}

function displaySign(sign){
    const rows = sign.length //배열의 길이 
    const columns = sign[0].length //배열의 행의 길이 

    for(let i=0; i<rows; i++){
        for(let j=0; j<columns; j++){
            displayCell(sign[i][j])
        }
    }
}

function redraw(){
    const sign = signs[index % signs.length] //인덱스를 배열의 길이로 나눈 나머지가 사인 배열의인자
    signDiv.innerHTML = '' // 화면 초기화
    displaySign(sign)
    index++
}

setInterval(redraw, 1000) //setInterval 로 1초마다 redraw 함수 호출 




