//* 연습과제 3

const hairColors = ['black', 'brown', 'yellow', 'white', 'gold']
const hairTypes = ['curly', 'straight', 'wavy', 'coily']
const glasses = [true, false]
const heights = [150, 160, 170, 180, 190, 200]
const weights = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150]

function randomPick(list){ //특정 배열에서 랜덤으로 특징 추출하는 함수 
    return Math.floor(Math.random()*list.length)
}

function Person(){ //생성자 함수 
    this.hairColor = hairColors[randomPick(hairColors)]
    this.hairType = hairTypes[randomPick(hairTypes)]
    this.glasse = glasses[randomPick(glasses)]
    this.height = heights[randomPick(heights)]+'cm'
    this.weight = weights[randomPick(weights)]+'kg'
}


const personList = [] //객체를 담을 빈 리스트 

for(let i=0; i<10000; i++){
    personList.push(new Person()) //리스트에 객체 생성해서 넣기 
}
console.log(personList)


const classified = {} //특징 빈도를 저장하는 변수

personList.forEach(person =>{
    for(let key in person){
        value = person[`${key}`]
        if(!classified[value]){
            classified[value] = 0
        }
        classified[value]++
    }
    //console.log(classified)
})
console.log(classified)

const characterList = []
for(let key in classified){
    let a = key 
    if(a === 'true'){
        a = 'put on glasses'
    }
    else if(a === 'false'){
        a = 'no glasses'
    }
    characterList.push({character : a, cnt: classified[key]})
}
console.log(characterList)

const root = document.getElementById('root')
characterList.forEach(character=>{
    const circle = document.createElement('div')
    circle.className = 'circle'
    circle.innerText = character.character + character.cnt
    root.append(circle)
    
})

