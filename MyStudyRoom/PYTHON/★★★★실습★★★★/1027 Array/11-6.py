#11-6
#인스턴스 변수와 클래스 변수의 차이점

#클래스 선언
class Car: 
    color="" #인스턴스 변수
    speed=0 #인스턴스 변수
    count=0 # 클래스 변수

    def __init__(self): #생성자: 생성되면 무조건 적용 
        self.speed=0 #인스턴스 변수: 해당 인스턴스에만 영향을 줌 myCar1, myCar2에 각각 영향
        Car.count+=1 #클래스 변수: Car 전체에 영향을 줌.   self.count로 하면 인스턴스 변수가 됨. 

#변수 선언
myCar1, myCar = None, None

#메인 코드 부분
myCar1=Car()
myCar1.speed=30
print("자동차1의 현재 속도는 %dkm,  생산된 자동차 숫자는 총 %d대 입니다" %(myCar1.speed, Car.count))

myCar2=Car()
myCar2.speed=60
print("자동차2의 현재 속도는 %dkm, 생산된 자동차 숫자는 총 %d대 입니다" %(myCar2.speed, Car.count))
