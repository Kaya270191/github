#좋아하는 동물 투표 프로그램 . 라벨, 라디오버튼, 
#11-9

from tkinter import*
from tkinter import messagebox

window=Tk()
window.geometry("400x420") #윈도우창 만들기 
window.title("애완동물 선택하기")

#함수 정의
def myFunc():
    if var.get() == 1:
        labelImage.configure(image = photo1)  #클릭하면 사진 표시
        labelText2.configure(text="강아지를 좋아하시네요") #클릭하면 글씨 표시               
    elif var.get() == 2:
        labelImage.configure(image = photo2)
        labelText2.configure(text="고양이를 좋아하시네요")
    else :
        labelImage.configure(image = photo3)
        labelText2.configure(text="토끼를 좋아하시네요")

#메인 코드 부분
filename = PhotoImage(file="../gif/jeju3.gif") #배경 이미지 설정하기
imagelabel = Label(window, image = filename)
        
labelText = Label(window, text="좋아하는 동물 투표", fg="blue", font=("고딕체",20))


var = IntVar()
rb1 = Radiobutton(window, text = "강아지", variable = var, value = 1 , command=myFunc) #라디오 버튼을 var의 값으로 1로 대입됨. 누르면 함수 실행(사진보여줌)
rb2 = Radiobutton(window, text="고양이", variable = var, value = 2, command=myFunc)
rb3 = Radiobutton(window, text="토끼", variable = var, value=3, command=myFunc)
button0k = Button(window, text="사진보기 ", command=myFunc) #button0k를 누르면 myFunc함수 실행

#각각의 라디오 버튼과 연결된 이미지 지정 
photo1 = PhotoImage(file="../gif/dog4.gif")
photo2 = PhotoImage(file="../gif/cat.gif")
photo3 = PhotoImage(file="../gif/rabbit.gif")
photo4 = PhotoImage(file="../gif/back2.png")

#이미지 위젯 labelImage 생성, 초기 이미지로 photo4 표시  
labelImage = Label(window, width=200, height=200, bg="#fff", image=photo4)
#텍스트 라벨 생성 
labelText2 = Label(window, text="어떤 동물을 좋아하세요?")


labelText.pack(padx=5, pady=5)

imagelabel.place(x=-2, y=-2) #배경 표시 
rb1.pack(padx=5, pady=5)
rb2.pack(padx=5, pady=5)
rb3.pack(padx=5, pady=5)
button0k.pack(padx=5,pady=5)
labelImage.pack(padx=5, pady=5)
labelText2.pack(padx=5, pady=5) #텍스트 라벨 표시 

window.mainloop()


                  
