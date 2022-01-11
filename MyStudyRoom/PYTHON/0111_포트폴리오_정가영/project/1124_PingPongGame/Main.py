from tkinter import *

from table import* #모듈명 안 붙여도 됨.  #import table #불러오면 모듈명을 붙여야함
from ball import*
from bat import*


#####전역변수 초기화####
x_speed = 10        # 공의 x 속도
y_speed = 0         # 공의 y 속도

score_left =0       #왼쪽 점수판 초기화
score_right =0      #오른쪽 점수판 초기화


#####메인부####
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

######game_flow() 함수부#####
def game_flow():                              #공을 일정시간마다 움직임
    global score_left, score_right      #전역변수 선언 
    my_ball.move_next()
    window.after(30, game_flow)     #30밀리초마다 game_flow 함수 실행, ex 5초는 500

    #공이 배트에 닿았는지 충돌 확인, 두 배트에 대해 detect_collision() 함수 실행
    bat_L.detect_collision(my_ball)
    bat_R.detect_collision(my_ball)


    ###공이 좌우 벽에 충돌했을 때 처리
    #왼쪽 벽에 충돌한 상황 -> 공의 x 좌표값이 0보다 작을 경우 
    if(my_ball.x_posn <= 0 ):
        my_ball.stop_ball()                 # 공을 멈춤, x_speed, y_speed를 0으로 설정
        my_ball.start_position()         # 공의 위치 초기화
        
        bat_L.start_position()          #bat_L 배트 위치 초기화
        bat_R.start_position()          #bat_R 배트 위치 초기화



        #득점판 득점 표시
        score_right = score_right +1
        if(score_right >=10):            #score_right가 3점 이상이면  
            score_right = "WIN"           #score_right 를 WIN로 표시 
            score_left = "LOSE"                #score_right 를 LOSE로 표시
        my_table.draw_score(score_left, score_right)



    #공이 오른쪽 벽에 충동했는지 감지하여 처리 
    if(my_ball.x_posn  + my_ball.width >= my_table.width ):
        my_ball.stop_ball()                 # 공을 멈춤, x_speed, y_speed를 0으로 설정
        my_ball.start_position()         # 공의 위치 초기화
        
        bat_L.start_position()          #bat_L 배트 위치 초기화
        bat_R.start_position()          #bat_R 배트 위치 초기화
        

        #득점판 득점 표시
        score_left = score_left +1
        if(score_left >=10):
            score_left = "WIN"
            score_right = "LOSE"
        my_table.draw_score(score_right, score_left)


###### restart_game() 함수부 - 게임을 재시작하는 함수 
def restart_game(master):
    global score_left
    global score_right
    
    my_ball.start_ball(x_speed = x_speed, y_speed = y_speed) #볼 초기화
    bat_L.start_position()              # 배트 초기화
    bat_R.start_position()              # 배트 초기화 
    if(score_left =="WIN" or score_right =="LOSE"):         #득점판 초기화   
        score_left =0
        score_right =0
    my_table.draw_score(score_left, score_right)          


 

###만든 Table 클래스로 인스턴스my_Table 생성
my_table = Table(window, 600, 400 ,"pink","silver")

#배경이미지 설정 
bgImage =   PhotoImage(file = "background_space.png")
my_table.canvas.create_image(0, 0, anchor =NW, image = bgImage, tags="bgbg_img")
my_table.canvas.lower("bgbg_img") 


###만든 Ball 클래스로 my_ball 인스턴스 생성 - 앞에 파라미터 명을 적어주면 ( ) 안 변수를 생성자 순서대로 안 써도 됨.
#Ball(self, table, width, height, color, x_speed, y_speed, x_posn, y_posn)
my_ball = Ball(table = my_table, x_speed =5, y_speed=5, width=24, height=24, color="lime", x_posn=288, y_posn=188)
my_ball.move_next()



###만든 Bat 클래스로부터 인스턴스 배트 생성
#Bat(self, table, width, height, x_posn, y_posn, color, x_speed = 23, y_speed  =23)
bat_L = Bat(table = my_table, width = 15, height = 100, x_posn=20, y_posn=150, color="sandybrown")
bat_R = Bat(table = my_table, width = 15, height = 100, x_posn=565, y_posn=150, color="palegoldenrod")



################함수의 실행부##########
game_flow()

#restart_game함수 실행부
#스페이스바를 눌러 게임시작 또는 재시작 
window.bind("<space>", restart_game)


###배트를 제어하기 위한 키 이벤트 및 연결될 함수 지정
#window.bind("<키 명>", 함수명)
window.bind("<Up>", bat_R.move_up)
window.bind("<Down>", bat_R.move_down)
window.bind("<Right>", bat_R.move_right)
window.bind("<Left>", bat_R.move_left)

window.bind("<w>", bat_L.move_up)
window.bind("<s>", bat_L.move_down)
window.bind("<d>", bat_L.move_right)
window.bind("<a>", bat_L.move_left)

window.mainloop()

