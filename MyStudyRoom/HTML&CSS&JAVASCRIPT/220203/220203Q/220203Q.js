//* 연습과제 1
// min ~ max 사이의 랜덤숫자를 생성하는 함수 (min, max 포함)
function pickRandomNumber(min, max){
    return Math.floor( Math.random() * (max-min+1) ) + min 
}

function Tester(){
    this.timeToSleep = pickRandomNumber(1,10) // 잠들기까지 걸린 시간의 범위 (1~10분 사이)
    this.timeToWakeup = pickRandomNumber(1,10) // 잠에서 깨어나는데 걸린 시간의 범위 (1~10분 사이)
    this.duringSleep1 = pickRandomNumber(1,5) // 잠자는 동안 중간에 깬 횟수 (1~5회 사이)
    this.duringSleep2 = pickRandomNumber(1,10) // 잠자는동안 뒤척인 횟수 (1~10회 사이)
    this.deltapaRatio = pickRandomNumber(0,50) // 델타파 비율 (0~50% 사이)
    this.sleepResult = 0 // 수면 만족도 (초기값 0)
}

Tester.prototype = {
    QualityOfSleep(){//수면만족도 계산  
        this.sleepResult = this.sleepResult=this.deltapaRatio/(this.timeToSleep*this.timeToWakeup*this.duringSleep1*this.duringSleep2)
    },

    get getQualityOfSleep(){ //수면만족도 조회
        return this.sleepResult
    },
    
    highQuality(){ //수면만족도 판단 기준 
        if (this.sleepResult>=0.37 && this.sleepResult<=50){
            return true
        }
        else{
            return false
        }
    },
}

function goodSleep(group){ //변경된 수면 만족도를 적용하는 함수 
    group.forEach(tester=>{
        tester.QualityOfSleep()
    })
}

function countNum(group){ //그룹의 수면 만족도 수를 세는 함수  
    let count=0
    group.forEach(tester=>{
        if(tester.highQuality()){
            count++  
        }
    })
    return count
}

function allTest(){
    const cntA = countNum(groupA)
    const cntB = countNum(groupB)
    const cntC = countNum(groupC)

    console.log('A group cnt :' + cntA)
    console.log('B group cnt :' + cntB)
    console.log('C group cnt :' + cntC)
    
    if(cntA > cntB && cntA > cntC){
        alert('groupA 의 침대가 더 좋아요')
    }
    else if(cntB > cntA && cntB > cntC){
        alert('groupB 의 침대가 더 좋아요')
    }
    else if(cntC > cntA && cntC > cntB){
        alert('groupC 의 침대가 더 좋아요')
    }
}

const groupA = [] //객체를 담을 groupA 빈 리스트 
const groupB = [] //객체를 담을 groupB 빈 리스트 
const groupC = [] //객체를 담을 groupC 빈 리스트 
for(let i=0; i<100; i++){
    groupA.push(tester = new Tester()) //groupA 객체 생성하기
    groupB.push(tester = new Tester()) //groupB 객체 생성하기
    groupC.push(tester = new Tester()) //groupC 객체 생성하기
}

goodSleep(groupA)
goodSleep(groupB)
goodSleep(groupC)

allTest()