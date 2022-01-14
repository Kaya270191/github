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

const points = []
const dx = 1 // degree
let x = 0 // degree
let y = 0
let radx = 0 // radian

// 다음 (X,Y) 포인트 값 계산
function getNextPoint(){
    radx = x * (Math.PI / 180)
    y = Math.sin(radx)
    points.push([x, y])//point 배열에 x,y 점의 좌표가 들어간 다른[] 추가 
    x += dx //1도씩 증가 
    // console.log(points)
}


// (X,Y) 포인트 값으로부터 DOM 객체 생성 및 화면에 표시
function displayPoint(point){
    const pointEl = document.createElement('div')
    pointEl.className = 'dot'
    pointEl.style.left = `${point[0] * 2}px` // x-scale: 2배
    pointEl.style.top = `${point[1]* 100 * -1 + 100}px` // y-scale : 100배 (반전 + 좌표이동)
    graph.appendChild(pointEl)
}

// (X,Y) 포인트 값을 요소로 가지는 2차원 배열 생성
for(let i=0; i<360; i++){
    getNextPoint()
}
console.log(points)

points.forEach(displayPoint)





//* 연습과제 6
//2차원 배열로 생성한 sign1, sign2, sign3, sign4, sign5 를 
//1초마다 순서대로 화면에 보여주도록 구현해보자!
//(단, sign5 를 보여준 다음에는 다시 sign1을 보여줘야 한다.)

const signDiv = document.getElementById('sign')

const signDiv2 = document.createElement('div')
signDiv.append(signDiv2)

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
//const signsTest = signs[0]


// 구현하기
function displaySign(value){

    
    const cellEl = document.createElement('div')
    cellEl.className = value === 0 ? 'cell' : 'cell bright'
    signDiv2.appendChild(cellEl)


}

function test() {
    console.log(index)
    copysign = signs[index]

    let rows = copysign.length
    let columns = copysign[0].length

    for(let i=0; i<rows; i++){
        for(let j=0; j<columns; j++){
            displaySign(copysign[i][j])
        }
    }

    if(index >= signs.length-1){
        index = 0
    }else{
        index += 1
    }
  }


function setWord(){
    //단어를 5개 보여주면 
}

setInterval(test, 1000);





