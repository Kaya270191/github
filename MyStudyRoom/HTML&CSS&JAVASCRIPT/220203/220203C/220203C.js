//객체 리터럴 

// const book ={
//     name: 'javascript',
//     price: 21000,
//     release: '2019-12-03',
//     authors: ['mark', 'victoria'],
//     getInfo(){
//         console.log('-----책 정보-----')
//         console.log('제목: ', this.name)
//         console.log('가격: ', this.price)
//         console.log('초판: ', this.release)
//         console.log('저자: ', this.authors.join(' '))
//     }
// }

// book.getInfo()


//생성자 함수
//생성자 함수 이름 첫번째는 대문자
//new 라는 키워드로 객체 생성함

// function Book(name, price, release, authors){ //생성자 함수 
//     this.name = name
//     this.price = price
//     this.release = release
//     this.authors = authors

//     this.getInfo = function(){
//         console.log('-----책 정보-----')
//         console.log('제목: ', this.name)
//         console.log('가격: ', this.price)
//         console.log('초판: ', this.release)
//         console.log('저자: ', this.authors.join(' '))
//     }
// }

// const book = new Book( //객체 생성 
//     'javascript',
//     21000,
//     '2019-12-03',
//     ['mark', 'victoria']
// )
// book.getInfo()


//프로토타입
// function Book(name, price, release, authors){ //생성자 함수 
//     this.name = name
//     this.price = price
//     this.release = release
//     this.authors = authors
// }

// Book.prototype.getInfo = function() { // 프로토타입에 객체에  객체 메서드 등록
//     console.log('-----책 정보-----')
//     console.log('제목: ', this.name)
//     console.log('가격: ', this.price)
//     console.log('초판: ', this.release)
//     console.log('저자: ', this.authors.join(' '))
// }
// const book = new Book( //객체 생성 
//     'javascript',
//     21000,
//     '2019-12-03',
//     ['mark', 'victoria']
// )

// console.dir(Book) // 생성자 함수 출력
// console.log(Book.prototype) // 생성자 함수의 프로토타입 객체
// book.getInfo()
// console.log(book)





// function Book(name, price, release, authors){//생성자 함수
//     this.name = name
//     this.price = price
//     this.release = release
//     this.authors = authors
// }

// Book.prototype = { //프로토타입- 공유할 메서드 추가 
//     getInfo(){
//         console.log('----- 책 정보 -----')
//         console.log('제목: ', this.name)
//         console.log('가격: ', this.price)
//         console.log('초판: ', this.release)
//         console.log('저자: ', this.authors.join(' '))
//     },
//     discount(){
//         if(this.name === 'python'){
//             this.price -= 1000
//         }
//     },
//     get getPrice(){ //getter : 멤버 변수 조회
//         return this.price
//     },
//     get getAuthors(){
//         return this.authors
//     },
//     set addAuthor(newAuthor){ //setter : 추가 
//         this.authors.push(newAuthor)
//     }
// }

// const book1 = new Book(
//     'javascript',
//     21000,
//     '2019-12-03',
//     ['mark', 'victoria']
// )
// const book2 = new Book(
//     'python',
//     18700,
//     '2022-01-07',
//     ['syleemomo']
// )


// book1.discount()
// book1.addAuthor = 'sunrise'
// console.log(book1.name, book1.getPrice)
// console.log(book1.getAuthors)
// console.log(book1.getPrice) //getter로 가격 조회 

// book2.discount()
// console.log(book2.getPrice) //getter로 가격 조회 
// console.log(book2.name, book2.getPrice)



//객체 프로퍼티 조회 : 
//1.  .으로 접근 가능 
//2. 대괄호 접근법  객체이름['프로퍼티이름']
// const book = {
//     name: 'javascript',
//     price: 21000,
//     release: '2019-12-03',
//     authors: ['mark', 'victoria']
// }

// for(let key of Object.keys(book)){
//     console.log(key, book[key]) //키와 밸류 값 
// }

// console.log(Object.keys(book)) //객체 프로퍼티 추출 후 배열로 반환
// console.log(Object.values(book))//객체 프로퍼티 값 추출 후 배열로 반환


// //객체 프로퍼티 존재유무 판별
// console.log('price' in book) //book 객체에 price 프로퍼티가 있는지 확인
// console.log('title' in book) //book 객체에 title 프로퍼티가 있는지 확인

// console.log(book.hasOwnProperty('price')) //book 객체에 price 프로퍼티가 있는지 확인
// console.log(book.hasOwnProperty('title')) //book 객체에 title 프로퍼티가 있는지 확인



//객체 프로퍼티 값 변경 
//객체의 프로퍼티 값은 점 표기법이나 대괄호 표기법으로 변경
// let book = {
//     name: 'javascript',
//     price: 21000,
//     release: '2019-12-03',
//     authors: ['mark', 'victoria']
// }


// book ={...book, release: '2022-01-17'}
// console.log(book)


//객체 복사
//1. 얕은 복사 : 프로퍼티의 배열이나 객체의 주소값만 복사
const book = {
    name: 'javascript',
    price: 21000,
    release: '2019-12-03',
    authors: ['mark', 'victoria']
}

const target = Object.assign({}, book)
const target2 = {...book}


book.price = 3200 //book 객체의 price 프로퍼티 변경 
book.authors[0] = 'jojo' 

console.log(book) 
console.log(target) //얕은 복사를 한 객체는 프로퍼티가 변경이 안됨 




//2. 깊은 복사 : 프로퍼티의 배열이나 객체의 내부 요소까지 복사
const book1 = {
    name: 'javascript',
    price: 21000,
    release: '2019-12-03',
    authors: ['mark', 'victoria']
}

const target1 = JSON.parse(JSON.stringify(book1))

book1.authors[0] ='변경'
console.log(book1)
console.log(target1)

