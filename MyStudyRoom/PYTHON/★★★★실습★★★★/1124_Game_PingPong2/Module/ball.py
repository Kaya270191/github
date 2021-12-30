
import random, table


###########Ball 클래스 생성###########
class Ball:                 ##(self, 테이블위에 공 생성, 공 가로, 공 세로, 색, 속도)
    def __init__(self, table, width, height, color, x_speed, y_speed, x_posn, y_posn): #생성자
        self.width = width              #공의 가로사이즈
        self.height = height            #공의 세로 사이즈
        self.x_posn = x_posn        # 공의 x 좌표값
        self.y_posn = y_posn        # 공의 y 좌표값
        self.color = color              #공의 색상

        self.x_start = x_posn           #공의 x포지션은 시작값 
        self.y_start = y_posn           #공의 y포지션은  시작값
        self.x_speed = x_speed       #공의 x좌표속도 
        self.y_speed = y_speed          #공의 y좌표 속도 

        self.table = table              # 입력받은 table 값을 대입
        self.circle = self.table.draw_oval(self)   #위 table에 draw_oval 함수(table에 있음-원그리는 함수)


    ###함수부
    #공이 움직이는 부분
    def move_next(self):
        self.x_posn = self.x_posn + self.x_speed     #현재 공의 위치+ 이동할 거리 x를 추가
        self.y_posn = self.y_posn + self.y_speed    #현재 공의 위치+ 이동할 거리 y를 추가
        

        #공이 위쪽 벽에 충돌했을 때:
        if(self.y_posn <=0):                            #위쪽 벽의 좌표가 y=0  보다 작아지면(창을 넘어간다면)
            self.y_posn =0                                #y 좌표값을 0 으로 만들고
            self.y_speed = -self.y_speed        #아래방향으로( y_speed에 * -1을 하면 반대방향으로 감)
        #공이 아래쪽 벽에 충돌했을 때:
        if(self.y_posn>=(self.table.height - self.height)):  #테이블의 높이에서 공의 높이를 뺀 것이 y의 포지션인데 이것보다 더 크다면(공이 아랫벽을 넘어감)
           self.y_posn = (self.table.height-self.height)        #y포지션은 테이블높이300- 공의 높이 24= 276 지점이 되어야함
           self.y_speed = -self.y_speed                                 #위쪽방향으로 
            

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
        
    #전역변수 x_speed의 값을 불러와서 공의 속도에 대입, 랜덤하게 생성된 값에 의해 + 또는 - 스피드 값이 적용
    def start_ball(self, x_speed, y_speed): # .randint(0,1)가 참(1)이면 -x.speed가 되고 거짓(0)이면 x_speed가 됨
        self.x_speed = -x_speed if random.randint(0,1) else x_speed # 원래 -x_speed값임. if(랜덤해서 뽑은 값이 1이면) 참이니까 원래값 유지. 그렇지 않으면 else실행
        self.y_speed = -y_speed if random.randint(0,1) else y_speed
        self.start_position()

    #공을 멈춤, x_speed, y_speed 값을 0으로 지정하여 공 멈춤
    def stop_ball(self): 
        self.x_speed = 0
        self.y_speed = 0

