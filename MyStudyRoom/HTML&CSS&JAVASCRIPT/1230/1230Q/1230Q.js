const lyrics = `
Sorry Sorry Sorry Sorry
내가 내가 내가 먼저
네게 네게 네게 빠져
빠져 빠져 버려 baby
Shawty Shawty Shawty Shawty
눈이 부셔 부셔 부셔
숨이 막혀 막혀 막혀
내가 미쳐 미쳐 baby
바라보는 눈빛 속에
눈빛 속에 나는 마치
나는 마치 뭐에 홀린 놈
이젠 벗어나지도 못해
걸어오는 너의 모습
너의 모습 너는 마치
내 심장을 밟고 왔나봐
이젠 벗어나지도 못해
어딜 가나 당당하게
웃는 너는 매력적
착한 여자 일색이란
생각들은 보편적
도도하게 거침 없게
정말 너는 환상적
돌이킬 수 없을만큼
네게 빠져 버렸어
Sorry Sorry Sorry Sorry
내가 내가 내가 먼저
네게 네게 네게 빠져
빠져 빠져 버려 baby
Shawty Shawty Shawty Shawty
눈이 부셔 부셔 부셔
숨이 막혀 막혀 막혀
내가 미쳐 미쳐 baby
딴딴 딴따다 따 따란딴
딴딴 딴따다 따
네게 반해버렸어 baby
딴딴 딴따다 따 따란딴
딴딴 딴따다 따 따라빠빠라
Hey girl gir gir gir gir girl i
눈만뜨면 니 생각 Hey girl
자나깨나 사실 너 하나 밖에 안보여
말해봐 니 맘에 내가
말해봐 자리 잡았는지
말해줘 내게 말해줘
나는 바보 바보 바보
주변 사람들은 말해
내가 너무 적극적
이 세상에 그런 사람
어디 한둘이냐고
그걸 몰라 그녈 몰라
시기하며 하는 말
내가 부럽다면 그건
그대들이 지는 거
Sorry Sorry Sorry Sorry
내가 내가 내가 먼저
네게 네게 네게 빠져
빠져 빠져 버려 baby
Shawty Shawty Shawty Shawty
눈이 부셔 부셔 부셔
숨이 막혀 막혀 막혀
내가 미쳐 미쳐 baby
딴딴 딴따다 따 따란딴
딴딴 딴따다 따
네게 반해버렸어 baby
딴딴 딴따다 따 따라라라
딴딴 딴따다 따 따라빠빠라
Lets dance dance dance dance
Lets dance dance dance dance
Lets dance dance dance dance dance dance
Hey 이제 그만 내게 와줄래
정말 미칠 것만 같아 yeah
난 너만 사랑하고 싶어
절대 다시 한눈 팔 생각 없어 hey hey hey.
애인이라기보다 친구같은
내가 되고 싶어
너의 모든 고민 슬픔
함께 간직하고파
다시 없을 만큼 만큼
너를 너무 사랑해
내가 바란 사람 니가 바로 그
That that that girl
Sorry Sorry Sorry Sorry
내가 내가 내가 먼저
네게 네게 네게 빠져
빠져 빠져 버려 baby
Shawty Shawty Shawty Shawty
눈이 부셔 부셔 부셔
숨이 막혀 막혀 막혀
내가 미쳐 미쳐 baby
`
//* 연습과제 1
// 가사에서 'Sorry' 와 '부셔' 가 각각 몇번 반복되는지 화면에 출력해보자.
const keyword1 = 'Sorry'
const keyword2 = '부셔'

//const lyrics2 = lyrics.replace(/\s+/, "").replace(/\s+$/g, "").replace(/\n/g, "").split(" ")
// value = value.replace(/\s+/, "");//왼쪽 공백제거
// value = value.replace(/\s+$/g, "");//오른쪽 공백제거
// value = value.replace(/\n/g, "");//행바꿈제거
// value = value.replace(/\r/g, "");//엔터제거
//console.log(lyrics2)

