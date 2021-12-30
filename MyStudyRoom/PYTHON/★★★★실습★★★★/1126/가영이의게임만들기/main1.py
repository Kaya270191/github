from tkinter import *
from table1 import *
from ball1 import *
from bat1 import *




window = Tk()
window.title("MyBreakOut")

#전역 변수 초기화
x_velocity =10
y_velocity =15
first_serve = True
bricks=[]

#### 함수:
def game_flow(): #
    my_ball.move_next() #공 움직이기
    window.after(40, game_flow) # 50 밀리초마다 game_flow 함수 실행
    create_bricks()


    # 배트에 공이 충돌하는지 감지
    bat_B.detect_collision(my_ball, sides_sweet_spot=False, topnbottom_sweet_spot=True)

    # 벽돌에 공이 충돌하는지 감지
    for b in bricks:
        #  b번째 공이 벽돌에 충돌했다면 벽돌을 화면에서 지우고, 배열에서 삭제
        if(b.detect_collision(my_ball, sides_sweet_spot=False) != None):
            print(b.detect_collision(my_ball, sides_sweet_spot=False))
            my_table.remove_item(b.rectangle)
            bricks.remove(b)
        # 벽돌이 없다면 점수 출력
        if(len(bricks) == 0): #벽돌의 수가 없다면
            my_ball.stop_ball() #볼 멈춤
            my_ball.start_position() #볼을 스타트 포지션으로
            my_table.draw_score("", "  YOU WIN!")             #YOU WIN을 화면에 그린다.  
            
    # 아래쪽 벽에 공이 충돌하는지 감지
    if(my_ball.y_posn >= my_table.height - my_ball.height): #테이블 높이에서 공의 높이를 뺀 것보다 볼 포지션이 더 크면
        my_ball.stop_ball() #볼을 멈추고
        my_ball.start_position() #볼을 스타트 포지션으로 옮긴다
        first_serve = True #퍼스트 서브를 트루로 바꾸고..???
        my_table.draw_score("", " ") #스코어를 화면에 그린
    


#테이블 생성
my_table = table.Table(window, width=680, height =849)

#배경이미지 설정
bgImage = PhotoImage(file="roodolf.png")
my_table.canvas.create_image(0,0,anchor=NW, image=bgImage, tags="bgbg_img")
my_table.canvas.lower("bgbg_img")


#ball 모듈의 Ball 클래스로부터 my_ball 인스턴스 생성 %필드명 없이 적어줄 때는 함수의 괄호 안 순서대로 적어야함
my_ball = Ball(table = my_table, x_speed=x_velocity, y_speed=y_velocity,
                    width=30, height=30, colour="red", x_start=310, y_start=550)

#bat 모듈의 Bat클래스로부터 bat_B 인스턴스 생성 
bat_B = Bat(table = my_table, width=120, height=20,
                x_posn=267, y_posn=750, colour="black")


# 벽돌 리스트(bricks)를 생성하여 반복문을 통해 6개의 리스트 원소를 추가
def create_bricks(): 
    b=1
    #while b < 8:
    #    i=80 #벽돌을 x좌표 80px 간격으로 생성 
    #    bricks.append(Bat(table = my_table, width=50, height=20,
    #                          x_posn=(b*i), y_posn=75, colour="green"))
    #    b = b+1
    xx = 80
    yy = 75
    for i in range(1, 5, 1):
        for b in range( 1, 8,1):
            bricks.append(Bat(table = my_table, width = 50, height = 20, x_posn=xx, y_posn=yy, colour="green"))
            xx += 80
        yy+=35
        xx=80
        
#def no_bricks():
#    if(bricks=0)
#        create_bricks()
    
    

#키 이벤트(Space) 가 발생하면 공을 지정한 speed로 속도를 지정
def restart_game(master):
    my_ball.start_ball(x_speed=x_velocity, y_speed=y_velocity)
    my_table.draw_score("", " Game Start")
    bat_B.start_position()  #배트 초기화
    
   
    
# 스페이스 키를 게임 재시작 기능과 연결 
window.bind("<space>", restart_game)


# 배트를 제어할 수 있도록 키보드의 키와 연결
window.bind("<Left>", bat_B.move_left)
window.bind("<Right>", bat_B.move_right)

#game_flow() 함수 실행 
game_flow()


window.mainloop()
