//* 부분 배열 만들기 - slice
const words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']
const sliceWords = words.slice(3) //3번전까지 날리기
console.log(sliceWords)
const sliceWords1 = words.slice(2,4)// 2번째부터 4번 전까지 
console.log(sliceWords1)
const slicedWords2 = words.slice(-4, -1) //끝에서 4번째부터 끝에서 첫번째 전까지
console.log(slicedWords2)

const movies = [
    {title: 'Harry Potter', release: '2003-02-22'}, 
    {title: 'Indiana Jhones', release: '2009-01-09'}, 
    {title: 'Jurassic Park', release: '2007-04-13'},
    {title: 'Iron man', release: '2012-12-18'},
    {title: 'Spider man', release: '2017-03-07'}
]
const slicedWords3 = movies.slice(1, 3) //1번째부터 3번 전까지 
console.log(slicedWords3)
movies[1].title = 'syleemomo' //배열의 첫번째 요소의 밸류값을 변경 
console.log(movies)
console.log(slicedWords3)



//* 배열에서 배열요소 꺼내기 - 구조분해(destructuring assignment)
const fruits = ['apple', 'banana', 'orange', 'lemon', 'watermelon']
// const [firstFruit] = fruits
// console.log(firstFruit)
// const [,,thirdFruit] = fruits
// console.log(thirdFruit)
// const [lastFruit] = fruits.reverse()
// console.log(lastFruit)
const [firstFruit, ...rest] = fruits
console.log(rest)




//* 배열 합치기(concat, 스프레드 연산자)
const words1 = ['car', 'mobile', 'sun', 'foot', 'pen']
const numbers = [1, 2, 3]

const unitedArr = words1.concat(numbers) //배열 합치기 
console.log(unitedArr)

const unitedArr1 = [...words1, ...numbers] //배열합치기 
console.log(unitedArr)



//* 배열을 문자열로 변경하기
//[배열].join(구분문자)
const fruits3 = ['apple', 'banana', 'orange']
const fruitsStr = fruits3.join(' ')
console.log(fruitsStr)
const fruitsStr2 = fruits3.join('$ ')
console.log(fruitsStr2)



//* 문자열을 배열로 변경하기
//[배열] = 문자열.split(구분문자)
const str = ''
const strSeprated = str.split()
console.log(strSeprated)

const sentence = 'I joined swimming club in my highschool'
const splitedSentence = sentence.split('')//빈 문자열로 잘라서 배열에 넣기 
console.log(splitedSentence)

const splitedSentence2 = sentence.split(' ')//띄어쓰기로 구분하여 배열에 넣기 
console.log(splitedSentence2)

const sentence3= 'I (joined) swimming <club> in my highschool'
const splitedSentence3 = sentence3.split(/[()<>]/) //대괄호 안 () <> 이 있으면 기준으로 자르기
console.log(splitedSentence3)

const sentence4 = 'I joined swimming club in my highschool'
const splitedSentence4 = sentence4.split(' ', 3) //빈칸을 기준으로 자름. 배열의 3번 전까지 
console.log(splitedSentence4)

const sentence5 = 'I^,^joined^,^swimming^,^club^,^in^,^my^,^highschool'
const splitedSentence5 = sentence5.split(['^', '^'])
console.log(splitedSentence5)

const sentence6 = 'I joined swimming club in my highschool. that club was awsome !'
//공백으로 자르기-> 배열로 됨 -> 배열이 되면 filter함수 사용 가능. word가 'club'이면 배열로 반환 
const foundedKeyword6 = sentence6.split(' ').filter(word => word === 'club')
console.log(foundedKeyword6)
console.log(foundedKeyword6.length)




//* 배열과 문자열 메서드를 함께 사용하기 - split, join 
const sentence1 = '?죠밌재 트립크스바자'
//한개씩 자르고 -> 반대로 뒤집고-> 붙이기 
const splitedSentence1 = sentence1.split('').reverse().join('')
console.log(splitedSentence1)


const sentence2 = 'I joined swimming club in my highschool. that club was awesome !'
const modifiedSentence2 = sentence2.
                        split(' ')//빈칸 기준으로 자르기 
                        .map(word => { //배열안의 요소가 club이면 `${word} 🏊` 아니면 word로 
                            return word = word === 'club' ? `${word} 🏊` : word
                        })
                        .join(' ') //다시 붙이기 
console.log(modifiedSentence2)