function searchWord(keyword, n){
    const serchedIndexes = []//찾은 인덱스를 저장할 배열
    let foundIndex = lyrics.indexOf(keyword)

    while(foundIndex != -1){
        serchedIndexes.push(foundIndex)
        foundIndex = lyrics.indexOf(keyword, foundIndex + n) //다음 인덱스를 찾기 위해 찾은 배열번째에서 +n
    }
    return serchedIndexes.length
}

console.log(searchWord(keyword1, keyword1.length))
console.log(searchWord(keyword2, keyword2.length))

//* 연습과제 2
//아래 movies 배열에서 영화 발매일이 2005년과 2010년 사이 영화중 
//첫번째로 검색되는 영화를 추출해보자. find 메서드를 사용하고, 반환값은 객체이다. 
const movies = [
    {title: 'Harry Potter', release: '2003-02-22'}, 
    {title: 'Indiana Jhones', release: '2009-01-09'}, 
    {title: 'Jurassic Park', release: '2007-04-13'},
    {title: 'Iron man', release: '2012-12-18'},
    {title: 'Spider man', release: '2017-03-07'}
]

const foundMovie =movies.find((movie)=> {
    //const year = movie.release.split('-')[0] //movies의 release로 접근해서year만 잘라옴
    return movie.release > '2005-01-01' && movie.release < '2010-01-01'
})
console.log(foundMovie)
//* 연습과제 3
//아래 movies 배열에서 영화 제목에 man 이라는 단어가 포함된 영화중 
//첫번재로 검색되는 영화를 추출해보자! find 메서드를 사용하고, 반환값은 객체이다

const foundMovie2=movies.find((movie)=>{
    return movie.title.includes('man')
    //return movie.title.indexOf('man')!=-1 
})
console.log(foundMovie2)

//* 연습과제 4
//아래 movies 배열에서 2010년 이전에 발매되었고, 영화 제목의 첫글자가 J로 시작하는 
//영화를 추출해보자! find 메서드를 사용하고, 반환값은 객체이다. 

const foundMovie3=movies.find((movie)=>{
    return movie.title.startsWith('J') && movie.release.split('-')[0]<2010
})
console.log(foundMovie3)

//* 연습과제 5
//아래 words 배열에서 a 가 한번 이상 들어가는 모든 단어를 출력해보자!
const words = [
    'abc',
    'animal',
    'fruit',
    'abba',
    'abcba',
    'location',
    'radar',
    'madam',
    'mario',
    'level'
]
//배열로 리턴함 
//['abc', 'animal', 'abba', 'abcba', 'location', 'radar', 'madam', 'mario']
const foundWord=words.filter((word)=>{
    return word.includes('a')
})
console.log(foundWord)
//객체로 리턴함
function A(word){
    if(word.includes('a')){
        console.log(word)
    }

    //if(word.indexOf('a')!= -1){
    //    console.log(word)
    //}
}
words.forEach(A)

// * 연습과제 6
// 상품 유형(product_type) 이 mascara 이고, 가격(price) 이 10달러 미만인 
// 모든 화장품에 대한 정보(객체)를 검색해보자!

const API_URL = 'http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline' 

// fetch(API_URL)
// .then(function(res){
//     return res.json()
// })
// .then(function(products){
//     console.log(products) //객체 배열 

//     function foundCos(product){ 
//         //parseInt
//         if (product.product_type=== 'mascara' && parseInt(product.price) < 10){
//             console.log("6번")
//             console.log(product)
//         }
//     }
//     products.forEach(foundCos)  
// })

//* 연습과제 7 
//상품 유형(product_type) 이 lipstick 이고, 평점(rating) 이 
//4점과 5점 사이인 모든 화장품에 대한 정보(객체)를 검색해보자!  

// fetch(API_URL)
// .then(function(res){
//     return res.json()
// })
// .then(function(products){
//     console.log(products)

