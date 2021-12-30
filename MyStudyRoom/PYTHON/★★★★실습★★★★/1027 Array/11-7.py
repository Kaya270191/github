#11-7

#클래스 선언
class Car: #부모클래스 
    speed=0

    def upSpeed(self, value):
        self.speed=self.speed+value

    def downSpeed(self, value):
        self.speed=self.speed-value

class Sedan(Car): #Sedan 클래스는 부모 Car 클래스의 상속을 받음(스피드, 업스피드, 다운스피드 사용가능)
    seatNum=0

    def getSeatNum(self): #sedan 클래스가 SeatNum을 가짐 
        return self.seatNum


class Truck(Car): #Truck 클래스는 Car 클래스의 상속을 받음 
    capacity=0

    def getCapacity(self): #Truck 클래스가 Capacity을 가짐
        return self.capacity

#변수 선언
sedan1, truck1=None, None

#메인 코드 부분
sedan1=Sedan()
truck1=Truck()

sedan1.upSpeed(100)
truck1.upSpeed(80)

sedan1.seatNum=5
truck1.capacity=50

print("승용차의 속도는 %d km, 좌석수는 %d개입니다." %(sedan1.speed, sedan1.getSeatNum() ))
print("트럭의 속도는 %d km, 총중량은 %d톤입니다. " %(truck1.speed, truck1.getCapacity() ))
