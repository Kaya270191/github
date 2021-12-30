
const words = ['car', 'paper', 'mobile', 'computer', 'school', 'sun', 'house']

function isShort(word){
    return word.length >5
}

const findWord = words.filter(isShort)
console.log(findWord)

let findWord2 = words.filter((word)=>{
    return word.length>5
})

console.log(findWord2)

const numbers = [32, 6, 4, 13, 9, 57]
function isMultiplyByThree(element){
    return element % 3 ===0
}
console.log(numbers.some(isMultiplyByThree))

const findNum=numbers.some((element)=>{
    return element % 3 ===0
})
console.log(findNum)

function isMultiplyByThree2(element){
    return element % 3 === 0
}
console.log(numbers.every(isMultiplyByThree2))

const findNum2 = numbers.every((element)=>{
    return element % 3 ===0
})
console.log(findNum2)


//forEach
const currentTime = [3, 8, 23]
const timeStr =[]

function addZone(time){
    timeStr.push(`${time<10? '0' + time :time}`)
}
currentTime.forEach(addZone)
console.log(timeStr)


const userIDs = ['victoria', 'sun', 'johseb', 'syleemomo', 'hannah', 'shara', 'martin', 'gorgia', 'nana', 'dannel']

function addDotCom(userid){
    console.log(userid + "@gmail.com")
}
userIDs.forEach(addDotCom)

userIDs.forEach((userid)=>{
    console.log(userid + "@naver.com")
})



const numbers1 = [1, 2, 3, 4, 5,6,7,8,9]
function isMultiplyByFour(n){
    return n *4
}

const numbersRefined = numbers1.map(isMultiplyByFour)
console.log(numbersRefined)

const refinedNum1= numbers1.map((n)=>{
    return n*4
})
console.log(refinedNum1)


const userEmails = [
    'victoria@gmail.com',
    'sun@gmail.com',
    'johseb@gmail.com',
    'syleemomo@gmail.com',
    'hannah@gmail.com',
    'shara@gmail.com',
    'martin@gmail.com',
    'gorgia@gmail.com',
    'nana@gmail.com',
    'dannel@gmail.com'
]

function removeDotcom(userEmail){
    return userEmail.split('@')[0]
}
function displayUserID(userID){
    console.log(userID)
}
const userIDss = userEmails.map(removeDotcom)
console.log(userIDss)

const onlyId = userEmails.map((n)=>{
    const id= n.split('@')[0]
    return id
})
console.log(onlyId)