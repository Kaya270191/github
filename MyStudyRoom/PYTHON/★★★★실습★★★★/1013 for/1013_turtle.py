#거북이 그래픽 활용하기 위한 모듈 가져오기 #
'''
import turtle as t 

t.shape("turtle") #거북이 모양 바꾸기

t.forward(100) #앞으로 100px 나아가기
t.right(90) #오른쪽 방향을 각도만큼 회전하기 
t.forward(100) 
t.right(90)
t.forward(100)
t.right(90)
t.forward(100)


#반복문을 이용한 사각형 그리기

import turtle as t 

t.shape("turtle") #거북이 모양 바꾸기
for i in range(1, 100,1):
    t.forward(100) #앞으로 100px 나아가기
    t.right(55) #오른쪽 방향을 각도만큼 회전하기

'''
#for문을 이용한 turtle 그리기
import turtle as t
t.shape("turtle")

angle=90
t.bgcolor("black")
t.color("yellow")
t.speed(0)
for x in range(200):
    print(x)
    t.forward(x)
    t.left(angle)
    



    
