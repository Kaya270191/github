#사진 앨범 보기 프로그램 

from tkinter import*
from time import*

#변수 선언
fnameList = ["../gif/jeju1.gif"] #파일목록 리스트 생성 

for i in range(2,10):
    fnameList.append("../gif/jeju"+str(i)+".gif") # 리스트에 사진을 추가 
    
#함수 선언/ 버튼 함수 
num=0 #함수의 변수 선언
def clickNext(): #클릭하면 누르면 다음장으로 가는 함수 
    global num # 전역변수 
    num+=1 #다음 사진이 보여야 함으로 +1씩 증가 
    if num>8: # 8이상이 되면 
        num=0 # 0으로 돌아가

    photo = PhotoImage(file = fnameList[num]) #변경된 사진 번호에 해당하는 이미지 파일로 pLabel변경
    pLabel.configure(image=photo)
    pLabel.image = photo
    labelText.configure(text="Jeju"+str(num+1)+".gif") #버튼을 눌렀을 때 사진 이름 나옴

def clickPrev(): #클릭하면 누르면 이전 
    global num 
    num-=1
    if num < 0: #사진 번호가 0보다 작으면 
        num=8 #가장큰 8번 사진으로 넘어감 
    photo = PhotoImage(file = fnameList [num]) #변경된 사진 번호에 해당하는 이미지 파일로 pLabel변경
    pLabel.configure (image = photo)
    pLabel.image = photo
    labelText.configure(text="Jeju"+str(num+1)+".gif") #버튼을 눌렀을 때 사진 이름 나옴
    

#키보드 함수 - 특수 키나 키보드로 처리하려면 이벤트를 사용해야 함 
def pageUp(event): #pageUp 함수는 event가 발생했을 때 (함수가 함수를 부름!)
    clickNext() #clinckNext ()함수를 호출 

def pageDown(event):#pageUp 함수는 event가 발생했을 때 (함수가 함수를 부름!)
    clickPrev() #clickPrev()함수를 호출 


#메인 코드
window = Tk() #윈도우 생성
window.geometry("920x650") #사이즈
window.title("사진 앨범 보기") #타이틀 지정

background = PhotoImage(file="../gif/background.png") #배경이미지 설정 -step1
bgLabel = Label(window, image = background) #배경이미지 설정 -step2


window.bind("<Prior>", pageUp)  #키보드 이벤트 처리
window.bind("<Next>", pageDown) # <NEXT> 키보드 키를 누르면 pageDown 함수로
window.bind("<Right>", pageUp) # <Right> 키보드 키를 누르면 pageUp 함수로
window.bind("<Left>", pageDown) # <Left> 키보드 키를 누르면 pageDown 함수로

#사진이 올라간 위젯 생성 
btnNext1 = PhotoImage(file="../gif/arrow.png")
btnLabel1= Label(window, image= btnNext1)

btnPrev1 = PhotoImage(file="../gif/arrow1.png")
btnLabel2= Label(window, image= btnPrev1)

btnPrev = Button(window, image=btnPrev1,  cursor="heart",command = clickPrev) #버튼 위젯 생성 -step1
btnNext = Button(window, image=btnNext1, cursor="heart", command = clickNext)


labelText = Label(window, text =" Jeju1.gif", font = ("Curlz MT",17)) #라벨 텍스트 생성 

photo = PhotoImage(file= fnameList[0]) #이미지를 파일로 부터 준비 -step1
pLabel = Label(window, image = photo) #이미지 위젯 생성 -step2

buttonExit = PhotoImage(file="../gif/xicon.png") # 종료 아이콘 위젯 생성 
button1=Button(window, image = buttonExit, cursor="heart",command=quit)



bgLabel.place(x=-2, y=-2) #배경 디스플레이 -step3
btnPrev.place(x=300, y=40) #버튼 위젯 디스플레이-step2
labelText.place(x=450, y=55) #라벨 텍스트 디스플레이 
btnNext.place(x=600, y=40)
pLabel.place(x=140, y = 120) #이미지 위젯  디스플레이 -step3
button1.place(x=80,y=40) # 종료 위젯 디스플레이


window.mainloop()
