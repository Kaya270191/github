//함수의 개념 : 함수는 속성과 메서드를 가지는 객체
// function add(a,b){
//     return a+b
// }
// console.dir(add)

// add['description'] = 'add two numbers' //함수 설명 추가
// add['parameter-info'] = function(){
//     console.log(`parameters: ${add.name} function needs ${add.length} parameters`)
// }

// console.dir(add)

// console.log('----function information ----')
// console.log('description: ' , add['description'])
// add["parameter-info"]()


//함수 사용 이유: 코드의 재사용성
// const a = 3
// const b = 5

// function subtract(a,b){
//     return a<b? b-a: a-b
// }
// console.log(subtract(a,b))

// if(a<b){
//     console.log(-(a-b))
// }else{
//     console.log(a-b)
// }


//함수 정의방식(1.함수선언 2. 함수표현식, 3. 화살표 함수)
//const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']

//1. 함수선언 : 호이스팅 가능 
//입력값: 배열
//출력값: 배열(복사)
// function copyArr(arr){
//     const copiedArr = []
//     for(let element of arr){
//         copiedArr.push(element)
//     }
//     return copiedArr
// }

// const copiedArr = copyArr(launguage)
// console.log(copiedArr)
// console.log(launguage === copiedArr)


//2. 함수표현식: 변수에 할당하는 형태 
//함수표현식은 호이스팅이 안됨
// const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']
// const copyArr = function(arr){
//     const copiedArr =[]
//     for(let element of arr){
//         copiedArr.push(element)
//     }
//     return copiedArr
// }
// const copiedArr = copyArr(launguage)
// console.log('check array is same: ', launguage === copiedArr)
// console.log(copiedArr)

//3. 화살표 함수
// const launguage = ['korean', 'japanese', 'english', 'chinese', 'russian']
// const copyArr =(arr)=>{
//     const copiedArr = []
//     for(let element of arr){
//         copiedArr.push(element)
//     }
//     return copiedArr
// }
// const copiedArr = copyArr(launguage)
// console.log(copiedArr)


//코드블럭이 한 줄이면 return 생략가능
//const copyArr = arr => arr



//함수선언과 화살표 함수 차이점
//1. this 2. 생성자함수로 사용가능 여부 3. arguments
// const music = {
//     name: '금요일에 만나요',
//     artist: 'IU',
//     release: '2013-12-20',
//     info(){ //this 는 music을 가리킴
//         console.log(`${this.name} - ${this.artist} 는 ${this.release} 에 발매되었다.`)
//     }
// }

//music.info()


// this.name = '보고 싶다'
// this.artist = '김범수'
// this.release = '2002-12-17'


// const music = {
//     name: '금요일에 만나요',
//     artist: 'IU',
//     release: '2013-12-20',
//     info: ()=>{ //화살표함수에서 this 는 윈도우객체를 가리킴  
//         //console.log(`${this.name} - ${this.artist} 는 ${this.release} 에 발매되었다.`)
//         console.log(this) 
//     }
// }
// music.info()



// function Music(){
//     this.name = '보고 싶다'
//     this.artist = '김범수'
//     this.release = '2002-12-17'

//     const music = {
//         name: '금요일에 만나요',
//         artist: 'IU',
//         release: '2013-12-20',
//         info: () => { //화살표 함수의 this가 생성자함수를 가리킴 
//             console.log(this)
//             console.log(`${this.name} - ${this.artist} 는 ${this.release} 에 발매되었다.`)
//         }
//     }
//     return music
// }

// const music = new Music()
// music.info()


//화살표 함수는 new 키워드와 쓸 수 없음
// function Music(){
//     this.name = '보고 싶다'
//     this.artist = '김범수'
//     this.release = '2002-12-17' 
// }

// const music = new Music()


//함수 선언으로 정의한 함수는 arguments 객체(유사배열:객체와 배열의 중간단계) 사용 가능 

// function add(a,b){
//     console.log(arguments[0])
//     console.log(arguments[1])
// }
// add('apple','banana')



//함수는 하나의 기능을 수행하는 것이 좋음
// function subtract(a,b){ //빼기함수
//     return compare(a,b) ? (a-b) : (b-a)
// }

// function compare(a,b){ //값 비교함수
//     if(a>b) return true
//     else return false
// }


//함수의 파라미터 기본값 설정하기
// function add(a,b){
//     //타입체크
//     if(typeof a === 'undefined') a=0
//     if(typeof b === 'undefined') b=0
//     return a+b
// }

// console.log(add(3,5))
// console.log(add(3))
// console.log(add())


// function add(a,b){
//     //타입체크 
//     a = typeof a !== 'undefined' ? a : 0
//     b = typeof b !== 'undefined' ? b : 0
//     return a+b
// }
// console.log(add(3,5))
// console.log(add(3))
// console.log(add())

