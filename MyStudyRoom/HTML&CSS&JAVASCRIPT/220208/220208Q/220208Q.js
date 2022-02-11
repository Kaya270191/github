//연습과제 1 - 렉시컬 스코프 
// const fruit = 'apple'
// let printB = null

// function printA(){
//     const fruit = 'banana'

//     printB = function(){
//         console.log(fruit) 
//     }
//     printB()
// }

// printA() // banana
// printB() // banana


//연습과제 2
//서울에 사는 친구들만 추출해보자! 
//filter 함수의 첫번째 인자에는 filterSeoul 이라는 콜백함수가
// 들어가고, 두번째 인자에는 친구목록이 들어간다. 
//filter 함수는 조건에 맞는 배열요소들만 추출된 새로운 배열을 반환

// const friends = [
//     {name: 'victoria', age: 13, city: 'seoul'},
//     {name: 'sun', age: 34, city: 'busan'},
//     {name: 'johseb', age: 25, city: 'busan'},
//     {name: 'syleemomo', age: 9, city: 'seoul'},
//     {name: 'hannah', age: 41, city: 'daegu'},
//     {name: 'shara', age: 37, city: 'seoul'},
//     {name: 'martin', age: 28, city: 'daegu'},
//     {name: 'gorgia', age: 39, city: 'seoul'},
//     {name: 'nana', age: 24, city: 'busan'},
//     {name: 'dannel', age: 19, city: 'seoul'},
//]

// function filter(f, arr){
//     const newArr =[] //빈 배열 
//     for(let i in arr){
//         if(f(arr[i])){ //콜백함수 호출 - true 이면 
//             newArr.push(arr[i]) //배열에 추가 
//         }
//     }
//     return newArr
// }

// function filterSeoul(element){ //서울 사는 사람 찾는 콜백함수 
//     if(element.city === 'seoul')
//         return true
//     else
//         return false
// }


// //교수님 답
// function filter(f, arr){
//     const newArr = [] //빈 배열
//     let index = 0 //빈 배열의 인덱스값

//     for(let i in arr){
//         if(f(arr[i])){
//             newArr[index] = arr[i]
//             index++ //다음 인덱스자리를 위해서 ++
//         }
//     }
//     return newArr
// }

// function filterSeoul(friend){
//     return friend.city === 'seoul'
// }



// const seoulFriends = filter(filterSeoul, friends)
// console.log(seoulFriends)


//* 연습과제 3
//아래 코드는 계산기 예제에서 pow 라는 기능을 추가하는 중이다.
// pow 함수가 동작하도록 코드를 완성해보자! pow(2, 3)은 2의 3제곱이고, 
//pow(3, 4)는 3의 4제곱이다. 

// function add(a, b){
//     return a + b
// }
// function subtract(a, b){
//     return a - b
// }
// function multiply(a, b){
//     return a * b
// }
// function divider(a, b){
//     return a / b
// }
// function pow(a, b){
//     return a**b
// }

// //교수님 답 
// function pow(a, b){
//     let ret = 1
//     for(let i=0 ; i<b; i++){
//         ret *= a
//     }
//     return ret
// }



// function calculator(mode, a, b, ...funcs){
//     let ret = null
//     switch(mode){
//         case '+':
//             ret = funcs[0](a, b)
//             break
//         case '-':
//             ret = funcs[1](a, b)
//             break
//         case '*':
//             ret = funcs[2](a, b)
//             break
//         case '/':
//             ret= funcs[3](a, b)
//             break
//         case '^':
//             ret = funcs[4](a, b)
//             break
//     }
//     return ret
// }

// // 테스트 케이스
// const ret1 = calculator('+', 3, 4, add, subtract, multiply, divider, pow)
// const ret2 = calculator('-', 3, 4, add, subtract, multiply, divider, pow)
// const ret3 = calculator('*', 3, 4, add, subtract, multiply, divider, pow)
// const ret4 = calculator('/', 3, 4, add, subtract, multiply, divider, pow)
// const ret5 = calculator('^', 3, 4, add, subtract, multiply, divider, pow)

// console.log(ret1)
// console.log(ret2)
// console.log(ret3)
// console.log(ret4)
// console.log(ret5)



