
//연습과제2 
//const 요소이름 = document.createElement('태그이름')
//navigation 바 

const nav = document.createElement('div') 
nav.id = "nav"

const menu = document.createElement('div')
menu.id = "menu"
// const bar1 = document.createElement('div')
// bar1.className = "bar"
// const bar2 = document.createElement('div')
// bar2.className = "bar"
// const bar3 = document.createElement('div')
// bar3.className = "bar"
//menu.append(bar1,bar2,bar3)

for(let i =0; i<3;i++){
    const bar = document.createElement('div')
    bar.className ='bar'
    menu.append(bar)
}

const screen_mode = document.createElement('div') 
screen_mode.id = "screen-mode"
const circle_btn = document.createElement('div')
circle_btn.id = "circle_btn"

screen_mode.appendChild(circle_btn)

const profile_menu = document.createElement('div')
profile_menu.id = "profile-menu"

const profile_image = document.createElement('img')
profile_image.src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHRc2FxbckEsAAJd7KQrm4L33MhfBEbw_kPQ&usqp=CAU"
profile_image.alt = ""

profile_menu.append(profile_image)

nav.append(menu,screen_mode, profile_menu)


////////타이틀

const title = document.createElement('div') 
title.id = "title"


const center = document.createElement('div')
center.id = "center"

const heading = document.createElement('div')
heading.id = "heading"

const h1 = document.createElement('h1')
h1.innerText = "My photo gallery"
const h4 = document.createElement('h4')
h4.innerText = "my old memories from my life"
heading.append(h1,h4)

const search = document.createElement('div')
search.id = "search"

const input = document.createElement('input')
input.type = "text"
input.placeholder ="Search photo..."

search.appendChild(input)

center.append(heading, search)

title.appendChild(center)


//포토컨테이너 리스트
// const photo_container = document.createElement('div')
// photo_container.className = "photo-container"

// const photo_card = document.createElement('div')
// photo_card.className = "photo-card"

// const img = document.createElement('img')
// img.src = "http://www.newsworks.co.kr/news/photo/202002/433057_327801_345.jpg"
// img.alt = ""

// const photo_name = document.createElement('div')
// photo_name.className = "photo-name"
// photo_name.innerText = "이름"


//*function을 이용해서 사진첩만들기*  
// function buildElement(tagName, attributes, elements){
//     const el = document.createElement(tagName)

//     for(let key in attributes){
//         console.log(key, attributes[key])
//         el[key] = attributes[key]
//     }
//     for(let element of elements){
//         if(typeof element === 'string'){
//             el.innerText = element
//         }else{
//             el.appendChild(element)
//         }
//     }
//     return el
// }
// const menu = buildElement('div', {'id': 'menu'},[
//     buildElement('div',{'className': 'bar'},[]),
//     buildElement('div',{'src':'cat.jpg', 'style':'width:300px; height:200px'},[]),
//     buildElement('div',{'className': 'bar'},[]),
// ])
// console.log(menu)


const photo_list = document.createElement('div')
photo_list.id = "photo-list"

//사진첩 만들기 
for(let i=0; i<9; i++){ 
    const photo_container = document.createElement('div')
    photo_container.className = "photo-container"

    const photo_card = document.createElement('div')
    photo_card.className = "photo-card"

    const img = document.createElement('img')
    img.src = "http://www.newsworks.co.kr/news/photo/202002/433057_327801_345.jpg"
    img.alt = ""

    const photo_name = document.createElement('div')
    photo_name.className = "photo-name"
    photo_name.innerText = "이름"

    photo_card.append(img)
    photo_container.append(photo_card,photo_name)

    photo_list.appendChild(photo_container)
}

/////모달창 

const modal_window = document.createElement('div')
modal_window.className = "modal-window"

const header = document.createElement('div')
header.id = "header"
header.innerText = "Food Recipe"

const body = document.createElement('div')
body.id = "body"

const p = document.createElement('p')
p.innerText = `Lorem ipsum dolor sit amet consectetur adipisicing elit. Error modi nesciunt facilis tempora qui temporibus, odio dolores reiciendis, quis voluptate ducimus quam. Voluptatum omnis, rem quam porro ipsam nam dolorum.
Laudantium aliquam suscipit, nobis exercitationem neque inventore incidunt quos possimus numquam! Temporibus adipisci, illum in fuga earum magnam consequatur minima. Neque, labore esse tempora tenetur doloribus beatae. Facere, dolorum incidunt?
Nulla facere earum fuga doloremque magni. Aspernatur excepturi ipsam commodi in ullam? Dolore, ipsa, a dignissimos, vel nulla alias accusantium qui voluptatibus officia minus est libero! Adipisci, fugit? Architecto, quia!`

const footer = document.createElement('div')
footer.id = "footer"

const button = document.createElement('button')
button.innerText ="Close"

body.appendChild(p)
footer.appendChild(button)

modal_window.append(header, body, footer)

//바디에  nav, title, photoList, modalWindow 추가하기
document.body.append(nav, title, photo_list, modal_window)


// for(let i =0; i<3;i++){
//     const bar = document.createElement('div')
//     bar.className ='bar'
//     menu.appendChild(bar)
// }


//document.body.append(자식1,자식2,자식3) 바디에 마운트하기

// //연습과제3-h4 요소를 검색한 다음 해당 요소의 컨텐츠를 변경해보자!
const search1 = document.querySelector('#heading h4')
search1.innerText = "Good Morning!!!dude!"

// //연습과제4-id 값이 profile-menu 인 div 요소를 먼저 검색한 다음, 해당 요소의 내부 프로필 이미지를 변경
const search2 = document.getElementById('profile-menu')
const search2Img = search2.querySelector('img')
search2Img.src = "https://www.sisajournal.com/news/photo/202106/219562_127815_4415.jpg"

// //연습과제5-사진리스트에서 세번째 사진을 다른 사진으로 변경하기
const search3 = document.querySelectorAll('.photo-card img')[2] //리스트 전체를 가져와야해서쿼리셀렉트올
search3.src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYq_X4HKaqgA8i0D0YEYaodVJJDg1zzl3EfA&usqp=CAU"

// //연습과제6- 사진리스트에서 다섯번째 사진의 "이름"이라는 문자열을 "sunrise"로 변경하기
const search4 = document.querySelectorAll('.photo-name')[4]
search4.innerText ="sunrise"

// //연습과제7- 클래스명이 "modal-window" 인 div 요소의 클래스명을 "modal-window hide" 으로 변경 -모달창 숨기기 
const search5 = document.querySelector('.modal-window')
search5.className = 'modal-window hide' //방법1
//search5.classList.add('hide') //방법2