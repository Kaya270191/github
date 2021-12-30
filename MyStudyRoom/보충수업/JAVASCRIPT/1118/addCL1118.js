//if문

var num =10;
if(num<500){
    document.write("hello<br>");
}

if(/*=Boolean(false) 1 = Boolean(true)*/1){
    document.write("hello","<br>50");
}

/*
walkAmount = prompt("당신의 하루 걷는 양은 몇 보인가요?", "0");
if(walkAmount >=10000){
    document.write("매우 좋은 습관이다.","<br>");
}
document.write("====the end====","<br>");

min = prompt("당신의 하루 통화량은 몇 분인가요?");
if(min >=60){
    document.write("많이 사용하는 편이네요. ", "<br>");
}
document.write("====the end====");

var num = prompt("값을 하나 넣어주세요"); //0, null, "", undefined 만 false로 받음. 
if(num){
    document.write(num,"<br>");
}

var num = prompt("당신이 좋아하는 숫자는?");
if(num%2 == 0){
    document.write("당신이 좋아하는 수는 짝수");
}
else{
    document.write("당신이 좋아하는 수는 홀수")
}
*/
/*if~else문
var result = confirm("정말로 회원을 탈퇴?");
if(result){
    document.write("탈퇴완료");
}
else{
    document.write("탈퇴취소");
}
*/
/*if~else if ~ else
var mon = prompt("현재는 몇 월?");
if(mon>=9 && mon<=11){
    document.write("가을");
}
else if(mon>=6 && mon<=8){
    document.write("여름");
}
else if(mon>=3 && mon<=5){
    document.write("봄");
}
else{
    document.write("겨울");
}
document.write("end")
*/
/*
//중첩if문
var id = "easy1004";
var pw = "112233";
var user_id = prompt("아이디는?");
var user_pw = prompt("비밀번호는?");
if(id==user_id){
    if(pw==user_pw){
        document.write(user_id + "님 반갑습니다");
    }
    else{
        alert("비밀번호가 일치하지 않습니다.");
        location.reload();
    }
}
else{
    alert("아이디가 일치하지 않습니다");
    location.reload();
}
*/

/*선택문
var site = prompt("네이버, 다음, 구글 중 즐겨 사용하는 포털 검색 사이트?");
var url;
switch(site){
    case"네이버": url="www.naver.com";
    break;
    case"다음": url="www.daum.net";
    break;
    case"구글": url="www.google.com";
    break;
    default:alert("보기 중에 없음. ")
}
if(url)location.href = "http://"+url;
*/

/*반복문
var i = 1; 
while(i<=100){
    if(i%2==0 && i %6==0){
    document.write(i,"<br>");
    }
    i++;
}
document.write("====the End====")
*/
/*
var i = 20;
while(i>=10){
    if(i%2==0){
        document.write("<p class='blue'> "+ i + "</p>");
    }
    else{
        document.write("<p class='red'>" + i + "</p>");
    }
    i--;
}
*/

/*do-while문
var i = 1; 
do{
    document.write("hi"+i);
    i++;
}
while(i<=10)
*/
/*for문
for(var i = 1; i<=100; i++){
    if(i%5 ==0 && i%7 != 0){
        document.write("<p class = 'red'>" + i +"</p>");
    }
    else if(i%7 ==0 && i%5 !=0){
        document.write("<p class = 'green'>" + i +"</p>");
    }
    else if(i%7 ==0 && i %5 ==0){
        document.write("<p class = 'aqua'>" + i +"</p>");
    }
}
*/

/* break문
for(var i = 1; i<=10; i++){
    if(i==6) break;
    document.write(i, "<br>");
}
document.write("===the End===");

continue문
for(var i =1; i<=10; i++){
    if(i%2==0) continue;
    document.write(i,"<br>");
}
*/
/*
중첩for문
for(var i = 1; i<=3; i++){
    for(var k =1; k <=2; k++){
        document.write(i + "행" +  k + "열", "<br>");
    }
}
*/
/*
//1. 구구단 5단
var i = 1;
while(i<10){
    document.write("5X" + i + "=" + i * 5, "<br/>");
    i++;
}
*/

//중첩 for문을 이용
var num =1;
var t = "<table border = 1>";
for(var i = 1; i<= 5; i++){
    t+="<tr>";

    for(var k = 1; k <= 5; k++){
        t+="<td>" +num+ "</td>"
        num++;
    }
    t+="</tr>";
}

t+="</table>";
console.log(t);
document.write(t);












