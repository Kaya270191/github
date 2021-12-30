#tkinter는 파이썬에서 GUI 관련 모듈을 제공해주는 표준 윈도우 라이브러리
#위젯(Widget) - 윈도우 창에 나올 수 있는 문자, 버튼, 체크박스, 라디오버튼 등을 말함
#파이썬 3.6이후 버전에서 messagebox.showinfor() 함수를 사용하기 위해서는
#for tkinter import messagebox 를 추가 해야함 

from tkinter import  *
from tkinter import messagebox

#Tk( )는 기본이 되는 윈도우를 반환, 루트 윈도우(Root Window) 또는 베이스 윈도우(Base Window)
window= Tk()

#윈도우 창에 제목 표시 
window.title("윈도우 창 연습")

#윈도우 창의 초기 크기 지정
window.geometry("600x300")


#윈도우 창의 크기 변경 가능 여부 설정, TRUE/FALSE , 1/0 로 표현 가능
window.resizable(width=1, height=1)


#1. 라벨은 문자 또는 이미지를 표현할 수 있는 위젯
#위젯은 생성하고 디스플레이하는 2스텝으로 진행
#step1. 라벨 위젯을 생성 
label1= Label(window, text="파이썬은 재밌다")
label2= Label(window, text="파이썬은 재미있다 너무 재미있다")
label3= Label(window, text="오늘은 불금", font=("궁서체", 30), fg="blue")
#anchor 는 위젯의 위치 지정, N,NE,E,SE,S,SW,W,NW,CENTER 등이며 기본값은 CENTER
label4= Label(window, text="공부 중입니다", bg="magenta", width=5, height=2, anchor=NW)
#step2. 라벨 위젯을 화면에 표시
#pack() 함수를 호출하여 화면에 디스플레이 됨
label1.pack()
label2.pack()
label3.pack()
label4.pack()

#2. 이미지 위젯 표시
#step1. 이미지를 불러옴
filename = PhotoImage(file ="../gif/dog3.gif") #이미지의 경로와 이미지의 이름을 적어야함 .filename은 인스턴스 명 
filename2 = PhotoImage(file ="../gif/dog.gif")
filename3 = PhotoImage(file ="../gif/jeju3.gif")

#step2. 이미지 위젯을 생성
imagelabel3= Label(window, image= filename3)
imagelabel = Label(window, image= filename)
imagelabel2= Label(window, image= filename2)

#step3.  이미지 위젯을 화면에 표시
imagelabel3.place(x=-2, y=-2) #place ()위치 조정
imagelabel.pack(side=LEFT)  #pack() 화면에 띄우기
imagelabel2.pack(side=LEFT) #가로 왼쪽 정렬

#버튼을 눌렀을 때 사용자 정의 함수가 실행되도록 하기
#사용자 정의 함수 만들기
def myFunc():
    messagebox.showinfo("강아지 버튼", " 강아지 이쁘다")



#3. 버튼 위젯 표시
#step1. 버튼 위젯을 생성
#button1= Button(window, text="파이썬 종료", fg="red", command=quit) #버튼에 텍스트 표시 
button1= Button(window, image= filename, fg="red", command=myFunc) #버튼에 이미지를 표시
#step2. 버튼 위젯을 화면에 표시 
button1.pack()

#화면을 구성하고 처리
#윈도우 창에 키보드 누르기, 마우스 클릭 등 다양한 이벤트를 처리 
window.mainloop()






