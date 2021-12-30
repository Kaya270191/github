#리스트와 반복문 
'''
#7-1 변수값 입력하고 합계 출력/ 리스트 활용 전
a,b,c,d=0,0,0,0
hap=0

a=int(input("1번째 숫자: "))
b=int(input("2번째 숫자: "))
c=int(input("3번째 숫자: "))
d=int(input("4번째 숫자: "))

hap=a+b+c+d

print("합계==> %d" %hap)

#7-2 리스트 활용  
aa=[0,0,0,0] # a,b,c,d=0,0,0,0
hap=0

aa[0]=int(input("1번째 숫자: ")) #a=int(input("1번째 숫자: "))
aa[1]=int(input("2번째 숫자: ")) #b=int(input("2번째 숫자: "))
aa[2]=int(input("3번째 숫자: ")) #c=int(input("3번째 숫자: "))
aa[3]=int(input("4번째 숫자: ")) #d=int(input("4번째 숫자: "))

hap=aa[0]+aa[1]+aa[2]+aa[3] #hap=a+b+c+d

print("합계==> %d" %hap)


#리스트와 append() 함수 활용: 리스트 끝에 추가 
aa=[]
aa.append(0)
aa.append(0)
aa.append(0)
aa.append(0)
print(aa)
'''
'''
#for 문 활용
hap=0
aa=[]
for i in range(4):
    aa.append(0)

for i in range(4):
    aa[i] = int(input("숫자를 입력하세요"))
    print(aa)
print(aa)


for i in range(4):
    aa.append(0)
    aa[i] = int(input("숫자를 입력하세요"))
    hap=hap+aa[i]  #hap=aa[0]+aa[1]+aa[2]+aa[3]
    print(aa)
print(hap)

'''
aa=[]
hap=0
for i in range(10):
    aa.append(0)
    aa[i]=int(input("숫자를 입력하세요"))
    hap=hap+aa[i]  #hap=aa[0]+aa[1]+aa[2]+aa[3]
    print(aa)

print(hap)
