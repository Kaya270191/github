//문자열 객체란 문자형 데이터를 객체로 취급한다

var userName = prompt("당신의 영문 이름은?")

var upperName =userName.toUpperCase();
document.write(upperName,"<br>");

var userNum = prompt("당신의 연락처는?");
var result = userNum.substring(0, userNum.length-4) + "****";
document.write(result,"<br>")