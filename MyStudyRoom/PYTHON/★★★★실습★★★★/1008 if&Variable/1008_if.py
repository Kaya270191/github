# 조건문
'''
if 조건식 :
    실행할 문장

a=89 # a 변수 선언 및 값 대입
if a<100:
    print("%d보다 작군요" %a)


if ~else 조건식 : 참일 때 실행하는 문장과 거짓일 때 실행하는 문장이 다를 때 사용
    if 조건식:
        실행할 문장
    else:
        실행할 문장


a=101 # a 변수 선언 및 값 대입
if a<100:
    print("%d보다 작군요" %a)
else :
    print("%d보다 크군요" %a)


# if~else 문 변형: 사용자로 입력받아 a 값에 대입
a=int(input("정수를 입력하세요.")) #대입 연산자 
if a<100: #관계 연산자 
    print("%d보다 작군요" %a)
else :
    print("%d보다 크거나 같군요" %a)
print("조건문을 빠져나왔습니다.")


#
a=int(input("정수를 입력하세요 : "))
if a%2==0: #나머지 연산자, 2로 나눈 나머지가 0일 경우
    print("짝수를 입력했군요.")
else : #나머지 연산자, 2로 나눈 나머지가 0이 아닐 경우 
    print("홀수를 입력했군요.")


#중첩 if 문
score=int(input("점수를 입력하세요"))

if score>=90:
    print("A", end=" ")                  
else :
    if score >=80:
        print("B", end=" ")
    else:
        if score >=70:
            print("C", end=" ")
        else:
            if score >=60:
                print("D", end=" ")
            else:
                print("F")                
print("학점입니다.")


# if~elif~ else 문
score=int(input("점수를 입력하세요"))

if score>=90:
    print("A", end=" ")                  
elif score >=80:
        print("B", end=" ")
elif score >=70:
        print("C", end=" ")
elif score >=60:
        print("D", end=" ")
else:
        print("F")                
print("학점입니다.")

'''
#계산기 프로그램
#변수 선언
a, b, ch=0, 0, ""
#메인 코드
a=int(input("첫 번째 수를 입력하세요 : "))
ch=input("계산할 연산자를 입력하세요 : ")
b=int(input("두 번째 수를 입력하세요 : "))

if ch=="+" :
    print("%d + %d= %d 입니다. " %(a,b,a+b))
elif ch=="-" :
    print("%d- %d= %d 입니다. " %(a,b,a-b))
elif ch=="*" :
    print("%d* %d= %d 입니다. " %(a,b,a*b))
elif ch=="/" :
    print("%d/ %d= %d 입니다. " %(a,b,a/b))
elif ch=="%" :
    print("%d %% %d= %d 입니다. " %(a,b,a%b))
elif ch=="//" :
    print("%d// %d= %d 입니다. " %(a,b,a//b))
elif ch=="**" :
    print("%d** %d= %d 입니다. " %(a,b,a**b))
else:
    print("알 수 없는 연산자입니다.")










    
