'''
##input 함수로 값 입력받기
print("더할 첫번째 값 입력>>")
a = input()
print("더할 두번째 값 입력>>")
b = input()
result = a +b
print(result)


#사용자가 입력한 값을 int형으로 변환하기
c = int(input("첫번째 입력"))
print(c)
d = int(input("두번째 입력"))
result = c+d
print(result)

'''
'''
##선그리기 
from tkinter import * #GUI 프로그램을 작성할 수 있는 tkinter 호출 

#####변수선언부분
window = None
canvas = None
x1, x2, y1, y2 = None, None, None, None #x1,y1는 시작점 x2,y2는 끝점 

##### 함수 선언 부분
def mouseClick(event): #마우스클릭할 때  함수
    global x1, y1, x2, y2
    x1 = event.x
    y1 = event.y

def mouseDrop(event): #마우스 뗄 때
    global x1, y1, x2, y2
    x2 = event.x
    y2 = event.y
    my_canvas.create_line(x1, y1, x2, y2, width=5, fill ="red")


#####메인코드
window = Tk()
window.title("window")
window.geometry("500x300")
my_canvas=Canvas(window, height = 500, width = 300) #캔버스 만든 인스턴스
my_canvas.bind("<Button-1>", mouseClick) # 캔버스 인스턴스.bind ("마우스 오른쪽 클릭", 함수)
my_canvas.bind("<ButtonRelease-1>", mouseDrop)

my_canvas.pack() #캔버스를 생성


window.mainloop()
'''
'''
print("안녕")
print("100") #문자열로 인식
print("%d" % 100) #숫자로 인식
print("100+100") #문자열
print("%d" %(100+100))
print(("%d +  %d - %d") %(100,200,300))

#변수
a = 100
type(a)
print(type(a)) #a의 프린트 
'''
'''
a,b = 9,2
print(a**b) #제곱
print(a%b) #나머지
print(a//b) #나눠서 소수점 버리기 
'''

'''
#####동전 교환 프로그램 완성
##변수 선언
money, c500, c100, c50=0,0,0,0
##메인 코드부분
money = int(input("교환할 돈은 얼마???"))
c500 = money/500
money = money
c100 = money/100
money = money
c50 = money / 50
money = money
print(("%d") %money)
'''

list1=[]
list2=[]
value=1

for i in range(0,3):
    for k in range(0,4):
        list1.append(value)
        list2.append(list1)
        list1 =[]
    print(list[i][k])











