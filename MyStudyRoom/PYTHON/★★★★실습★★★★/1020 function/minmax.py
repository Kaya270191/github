#리스트 안에서 최대값, 최소값 구하기
#리스트a 찾는 값 x
'''

num=[1,889,7,3,552,-10,-444,1,6,5]

max_num =num[0]
min_num=num[0]

for n in num:
    if max_num < n:
        max_num = n
    if min_num > n: 
        min_num = n

print("max_number : ", max_num)
print("min_number : ", min_num)
'''

#입력받은 값 중 최소값, 최대값 구하기

aa=[]

for i in range(8):
    aa.append(int(input(str(i+1) + "번째 숫자를 입력해 주세요 : ")))

maxn=aa[0]
minn=aa[0]

for n in aa:
    if maxn<n:
        maxn=n

    if minn>n:
        minn=n

print(aa)
print("최대값: ", maxn)
print("최소값: ", minn)


    

