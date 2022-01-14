const graph = document.getElementById('graph')

const points= [] //빈배열
const dx =1 // degree
let x = 0 //degree
let y =0
let radx =0


//sin 값을 계산하는 함수
function getNextPoint(){
    radx = x * (Math.PI / 180)
    y = Math.sin(radx)
    points.push([x,y])
    x += dx
}

function displayPoint(point){
    const pointEl = document.createElement('div')
    pointEl.className = 'dot'
    pointEl.style.left = `${point[0] * 2}px` //x-scale :2배
    pointEl.style.top = `${point[1] * 100 * -1 +100}px`
    graph.appendChild(pointEl)
}


for(let i=0; i<360; i++){
    getNextPoint() // sin 값이 계산되는 points 배열이 추가됨 
}

console.table(points)

points.forEach(displayPoint)