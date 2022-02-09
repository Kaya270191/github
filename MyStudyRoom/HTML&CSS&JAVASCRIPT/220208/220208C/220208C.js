//문법 13. 함수의 활용

//1.함수 스코프 - 렉시컬 스코프(Lexical Scope) 또는 정적 스코프(Static Scope)
//스코프: 함수가 접근할 수 있는 범위 


// const fruit = 'apple' // 전역변수

// // 글로벌 스코프에 선언된 printA 함수
// function printA(){
//     const fruit = 'banana' // 지역변수
//     console.log(fruit)
// }

// printA() // banana



// const fruit = 'apple' //전역변수
// function printA(){
//     const fruit = 'banana' //지역변수 
//     printB()//함수 호출 
// }
// //함수 스코프는 렉시컬 스코프 또는 정적 스코프이다. 
// //함수를 어디서 호출하였는지가 아니라 함수를 어디서 선언하였는지에 따라 상위 스코프가 결정된다는 뜻
// function printB(){
//     console.log(fruit) //전역변수를 프린트 
// }

// printA() // apple
// printB() // apple



// const global = 3 // 전역변수 (상위 스코프)

// function globalFunction(){ //글로벌 스코프에 선언된 함수 
//     const local = 1 // 지역변수
//     return global + local //함수스코프는 렉시컬 스코프이므로 자신의 지역변수와 선언된 위치에서 상위 스코프의 변수에 접근 가능
// }

// console.log(globalFunction())



// const global = 3 // 전역변수 (상위 스코프)

// function globalFunction(){
//     const localOuter = 2 // 외부함수 스코프
//     function localFunction(){
//         const local = 1 // 지역변수 
//         return global + localOuter + local //자신보다 상위 스코프의 변수에 접근가능함-> '스코프체인'
//     }
//     return localFunction()
// }

// console.log(globalFunction()) //6



//2.콜백함수 (callback function)
//함수의 인자로 전달되어 함수의 내부에서 실행되는 함수

// const numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]

// function map(f, arr){ //첫번째 파라미터는 콜백함수 f, 두번째:배열
//     const newArr = []
//     for(let i in arr){
//         newArr[i] = f(arr[i])
//     }
//     return newArr
// }

// function str2num(element){//콜백함수 
//     return parseInt(element)
// }

// const numbersParsed = map(str2num, numbers)//함수이름(콜백함수이름,배열)
// console.log(numbersParsed)



// function add(a, b){//콜백함수
//     return a + b
// }
// function subtract(a, b){//콜백함수
//     return a - b
// }
// function multiply(a, b){//콜백함수
//     return a * b
// }
// function divider(a, b){//콜백함수
//     return a / b
// }

// function calculator(mode, a, b, ...funcs){ //콜백함수를 ...funcs이라는 배열에 담음
//     let ret = null
//     switch(mode){
//         case '+': //mode값이 +이면 
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
//     }
//     return ret
// }
// const ret1 = calculator('+', 3, 4, add, subtract, multiply, divider)
// const ret2 = calculator('-', 3, 4, add, subtract, multiply, divider)
// const ret3 = calculator('*', 3, 4, add, subtract, multiply, divider)
// const ret4 = calculator('/', 3, 4, add, subtract, multiply, divider)

// console.log(ret1)
// console.log(ret2)
// console.log(ret3)
// console.log(ret4)



//3. 클로저=> 캡슐화, 은닉화 => 보호해야 할 변수가 있을 때 
//독립적인 실행환경
//클로저가 형성되면 외부함수 initCount 의 실행이 종료되어도 지역변수 cnt 는 메모리에서 사라지지 않는다
//클로저에서는 cnt 변수가 함수에 의해서만 변경 가능하도록 보호받음

// function initCount(){
//     let cnt = 0 //외부함수의 지역변수 
//     function increaseCount(){
//         cnt++
//         return cnt
//     }
//     return increaseCount
// }

// const cnt1 = initCount() // 클로저 (독립적인 실행환경) 생성 => 지역변수 cnt값을 기억
// const cnt2 = initCount() // 클로저 (독립적인 실행환경) 생성
// const cnt3 = initCount() // 클로저 (독립적인 실행환경) 생성

// cnt1() 
// console.log(cnt1()) //2

// cnt2()
// cnt2()
// console.log(cnt2()) //3

// cnt3()
// cnt3()
// cnt3()
// console.log(cnt3()) //4



//클로저 사용 안 하고 위와 동일한 기능 작동
//동일한 실행환경을 만드려면 변수를 여러개 생성해야 한다
// function increaseCount(cnt){
//     return ++cnt
// }

// let cnt1 = 0
// let cnt2 = 0
// let cnt3 = 0

// cnt1 = increaseCount(cnt1)

// cnt2 = increaseCount(cnt2)
// cnt2 = increaseCount(cnt2)