//     function foundCos2(product){
//         if(product.product_type === 'lipstick'){
//             if(product.rating >=4 && product.rating <5){
//                 console.log(product)
//             }
//         }
//     }
//     products.forEach(foundCos2)   
// })

//* 연습과제 8
//친구목록에서 현재 서울에 살고 있고, 
//나이가 서른 미만인 친구들만 찾아보자!
const friends = [
    {name: 'victoria', age: 13, city: 'seoul'},
    {name: 'sun', age: 34, city: 'busan'},
    {name: 'johseb', age: 25, city: 'busan'},
    {name: 'syleemomo', age: 9, city: 'seoul'},
    {name: 'hannah', age: 41, city: 'daegu'},
    {name: 'shara', age: 37, city: 'seoul'},
    {name: 'martin', age: 28, city: 'daegu'},
    {name: 'gorgia', age: 39, city: 'seoul'},
    {name: 'nana', age: 24, city: 'busan'},
    {name: 'dannel', age: 19, city: 'seoul'},
]

function foundFriend(friend){
    if(friend.city=='seoul' && friend.age <30){
        console.log(friend)
    }
}
friends.forEach(foundFriend)

//* 연습과제 9
//친구목록에서 city 프로퍼티를 기준으로 친구들이
// 사는 지역을 분류해보자!
const citySeoul = []
const cityBusan = []
const cityDaegu = []

friends.forEach((element) =>{
    if(element.city === 'seoul'){
        citySeoul.push(element)
    }
    else if(element.city === 'busan'){
        cityBusan.push(element)
    }
    else if(element.city === 'daegu'){
        cityDaegu.push(element)
    }
})
console.log("9번")
console.log("seoul : " + citySeoul.length)
console.log("daegu : " + cityDaegu.length)
console.log("busan : " + cityBusan.length)


//* 연습과제 10
//다음은 SNS 에 등록된 나의 친구목록이다. 
//친구목록에서 나보다 나이가 많은 친구들이 한명이라도 있는지 알고
// 싶다. 나의 현재 나이는 40세이고, 나보다 나이가 많은 친구가 
//있는지 알아내보자! true 나 false 를 출력하면 된다.

function findAge(friend){
    return friend.age > 40  
}

console.log(friends.some(findAge))

//* 연습과제 11
//나이(age)가 0 보다 작거나 실수인 유효하지 않은 정보를 가진 
//사용자가 존재한다. 또한, 연락처(email)에 @가 존재하지 않거나 
//.com 으로 끝나지 않은 사용자도 존재한다. 이러한 유효하지 않은
// 사용자 정보를 걸러내보자! 결과는 캡쳐화면과 같다.

const users = [
    {name: 'victoria', age: 13, city: 'seoul', email: 'victoria@gmail.com'},
    {name: 'sun', age: 34, city: 'busan', email: 'sun@gmail.com'},
    {name: 'johseb', age: 25, city: 'busan', email: 'johseb@gmail'},
    {name: 'syleemomo', age: 9.23, city: 'seoul', email: 'syleemomo@nate.com'},
    {name: 'hannah', age: 41, city: 'daegu', email: 'hannah0923*gmail.com'},
    {name: 'shara', age: 37, city: 'seoul', email: 'shara@gmail.com'},
    {name: 'martin', age: -34, city: 'daegu', email: 'martin@gmail.com'},
    {name: 'gorgia', age: 39, city: 'seoul',  email: 'gorgia@gmail.com'},
    {name: 'nana', age: 24, city: 'busan', email: 'nana@gmail.com'},
    {name: 'dannel', age: 19, city: 'seoul', email: 'dannel@gmail.com'},
]
console.log("*************")

users.forEach((user)=>{
    if(user.age > 0 && user.age % 1=== 0 && user.email.includes('@') === true && 
    user.email.includes('.com')===true ){
        console.log(user)
    }

})







