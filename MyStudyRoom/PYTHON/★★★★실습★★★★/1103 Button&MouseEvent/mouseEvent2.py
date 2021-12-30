#12-15
#마우스를 클릭할 때 마다 어떤 마우스가 클릭되었는지 보여주고 좌표도 출력

from tkinter import*

#함수 정의 부분
def clickMouse(event):
    txt=""
    if event.num==1:
        txt +="마우스 왼쪽 버튼이 ("
    elif event.num==3:
        txt +="마우스 오른쪽 버튼이 ("

    txt+=str(event.x)+"," + str(event.y)+")에서 클릭됨"
    label1.configure(text =txt)
    label1.place(x=event.x, y=event.y) #place(x,y) x 좌표는 마우스를 눌렀을 때 뜨는 좌표로 

#메인 코드 부분
window = Tk()
window.geometry("400x400")

label1 = Label(window, text= "이곳이 바뀜")

window.bind("<Button>", clickMouse)
#expand: 미사용 공간 확보, True/False
#할당되지 않은 미사용 공간을 모두 현재 위젯의 할당된 공간으로 변경 
label1.pack(expand =1, anchor = CENTER)
window.mainloop()
