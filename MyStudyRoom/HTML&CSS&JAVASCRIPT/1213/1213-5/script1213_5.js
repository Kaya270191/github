//* 이벤트 처리하기 연습문제 14
//아코디언 예제코드에서 특정 메뉴를 선택하면 
//해당 메뉴에 대한 정보만 보여지고 나머지 메뉴에 대한 정보는 닫히도록 해보자!

const menuContainer = document.getElementById('menu-container')

let prevTarget=null //prevTarget 초기값

function openMenu(e){
    const target = e.target

    //바로 전에 클릭한 타겟 위치 초기화 
    if(prevTarget !==null){
        prevTarget.nextElementSibling.classList.remove('open')//css의 .open
    }

    if(target.className === 'title'){
        console.dir(target)
        target.nextElementSibling.classList.add('open')//css의 .open
        prevTarget = target
    }
}

menuContainer.addEventListener('click', openMenu)