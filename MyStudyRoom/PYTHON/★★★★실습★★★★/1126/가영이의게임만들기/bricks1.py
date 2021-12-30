import table

class Bricks:
    ##생성자
    def __init__(self, table, width=50, height=20, x_posn=80, y_posn=75, colour="green"):
        self.width = width
        self.height = height
        self.x_posn = x_posn
        self.y_posn = y_posn
        self.colour = colour

        self.x_start = x_posn
        self.y_start = y_posn
        self.table = table
        self.rectangle = self.table.draw_rectangle(self)
    
        bricks =[]
        b=1
        xx = 80
        yy = 75
        for i in range(1, 5, 1):
            for b in range( 1, 8,1):
                bricks.append(Bat(table = my_table, width = 50, height = 20, x_posn=xx, y_posn=yy, colour="green"))
                xx += 80
            yy+=35
            xx=80

    def start_postion(self):
        self.x_posn = self.x_start
        self.y_posn = self.y_start
        self.table.move_item()
        
