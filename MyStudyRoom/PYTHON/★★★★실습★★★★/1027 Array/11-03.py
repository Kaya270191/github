#객체

#11-2
#클래스의 정의 부분 
class Car:  #자동차 속성
    #필드부분
    color=""
    speed=0
    #메소드 부분
    #메소드 upSpeed 정의부 
    def upSpeed(self,value): #자동차 기능 
        self.speed+=value
    #메소드 downSpeed 정의부 
    def downSpeed(self,value):
        self.speed-=value

#메인 코드 부분 (인스턴스)
myCar1=Car()                #myCar1의 인스턴스 생성 
myCar1.color="빨강"       #myCar1의 color 필드값 대입 
myCar1.speed=0              #myCar1의 speed 필드값 대입 

myCar2=Car()                #myCar2의 인스턴스 생성 
myCar2.color="파랑"       #myCar2의 color 필드값 대입 
myCar2.speed=0              #myCar2의 speed 필드값 대입 

myCar3=Car()
myCar3.color="노랑"
myCar3.speed=0

myCar1.upSpeed(30)  #myCar1 메소드 실행부 (인스턴스명.필드)
print("자동차1의 색상은 %s 이며, 현재속도는 %d km 입니다" %(myCar1.color, myCar1.speed))

myCar2.upSpeed(60)
print("자동차2의 색상은 %s 이며, 현재속도는 %d km 입니다" %(myCar2.color, myCar2.speed))
              
myCar3.upSpeed(0)
print("자동차3의 색상은 %s 이며, 현재속도는 %d km 입니다" %(myCar3.color, myCar3.speed))
