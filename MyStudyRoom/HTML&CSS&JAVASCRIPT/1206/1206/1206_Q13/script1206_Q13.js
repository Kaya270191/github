const boxes = document.querySelectorAll('.box') //1.box를 담은 배열boxes 

//교수님 풀이 
let index =0 //공을 올리기 위함 
let prevIndex =0 //공을 내리기 위함
function moveUp(){
   boxes[prevIndex].style.marginTop = 0+'px'
   boxes[index].style.marginTop = -50 +'px'
   prevIndex = index       
   index = index === boxes.length -1 ? 0: index+1;
}

// const moves=[
//     {pos: 'margin-bottom', length:50},
//     {pos: 'margin-bottom', length:0}
// ]

// let cnt = 0
// let prevOption = 0
 
// function moveUp(){   
//     const pos = moves[0].pos
//     const length = moves[0].length
//     //console.log(cnt)

//     box[prevOption].style[pos]= moves[1].length
//     box[cnt].style[pos]= length + 'px'

//     //console.dir(box[cnt])

//     prevOption = cnt
//     cnt = cnt ===box.length -1 ? 0 : cnt+1
// }

function circleMove(){//3. 1초마다 moveUp함수가 실행되도록
    setInterval(moveUp, 1000)
}

window.addEventListener('load', circleMove)//2.윈도우가 로드될때 함수가 호출되도록



