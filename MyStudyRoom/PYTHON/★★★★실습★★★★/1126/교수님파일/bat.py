# 이 파일은 원래 MyPong을 위해 만든 Bat 클래스입니다.
# 이 클래스는 Bat의 처리 공간을 2D 직사각형으로 정의합니다.

import table

class Bat:
    #### 생성자- 배트의 가로,세로, 위치, 색, 속도 설정 
    def __init__(self, table, width=30, height=100, x_posn=50, y_posn=50, colour="green", x_speed = 23, y_speed = 23): 
        self.width = width
        self.height = height
        self.x_posn = x_posn
        self.y_posn = y_posn
        self.colour = colour

        self.x_start = x_posn
        self.y_start = y_posn
        self.x_speed = x_speed
        self.y_speed = y_speed
        self.table = table
        self.rectangle = self.table.draw_rectangle(self)

    #### 메서드 
    def detect_collision(self, ball, sides_sweet_spot=True, topnbottom_sweet_spot=False):
        collision_direction = ""
        collision = False               #초기값은 false로 두고 충돌이 일어나면 true로 바꾼다
        feel = 5
        # 배트 변수:                    #충돌 경우를 기술하기 위해 배트와 공의 위치에 대한 변수를 설정
        top = self.y_posn
        bottom = self.y_posn + self.height
        left = self.x_posn
        right = self.x_posn + self.width
        v_centre = top + (self.height/2)
        h_centre = left + (self.width/2)
        # 공 변수:
        top_b = ball.y_posn
        bottom_b = ball.y_posn + ball.height
        left_b = ball.x_posn
        right_b = ball.x_posn + ball.width
        r = (right_b - left_b)/2
        v_centre_b = top_b + r
        h_centre_b = left_b + r
        
        if((bottom_b > top) and (top_b < bottom) and (right_b > left) and (left_b < right)): #충돌이 일어나는 경우 
            collision = True
        if(collision): # 충돌이 일어난 경우?????
            if((top_b > top-r) and (bottom_b < bottom+r) and (right_b > right) and (left_b <= right)):
                collision_direction = "E"
                ball.x_speed = abs(ball.x_speed)

            elif((left_b > left-r) and (right_b < right+r) and (bottom_b > bottom) and (top_b <= bottom)):
                collision_direction = "S"
                ball.y_speed = abs(ball.y_speed)
                
            elif((left_b > left-r) and (right_b < right+r) and (top_b < top) and (bottom_b >= top)):
                collision_direction = "N"
                ball.y_speed = -abs(ball.y_speed)

            elif((top_b > top-r) and (bottom_b < bottom+r) and (left_b < left) and (right_b >= left)):
                collision_direction = "W"
                ball.x_speed = -abs(ball.x_speed)

            else:
                collision_direction = "miss"

            if((sides_sweet_spot == True) and (collision_direction == "W" or collision_direction == "E")):
                # 배트의 중심에서 얼마나 먼 거리에서 충돌이 발생했는지 y 값을 찾습니다.
                adjustment = (-(v_centre - v_centre_b))/(self.height/2)
                ball.y_speed = feel * adjustment

            if((topnbottom_sweet_spot == True) and (collision_direction == "N" or collision_direction == "S")):
                # 배트의 중심에서 얼마나 먼 거리에서 충돌이 발생했는지 x 값을 찾습니다.
                adjustment = (-(h_centre - h_centre_b))/(self.width/2)
                ball.x_speed = feel * adjustment

            return (collision, collision_direction)

    def move_up(self, master): #배트를 위로 움직임
        self.y_posn = self.y_posn - self.y_speed
        if(self.y_posn <= 0):
            self.y_posn = 0
        x1 = self.x_posn
        x2 = self.x_posn+self.width
        y1 = self.y_posn
        y2 = self.y_posn+self.height
        self.table.move_item(self.rectangle, x1, y1, x2, y2)
        
    def move_down(self, master): #배트를 아래로 움직임 
        self.y_posn = self.y_posn + self.y_speed
        far_bottom = self.table.height - self.height
        if(self.y_posn >= far_bottom):
            self.y_posn = far_bottom
        x1 = self.x_posn
        x2 = self.x_posn+self.width
        y1 = self.y_posn
        y2 = self.y_posn+self.height
        self.table.move_item(self.rectangle, x1, y1, x2, y2)

    def move_left(self, master): #배트를 왼쪽으로 움직임
        self.x_posn = self.x_posn - self.x_speed
        if(self.x_posn <= 0):
            self.x_posn = 0
        x1 = self.x_posn
        x2 = self.x_posn+self.width
        y1 = self.y_posn
        y2 = self.y_posn+self.height
        self.table.move_item(self.rectangle, x1, y1, x2, y2)
        
    def move_right(self, master): #배트를 오른쪽으로 움직임
        self.x_posn = self.x_posn + self.x_speed
        far_right = self.table.width - self.width
        if(self.x_posn >= far_right):
            self.x_posn = far_right
        x1 = self.x_posn
        x2 = self.x_posn+self.width
        y1 = self.y_posn
        y2 = self.y_posn+self.height
        self.table.move_item(self.rectangle, x1, y1, x2, y2)

    def start_position(self): #배트의 초기화
        self.x_posn = self.x_start
        self.y_posn = self.y_start
