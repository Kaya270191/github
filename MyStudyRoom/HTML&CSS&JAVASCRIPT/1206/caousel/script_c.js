const photos = document.getElementById('photos')
const photoItems = photos.querySelectorAll('.photo')
const options = document.querySelectorAll('.options')

let timerID = null
let cnt = 0
let prevOption = 0

function changePosition(){
    cnt = cnt === photoItems.length - 1 ? 0 : cnt + 1
    photos.style.marginLeft = cnt * -500 + 'px'

    // 셀렉터 구현부분
    options[prevOption].style.width = 20 + 'px' // 이전 셀렉터 초기화
    options[cnt].style.width = 50 + 'px' // 현재 셀렉터 변경
    options[cnt].style.borderRaidus = '5px'
    prevOption = cnt // 현재 셀렉터 인덱스 저장
}

function startCarousel(){
    timerID = setInterval(changePosition, 1000)
}

function stopCarousel(){
    clearInterval(timerID)
}

photos.addEventListener('mouseenter', startCarousel)
photos.addEventListener('mouseleave', stopCarousel)