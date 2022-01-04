//* 연습과제 2
//배열의 pop 메서드를 이용하여 배열요소의 순서가 뒤바뀐 새로운 배열을 만들어보자!
const companies = ['Samsung', 'LG', 'Google', 'Facebook', 'Amazon']
const companiesReversed = []

// const reverse = [...companies].reverse();
// console.log(reverse)

for(let i=0; i<5; i++){
    const companyPop = companies.pop()
    companiesReversed.push(companyPop)
}
console.log(companiesReversed)


//* 연습과제 3
//다음은 SNS 에 등록된 나의 친구목록이다. 
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
//아래와 같이 사용자가 오늘 친구를 2명 추가해서 frineds 배열의 3번째 위치에 들어가야 한다면 어떻게 하면 될까?
const newFriends = [
    {name: 'Ami', aage: 27, city: 'ulsan'},
    {name: 'gracias', aage: 21, city: 'ulsan'},
]
const addFriends = friends.splice(2,0, newFriends[0],newFriends[1])
console.log(friends)

//연습과제4
//hannah 와 shara 를 친구목록에서 제거
const friends1 = [
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
const removeFriends1 = friends1.splice(4,2)
console.log(friends1)

//* 연습과제 5
//서울에 사는 친구들을 친구목록에서 제거해보자!
const friends2 = [
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

const ruralFriends=[]

let filtered = friends2.filter((element)=>{
    const noSeoul = (element.city !== 'seoul')
    if(noSeoul==true){
        ruralFriends.push(element)
    }
})
console.log(ruralFriends)


//* 연습과제 6
// friends 배열을 나이순으로 정렬한 다음 서른보다 적은 친구만 추출

const friends3 = [
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
const myFrineds3=[]

function comparedAge(a,b){ //나이순으로 정렬 
    return a.age - b.age
}
friends3.sort(comparedAge)
//console.log(friends3)

friends3.forEach((a)=>{
    if(a.age < 30){
        myFrineds3.push(a)
    }
})
console.log(myFrineds3)

//* 연습과제 7
//친구의 이름에 대하여 알파벳 순으로 정렬 
const friends4 = [
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

friends4.sort((a,b)=>{
    if(a.name > b.name) return 1
    if(a.name < b.name) return -1 
    if(a.name === b.name) return 0
})
console.log(friends4)


//* 연습과제 8
//영화 발매일 (release) 을 기준으로 최신순으로 정렬
const movies = [
    {title: 'Harry Potter', release: '2003-02-22'}, 
    {title: 'Indiana Jhones', release: '2009-01-09'}, 
    {title: 'Terminator', release: '2007-04-11'},
    {title: 'Dracula', release: '2007-04-13'},
    {title: 'Jurassic Park', release: '2007-05-13'},
    {title: 'Iron man', release: '2012-12-18'},
    {title: 'Spider man', release: '2017-03-07'}
]

movies.sort((a,b)=>{
    if(a.release < b.release) return 1
    if(a.release > b.release) return -1
    if(a.release === b.release) return 0
})
console.log(movies)

