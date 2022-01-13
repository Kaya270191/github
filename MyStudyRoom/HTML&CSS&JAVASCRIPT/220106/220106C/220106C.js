
// //* 부분 배열 만들기 - slice

// const words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']
// const sliceWords = words.slice(3) //배열의 3번째('computer', 'school', 'sun', 'house')을 리턴  
// console.log(sliceWords)
// console.log(words)

// const words1 = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']
// const sliceWords1 = words1.slice(2,4)  // 배열의 2번째부터 4번 전까지 ('mobile', 'computer')리턴 
// console.log(sliceWords1)


// const words2 = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']
// const sliceWords2 = words2.slice(-4,-1) //배열의 뒤에서부터 4번째부터 배열의 끝에서 1번째 전까지
// console.log(sliceWords2)// 'computer', 'school', 'sun' 리턴 



// const movies = [
//     {title: 'Harry Potter', release: '2003-02-22'}, 
//     {title: 'Indiana Jhones', release: '2009-01-09'}, 
//     {title: 'Jurassic Park', release: '2007-04-13'},
//     {title: 'Iron man', release: '2012-12-18'},
//     {title: 'Spider man', release: '2017-03-07'}
// ]

// const sliceWords3 = movies.slice(1, 3) //배열의 1번째부터 3번째 전까지 리턴 
// console.log(sliceWords3)

// //배열의 slice 메서드로 추출하면 객체의 주소값만 복사됨. 
// //원본 배열에서 객체의 프로퍼티를 변경하면 slice 메서드로 추출한 부분배열도 변경됨 
// movies[1].title = 'hatu'
// console.log(sliceWords3)





// //* 배열에서 배열요소 꺼내기 - 구조분해(destructuring assignment)

// const fruits = ['apple', 'banana', 'orange', 'lemon', 'watermelon']
// const [firstFruit] = fruits //변수명에 대괄호를 치면 원본 배열의 첫번째 요소만 복사
// console.log(firstFruit)

// const [,,thirdFruit] = fruits //콤마가 위치한 배열요소는 건너뛰고, 세번째 배열요소만 fruits 배열로부터 복사
// console.log(thirdFruit)

// const [lastFruit] = fruits.reverse()//reverse 메서드로 배열원소의 순서를 뒤바꾼 다음 구조분해를 이용하여 첫번째 배열요소만 복사하면 된다. 
// console.log(lastFruit)

// const [firstFruit1, ...rest] = fruits //스프레드 연산자(...)를 사용하면 첫번째 배열요소를 제외한 나머지 요소들로 이루어진 부분배열을 추출
// console.log(rest)

// const [firstFruit2, secondFruit, ...rest2] = fruits//첫번째와 두번째 배열요소를 제외한 나머지 요소들로 이루어진 부분배열을 rest 배열에 담는다
// console.log(rest2)




// //* 배열 합치기(concat, 스프레드 연산자)
// const words = ['car', 'mobile', 'sun', 'foot', 'pen']
// const numbers = [1, 2, 3]

// const unitedArr = words.concat(numbers)//words배열 + numbers배열
// console.log(unitedArr)


// const unitedArr1 = [...words, ...numbers] // 스프레드 연산자(...)를 이용하여 새로운 배열에 각 배열의 요소들을 풀어헤쳐서 복사
// console.log(unitedArr1)




// //* 배열을 문자열로 변경하기
// //[배열].join(구분문자)

// const fruits = ['apple', 'banana', 'orange']
// const fruitsStr = fruits.join(' ')
// console.log(fruitsStr)

// const fruitsStr1 = fruits.join(' & ')
// console.log(fruitsStr1)



// //* 문자열을 배열로 변경하기
// //[배열] = 문자열.split(구분문자)

// const str = ''
// const strSeprated = str.split()// 빈 문자열을 하나의 요소로 가진 배열을 반환
// console.log(strSeprated)

// const sentence = 'I joined swimming club in my highschool'
// const splitedSentence = sentence.split()//구분문자를 설정하지 않았기 때문에 sentence 문장 전체를 요소로 가진 배열을 반환
// console.log(splitedSentence)


// const sentence1 = 'I joined swimming club in my highschool'
// const splitedSentence1 = sentence1.split('') //구분문자를 빈 문자열로 줌. 문자 하나씩 자르기
// console.log(splitedSentence1)


// const sentence2 = 'I joined swimming club in my highschool'
// const splitedSentence2 = sentence2.split(' ')//구분문자를 공백으로 줌. 문자열을 공백으로 잘라서 배열로 반환  
// console.log(splitedSentence2)

// const sentence3 = 'I (joined) swimming <club> in my highschool'
// const splitedSentence3 = sentence3.split(/[()<>]/)//대괄호 안에 구분문자를 여러개 설정하면 해당 구분문자들 중 어느 하나이면 문자열을 잘라준다.
// console.log(splitedSentence3)

// const sentence4 = 'I joined swimming club in my highschool'
// const splitedSentence4 = sentence4.split(' ', 3)//공백 기준으로 자르고 3번째 요소 전까지 반환
// console.log(splitedSentence4)


// const sentence5 = 'I^,^joined^,^swimming^,^club^,^in^,^my^,^highschool'
// const splitedSentence5 = sentence5.split(['^', '^'])// split 메서드에는 구분문자로 배열을 사용
// console.log(splitedSentence5)//배열요소들이 콤마로 구분된 하나의 문자열로 변경
// //구분문자는 결국 ^,^ 이 된다

// // split, filter 메서드를 함께 사용하여 sentence 문자열에서 club 이라는 부분 문자열이 몇번 들어가 있는지 검사
// //배열의 indexOf 나 includes 메서드를 사용해도 같은 기능을 구현할 수 있다
// const sentence6 = 'I joined swimming club in my highschool. that club was awesome !'
// const foundedKeyword6 = sentence6.split(' ').filter(word => word === 'club')//빈칸을 기준으로 나눠 배열에 저장 후 클럽 단어가 포함된거 찾기 
// console.log(foundedKeyword6)
// console.log(foundedKeyword6.length)




// //* 배열과 문자열 메서드를 함께 사용하기 - split, join 

const sentence = '?죠밌재 트립크스바자'
//문장을 각 단어별로 나눠서 배열에 저장한 후-> 뒤집기-> 다시 문자열로 합치기 
const splitedSentence = sentence.split('').reverse().join('') 
console.log(splitedSentence)


const sentence1 = 'I joined swimming club in my highschool. that club was awsome !' //문자열
//문자열을 빈칸(' ') 기준으로 잘라서 배열로 만듦-> 맵 함수로 단어에 클럽이 있으면 ${word} 🏊 리턴 아니면 그냥 리턴-> 다시 문자열로 합치기
const modifiedSentence = sentence1.
                        split(' ')
                        .map(word => {
                            return word = word === 'club' ? `${word} 🏊` : word
                        })
                        .join(' ')
console.log(modifiedSentence)





