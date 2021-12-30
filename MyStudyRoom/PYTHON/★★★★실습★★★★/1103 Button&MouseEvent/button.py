
from tkinter import*
window = Tk()
window.geometry("800x600") #윈도우 사이즈 지정 

'''
#버튼 생성
button1= Button(window, text="버튼1")
button2= Button(window, text="버튼2")
button3= Button(window, text="버튼3")
button4= Button(window, text="버튼4")
button5= Button(window, text="버튼5")
button6= Button(window, text="버튼6")

#버튼 출력
button1.pack(side=LEFT)
button2.pack(side=LEFT)
button3.pack(side=LEFT)
button4.pack(side=LEFT)
button5.pack(side=LEFT)
button6.pack(side=LEFT)

window.mainloop()


#반복문과 리스트를 활용하여 소스코드 수정하기
button = [None]*6 #6개 칸막이가 있는 빈 리스트 만들기
for i in range(0,6,1) :
    button[i]= Button(window, text="버튼"+str(i+1)) #문자열로 표한하기 위해 str ()
    button[i].pack(side=LEFT)
    print(button)

'''

'''
button = [None]*6 #6개 칸막이가 있는 빈 리스트 만들기
for i in range(0,2,1) :
    
    for i in range(0,3,1):
        button[i]= Button(window, text="버튼"+str(i+1)) #문자열로 표한하기 위해 str ()
        button[i].pack(side=LEFT)
        print(button)
       


'''

#버튼 생성
button1= Button(window, text="버튼1")
button2= Button(window, text="버튼2")
button3= Button(window, text="버튼3")
button4= Button(window, text="버튼4")
button5= Button(window, text="버튼5")
button6= Button(window, text="버튼6")
button7= Button(window, text="버튼7")
button8= Button(window, text="버튼8")
button9= Button(window, text="버튼9")
button10= Button(window, text="버튼10")
button11= Button(window, text="버튼11")
button12= Button(window, text="버튼12")

#버튼 출력
button1.place(x=0, y=0)
button2.place(x=50, y=0)
button3.place(x=100, y=0)
button4.place(x=0, y=30)
button5.place(x=50, y=30)
button6.place(x=100, y=30)
button7.place(x=0, y=60)
button8.place(x=50, y=60)
button9.place(x=100, y=60)
button10.place(x=0, y=90)
button11.place(x=50, y=90)
button12.place(x=100, y=90)



'''

#for문을 이용해 버튼 3 x 4 만들기
#place ()이용해 원하는 자리에 배치 !
button=[None]*12 #배열 만들기 
xPos, yPos =0,0 #버튼의 위치(변수)를 (0,0)으로 초기값을 준다 

i=0 # 버튼의 숫자 
print(button)
for y in range(0,3): #세로줄 버튼 

    for x in range(0,4): #가로줄 버튼 만들기 
        button[i] = Button(window, text="버튼"+str(i+1)) #버튼 만들기 
        button[i].place(x=xPos, y=yPos) #버튼 위치
        xPos+=50 #버튼 만든 후 다음 버튼을 만들기 위해 x 좌표 50씩 증가  
        i+=1 #내부 for문 i 를 1증가  

    xPos=0 #내부 for문이 끝나면 x 좌표 0으로 만들기
    yPos+=30 # 내부 for 문이 끝나면 y 좌표에 30 증가 시키기 
                           

#for문을 이용해 버튼 3 x 3 만들기
#place ()이용해 원하는 자리에 배치 !
#버튼에 이미지 표현하기

#버튼에 사용될 이미지 생성하기

#1.파일 이름 목록 리스트 생성 
fnameList=["../gif/puz1.gif"]

for i in range(2,10): #fnamelist에 사진을 추가 
    fnameList.append("../gif/puz"+str(i)+".gif")
    print(fnameList)

button=[None]*9 #버튼 배열 만들기

#2.PhotoImage로 이미지 생성
photoList = [None]*9
for i in range(0,9):
    photoList[i] = PhotoImage(file = fnameList[i])
    button[i] = Button(window, image=photoList[i]) #버튼 만들기 


#버튼으로 이미지 출력 
xPos, yPos =0,0 #버튼의 위치(변수)를 (0,0)으로 초기값을 준다 

i=0 # 버튼의 숫자 
print(button)
for y in range(0,3): #세로줄 버튼 
    for x in range(0,3): #가로줄 버튼 만들기
                           
        button[i].place(x=xPos, y=yPos) #버튼 위치
        xPos+=70 #버튼 만든 후 다음 버튼을 만들기 위해 x 좌표 50씩 증가  
        i+=1 #내부 for문 i 를 1증가  

    xPos=0 #내부 for문이 끝나면 x 좌표 0으로 만들기
    yPos+=70 # 내부 for 문이 끝나면 y 좌표에 30 증가 시키기 
                     
'''



