#이미지 위젯 10개 가로로 불러오기, list 와 for문 이용 

from tkinter import *

window =Tk()

window.geometry("800x600")

#이미지 위젯 표시
'''
filename1 = PhotoImage(file="../gif/puz1.gif")
imageable1 = Label(window, image=filename1)
imageable1.pack(side=LEFT)

filename2 = PhotoImage(file="../gif/puz2.gif")
imageable2 = Label(window, image=filename2)
imageable2.pack(side=LEFT)
'''
# 반복문과 리스트를 결합하여 이미지 위젯을 순서대로 표시하기 
#리스트 선언
filename = [None] *10 #10칸 짜리 리스트 
imageable = [None] *10

for i in range(1, 10,1):
    filename[i] = PhotoImage(file="../gif/puz"+str(i)+".gif") #사진이름의 숫자는 문자이기 때문에 str를 사용
    imageable[i] = Label(window, image=filename[i])
    imageable[i].pack(side=LEFT)


window.mainloop()











