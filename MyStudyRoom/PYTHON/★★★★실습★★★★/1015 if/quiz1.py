while True:
    x=int(input("다섯자리 정수를 입력하시오 : "))
    print(x)

    a=x//10000
    b=(x%10000)//1000
    c=(x%1000)//100
    d=(x%100)//10
    e=x%10

    sum=a+b+c+d+e
    print("%d+%d+%d+%d+%d=%d" %(a,b,c,d,e,sum))





