#마우스  왼쪽, 오른쪽  버튼을 누르면 메시지박스 등장~

from tkinter import*
from tkinter import messagebox 

#함수 정의 부분
def clickLeft(event): 
    messagebox.showinfo("마우스","마우스 왼쪽 버튼이 클릭됨")

def clickRight(event):
    messagebox.showinfo("마우스","마우스 오른쪽 버튼이 클릭됨")

def clickImage(event):
    messagebox.showinfo("마우스", "토끼 눌렀어")
    
def EnterImage(event):
    messagebox.showinfo("마우스", "사진에 마우스를 올렸을 때!!!")
    window2=Tk() #새창 생성 


#메인 코드 부분
window= Tk()
window.geometry("500x500")

photo = PhotoImage(file = "../gif/rabbit.gif")
label1 = Label(window, image=photo)


window.bind("<Button-1>", clickLeft) #윈도우 화면에 왼쪽 버튼을 눌렀을 때 clickLeft 함수를 실행
window.bind("<Button-3>", clickRight) # 윈도우 화면에 오른쪽 버튼을  눌렀을 때 clickLeft 함수를 실행
label1.bind("<Button>", clickImage) #사진을 눌렀을 때 clickImage 함수 실행 
label1.bind("<Enter>", EnterImage) #사진 위에 마우스를 올렸을 때 EnterImage 함수 실행 
label1.pack(expand=1, anchor=CENTER)
window.mainloop()
