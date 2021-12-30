
/*내장객체 
var tv = new Object();
tv.color = "white";
tv.price = 300000;
tv.info = function(){
    document.write("tv 색상 :" + this.color, "<br>"); //this 가 tv를 가리킴 
    document.write("tv 가격:" + this.price, "<br>");

}

var car = {
    color: "black",
    price: 500000,
    info: function(){
        document.write("car 색상: " +  this.color, "<br>"); //this 가 car를 가리킴
        document.write("car 가격" + this.price, "<br>");
    }
};

document.write("<h1>tv 객체 매서드 호출</h1>");
tv.info();
document.write("<h1>car 객체 메서드 호출</h1>");
car.info();
*/

/*오류
var today = new Date();
var nowMonth = today.getMonth()+1,//genMonth()는 현재 월 -1  
nowDate = today.getDate(),
nowDay = today.getDay(),
nowFullyear = today.getFullyear(),
nowHour = today.getHours(),
nowMinute = today.getminutes(),
nowSeconds = today.getSeconds(),
nowMilliseconds = today.getMilliSeconds(),
nowTime = today.getTime();


document.write("<h1>오늘 날짜 정보</h1>");
document.write("현재 월:" +nowMonth, "<br>");
document.write("현재 일:" +nowDate, "<br>");
document.write("현재 요일:" +nowDay, "<br>");

document.write("현재 연도:" +nowFullyear, "<br>");
document.write("현재 시간:" +nowHour, "<br>");
document.write("현재 분:" +nowMinute, "<br>");
document.write("현재 초:" +nowSeconds, "<br>");
document.write("현재 밀리초:" +nowMilliseconds, "<br>");
document.write("현재 현재시간:" +nowTime, "<br>");


var worldcup = new Date(2002,4,31);
var theMonth = worldcup.getMonth(),
theDate = worldcup.getDate(),
theDay = worldcup.getDay();
document.write("<h1>월드컵 날짜 정보</h1>");
document.write("2002월드컵 몇 월:" + theMonth,"<br>");
document.write("2002월드컵 몇 일: " +theDate,"<br>");
document.write("2002월드컵 무슨 요일:" + theDay,"<br>");
*/

/*특정날짜까지 남은 날짜 구하기
var today = new Date();
var nowYear = today.getFullYear(); //getFullYear()연도정보 

var theDate = new Date(nowYear, 11,31);
var diffDate = theDate.getTime() - today.getTime();

var result = Math.ceil(diffDate / (60 * 1000 * 60 * 24));
document.write("연말 D-day:" +result +"일 남았습니다.");
*/

/*
수학객체
var num = 2.1234;

var maxNum = Math.max(10,5,8,30),   //최대값
minNum = Math.min(10,5,8,30),       //최소값
roundNum = Math.round(num),         //소수점 첫째자리 반올림
floorNum = Math.floor(num),         //소수점 첫쨰자리 내림
ceilNum = Math.ceil(num),            //소수점 첫째자리 올림
rndNum = Math.random(),             //0과 1 사이 난수
piNum = Math.PI;                    //원주율 상수로 반환 

document.write(maxNum,"<br>");
document.write(minNum,"<br>");
document.write(roundNum,"<br>");
document.write(floorNum,"<br>");
document.write(rndNum,"<br>");
document.write(piNum,"<br>");
*/

/*가위바위보
document.write("<h1> 컴퓨터 가위, 바위, 보 맞추기</h1>");

var game = prompt("가위, 바위, 보 중 선택하세요?");
var gameNum;
switch(game){
    case "가위":
        gameNum = 1;
        break;
    case "바위":
        gameNum =2;
        break;
    case "보":
        gameNum = 3;
        break;
    default: alert("잘못 작성했습니다.");
        location.reload();
}

var com = Math.ceil(Math.random() *3);
document.write("<img src=\""+ com + ".png\">");
if(gameNum ==com){
    document.write("<br>", "잘 맞춤");
}
else{
    document.write("<br>", "틀림");
}
*/

/*배열객체에 저장된 데이터 불러오기 
var arr = [30, "따르릉", true];
document.write("배열값 가져오기 -1");
document.write(arr[0],"<br>");
document.write(arr[1],"<br>");
document.write(arr[2],"<br>");

document.write("배열값 가져오기 -2");
for(var i =0; i<arr.length; i++){
    document.write(arr[i], "<br>");
}

document.write("배열값 가져오기 -3");
for( i in arr){
    document.write(arr[i], "<br>")
}
*/

var arr_1 = ["사당", "교대", "방배", "강남"];
var arr_2 = ["신사", "압구정", "옥수"];

var result = arr_1.join("-"); //값을 문자열로 연결 
console.log(result);

result = arr_1.concat(arr_2); // 2개의 배열을 하나의 배열로 만듦
console.log(result);

result = arr_1.slice(1,3);      //1번 이전의 요소 잘래내기
console.log(result);

arr_1.sort();                   //오름차순으로 정렬
console.log(arr_1);

arr_2.reverse();                //배열 순서 뒤집기 
console.log(arr_2);

result = arr_1.length;          //배열 개수 반환
console.log(result);

arr_1.unshift("잠실");          //가장앞에 인덱스에 데이터 삽입
console.log(arr_1);

arr_1.shift();                  //가장 앞의 인덱스 삭제 
console.log(arr_1);

arr_1.push("종로");             //마지막에 데이터 삽입
console.log(arr_1);

arr_1.pop();                    //마지막 데이터 삭제 
console.log(arr_1);

arr_1.splice(2,1, "서초", "역삼");  //2번째를 삭제하고 서초, 역삼 넣기
console.log(arr_1)