# MyPong의 주된 파일을 만듭니다.

from tkinter import *
import table, ball, bat, random


window = Tk()
window.title("MyBreakout")
my_table = table.Table(window)

# 전역 변수 초기화
x_velocity = 8 #공의 속도 
y_velocity = 14
first_serve = True # 왜????

# Ball 공장으로부터 볼을 주문합니다
my_ball = ball.Ball(table = my_table, x_speed=x_velocity, y_speed=y_velocity,
                    width=24, height=24, colour="red", x_start=388, y_start=288)

# Bat 공장으로부터 배트를 주문합니다
bat_B = bat.Bat(table = my_table, width=100, height=10,
                x_posn=350, y_posn=470, colour="blue")

# Bat 클래스로부터 배트를 주문하지만 이것은 벽돌을 호출하는 것은 아닙니다.
bricks = [] #벽돌을 담는 함수 




b=1                 #1부터
while b < 11:     #6까지  
    i=80            #??
    bricks.append(bat.Bat(table = my_table, width=50, height=20,
                          x_posn=(b*i), y_posn=75, colour="green"))
    b = b+1

        
#### 함수:
def game_flow():
    global first_serve
    # 첫번째 서브를 기다립니다:
    if(first_serve==True):      #첫번째 서브가 트루일때 
        my_ball.stop_ball()     #볼은 멈춰있다
        first_serve = False     #폴스가 되면 움직임
    
    # 배트에 공이 충돌하는지 감지-??
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
        my_table.draw_score("", "  WHOOPS!") #스코어를 화면에 그린
        
    my_ball.move_next()
    window.after(50, game_flow)
    
def restart_game(master):
    my_ball.start_ball(x_speed=x_velocity, y_speed=y_velocity)
    my_table.draw_score("", "")

# 배트를 제어할 수 있도록 키보드의 키와 연결
window.bind("<Left>", bat_B.move_left)
window.bind("<Right>", bat_B.move_right)
window.bind("<Up>", bat_B.move_up)
window.bind("<Down>", bat_B.move_down)

# 스페이스 키를 게임 재시작 기능과 연결
window.bind("<space>", restart_game)

game_flow()
window.mainloop()
