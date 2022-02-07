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
            //console.log(typeof(args[i]))
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

function Movie(title, author, release){
    this.title = title
    this.author = author
    this.release = release

    this.printMovieInfo = () => {
        console.log(this)
        const getInfo=()=>{
            console.log(this)
            return `${this.title}-${this.author}는 ${this.release}에 발매되었다.`
        }
        console.log(getInfo()) 
    }
}

const movie = new Movie("해리포터", "조앤K롤링", "2003 년 3월 23일")
movie.printMovieInfo()


//* 연습과제 3
//아래는 피타고라스 정리를 이용하여 두 점 사이의 거리를 계산하는 코드의 일부이다. 
//getDistance 함수를 구현해보자! 주의할 점은 함수의 인자로 하나의 점만 주어진 경우 원점(0, 0)과의 
//거리를 계산해야 한다. 또한, 자바스크립트에서 제곱근(루트)를 구하는 방법은 Math 객체의 sqrt 메서드를
// 이용하는 것이다.


// getDistance 함수 구현하기

function getDistance(x,y){
    
    console.log(x)
    console.log(y)

}
 
 // 테스트 케이스
 console.log(getDistance({x: 3, y: 2}, {x: 8, y: 14}))
 console.log(getDistance({x: 3, y: 4}))