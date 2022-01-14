//* 2차원 배열을 생성하는 방법
//배열 리터럴 사용
//const _2dArray = [[1, 2], [3, 4], [5, 6], [7,8], [9, 10]]
// const _2dArray = [] //빈 배열 
// const rows = 5 //행
// const columns = 2 //열

// for(let i=0; i<rows; i++){
//     const element = [] //배열 안에 들어갈 배열 생성 
    
//     for(let j=columns*i; j<columns*i+columns; j++){
//         element.push(j+1) //이차원 배열의 요소를 일차원 배열에 넣기 
//     }
//     _2dArray.push(element)
// }
// console.log(_2dArray)


//Array 생성자 함수 사용
// const rows = 5
// const columns = 2
// const _2dArray = new Array(rows)

// for(let i=0; i<rows; i++){
//     const element = new Array(columns)
//     for(let j=columns*i; j<columns*i + columns; j++){
//         element[j - columns*i] = j+1
//     }
//     _2dArray[i] = element
// }


//* 2차원 배열을 조회하는 방법
// const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]
// for(let fruit of fruits){
//     for(let i in fruit){ //for in 문에서 i는 문자가 됨
//         switch(i){
//             case '0':
//                 console.log('name', fruit[i])
//                 break;
//             case '1':
//                 console.log('price',fruit[i])
//                 break;

//         }
//     }
// }


//* 2차원 배열을 변경하는 방법
// const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]
// for(let fruit of fruits){
//     fruit.push(Math.floor(Math.random()*100+1))
// }
// console.log(fruits)



//* 2차원 배열의 요소를 삭제하는 방법
// const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]
// // delete fruits[1] //내용만 삭제되고 배열의 길이는 그대로임 
// // console.log(fruits)
// fruits.splice(1,1) //1번째에서 1개 삭제 
// console.log(fruits)


// * 2차원 배열을 출력하는 방법
// const fruits = [['apple', 570], ['orange', 270], ['strawberry', 30]]
// console.log(fruits.toString()) //문자열로 변경해서 출력
// console.table(fruits) //테이블로 출력


//* 객체들의 배열을 2차원 배열로 변경하기
// const persons = [
//     {name: 'sunrise', age: 23},
//     {name: 'victoria', age: 19},
//     {name: 'daniel', age: 28},
//     {name: 'ammy', age: 21},
//     {name: 'smith', age: 32},
// ]

// for(let i in persons){
//     persons[i] = [persons[i].name, persons[i].age]
//     //persons[i] = [persons[i]['name'], persons[i]['age']]
// }
// console.log(persons)


//* 2차원 배열을 객체들의 배열로 변경하기
// const persons = [
//     [ "sunrise", 23],
//     [ "victoria",19],
//     [ "daniel", 28],
//     [ "ammy", 21],
//     [ "smith", 32]
// ]

// for(let i in persons){
//     persons[i] = {name: persons[i][0], age: persons[i][1]}
// }
// console.log(persons)


//* 2차원 배열을 1차원 배열로 변환하는 방법
// const persons = [
//     [ "sunrise", 23],
//     [ "victoria",19],
//     [ "daniel", 28],
//     [ "ammy", 21],
//     [ "smith", 32]
// ]
// let _1dArray = []
// for(let person of persons){
//     _1dArray = _1dArray.concat(person)
// }
// console.log(_1dArray)


//* 1차원 배열을 2차원 배열로 변환하는 방법
// const persons = [
//     "sunrise", 23, "victoria", 19, "daniel", 28, "ammy", 21, "smith", 32
// ]

// const columns = 2
// const rows = persons.length / columns
// const _2dArray = new Array(rows).fill(0)

// for(let i=0; i<rows; i++){
//     const person = new Array(columns).fill(0)
//     for(let j=0; j<columns; j++){ //j가 0,1
//         person[j] = persons[columns*i+j] //열의 갯수 * 행의 인덱스 + 열의 인덱스
//     }
//     _2dArray[i] = person
// }
// console.table(_2dArray)
