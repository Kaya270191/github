//caurosel
const photos = document.getElementById('photos')
const options = document.querySelectorAll('.options')

//const selection = document.getElementsById('selection')


let timerID = null
let prevOption = 0  //이전에 늘어났던 동그라미의 인덱스값

function changePosition(){
    const photoItems = document.querySelectorAll('.photo') 
    index = index === photoItems.length -1 ? 0 : index +1
    photos.style.marginLeft = index *-500 + 'px'; //style 시트의 photos의 marginLeft
    //0 -500 -1000 -1500 
    
    //셀렉터 구현
    options[previndex].style.width =20 + 'px'
    options[previndex].style.borderRadius =20 + 'px'
    options[prevOption].style.width=20 +'px' //이전 인덱스값으로 동그라미의 길이를 원래대로 초기화
    options[prevOption].style.borderRadius = 20 + 'px'
    options[index].style.width = 50 + 'px'
    options[index].style.borderRadius = '5px'
    prevOption = index //현재 인덱스값을 저장함 
}

function countIndex(e){ //클릭한 것 찾기.
    var i = 0;
    while((e=e.previousSibling)!=null){       
        i++;
        console.log('i='+i)
    }   
    return i;
}

let index = 0;
let previndex =0;
function matchCarousel(e){
    
    index = countIndex(e.target)-1 //누른 것 위치 찾기 위해countIndex(e)호출
    console.log(index)

    photos.style.marginLeft = (index) *-500 + 'px' //누른 것과 맞는 사진 
    options[previndex].style.width =20 + 'px'
    options[previndex].style.borderRadius =20 + 'px'
    options[prevOption].style.width=20 +'px' //이전 인덱스값으로 동그라미의 길이를 원래대로 초기화
    options[prevOption].style.borderRadius = 20 + 'px'
    options[index].style.width = 50 +'px'
    options[index].style.borderRadius = '5px'
    previndex= index
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

//option.addEventListener('click', matchCarousel) //캐러셀에 마우스를 올리면 같은 사진으로 찾아감
for(let option of options){ //options 배열에 각 요소를 option 변수로 해서 
    option.addEventListener('mousedown', matchCarousel) //mousedown이 되면 matchCarousel()를 호출하도록 함 
}


//html의 option에 id값을 추가해서 함수 만듦.
// function changePhoto(e){
//     console.log(e.target)
//     const target = e.target
//     if(target.className === 'options'){ //버튼 클릭한 경우 
//         console.log(target.id)
//         cnt = parseInt(target.id)-1
//         changePosition()
//     }
// }

// function changePosition(){
//     photos.style.marginLeft = (index) *-500 + 'px' //누른 것과 맞는 사진 
//     options[previndex].style.width =20 + 'px'
//     options[previndex].style.borderRadius =20 + 'px'
//     options[prevOption].style.width=20 +'px' //이전 인덱스값으로 동그라미의 길이를 원래대로 초기화
//     options[prevOption].style.borderRadius = 20 + 'px'
//     options[index].style.width = 50 +'px'
//     options[index].style.borderRadius = '5px'
//     previndex= index
// }

//selection.addEventListener('click',changePhoto)