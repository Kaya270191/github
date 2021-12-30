#매개변수가 있는 생성자

#11-4
#클래스의 정의 부분 
class Car:  #자동차 속성
    #필드부분
    color=""
    speed=0
    #메소드 부분
    #메소드 upSpeed 정의부
    #생성자 추가, 인스턴스를 생성하면 무조건 호출되는 메소드
    #매개 변수를 입력받아 생성자 실행 
    def __init__(self, value1, value2):
        self.color=value1 #매개 변수를 부여해 값을..
        self.speed=value2


    def upSpeed(self,value): #자동차 기능 
        self.speed+=value
    #메소드 downSpeed 정의부 
    def downSpeed(self,value):
        self.speed-=value

#메인 코드 부분 (인스턴스)
#매개변수가 있는 생성자일 경우 클래스로부터 인스턴스 생성 시 반드시 매개변수를 입력할 것
myCar1=Car("빨강", 0)     #myCar1의 인스턴스 생성, 매개변수가 있는 생성자 활용 

myCar2=Car("파랑", 0)     #myCar2의 인스턴스 생성, 매개 변수 값을 반드시 넣어줘야함! 

myCar3=Car("노랑", 0)     #myCar3의 인스턴스 생성 


myCar1.upSpeed(30)  #myCar1 메소드 실행부 (인스턴스명.필드)
print("자동차1의 색상은 %s 이며, 현재속도는 %d km 입니다" %(myCar1.color, myCar1.speed))

myCar2.upSpeed(60)
print("자동차2의 색상은 %s 이며, 현재속도는 %d km 입니다" %(myCar2.color, myCar2.speed))
              
myCar3.upSpeed(0)
print("자동차3의 색상은 %s 이며, 현재속도는 %d km 입니다" %(myCar3.color, myCar3.speed))
