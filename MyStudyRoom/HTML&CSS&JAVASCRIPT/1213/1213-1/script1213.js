const pageContents = [// 버튼을 클릭하면 보여줄 페이지 내용을 배열로 선언
    'page 1', 'page 2', 'page 3', 'page 4', 'page 5',
    'page 6', 'page 7', 'page 8', 'page 9', 'page 10',
]

const contents = document.getElementById('contents')
const pageBtns = document.getElementById('page-btns')

for(let i=0;i<pageContents.length;i++){//페이지수만큼 버튼을 생성
    const btn = document.createElement('button')
    btn.className = 'page-btn'
    btn.innerText = i + 1

    pageBtns.appendChild(btn)// 버튼들을 pageBtns 요소에 추가
}
contents.innerHTML = pageContents[0]

function changePage(e){
    const target = e.target
    if(target.className === 'page-btn'){
        console.log(target)
        const indexSelected = parseInt(target.innerText) - 1
        console.log(indexSelected)
        contents.innerHTML = pageContents[indexSelected]
    }
}

pageBtns.addEventListener('click', changePage)