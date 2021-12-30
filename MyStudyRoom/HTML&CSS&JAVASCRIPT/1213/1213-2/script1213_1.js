const pageContents = [] // 데이터를 담고 있는 배열
const numOfData = 100 // 전체 리스트 수
const limit = 4 // 페이지당 보여줄 리스트 수
const numOfBtns = Math.ceil(numOfData / limit) //보여줄 페이지네이션 버튼 개수
let offset = 0 //offset 초기값은 0 - 페이지 로딩
console.log(numOfBtns)

const contents = document.getElementById('contents')
const pageBtns = document.getElementById('page-btns')


//데이터 구조
/*[
    {name: ", age: 34, id:},
    {name: ", age: 34, id:},
    {name: ", age: 34, id:},
    {name: ", age: 34, id:}
]
*/

//데이터 리스트 배열 만들기 
for(let i=0; i<numOfData; i++){
    pageContents.push({name:'sunrise', age:23, id:i})//push 배열 끝부분에 추가
}
console.log(pageContents)

// 화면에 페이지네이션 버튼 보여주기
for(let i=0;i<numOfBtns;i++){
    const btn = document.createElement('button')
    btn.className = 'page-btn'
    btn.innerText = i + 1

    pageBtns.appendChild(btn)
}

// 첫 페이지 로딩
for(let i=0; i<offset+limit; i++){
    const listItem = pageContents[i]
    contents.innerHTML += `
                <div id=${listItem.id} class='list-item'>
                    <h3>${listItem.name} (${listItem.id})</h3>
                    <h3>${listItem.age}</h3>
                </div>
            `
}


function changePage(e){
    const target = e.target
    if(target.className === 'page-btn'){
        const indexSelected = parseInt(target.innerText)-1
        offset = limit * indexSelected

        const listSelected = []
        for(let i=offset; i<offset + limit; i++){
            const item = pageContents[i]
            listSelected.push(item)
        }
        console.log(listSelected)

        // 화면 초기화
        contents.innerHTML = ''

        //화면에 추출한 데이터 리스트 보여주기
        for(let listItem of listSelected){
            contents.innerHTML +=`
            <div id=${listItem.id} class='list-item'>
            <h3>${listItem.name} (${listItem.id})</h3>
            <h3>${listItem.age}</h3>
            </div>

            `
        }
    }
}




pageBtns.addEventListener('click', changePage)

 

