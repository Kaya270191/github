//* 연습문제 1
//주어진 인자들 중에서 최대값을 구하는 함수를 완성해보자!

// function findMaxValue(...args){
//     // 구현하기
//     console.log(args)
//     return Math.max.apply(null, args) //최대값 
// }

const newArray =[]
function findMaxValue1(...args){
    //console.log(typeof(args))
    for (var i = 0; i < args.length; i++) {
        if(typeof(args[i]) === 'string'){
            console.log(typeof(args[i]))
            num=parseFloat(args[i])
            //console.log(args[i])
            if(typeof(num=='number')){
                newArray.push(num)
            }
        }
        if(typeof(args[i]) ==='number'){
           //console.log((typeof(args[i])))
           newArray.push(args[i])
        }  
    }return newArray
}



// 테스트 케이스 
//console.log(findMaxValue(-3, 7, -345, 41, 9, 137, 69))
console.log(findMaxValue1(-31, 8, null, -26, false, 92, {}, 284, 923, [], "2045.8", 'zip', 54, "1024"))



//* 연습과제 2
//다음은 Movie 생성자 함수를 이용하여 영화 정보를 출력하는 코드이다. 
//하지만 영화 정보는 캡쳐화면과 같이 제대로 출력되지 않는다. 
//getInfo 함수는 제거하지 말고, 영화 정보가 제대로 출력되게 해보자!

// function Movie(title, author, release){
//     this.title = title
//     this.author = author
//     this.release = release

//     this.printMovieInfo = () => {
//         console.log(this)
//         const getInfo=()=>{
//             console.log(this)
//             return `${this.title}-${this.author}는 ${this.release}에 발매되었다.`
//         }
//         console.log(getInfo()) 
//     }
// }

// const movie = new Movie("해리포터", "조앤K롤링", "2003 년 3월 23일")
// movie.printMovieInfo()


//* 연습과제 3
//아래는 피타고라스 정리를 이용하여 두 점 사이의 거리를 계산하는 코드의 일부이다. 
//getDistance 함수를 구현해보자! 주의할 점은 함수의 인자로 하나의 점만 주어진 경우 원점(0, 0)과의 
//거리를 계산해야 한다. 또한, 자바스크립트에서 제곱근(루트)를 구하는 방법은 Math 객체의 sqrt 메서드를
// 이용하는 것이다.


// getDistance 함수 구현하기

// function getDistance(x,y){
//     //y = y ?? 0
//     let newArray =[]

//     for(let key of Object.keys(x)){
//         //console.log(x[key])
//         newArray.push(x[key])  
//     }
//     for(let key of Object.keys(y)){
//         //console.log(y[key])
//         newArray.push(y[key])
//     }
//   console.log(newArray)

//   let xPoint = newArray[2]-newArray[0]
//   let yPoint = newArray[3]-newArray[1]
  
//   return Math.sqrt(xPoint * xPoint + yPoint * yPoint) //두 점사이 거리 구하는 공식 
// }
 




//  // 테스트 케이스
// console.log(getDistance({x: 3, y: 2}, {x: 8, y: 14}))
// console.log(getDistance({x: 3, y: 4})) //이건 아직 못 품 


//* 연습과제 4
//아래는 첫번째 인자로 주어진 키워드(cat)이 나머지 인자들에서 몇번 반복되는지 알아내는 함수이다. 
//countDuplication 함수를 구현해보자! 아래 테스트 케이스 결과는 4이다. 즉, cat 이 4번 반복된다. 

// countDuplication 함수 구현하기 
function countDuplication(flag,...args){
    //console.log(args)
    
    let cnt=0
    for(let word of args){
        //console.log(word)
        if(word === flag) cnt++
    }
    return cnt
}

// 테스트 케이스 
console.log(countDuplication('cat', 'apple', 'cat', 'tiger', 'cat', 'water', 'computer', 'cat', 'lion', 'pear', 'cat')) // 4


//* 연습과제 5
//아래는 add 함수의 일부이다. add 함수는 주어진 인자가 숫자(문자열로 된 숫자 포함)인 경우에 더한다. 
//아래 테스트 케이스 결과가 75.9 가 되도록 add 함수를 완성해보자! 

// function add(...args){
//     //console.log(args)
//     let array=[]

//     for(let arg of args){//문자열을 숫자로 변환 
//         if(typeof(arg) === 'string' && isNaN(arg)===false){ 
//             if(typeof(arg) !== NaN){
//                 //console.log(typeof(arg))
//                 array.push(parseFloat(arg))
//             }
//         }else if(typeof(arg) === 'number'){
//             array.push(arg)
//         }
        
//     }//console.log(array) //NaN을 어떻게 없애지?

   
//     let sum=0
//     for(let i of array){
//         //console.log(i)
//         console.log(isNaN(i))
//         if(isNaN(i)===false){
//             sum +=i
//         }
//     }return sum
// }

// // 테스트 케이스
// console.log(add(3, null, 19, false, '9', [], 7, {}, '', 34, 'earth', '3.9')) // 75.9


//* 연습과제 6
//아래는 첫번째 인자로 주어진 값으로 나머지 인자들을 나누는 함수이다. 
//단, 첫번째 인자로 주어진 값이 0 이면 분모가 0 이 되므로 나눗셈은 불가능하다. 
//그러므로 이 경우에는 캡쳐화면처럼 나머지 인자들을 그냥 배열로 반환한다. 
//앞에서 설명한 divider 함수를 구현해보자!

// divider 함수 구현하기
// function divider(flag,...args){
//     let newArray=[]
//     //console.log(flag,args)
//     if(flag !== 0){
//         for(let arg of args){
//             const num = arg/flag
//             newArray.push(num)
//         }
//     }else{
//         for(let arg of args){
//             newArray.push(arg)
//         }  
//     }return newArray
// }

// // 테스트 케이스 
// console.log(divider(2, 39, 4, 7, 28, 62, 28))
// console.log(divider(0, 39, 4, 7, 28, 62, 28))


//* 연습과제 7
//아래 코드는 배열요소를 뒤섞는 shuffle 함수의 일부분이다. 
//shuffle 함수는 배열요소를 순차적으로 조회하면서 배열에서 랜덤으로 뽑은 요소와 위치를 맞바꾼다. 
//예를 들어 현재 조회중인 요소가 1번 인덱스 값이고, 랜덤으로 뽑은 요소가 4번 인덱스 값이면 두 값의
//위치를 맞바꾸는 식이다. shuffle 함수를 완성해보자!
const numbers = [121, 23, 345, 43, 59]

function pickIndex(len){
    return Math.floor(Math.random() * len)
}
function shuffle(arr){
    // 구현하기
    for(let i of arr){
        let randomNum = pickIndex(5)
        console.log(randomNum)
    }
    
}

console.log(shuffle(numbers))