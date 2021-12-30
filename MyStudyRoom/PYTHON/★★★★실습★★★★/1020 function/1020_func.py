'''
##함수 정의 부분
def plus(v1,v2):
    result=0
    result=v1+v2
    return result #반환값

##변수 선언 부분
hap=0


##메인 코드 부분
#함수의 실행부
hap=plus(100,200)
print("100과 200의 plus() 함수 결과는 %d" %hap)

##사용자 지정함수
while True:
    a=int(input("첫 번째 숫자 입력"))
    b=int(input("두 번째 숫자 입력"))
    hap=plus(a,b)
    print("%d과 %d의 plus() 함수 결과는 %d" %(a,b,hap))
    

##입력한 두 숫자의 덧셈, 뺄셈, 곱셈, 나눗셈하는 계산기

#함수 정의 부분 
def calc(v1, v2, op):
    result=0
    if op == '+' :
        result=v1+v2
    elif op == '-' :
        result=v1-v2
    elif op == '*' :
        result=v1*v2
    elif op == '/' :
        result=v1 / v2

    return result

#변수 선언 부분

res=0
var1, var2, oper=0, 0,""

#메인 코드 부분
oper=input("계산 입력 (+ ,-, *, /) : ")
var1=int(input("첫 번째 숫자 입력 : "))
var2=int(input("두 번째 숫자 입력 : "))

res=calc(var1, var2, oper)

print("## 계산기 : %d %s %d = %d" %(var1, oper, var2, res))


##지역변수와 전역변수?
#함수 정의 부분
def func1() :
    global a # a 가 전역변수가 됨 / global 을 주면 지역함수 변수일지라도 전역변수가 됨 
    a=10 #지역변수
    print("func1()에서 a의 값 %d" %a)

def func2() :
    print("func2()에서 a의 값 %d" %a)

#변수 선언 부분
a=20 #전역 변수

#메인 코드 부분
func1()
func2()



##9-7
#함수 정의 부분
def func1() :
    result=100
    return result

def func2() :
    print("반환값 없는 함수 실행")

#변수 선언 부분
hap=0

#메인 코드 부분
hap=func1() #return 값을 hap 에 대입
hap=func2() #return 값이 없어 에러 출력 
print("func1()에서 돌려준 값 ==> %d" %hap)
func2()


##9-8
#매개 변수 전달 방법
def para2_func(v1,v2):
    result=0
    result=v1+v2
    return result

def para3_func(v1,v2,v3):
    result=0
    result=v1+v2+v3
    return result

#변수 선언 부분
hap=0

#메인 코드 부분
hap=para2_func(10,20)
print("매개변수 2개 함수 호출 결과 ==> %d" %hap)
hap=para3_func(10,20,30)
print("매개변수 3개 함수 호출 결과 ==> %d" %hap)


##9-9 매개변수에 기본값을 설정해놓는 방법 
#함수 정의 부분
def para_func(v1,v2,v3=0):
    result=0
    result=v1+v2+v3
    return result

#변수 선언 부분
hap=0

#메인 코드 부분
hap=para_func(10,20)
print("매개변수 2개 함수 호출 결과 ==>%d" %hap)
hap=para_func(10,20,30)
print("매개변수 3개 함수 호출 결과==>%d" %hap)


##9-10 매개변수의 숫자를 정해놓지 않는 방법-가변 매개변수 
def para_func(*para): #가변 매개변수 튜플 형식으로 전달 
    print(para)
    print(type(para))
    result=0
    for num in para:
        result=result+num

    return result

#변수 선언 부분
hap=0

#메인 코드 부분
hap=para_func(10,20)
print("매개변수 2개 함수 호출 결과 ==> %d" %hap)
hap=para_func(10,20,30)
print("매개변수 3개 함수 호출 결과 ==>%d" %hap)


#딕셔너리 형식의 매개변수 키=값 
def dic_func(**para): #가변 매개변수, 딕셔너리 형식**으로 전달 
    print(para) #딕셔너리 전체 출력
    print(type(para)) #para의 타입 출력
    print(para.keys()) #para의 전체 출력
    for k in para.keys():
        print("%s --> %d 명 입니다." %(k, para[k]))

dic_func(아이오아이=11, 소녀시대=8, 걸스데이=4, AOA=7)
'''

def dic_func(*para): #가변 매개변수, 튜플  형식**으로 전달 
    print(para) #딕셔너리 전체 출력
    print(type(para)) #para의 타입 출력
    
    for k in para:
        print("%d 명 입니다." %k)

dic_func(11, 8, 4, 7)
