from tkinter import *

window = Tk()
window.title("MyPingPong")

###캔버스 생성
canvas = Canvas(window, width =600, height =400, bg ="black")
canvas.pack()

###캔버스 위에 선 생성(선이시작하는 x .y 와 선이끝나는 x y)
canvas.create_line(300, 0, 300, 400, width=2, fill="green", dash=(15,23))

###캔버스 위에 공 생성(폭과 높이가 24인 빨간 공. 공의 x,y 시작과 끝 좌표)
canvas.create_oval(288,188,312,212,fill="red")

###캔버스 위에 배트 생성 (배트의 왼쪽 상단 좌표와 오른쪽 하단 좌표)
canvas.create_rectangle(20, 150, 35, 250, fill= "blue")
canvas.create_rectangle(565, 150, 580, 250, fill="yellow")


window.mainloop()

