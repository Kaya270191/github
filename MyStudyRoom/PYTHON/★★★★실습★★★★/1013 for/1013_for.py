#for 문
#for 변수 in range(시작값, 끝값+1, 증가값) :
'''
for i in range(0,10,1):
    print("안녕하세요? for 문을 공부중입니다.")
for i in range(1,11,1):
    print("안녕하세요? for 문을 공부중입니다.", i)

#for 변수 in [배열] :
    반복 실행할 문장
    
for i in [0,1,2,3,4,5,6,7,8,9]:
    print("안녕하세요? for 문을 공부중입니다.")

#end=" "  : 한줄로 결과 출력, "" 사이 공란만큼 가로로 띄움


for i in range(1,6,1):
    print("%d"%i, end="  ")

for i in range(6): #for i in range(0,6,1): , 증가값과 시작값은 생략 가능
    print("%d"%i, end="  ")

#1부터 10까지의 합을 구하기 
hap=0
for i in range(1,11,1):
    hap = hap+i
    #hap+= i 
    
print("1에서 10까지의 합 : %d" % hap)

#1부터 10까지의 곱을 구하기 
hap=1
for i in range(1,11,1):
    hap = hap*i
    print(hap)
       
print("1에서 10까지의 곱 : %d" % hap)


#500과 1000사이에 있는 홀수의 합을 구하는 프로그램

i, hap = 0, 0
for i in range(501, 1001, 2) :
    hap= hap+i  
    print(hap)
print("500에서 1000까지의 홀수의 합 : %d" % hap)


i, hap = 0, 0
for i in range(501, 1001, 2) :
    if i % 2 == 1:  #if i % 2 !=0:  2로 나눈 나머지가 0 이 아닐 경우(홀수일 경우)
        hap = hap+i #hap에 i값 더하기 
        print(i)
print("500에서 1000까지의 홀수의 합 : %d" % hap)


#500-1000까지의 짝수의 합
i, hap = 0, 0
for i in range(500, 1001, 2) :
    if i % 2 != 1:  #if i % 2 ==0:  2로 나눈 나머지가 0 인  경우(짝수일 경우)
        hap = hap+i #hap에 i값 더하기 
        print(i)
print("500에서 1000까지의 짝수의 합 : %d" % hap)

#사용자가 입력한 값까지 for문으로 합계 구하기  
i, hap=0,0
num=0 #i, num 값 생략 가능

num=int(input("값 입력 : "))

for i in range(1, num+1,1):
    hap=hap+i
print("1에서 %d까지의 합 : %d" %(num, hap))

#사용자가 입력한 값부터 입력한 값까지 for문으로 합계 구하기
hap=0

num1=int(input("시작값 입력 : "))
num2=int(input("끝값 입력 : "))

for i in range(num1, num2+1,1):
    hap=hap+i
print("%d에서 %d까지의 합 : %d" %(num1, num2, hap))


    
#사용자가 입력한 값부터 입력한 값까지 for문으로 합계 구하기, 증가값 입력 
hap=0

num1=int(input("시작값 입력 : "))
num2=int(input("끝값 입력 : "))
num3=int(input("증가값 입력 : "))

for i in range(num1, num2+1, num3):
    hap=hap+i
    
print("%d에서 %d까지 %d씩 증가값의 합 : %d" %(num1, num2, num3, hap))

#2단 출력하기 
for i in range(1,10,1):
    print("2 x %d = %d" %(i, 2 * i))


# 입력한 숫자의 구구단을 출력하는 프로그램

dan=int(input("몇 단?  "))

for i in range(1,10,1):
    print("%d x %d = %d" %(dan, i, dan * i))


#중첩 for 문으로 구구단 출력

for dan in range(2,10,1):
    for i in range(1, 10, 1):
        print(" %d x %d = %2d " %(dan, i, dan*i))
    print("")



# while 2단 출력하기 
for i in range(1,10,1):
    print("2 x %d = %d" %(i, 2 * i))

i = 1
while i < 10:
    print("2 x %d = %d" %(i, 2 * i))
    i = i +1 # i+=1 
        

    
# while 문을 이용한 구구단 출력(중첩 for 문)
while 형식:
변수=시작값
while 변수값 < 끝값:    
    변수=변수+증가값

for dan in range(2,10,1):
    for i in range(1, 10, 1):
        print(" %d x %d = %2d " %(dan, i, dan*i))
    print("")


dan= 2 #단 초기화
while dan <10 : #단 조건식
    dan = dan+1 #단 증가식
    
    i=1 #i 초기화
    while i <10: #i 조건식
        print(" %d x %d = %2d " %(dan, i, dan*i))        
        i=i+1 #i 증감식
    print("")



#사용자가 입력한 값부터 입력한 값까지 for문으로 합계 구하기, 증가값 입력 
hap=0

num1=int(input("시작값 입력 : "))
num2=int(input("끝값 입력 : "))
num3=int(input("증가값 입력 : "))

i=num1 #초기값이 while 전에 선언 
while i < num2+1: #조건식(끝값보다 작을때까지)
    hap=hap+i
    i=i+num3 #증감식 while문 안에 실행
    
print("%d에서 %d까지 %d씩 증가값의 합 : %d" %(num1, num2, num3, hap))



#무한 루프를 위한 while문

while True:
    print("♥", end=" ")


#무한 루프, 입력한 값에서부터 입력한 값까지 for 문으로 합계 구하기
#무한 루프를 적용하려면 'while'조건식: 의 조건식을 True로 지정
#무한 루프를 중지하려면 Ctrl + C

while True:  #tap 키로 블럭 잡아서 들여쓰기 
    hap=0

    num1=int(input("시작값 입력 : "))
    num2=int(input("끝값 입력 : "))
    num3=int(input("증가값 입력 : "))

    i=num1 #초기값이 while 전에 선언 
    while i < num2+1: #조건식(끝값보다 작을때까지)
        hap=hap+i
        i=i+num3 #증감식 while문 안에 실행
        
    print("%d에서 %d까지 %d씩 증가값의 합 : %d" %(num1, num2, num3, hap))




#분기문1, 반복문 탈출하는 break 문
for i in range(1, 100):
    print("for 문을 %d 번 실행했습니다" %i)
    break


hap=0
a,b =0 , 0

while True:
    a=int(input("더할 첫 번째 수 입력 : "))
    if a==0:
        break
    b=int(input("더할 두 번째 수 입력 : "))
    if b==0:
        break
    
    hap=a+b
    print("%d + %d = %d" %(a,b,hap))

print("0을 입력해서 반복문을 탈출했습니다")




#분기문2, 반복문으로 다시 돌아가는 continue 문
#continue 문을 만나면 무조건 블록의 남은 부분을 건너뛰고 반복문의 처음으로 돌아감
hap=0
a,b =0 , 0

while True:
    a=int(input("더할 첫 번째 수 입력 : "))
    if a==0:
        continue
    b=int(input("더할 두 번째 수 입력 : "))
    if b==0:
        continue
    
    hap=a+b
    print("%d + %d = %d" %(a,b,hap))

print("0을 입력해서 반복문을 탈출했습니다")


#1~100까지 더하되, 누적 합계(hap)가 1000 이상이 되는 시작 지점을 구하는 프로그램
hap=0

for i in range(1,101):
    hap+=i

    if hap>=1000:
        break
    print(i, hap) #현재 i값과 hap 값 출력

print("1~100의 합에서 최초로 1000이 넘는 위치 : %d" %i)

'''
#1~100까지의 합을 구하되 1 +2 +4 +5 +7 +8 +10 +…과 같이 3의 배수를 건너뛰고(=제외하고) 더하는 프로그램

hap=0

for i in range(1, 101): 
    
    if i % 3 ==0: #3으로 나눈 나머지가 0과 같을 경우, 3의 배수일 경우
        continue #남은 부분을 건너뛰고 반복문의 처음으로 돌아감
    
    print(i, hap) # 현재 i 값과 hap 값 출력
    hap+=i
print("1~100의 합계(3의 배수 제외) : %d" %hap)
    







