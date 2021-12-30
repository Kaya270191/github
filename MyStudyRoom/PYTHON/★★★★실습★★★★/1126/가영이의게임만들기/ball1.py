import table, random

class Ball:
    ##생성자 
    def __init__(self, table, width=14, height=14, colour="red", x_speed=6, y_speed=4, x_start=0, y_start=0):
        self.width = width
        self.height = height
        self.x_posn = x_start
        self.y_posn = y_start
        self.colour = colour

        self.x_start = x_start
        self.y_start = y_start
        self.x_speed = x_speed
        self.y_speed = y_speed
        self.table = table
        self.circle = self.table.draw_oval(self) #import table 했기때문에 table.을 붙여야함

    def start_position(self): #초기 위치 
        self.x_posn = self.x_start
        self.y_posn = self.y_start
        
    def start_ball(self, x_speed, y_speed): #random.randint가 1이면 -x스피드 0이면 x스피드
        self.x_speed = -x_speed if random.randint(0,1) else x_speed
        self.y_speed = -y_speed if random.randint(0,1) else y_speed
        self.start_position()
        
    def move_next(self):        #공이 움직이는 함수 
        self.x_posn = self.x_posn + self.x_speed #공의 포지션+속도 
        self.y_posn = self.y_posn + self.y_speed
        # 공이 왼쪽 벽에 부딪쳤을 때:
        if(self.x_posn <= 3):       #공의 x 포지션이 3보다 작거나 같아지면 반대방향으로 
            self.x_posn = 3
            self.x_speed = -self.x_speed
        # 공이 오른쪽 벽에 부딪쳤을 때: x 스피드값을 반대로 
        if(self.x_posn >= (self.table.width - (self.width - 3))):
            self.x_posn = (self.table.width - (self.width - 3))
            self.x_speed = -self.x_speed
        # 공이 위쪽 벽에 부딪쳤을 때: y 스피드 값을 반대로 
        if(self.y_posn <= 3):
            self.y_posn = 3
            self.y_speed = -self.y_speed
        # 공이 아래쪽 벽에 부딪쳤을 때: y 스피드 값을 반대로 
        if(self.y_posn >= (self.table.height - (self.height - 3))):
            self.y_posn = (self.table.height - (self.height - 3))
            self.y_speed = -self.y_speed
        # 마지막으로 원의 이동:
        x1 = self.x_posn
        x2 = self.x_posn+self.width
        y1 = self.y_posn
        y2 = self.y_posn+self.height
        self.table.move_item(self.circle, x1, y1, x2, y2)
        
    def stop_ball(self):
        self.x_speed = 0
        self.y_speed = 0



        
                 
    
