//* 이벤트 캡쳐링과 버블링
// 이벤트 캡쳐링:  body 요소부터 시작해서 이벤트가 발생한 요소까지 내려가면서 이벤트핸들러 함수가 실행
// 이벤트 버블링:  이벤트가 발생한 요소부터 시작해서 body 요소까지 올라가면서 이벤트핸들러 함수가 실행
//body->parent->child 순으로 실행

const parent = document.querySelector('.parent')
const child = document.getElementById('child')

function hideParent(){
    console.log('parent clicked!')
    parent.classList.add('hide')
}

function popup(e){
    alert('child clicked!')
    //button 이 클릭될때 부모요소가 사라지지 않도록 하려면 
    e.stopPropagation() //이벤트 버블링 방지

}

function clickbody(){
    console.log('body clicked')
}

parent.addEventListener('click', hideParent)
child.addEventListener('click', popup)
document.body.addEventListener('click', clickbody)
//addEventListener 의 세번째 인자를 true로 지정하면 
//body->parent->child 순으로 실행
//false나 아무값도 지정하지 않으면 
//child->parent->body 순으로 실행 