// cnt3 = increaseCount(cnt3)
// cnt3 = increaseCount(cnt3)
// cnt3 = increaseCount(cnt3)

// console.log(cnt1) //1
// console.log(cnt2) //2
// console.log(cnt3) //3



// function makeAdder(){
//     let a=0
//     let b=0
//     let c=0
//     function addNums(){
//         return ++a + ++b + ++c
//     }
//     return addNums //클로저 => 독립적인 실행환경 => 클로저
// }
// const adder1 = makeAdder()
// const adder2 = makeAdder()
// const adder3 = makeAdder()

// console.log(adder1())//3
// console.log(adder2())//3
// console.log(adder3())//3


// //클로저 사용 안 하고 위와 동일한 기능 작동
// let a1 = 0, b1 = 0, c1 = 0
// let a2 = 0, b2 = 0, c2 = 0
// let a3 = 0, b3 = 0, c3 = 0

// function addNums(a, b, c){
//     return ++a + ++b + ++c
// }

// console.log(addNums(a1, b1, c1)) //첫번째 클로저에 대한 지역변수 대신
// console.log(addNums(a2, b2, c2)) //두번쨰 클로저에 대한 지역변수 대신
// console.log(addNums(a3, b3, c3)) //세번째 클로저에 대한 지역변수 대신



//* 클로저 활용
//1 함수 팩토링
// function multiplyXtimes(x){
//     function multiply(y){
//         return x * y
//     }
//     return multiply
// }

// const multiply3times = multiplyXtimes(3) //3배수하는 클로저

// console.log(multiply3times(4)) // 인자로 주어진 값에 3배를 반환
// console.log(multiply3times(13)) // 인자로 주어진 값에 3배를 반환

// const multiply5times = multiplyXtimes(5) //5배수하는 클로저 

// console.log(multiply5times(4)) // 인자로 주어진 값에 5배를 반환
// console.log(multiply5times(13)) // 인자로 주어진 값에 5배를 반환

// const multiply7times = multiplyXtimes(7) //7배수하는 클로저 



// // 커링(Currying) :동일한 동작을 하지만 반환된 내부함수를 변수에 저장하지 않고 곧바로 함수를 실행
// // 커링은 순차적으로 함수를 호출해야 할때나 부분적으로 함수의 일부 기능만 실행하고 싶을때 사용하면 좋다

// console.log(multiply7times(4)) // 인자로 주어진 값에 7배를 반환
// console.log(multiply7times(13)) // 인자로 주어진 값에 7배를 반환

// console.log(multiplyXtimes(3)(4)) // 인자로 주어진 값에 3배를 반환
// console.log(multiplyXtimes(3)(13)) // 인자로 주어진 값에 3배를 반환


// console.log(multiplyXtimes(5)(4)) // 인자로 주어진 값에 5배를 반환
// console.log(multiplyXtimes(5)(13)) // 인자로 주어진 값에 5배를 반환


// console.log(multiplyXtimes(7)(4)) // 인자로 주어진 값에 7배를 반환
// console.log(multiplyXtimes(7)(13)) // 인자로 주어진 값에 7배를 반환



//모듈 (module pattern) - 프라이빗 멤버변수와 프라이빗 메서드를 구현
// function initCount(){
//     let _cnt = 0 //프라이빗 변수
//     function _updateCount(diff){  //프라이빗 메서드
//         _cnt += diff
//     }
//     return {
//         increaseCount(){ //퍼블릭 메서드
//             _updateCount(1)
//         },
//         decreaseCount(){ //퍼블릭 메서드 
//             _updateCount(-1)
//         },
//         get cnt(){
//             return _cnt
//         }
//     }
// }

// const counter1 = initCount() // 클로저 (독립적인 실행환경) 생성
// const counter2 = initCount() // 클로저 (독립적인 실행환경) 생성
// const counter3 = initCount() // 클로저 (독립적인 실행환경) 생성

// counter1.increaseCount()
// console.log(counter1.cnt) // 1

// counter2.increaseCount()
// counter2.increaseCount()
// counter2.increaseCount()
// counter2.decreaseCount()
// console.log(counter2.cnt) // 2

// counter3.decreaseCount()
// counter3.decreaseCount()
// counter3.decreaseCount()
// counter3.decreaseCount()
// counter3.increaseCount()
// console.log(counter3.cnt) // -3


// //모듈 패턴
// var Component = (function(){
//     var _name = "" //프라이빗 변수 

//     function _setAttributes(el, attrs){//프라이빗 메서드 
//         if(attrs === undefined || attrs === null || Object.keys(attrs).length ===0) return //유효성 검사 
//         for( var prop in attrs){ // {class: , href} => attr
//             el.setAttribute(prop, attrs[prop])
//         }
//     }

//     function _setValues(el, values){//프라이빗 메서드 
//         if(values === undefined || values === null || values.length ===0 ) return //유효성 검사 
//         el.innerHTML ="" //자식요소 초기화 
//         values.map(function(value){
//             el.append(value) //부모의 자식요소 추가
//         })
//     }

