from tkinter import *
from table import *
from ball import *
from bat import *



window = Tk()
window.title("MyChristmasGame")

#테이블 생성
my_table = table.Table(window, width=680, height =849 )


#전역 변수 초기화
x_velocity =10
y_velocity =10
first_serve = True
bricks=[]
array = ["H","Ha","Hap","Happ","Happy","Happy C","Happy Ch","Happy Chr","Happy Chri","Happy Chris","Happy Christ","Happy Christm","Happy Christma","Happy Christmas"]



#ball 모듈의 Ball 클래스로부터 my_ball 인스턴스 생성 %필드명 없이 적어줄 때는 함수의 괄호 안 순서대로 적어야함
my_ball = Ball(table = my_table, x_speed=x_velocity, y_speed=y_velocity,
                    width=24, height=24, colour="red", x_start=310, y_start=550)


#bat 모듈의 Bat클래스로부터 bat_B 인스턴스 생성 
bat_B = Bat(table = my_table, width=120, height=15,
                x_posn=267, y_posn=750, colour="black")


#### 함수:
def game_flow(): #게임진행 함수 
    global first_serve
    # 첫번째 서브를 기다립니다:
    if(first_serve==True):
        my_ball.stop_ball()
        first_serve = False
    

    # 배트에 공이 충돌하는지 감지
    bat_B.detect_collision(my_ball, sides_sweet_spot=False, topnbottom_sweet_spot=True)

    # 벽돌에 공이 충돌하는지 감지
    for b in bricks:
        #  b번째 공이 벽돌에 충돌했다면 벽돌을 화면에서 지우고, 배열에서 삭제
        if(b.detect_collision(my_ball, sides_sweet_spot=False) != None):
            print(b.detect_collision(my_ball, sides_sweet_spot=False))
            my_table.remove_item(b.rectangle)
            bricks.remove(b)
            my_table.change_color(my_ball.circle, "#{:02x}{:02x}{:02x}".format(random.randint(0,255),random.randint(0,255),random.randint(0,255)))

        #벽돌이 14개 보다 적게 남아있으면 Happy Christmas가 차례로 나옴 
        if(len(bricks)  < 14 ): 
            for i in range(14-len(bricks)):
                my_table.draw_Merry(str(array[i]))
            
            
        # 벽돌이 없다면 점수 출력
        if(len(bricks) == 0): #벽돌의 수가 없다면
            my_ball.stop_ball() #볼 멈춤
            my_ball.start_position() #볼을 스타트 포지션으로
            #my_table.draw_score("", "  Finish Game!") #Finish Game 출력
            bat_B.start_position() #배트를 스타트 포지션으로

    my_ball.move_next() #공 움직이기
    window.after(30, game_flow) # 30 밀리초마다 game_flow 함수 실행

        
            
    # 아래쪽 벽에 공이 충돌하는지 감지
    if(my_ball.y_posn >= my_table.height - my_ball.height): #테이블 높이에서 공의 높이를 뺀 것보다 볼 포지션이 더 크면
        my_ball.stop_ball() #볼을 멈추고
        my_ball.start_position() #볼을 스타트 포지션으로 옮긴다
        bat_B.start_position() #배트를 스타트 포지션으로 옮긴다
        remove_bricks() #남은 블럭을 삭제하고
        create_bricks() #새로 블럭 생성 
        first_serve = True #퍼스트 서브를 트루로 바꾸고..???
        my_table.draw_score("", "  Game Over!") #스코어를 화면에 그린
        my_table.draw_Merry(" ")


    
#벽돌리스트 만들기
def create_bricks(): 
    b=1
    xx = 80
    yy = 75
    for i in range(1, 5, 1):
        for b in range( 1, 8,1): 
            bricks.append(Bat(table = my_table, width = 50, height = 20, x_posn=xx, y_posn=yy, colour="chocolate"))
            xx += 80
        yy+=35
        xx=80

def remove_bricks():
    for i in bricks:
        bricks.remove(i)
        my_table.remove_item(i.rectangle)


#배경이미지 설정
bgImage = PhotoImage(file="roodolf.png")
my_table.canvas.create_image(0,0,anchor=NW, image=bgImage, tags="bgbg_img")
my_table.canvas.lower("bgbg_img")


#키 이벤트(Space) 가 발생하면 공을 지정한 speed로 속도를 지정
def restart_game(master):
    my_ball.start_ball(x_speed=x_velocity, y_speed=y_velocity)
    my_table.draw_score("", "")
    my_table.draw_Merry(" ")
    
    bat_B.start_position()
    if(len(bricks) == 0 ):
        create_bricks()
    
    
# 스페이스 키를 게임 재시작 기능과 연결
window.bind("<space>", restart_game)


# 배트를 제어할 수 있도록 키보드의 키와 연결
window.bind("<Left>", bat_B.move_left)
window.bind("<Right>", bat_B.move_right)

#game_flow() 함수 실행
create_bricks() # 벽돌 함수 불러오기
game_flow()


window.mainloop()
