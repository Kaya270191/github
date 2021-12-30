const colorBox = document.querySelector('.color-box')
const colorList = document.querySelector('.color-list')
const colorInput = document.getElementById('color-input')

const colors = ['orange', 'blue', 'brown', 'green', 'red', 'skyblue']
let index = -1 //현재색상 인덱스 변수 선언 
let prevIndex = -1 //이전색상 인덱스 변수 선언

function displayColors(colors){
    for(let color of colors){ //colors 배열에서 색상 하나씩 뽑기
        const item = `<div class='color-item'>${color}</div>`
        colorList.innerHTML += item //뽑은 색을 컬러리스트에 추가 
    }
}

function typeColor(e){
    console.log(e.target.value)

    if(e.target.value !== ''){
        console.log('you typed something')
        colorList.classList.add('show')
        colorInput.addEventListener('keyup', selectColor)
    }else{
        console.log('you didn\'t type anything')
        colorList.classList.remove('show')
        colorInput.removeEventListener('keyup', selectColor)
    }
}

function setBackground(color){
    console.log('you picked color !', color)
    colorInput.value = color //입력창 화면 설정하기
    colorList.classList.remove('show') //색상 목록 숨기기
    colorBox.style.background = color //배경색 변경하기 
    colorInput.removeEventListener('keyup', selectColor) // 이벤트 제거
}

function setColor(e){
    console.log(e.target) //키보드 키에 대한 id 값 

    if(e.target.className === 'color-item'){
        const pickedColor = e.target.innerText
        setBackground(pickedColor)
    }
}

function changeHighLightItem(key){
    prevIndex = index // 사용자가 선택한 현재 색상 기억하기

    if(key === 40){ // 화살표 아래
        index++
        if(index > colors.length - 1){
            index = 0
        }
    }else if(key === 38){ // 화살표 위 
        index--
        if(index < 0){
            index = colors.length - 1
        }
    }else if(key === 13){ // 엔터키
        const colorItem = document.querySelectorAll('.color-item')[index]
        const pickedColor = colorItem.innerText
        setBackground(pickedColor)
    }
}

function unsetHighLightColorItem(){
    if(prevIndex >= 0){
        // 이전에 선택한 색상
        const colorItem = document.querySelectorAll('.color-item')[prevIndex]
        colorItem.classList.remove('highlight') // 하이라이트 제거
    }
}
function highlightColorItem(){
    if(index >= 0){
        /// 현재 선택한 색상
        const colorItem = document.querySelectorAll('.color-item')[index]
        colorItem.classList.add('highlight') // 하이라이트 적용
    }
}

function selectColor(e){
    if(e.keyCode){
        console.log(e.keyCode)
        changeHighLightItem(e.keyCode)// 색상 선택을 위한 인덱스값 변경
        unsetHighLightColorItem()  // 이전 색상의 하이라이트 제거
        highlightColorItem()// 현재 색상의 하이라이트 적용
    }
}

displayColors(colors)
colorInput.addEventListener('input', typeColor)
colorInput.addEventListener('keyup', selectColor)
colorList.addEventListener('click', setColor)