
from tkinter import*
window = Tk()
window.geometry("800x600") #윈도우 사이즈 지정 



button=[None]*9
photoList = [None]*9
xPos, yPos =0,0 
i=0

for y in range(0,3): 
    for x in range(0,3):
        #PhotoImage 로 이미지 생성 
        photoList[i] = PhotoImage(file ="../gif/puz"+str(i+1)+".gif")
        #버튼 이미지 생성 
        button[i] = Button(window, image=photoList[i])
        #버튼 이미지 출력 
        button[i].place(x=xPos, y=yPos) 
        xPos+=70
        i+=1 
    xPos=0 
    yPos+=70 





                     
