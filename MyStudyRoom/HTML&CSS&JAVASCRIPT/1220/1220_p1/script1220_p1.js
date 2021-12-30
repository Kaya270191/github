const colorBox = document.querySelector('.color-box')
const colorInput = document.getElementById('color-input')

function randomColor(e){
    var r = Math.floor(Math.random()*256)
    var g = Math.floor(Math.random()*256)
    var b = Math.floor(Math.random()*256)
    console.log(e.target)
    //return `rgb(${r},${g},${b})`
    colorBox.style.background = `rgb(${r},${g},${b})`
}


//교수님 답 - 키보드를 입력했을 때 랜덤한 색상으로 바탕화면 색이 바뀌게 하기!
// function pickRandomColor(){
//     return Math.floor(Math.random()*256)
// }
// function setColor(e){
//     colorBox.style.background = `rgb(${pickRandomColor()},${pickRandomColor()},${pickRandomColor()})`
// }
//colorInput.addEventListener('input, setColor)



colorInput.addEventListener('input', randomColor)