//     //퍼블릭 메서드
//     var create = function(tag, attrs, values){
//         var el = document.createElement(tag) // dom 객체(부모요소) 생성
//         _setAttributes(el, attrs) //속성 설정
//         _setValues(el, values) //자식요소 추가 
//         return el
//     }

//     var update = function(selector, attrs, values){
//         var targetEl = document.querySelector(selector) // dom 객체(부모요소) 생성
//         if(!targetEl) return 
        
//         _setAttributes(targetEl, attrs) //속성 업데이트
//         _setValues(targetEl, values) //자식업데이트
//         return targetEl
//     }


//     return {
//         create, // dom 생성하는 퍼블릭 메서드 
//         update, // dom 업데이트하는 퍼블릭 메서드
//         get name(){
//             return _name //프라이빗 멤버 변수 => 컴포넌트 이름 
//         },
//         set name(value){
//             _name = value
//         }
//     }
// })()


// var mainDiv = Component.create("div", { class: "main" }, [
//     Component.create("h1", { class: "title" }, ["main page"]),
//     Component.create("textarea", { class: "text-area" })
//   ]);

//   mainDiv.name = "main pgae"; // 접근자 프로퍼티 쓰기 (데이터 캡슐화: 접근자 메서드를 통해서만 읽기, 쓰기 가능)
//   console.log(mainDiv.name); // 접근자 프로퍼티 읽기

//   console.log(mainDiv)









//클로저 사용시 주의할 점 
// const popupBtns =  document.querySelectorAll('.popup')

// //핸들러 반복문 돌면서 연결해줌
// function addPopupEvents(){
//     for(let i=0; i<popupBtns.length; i++){
//         console.log(popupBtns[i])
//         popupBtns[i].onclick = function(){ // 이벤트핸들러 함수
//             alert(i+1)
//         }
//     }
// }

// addPopupEvents()



// const popupBtns =  document.querySelectorAll('.popup')

// function addPopupEvents(){
//     popupBtns.forEach( (btn, i) => {
//         console.log(btn)
//         btn.onclick = function(){
//             alert(i)
//         }
//     })
// }

// addPopupEvents()




// 즉시실행함수 (mmediately-invoked function expression) 
// //선언함과 동시에 실행하는 함수 

// const fruits = ["apple", "banana", "orange"]




// 재귀함수와 메모이제이션 (memoization)
// function factorial(n){
//     console.log('fact !', n)
//     if(n === 0 || n === 1) return 1
//     else return n * factorial(n-1)
// }

// console.log(factorial(3) + factorial(6))



// function factorial(n){
//     if(factorial[n]) return factorial[n] // 이미 계산된 결과가 있으면 저장해 놓은 값을 사용함

//     console.log('fact !', n)
//     if(n === 0 || n === 1) return 1
//     else{
//         factorial[n] = n * factorial(n-1) // 계산된 중간결과를 저장해 놓음
//         return factorial[n]
//     }
// }

// console.log(factorial(3) + factorial(6))



//* 동적으로 함수의 this 값 변경하기 - call, apply, bind 
// function getInfo(){ //function 키워드로 선언한 함수는 기본적으로 this 값을 가지고 있다. 
//     console.log(this) // 윈도우 객체
// }
// getInfo()



// function getInfo(){
//     console.log(this)
// }

// const sunrise = {
//     name: 'sunrise',
//     age: 23,
//     city: "daegu"
// }

// const victoria = {
//     name: 'victoria',
//     age: 17,
//     city: 'seoul'
// }

// //객체를 생성하고 함수의 call 메서드를 이용하여 함수내에 동적으로 this 값을 주입 ->바인딩
// getInfo.call(sunrise)
// getInfo.call(victoria)



function getInfo(friend1, friend2){
    console.log(this)
    console.log(friend1, friend2)
}

const sunrise = {
    name: 'sunrise',
    age: 23,
    city: "daegu"
}

const victoria = {
    name: 'victoria',
    age: 17,
    city: 'seoul'
}

//call, apply 메서드는 메서드 실행과 동시에 this 값을 바인딩하고 getInfo 함수를 실행
getInfo.call(sunrise, '영희', '철수')
getInfo.call(victoria, '영희', '철수')

getInfo.apply(sunrise, ['영희', '철수']) //apply 메서드는 첫번째 인자를 제외하고 배열에 인자를 담아서 전달
getInfo.apply(victoria, ['영희', '철수'])

//bind 메서드는 실행하면 this 값만 바인딩하고 getInfo 함수는 실행되지 않는다
bindedGetInfo1 = getInfo.bind(sunrise)
bindedGetInfo2 = getInfo.bind(victoria)

bindedGetInfo1('영희', '철수')
bindedGetInfo2('영희', '철수')