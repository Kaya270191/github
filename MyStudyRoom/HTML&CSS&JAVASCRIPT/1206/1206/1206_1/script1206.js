//caurosel
const photos = document.getElementById('photos')
const options = document.querySelectorAll('.options')

let cnt =0
let timerID = null
let prevOption = 0  //이전에 늘어났던 동그라미의 인덱스값

function changePosition(){
    const photoItems = document.querySelectorAll('.photo')
    cnt = cnt === photoItems.length -1 ? 0 : cnt +1
    photos.style.marginLeft = cnt *-500 + 'px'; //style 시트의 photos의 marginLeft
    //0 -500 -1000 -1500 
    
    //셀렉터 구현
    options[prevOption].style.width=20 +'px' //이전 인덱스값으로 동그라미의 길이를 원래대로 초기화
    options[prevOption].style.borderRadius=20 +'px'
    options[cnt].style.width = 50 + 'px'
    options[cnt].style.borderRadius = '5px'
    prevOption = cnt //현재 인덱스값을 저장함 
}


function startCarousel(){
    console.log('mouse entered')
    timerID = setInterval(changePosition,1000)
    //setInterval(changePosition, 2000) 
}

function stopCarousel(){
    clearInterval(timerID) //정지시키기 위해서 
}

photos.addEventListener('mouseenter', startCarousel) //마우스 올리면 캐러설이 움직임
photos.addEventListener('mouseleave', stopCarousel) //마우스가 빠져나오면 정지