//* 연습과제 4
//아래는 댓글에서 비속어가 포함된 단어들을 걸러내는 필터링 기능의 코드이다.
//아래 코드와 동일한 결과가 출력되도록 클로저를 활용하여 다시 작성해보자!
// const comment = '너는 진짜 못말리는 바보 똥개 그지다 !'
// const insults = ['바보', '똥개', '그지']

// function separateStr(str, delimeter){//str 을 ' '  기준으로 나눔 
//     console.log(str.split(delimeter)) //빈칸 기준으로 나눠서 배열로 리턴 
//     return str.split(delimeter)    
// }
// function filterKeyword(arr, keyword){ //keyword === insult
//     return arr.filter(word => !word.includes(keyword))
// }
// let strSeparated = separateStr(comment, ' ')

// for(let insult of insults){ //insults 배열을 순환 
//     strSeparated = filterKeyword(strSeparated, insult)
// }
// console.log(strSeparated)

// //클로저
// function separateStr(str, delimeter){//str 을 ' '  기준으로 나눔 
//     //console.log(str.split(delimeter)) //빈칸 기준으로 나눠서 배열로 리턴 
//     let arr = str.split(delimeter)
//     //console.log(arr)   
    
//     function filterKeyword(keywords){
//         for(let keyword of keywords){ //insults 배열을 순환
//             arr = arr.filter(word => !word.includes(keyword))
//          }return arr
//     }
//     return filterKeyword
// }

// let strSeparated = separateStr(comment, ' ')(insults)
// console.log(strSeparated)



//* 연습과제 5
//아래 코드는 배열에서 특정 배열요소가 포함되어 있는지 검색하는 기능이다. 
//아래 코드와 동일한 결과가 출력되도록 클로저를 활용하여 다시 작성해보자!

// const animals = ['cat', 'lion', 'turtle', 'dog', 'pig']
// const fruits = ['apple', 'banana', 'strawberry', 'pineapple', 'pear']

// // function searchItemInCategory(category, key){
// //     return category.filter(item => item === key)[0]
// // }

// function searchItemInCategory(category){
//     console.log(category)
//     function searchKeyword(key){
//         console.log(category.filter(item => item === key)[0]) //filter는 []을 반환함 그래서 0번째 값이 걸러져 나와 이것을 리턴함 
//         return category.filter(item => item === key)[0]
//     }return searchKeyword
// }

// console.log(searchItemInCategory(animals)('turtle')) // searchItemInCategory 내부의 category 변수에는 접근하지는 못하지만 외부인자에 의하여 수정이 가능함
// console.log(searchItemInCategory(animals)('pig'))
// console.log(searchItemInCategory(animals)('banana'))

// console.log(searchItemInCategory(fruits)('strawberry'))
// console.log(searchItemInCategory(fruits)('apple'))
// console.log(searchItemInCategory(fruits)('lion'))



//연습과제 6
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


function createPerson(name, age, city, friends){
    let _friends = JSON.parse(JSON.stringify(friends)) // 프라이빗 멤버변수를 보호하기 위하여 깊은복사로 저장함

    return {
        name, // 퍼블릭 멤버변수
        age,  // 퍼블릭 멤버변수
        city, // 퍼블릭 멤버변수

        get friends(){ //퍼블릭 메서드 
            return JSON.parse(JSON.stringify(_friends)) // 프라이빗 변수를 보호하기 위하여 깊은복사로 조회함
        },
        filterFriendsInMyCity(){ //퍼블릭 메서드 
            return this.friends.filter(friend => friend.city === this.city) 
        }
    }
}


const person = createPerson('영희', 23, 'daegu', friends)

console.log(person.friends === friends) // 전역변수 friends 와 프라이빗변수 _friends 주소가 다름을 확인함 (복사본을 저장하기 때문)
person.friends[0].name =  "태양" // 프라이빗 변수 _friends 를 변경하지 못함 (복사본을 조회하기 때문)

console.log(person.friends) 
console.log(person.filterFriendsInMyCity())

const person2 = createPerson('철수', 35, 'seoul', friends)
console.log(person2.friends) 
console.log(person2.filterFriendsInMyCity())

person2.name = "길동" // name 은 퍼블릭 멤버변수이므로 변경이 가능함
console.log(person2.name)

