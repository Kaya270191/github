from tkinter import *
import random           #randint 함수를 불러오기 위한 모듈 임포트 

#####전역변수 초기화
x_speed = 10        # 공의 x 속도
y_speed = 0         # 공의 y 속도


#####메인부
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

        #Canvas(Table)에 아이템(공,배트)를 조작할 수 있는 함수 coords()이용
        #coords()는 입력받은 값으로 속성값 업데이트하는 함수 
        #변경된 위치값으로 공과 배트의 위치 변경 
    def move_item(self, item, x1, y1, x2, y2):
        self.canvas.coords(item, x1, y1, x2, y2)
    
                           



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




    ###함수부
    #공이 움직이는 부분
    def move_next(self):
        self.x_posn = self.x_posn + self.x_speed #현재 공의 위치에 이동할 거리 x를 추가
        self.y_posn = self.y_posn + self.y_speed #현재 공의 위치에 이동할 거리 y를 추가

    #공의 변경된 위치 지정 및 이동
        x1 = self.x_posn
        x2 = self.x_posn + self.width
        y1 = self.y_posn
        y2 = self.y_posn +self.height
        self.table.move_item(self.circle, x1, y1, x2, y2)

  
    #공의 초기 위치값 지정
    def start_position(self):
        self.x_posn = self.x_start
        self.y_posn = self.y_start 





    def start_ball(self, x_speed, y_speed): # .randint(0,1)가 참(1)이면 -x.speed가 되고 거짓(0)이면 x_speed가 됨
        self.x_speed = -x_speed if random.randint(0,1) else x_speed #전역변수 x_speed값을 불러와서 randint 로 공을 랜덤하게 움직이게 함
        self.y_speed = -y_speed if random.randint(0,1) else y_speed
        self.start_position()        




       

###########Bat 클래스 생성###########
class Bat:
    def __init__(self, table, width, height, x_posn, y_posn, color, x_speed = 23, y_speed  =23): #생성자 
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

    ##함수부
    #배트를 위로 움직이는 함수 
    def move_up(self, master):
        self.y_posn = self.y_posn - self.y_speed  #y_speed의 값 만큼 y_posn 값을 뺌

        if(self.y_posn <=0): #bat가 위 화면에 닿으면 더이상 올라가지 않게 하는 코드 
            self.y_posn =0
        
        x1 = self.x_posn
        x2 = self.x_posn + self.width
        y1 = self.y_posn                                            #변경된 y_posn 값을 y1에 반영 
        y2 = self.y_posn + self.height

        #변경된 값으로 아이템을 옮김
        #Table 클래스의 move_item() 함수를 실행
        self.table.move_item(self.rectangle, x1, y1, x2, y2)


            #배트를 아래로 움직이는 함수 
    def move_down(self, master): #  이벤트(마우스, 키보드)를 처리해야하는 함수는 파라미터에 반드시 master나 event를 넣어줘야함
        self.y_posn = self.y_posn + self.y_speed  #y_speed의 값 만큼 y_posn 값을 뺌

        if(self.y_posn >=300): #bat가 위 화면에 닿으면 더이상 올라가지 않게 하는 코드 
            self.y_posn =300
        
        x1 = self.x_posn
        x2 = self.x_posn + self.width
        y1 = self.y_posn                                            #변경된 y_posn 값을 y1에 반영 
        y2 = self.y_posn + self.height

        #변경된 값으로 아이템을 옮김
        #Table 클래스의 move_item() 함수를 실행
        self.table.move_item(self.rectangle, x1, y1, x2, y2)



######game_flow() 함수부
def game_flow():                            #공을 일정시간마다 움직임
    my_ball.move_next()
    window.after(30, game_flow) #30밀리초마다 game_flow 함수 실행, ex 5초는 500
        

###### restart_game() 함수부 - 게임을 재시작하는 함수 
def restart_game(master):
    my_ball.start_ball(x_speed = x_speed, y_speed = y_speed)
    




        

###만든 Table 클래스로 인스턴스my_Table 생성
my_Table = Table(window, 600, 400, "black", "green")

###만든 Ball 클래스로 my_ball 인스턴스 생성 - 앞에 파라미터 명을 적어주면 ( ) 안 변수를 생성자 순서대로 안 써도 됨.
#Ball(self, table, width, height, color, x_speed, y_speed, x_posn, y_posn)
my_ball = Ball(table = my_Table, x_speed =0, y_speed=0, width=24, height=24, color="red", x_posn=288, y_posn=188)
my_ball.move_next()



###만든 Bat 클래스로부터 인스턴스 배트 생성
#Bat(self, table, width, height, x_posn, y_posn, color, x_speed = 23, y_speed  =23)
bat_L = Bat(table = my_Table, width = 15, height = 100, x_posn=20, y_posn=150, color="blue")
bat_R = Bat(table = my_Table, width = 15, height = 100, x_posn=565, y_posn=150, color="yellow")



#####함수의 실행부
game_flow()

#restart_game함수 실행부
#스페이스바를 눌러 게임시작 또는 재시작 
window.bind("<space>", restart_game)


###배트를 제어하기 위한 키 이벤트 및 연결될 함수 지정
#window.bind("<키 명>", 함수명)
window.bind("<Up>", bat_R.move_up)
window.bind("<Down>", bat_R.move_down)

window.bind("<A>", bat_L.move_up)
window.bind("<Z>", bat_L.move_down)

window.mainloop()










