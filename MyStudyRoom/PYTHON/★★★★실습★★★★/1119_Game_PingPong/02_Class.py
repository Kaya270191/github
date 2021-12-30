from tkinter import *

window = Tk()
window.title("MyPingPong")
'''
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
'''


############Table 클래스 생성#########
class Table:
    def __init__(self, window, width, height, bg_color, net_color): #생성자 
        self.width = width
        self.height = height
        self.bg_color = bg_color
        self.net_color = net_color


        ###Table 클래스 내에서 캔버스 생성
        self.canvas = Canvas(window, width=self.width, height = self.height, bg = self.bg_color)
        self.canvas.pack()

        self.canvas.create_line(self.width/2, 0, self.width/2, self.height, fill = net_color, dash=(15,23))

        ### 함수부
        #Canvas(Table)에 타원(공)을 추가하는 함수
    def draw_oval(self, oval):
        x1 = oval.x_posn
        x2 = oval.x_posn + oval.width
        y1 = oval.y_posn
        y2 = oval.y_posn + oval.height
        c = oval.color
        return self.canvas.create_oval(x1, y1, x2, y2, fill = c)

        #Canvas(Table)에 직사각형(배트)를 추가하는 함수
    def draw_rectangle(self, rectangle):
        x1 = rectangle.x_posn
        x2 = rectangle.x_posn + rectangle.width
        y1 = rectangle.y_posn
        y2 = rectangle.y_posn + rectangle.height
        c = rectangle.color
        return self.canvas.create_rectangle(x1, y1, x2, y2, fill = c)        
                           



###########Ball 클래스 생성###########
class Ball:                 ##(self, 테이블위에 공 생성, 공 가로, 공 세로, 색, 속도)
    def __init__(self, table, width, height, color, x_speed, y_speed, x_posn, y_posn): #생성자
        self.width = width              #공의 가로사이즈
        self.height = height            #공의 세로 사이즈
        self.x_posn = x_posn        # 공의 x 좌표값
        self.y_posn = y_posn        # 공의 y 좌표값
        self.color = color              #공의 색상

        self.x_start = x_posn
        self.y_start = y_posn
        self.x_speed = x_speed
        self.y_speed = y_speed

        self.table = table              # 입력받은 table 값을 대입
        self.circle = self.table.draw_oval(self)   #위 table에 draw_oval 함수

       

###########Bat 클래스 생성###########
class Bat:
    def __init__(self, table, width, height, x_posn, y_posn, color, x_speed = 23, y_speed  =23):
        self.width = width              #배트의 가로사이즈
        self.height = height            #배트의 세로 사이즈
        self.x_posn = x_posn        # 배트의 x 좌표값
        self.y_posn = y_posn        # 배트의 y 좌표값
        self.color = color              #배트의 색상

        self.x_start = x_posn
        self.y_start = y_posn
        self.x_speed = x_speed
        self.y_speed = y_speed

        self.table = table              # 입력받은 table 값을 대입
        self.rectangle = self.table.draw_rectangle(self)   #테이블에 배트 자기자신을 매개변수로 테이블에 사각형그리기

        


my_Table = Table(window, 600, 400, "black", "green") # 만든 Table 클래스로 인스턴스my_Table 생성
#만든 Ball 클래스로 my_ball 인스턴스 생성 - 앞에 파라미터 명을 적어주면 ( ) 안 변수를 생성자 순서대로 안 써도 됨.
#Ball(self, table, width, height, color, x_speed, y_speed, x_posn, y_posn)
my_ball = Ball(table = my_Table, x_speed =0, y_speed=0, width=24, height=24, color="red", x_posn=288, y_posn=188)

#만든 Bat 클래스로부터 인스턴스 배트 생성
#Bat(self, table, width, height, x_posn, y_posn, color, x_speed = 23, y_speed  =23)
bat_L = Bat(table = my_Table, width = 15, height = 100, x_posn=20, y_posn=150, color="blue")
bat_R = Bat(table = my_Table, width = 15, height = 100, x_posn=565, y_posn=150, color="yellow")


window.mainloop()










