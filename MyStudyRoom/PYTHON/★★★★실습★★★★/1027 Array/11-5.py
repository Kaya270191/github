#객체지향 기본 프로그램 완성
#11-5

#클래스 선언
class Car:
    name=""
    speed=0

    def __init__(self, name, speed):
        self.name=name
        self.speed=speed

    def getName(self):
        return self.name  #return 이 있으면 함수가 실행되기만 해도 값이 나옴 , return이 없으면 함수가 실행되고 결과값을 기억하기만 함. 

    def getSpeed(self):
        return self.speed

#변수 선언
Car1, Car2 = None, None

#메인 코드 부분
car1=Car("아우디",0)
car2=Car("벤츠", 30)

print("%s의 현재 속도는 %d 입니다." %(car1.getName(), car1.getSpeed() ))
print("%s의 현재 속도는 %d 입니다." %(car2.getName(), car2.getSpeed() ))
    
