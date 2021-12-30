from tkinter import*
from PIL import*

score_left=0
score_right=0

###############Table 클래스 생성#############
class Table:
    def __init__(self, window, width, height, bg_color, net_color): #생성자 
        self.width = width
        self.height = height
        self.bg_color = bg_color
        self.net_color = net_color

        ###Table 클래스 내에서 캔버스 생성 -Canvas(window,가로,세로, 배경색)
        self.canvas = Canvas(window, width=self.width, height = self.height, bg = self.bg_color)
        self.canvas.pack()

        # Table클래스 내에서 네트선 생성 - create_line()
        self.canvas.create_line(self.width/2, 0, self.width/2, self.height, width=2, fill=net_color, dash=(15,23))

        # Table 클래스 내에서 득점판 생성- create_text()
        font = ("times", 60)
        self.scoreboard = self.canvas.create_text(self.width/2, 65, font = font, fill="pink", text=str(score_left) + " " +str(score_right))
       

        ### 함수부
        #Canvas(Table)에 타원(공)을 추가하는 함수 - x,y시작점 끝점위치와 색 
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


        #Canvas(Table)에 득점판을 갱신하는 함수
    def draw_score(self, left, right): # itemconfigure 아이템을 바꾸는 기능(바꾸는 대상:스코어보드, 무엇을:텍스트)
        scores = str(left) + " " + str(right)
        self.canvas.itemconfigure(self.scoreboard, text=scores)
    
                           

