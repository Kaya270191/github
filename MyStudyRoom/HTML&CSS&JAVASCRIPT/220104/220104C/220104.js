
//[배열].push(추가할 요소)
const seasons = ['spring', 'summer', 'autumn'] //원래배열
const arrLength = seasons.push('winter') //배열.push('추가원소')

console.log(seasons)
console.log(arrLength)

const multiplyBySix = []  //빈 배열
for(let i=0; i<100; i++){ //6의 배수 요소를 배열에 넣기 
    multiplyBySix.push(6*i)
}
console.log(multiplyBySix)



//데이터 가공 => 데이터 형태를 변경한 것 (문자열=> 객체)
const movies = ['Haprry potter', 'Doctor stranger', 'Iron man', 'Spider man', 'Widow']
const moviesInfo =[] //빈 배열

//for ~ in(인덱스) +for ~ of(각각의 배열요소)
function addMovieInfo(movie, index){
    moviesInfo.push({title:movie, id: index})//배열에 객체요소 추가
}
movies.forEach(addMovieInfo)
console.log(moviesInfo)

//화살표 함수
movies.forEach((movie, index)=>{
    moviesInfo.push( {title: movie, id: index})
})
console.log(moviesInfo)



//는 다수의 값을 배열요소로 추가
//[배열].push(추가할 요소 1, 추가할 요소 2, 추가할 요소 3, ...)
const cities = ['seoul', 'busan', 'daegu']
cities.push('daejeon', 'ulsan')
console.log(cities)

//배열+배열  스프레드 연산자(...)를 사용
const cities1 = ['seoul', 'busan', 'daegu']
const citiesToAdd = ['deajeon', 'ulsan']
cities1.push(...citiesToAdd)
console.log(cities1)


//[배열].pop()
//배열에서 마지막 요소를 제거
//빈 배열의 경우 undefined 를 반환
const companies = ['Samsung', 'LG', 'Google', 'Facebook', 'Amazon']
console.log(companies.pop()) //마지막 요소가 제거되고 반환값이 됨
console.log(companies)



//[배열].splice(변경 시작 인덱스, 삭제할 요소의 수, 추가할 요소 1, 추가할 요소2, ...)
//반환값으로는 제거한 요소들이 담겨져 있는 배열
const fruits = ['apple', 'orange', 'watermelon']
const removedFruits=fruits.splice(1,0,'바나나') //1번자리에 삭제안함 바나나추가
console.log(fruits)
console.log(removedFruits) //제거한 요소들이 담겨져 있는 배열을 리턴 

const removedFruits1 = fruits.splice(1,0,'코코넛','딸기')//1번자리에 삭제안함, 코코넛 스트로베리 추가
console.log(fruits)
console.log(removedFruits1) //제거한 요소가 담긴 배열을 리턴->  삭제한 게 없으니 빈배열 리턴

const removedFruits2 = fruits.splice(2, 1) //2번자리에서 시작 1개 요소 제거 
console.log(fruits)
console.log(removedFruits2)

const removedFruits3 = fruits.splice(0, 3, '배', '레몬')//0번째자리에서부터 3개 요소 제거하고 0번 자리에 pear lemon추가
console.log(fruits)
console.log(removedFruits3)//제거된 요소 배열로 리턴


const removedFruits4 = fruits.splice(fruits.length - 4, 2)//배열의 길이에서 시작해서 뒤에서 4번째자리에서, 두 개 제거
console.log(fruits)
console.log(removedFruits4)

const fruits5 = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']
const removedFruits5 = fruits5.splice(-2, 1) //뒤에서 두번째 요소 한 개 제거 
console.log(fruits5)
console.log(removedFruits5)

const fruits6 = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']
const removedFruits6 = fruits6.splice(2)//2번 인덱스부터 모든 요소들이 제거
console.log(fruits6)
console.log(removedFruits6)


const fruits7 = ['apple', 'banana', 'strawberry', 'orange', 'watermelon']
const removedFruits7 = fruits7.splice(3, 1, 'lemon')//배열 3번째 인덱스에서 1개의 요소(오렌지)를 제거,레몬추가
console.log(fruits7)
console.log(removedFruits7)









//* 배열 정렬하기 (sort, reverse) 
//[배열].sort()
const words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']
console.log(words.sort()) //오름차순
console.log(words.reverse()) //내림차순

//숫자 정렬 
//[배열].sort(비교함수)
//function 비교함수 이름(배열요소 1, 배열요소 2){
// 	if(배열요소 1 > 배열요소 2) return 1 // 배열요소 1 이 크면 반환값 1을 설정함으로써 순서를 변경함
//     if(배열요소 1 < 배열요소 2) return -1 // 배열요소 1이 작으면 반환값 -1을 설정함으로써 순서를 변경하지 않음
//     return 0
// }
const numbers = [100, 3, 394, 27, 4, 82, 6, 5, 94]

//오름차순 정렬
function compareNumbers(a,b){
    //return a - b  한줄로 요약한다면 
    if(a > b) return 1 // a가 더 크면 순서 바꾸기
    if(a < b) return -1 // b가 더 크면 순서 그대로 두기
    return 0 // a, b 같은 경우  
}
numbers.sort(compareNumbers)
console.log(numbers)

//내림차순 정렬
function compareNumbers1(a,b){
    //return b - a  한줄로 요약
    if(a > b) return -1 // a가 더 크면 순서 바꾸기
    if(a < b) return 1 // b가 더 크면 순서 그대로 두기
    return 0 // a, b 같은 경우  
}
numbers.sort(compareNumbers1)
console.log(numbers)

// 숫자 내림차순 정렬하기
// numbers.sort( (a, b) => b - a) 


