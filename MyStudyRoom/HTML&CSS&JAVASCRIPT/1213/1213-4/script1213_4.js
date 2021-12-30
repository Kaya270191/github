//이벤트 위임 (Event delegation)
//자식 요소에 각각 이벤트를 등록하지 않고 부모 요소에 이벤트를 하나만 등록하는 방식
//주로 리스트에 아이템 수가 많을때 사용

const fruits = document.querySelectorAll('.fruit')
const fruitContainer = document.getElementById('fruits')//리스트 감싸고 있는 fruitContainer
let prevTarget = null

function moveToRight(e){

    // 바로 전 클릭한 타겟을 초기화
    if(prevTarget!==null){
        prevTarget.style.marginLeft='0px'
    }
    //현재 클릭한 타겟의 위치 변경 
    // const target = e.target
    // console.log(target)
    // target.style.marginLeft = '100px'

    const target = e.target
    if(target.className === 'fruit'){ //클릭한 것의 className이 fruit 이면
        target.style.marginLeft = '100px' //marginLeft 100px 적용 
        prevTarget = target //현재 타겟 저장 
    }
}
    
// for(let fruit of fruits){
//     fruit.addEventListener('click', moveToRight)
// }

fruitContainer.addEventListener('click', moveToRight)

