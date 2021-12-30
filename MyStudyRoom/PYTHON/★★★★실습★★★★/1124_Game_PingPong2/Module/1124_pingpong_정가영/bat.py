import table


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


        #공과 배트의 충돌 감지 및 처리 함수
    def detect_collision(self, ball):
        collision_direction = ""                #충돌 방향 저장
        collision = False                       #충돌이 감지되면 True로 바뀜
        feel = 5                                        #배트에서 공을 튕겨낸 다음 반사 각도와 반응 정도를 조정 

        #배트 변수
        top = self.y_posn
        bottom = self.y_posn + self.height
        left = self.x_posn
        right = self.x_posn +self.width
        v_center = top + (self.height/2)            #배트의 탑에서 배트의 높이를 2로 나눈 값 더하면 세로 중간
        h_center = left + (self.width/2)            #배트의 왼쪽에서 배트의 넓이를 2로 나눈 값 더하면 가로 중간

        #공 변수
        top_b = ball.y_posn
        bottom_b = ball.y_posn + ball.height
        left_b = ball.x_posn
        right_b = ball.x_posn + ball.width
        r = (right_b - left_b)/2                                #반지름
        v_center_b = top_b +r                                   #공의 탑에서 반지름을 더하면 세로 중간
        h_center_b = left_b +r                                  #공의 왼쪽에서 반지름을 더하면 가로 중간 

        #공의 바닥(y)이 배트의 탑(y)보다 크고, 공의 탑(y)이 배트의 바닥(y)보다 작고,
        #공의 오른쪽이 배트의 왼쪽보다 크고, 공의 왼쪽이 배트의 오른쪽보다 작을 때 충돌
        if((bottom_b > top) and (top_b < bottom) and (right_b > left) and (left_b < right)):
            collision = True                    #collision의 값 변경
            print("충돌")


        #만약 충돌했다면 어느 방향으로 충돌했는지 collision_direction 에 저장
        if(collision):                   #만약 collision 이 True 라면, 즉 충돌했다면
            #공의 오른쪽 부분이 배트의 오른쪽 부분보다 크고, 공의 왼쪽 부분이 배트의 오른쪽 보다 작다면->배트의 동쪽에서 공이 충돌 
            if((right_b > right) and (left_b <= right) and (top_b > top-r) and (bottom_b < bottom +r)):
               collision_direction = "E"
                # abs() 함수는 숫자의 부호를 제거하는 함수, 속도 값을 얻는데 사용
                # abs() 함수는 공이 배트의 어느 부분에 충돌했는지에 따라 공이 튀는 방향 바꿈
               ball.x_speed = abs(ball.x_speed) #공이 양수의 값, 즉 오른쪽으로 이동 

                #공의 중심이 배트의 중심에서 얼마나 먼 거리에서 충돌이 발생했는지 계산하여 y좌표값에 적용
               # 공의 중심이 배트의 중심보다 y 좌표값이 적은 위치(높은 위치)에서 부칮힐 경우 adjustment는 - 값이 되어 공은 사선 위로 이동
                # 공의 중심이 배트의 중심보다 y 좌표값이 큰 위치(낮은 위치)에서 부칮힐 경우 adjustment는 + 값이 되어 공은 사선 아래로 이동
               adjustment = (-(v_center - v_center_b)) / (self.height/2)
               print(adjustment)
               ball.y_speed = feel * adjustment
               
            #공의 왼쪽 부분이 배트의 왼쪽 부분보다 작고, 공의 오른쪽 부분이 배트의 왼쪽보다 크다면 ->배트의 서쪽에서 공이 충돌 
            elif((left_b < left) and (right_b >= left) and (top_b > top-r) and (bottom_b < bottom +r)):
               collision_direction = "W"
               ball.x_speed = -abs(ball.x_speed)

            adjustment = (-(v_center - v_center_b)) / (self.height/2)
            print(adjustment)
            ball.y_speed = feel * adjustment

        return (collision, collision_direction)


        #배트의 초기 위치값 지정
    def start_position(self):
        self.x_posn = self.x_start
        self.y_posn = self.y_start
        x1 = self.x_posn
        y1 = self.y_posn
        x2 = self.x_posn + self.width
        y2 = self.y_posn + self.height
        self.table.move_item(self.rectangle, x1,y1,x2,y2)


        

        
