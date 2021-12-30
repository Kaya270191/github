const contents = document.querySelectorAll('.contents')

function startAnimation(){
    for(let content of contents){
        //돔객체인 content의 x,y,가로,세로, 넓이. 등의 정보를 알려줌 getBoundingClientRect()
        console.log(content.getBoundingClientRect().top) //content의 top
        //content 의 classList에  show가 포함되어 있지 않고 content의 top이 200보다 작으면 
        if(!content.classList.contains('show') && content.getBoundingClientRect().top <200) {
            content.classList.add('show')//content의 클래스에 css의 show 클래스를 추가
        }
    }
}

window.addEventListener('scroll', startAnimation)