// function add(a,b){
//     //타입체크
//     a = a||0
//     b = b||0
//     return a+b
// }

// console.log(add(3, 5)) // 8
// console.log(add(3)) // 3
// console.log(add()) // 0
// console.log(add('', null)) // 0


// function add(a = 0, b = 0){ //undefied인 경우 0으로 초기화함
//     return a + b
// }
// console.log(add(3, 5)) // 8
// console.log(add(3)) // 3
// console.log(add()) // 0
// console.log(add('', null)) // null


// function add(a = 0, b = 0, c = a + b){ //undefied인 경우 0으로 초기화함
//     return a + b +c
// }
// console.log(add(3, 5, 7)) // 15
// console.log(add(3, 2)) // 10
// console.log(add()) // 0
// console.log(add('', null)) // nullnull



// function isValid(a,b){
//     return a>b
// }
// //기본값을 설정할때 다양한 타입의 값이 설정.문자열, 숫자, 논리형, 객체, 배열, 함수 등
// function add(a = 'apple', b= false, c=a+b, d = isValid(a,b), e=3, f={name:'sun', age:23}, g=[3,4,5]){ 
//     return a + b +c+d+e+f+g
// }

// console.log(3,5,7,9,11,13,15)
// console.log(add(3, 2)) 
// console.log(add()) 
// console.log(add('', null))


// function add(a,b){
//     //a,b 값이 null 또는 undefined 인 경우에 0으로 초기화 
//     a = a ?? 0
//     b = b ?? 0
//     return a+b
// }
// console.log(add(3,5)) //8
// console.log(add(3)) //3
// console.log(add()) //0
// console.log(add('', null))


// function add(a,b){
//     //a,b 값이 null 또는 undefined 인 경우에 0으로 초기화 
//     a = a || 0
//     b = b || 0
//     return a+b
// }
// console.log(add(3, 5)) // 8
// console.log(add(3)) // 3
// console.log(add()) // 0
// console.log(add('', '')) // 0


//함수 파라미터 유효성 검증하기
// 배열 복사하기
function copyArr(arr){
    if(!Array.isArray(arr)) return //인자가 배열이 아니면 아무것도 안함 
    if(arr.length === 0) return // 빈 배열인 경우도 아무것도 안함 

    const copiedArr = []

    for(let element of arr){
        copiedArr.push(element)
    }

    return copiedArr
}

const copiedArr = copyArr()
//console.log(copiedArr)

//테스트 케이스
const copiedArr1 = copyArr(3)
const copiedArr2 = copyArr('apple')
const copiedArr3 = copyArr(false)
const copiedArr4 = copyArr([])
const copiedArr5 = copyArr({})
const copiedArr6 = copyArr(null)

console.log(copiedArr1)
console.log(copiedArr2)
console.log(copiedArr3)
console.log(copiedArr4)
console.log(copiedArr5)
console.log(copiedArr6)



//나머지 매개변수를 이용한 가변항 함수 만들기
// function add(...args){ //인자가 몇 개 들어올지 모를때 arg라는 배열로 담김
//     console.log(args)

//     let sum =0
//     for(let arg of args){
//         sum+= arg
//     }
//     return sum 
// }

// console.log(add()) 
// console.log(add(1))
// console.log(add(1, 2))
// console.log(add(1, 2, 3))
// console.log(add(1, 2, 3, 4))
// console.log(add(1, 2, 3, 4, 5))

// function sortByOrder(flag, ...args){//flag 는 첫번째 인자, 나머지는 args 배열에 담김
//     args.sort((a,b) => flag*(a-b))
//     return args

// }
// console.log(sortByOrder(1,5,2,3,1,4))// 오름차순 1
// console.log(sortByOrder(-1,5,2,3,1,4))// 내림차순 -1


//함수 인자 전개하기
//인자가 객체인 경우

// function printPersonInfo({name, age, friends}){
//     console.log('name: ', name)
//     console.log('age: ', age)
//     console.log('friends: ', friends.join(' '))
// }

// const person = {
//     name: 'sunrise',
//     age: 21,
//     friends: ['victoria', 'smith', 'mark']
// }
// printPersonInfo(person)


// //인자가 배열인 경우 
// function printCircleInfo(x,y,radius){
//     console.log('원의 중심: ', x, ',', y)
//     console.log('반지름: ', radius)
// }
// printCircleInfo(...[3,4,5])//배열요소를 함수 각각의 파라미터에 따로 전달해야 하는 경우


//함수의 반환값
// function print(value){ //함수의 반환값은 기본적으로 undefined, return이 없으면 undefined 반환함
//     console.log(value)
// }
// const printReturned = print(3)
// console.log(printReturned)


// function print(value){
//     console.log(value)
//     return //return 키워드 뒤에 아무런 값도 반환하지 않아도 undefined 를 반환
// }

// const printReturned = print(3)
// console.log(printReturned)
