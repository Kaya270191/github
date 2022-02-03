//연습문제2

function Station(name, latitude, longitude) {//생성자 함수 
    this.name = name //역명
    this.latitude = latitude //위도
    this.longitude = longitude //경도
}

Station.prototype = {
    getDistantce(anotherStation){
        // 출발지 
        const lat1 = this.latitude; 
        const lon1 = this.longitude; 
        // 목적지 
        const lat2 = anotherStation.latitude; 
        const lon2 = anotherStation.longitude; 
        const R = 6371e3; // 지구의 반지름 (meter) // 좌표를 라디안 단위로 변환 
        const radian1 = lat1 * Math.PI / 180; 
        const radian2 = lat2 * Math.PI / 180; 
        const Δφ = (lat2 - lat1) * Math.PI / 180; 
        const Δλ = (lon2 - lon1) * Math.PI / 180; 
        const a = Math.sin(Δφ / 2) * Math.sin(Δφ / 2) + Math.cos(radian1) * Math.cos(radian2) * Math.sin(Δλ / 2) * Math.sin(Δλ / 2); 
        const c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)); 
        const d = R * c; // meter
        return distance = d/1000
    },

     getFee(anotherStation){ //요금 
        const distance = this.getDistantce(anotherStation)
        return fee=Math.floor(distance)*100
    },
}

const seoul = new Station(
    '서울역',
    37.55620110026294,
    126.97223116703012
)

const daejeon = new Station(
    '대전역',
    36.332516127741,
    127.43421099777726
)

const dongdaegu = new Station(
    '동대구역',
    35.88049128950934,
    128.62837657353532
)

const busan = new Station(
    '부산역',
    35.116613680508806,
    129.04009077373016
)

const staionDistance = {
    seoulToDaejeon : seoul.getDistantce(daejeon),
    daejeonToDongdaegu : daejeon.getDistantce(dongdaegu),
    dongdaeguToBusan : dongdaegu.getDistantce(busan)
}

console.table(staionDistance)

const staionFee = {
    seoulToDaejeon : seoul.getFee(daejeon),
    daejeonToDongdaegu : daejeon.getFee(dongdaegu),
    dongdaeguToBusan : dongdaegu.getFee(busan)
}
console.table(staionFee)

const allStationFee={
    ...staionFee,
    seoulToDongdaegu : seoul.getFee(daejeon) + daejeon.getFee(dongdaegu),
    seoulToBusan : seoul.getFee(daejeon) + daejeon.getFee(dongdaegu) + dongdaegu.getFee(busan),
    daejeonToBusan : daejeon.getFee(dongdaegu) + dongdaegu.getFee(busan)
}
console.table(allStationFee)