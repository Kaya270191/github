'''
#7-5
myList=[30,10,20]
print("현재 리스트 : %s" % myList)

myList.append(40) #항목 추가 
print("append(40) 후의 리스트 : %s" %myList)

print("pop() 으로 추출한 값 : %s" %myList.pop()) #마지막 항목 삭제 
print("pop() 후의 리스트 : %s" %myList)

myList.sort() #리스트 항목 정렬 
print("sort() 후의 리스트 : %s" %myList)

myList.reverse() #리스트 항목 순서 역순으로 
print("reverse() 후의 리스트 : %s" %myList)

print("20 값의 위치 : %d" % myList.index(20))

myList.insert(2,222) #지정된 위치에 값 삽입
print("insert(2,222) 후의 리스트 : %s" %myList)

myList.remove(222) #지정된 값 제거 
print("remove(222) 후의 리스트: %s " %myList)

myList.extend([77,88,77]) #리스트 뒤 리스트 추가 
print("extend([77,88,77]) 후의 리스트 : %s" %myList)

print("77 값의 개수 : %d" %myList.count(77))


#7-4
aa=[]
bb=[]
value=0

for i in range(0,10):
    aa.append(value)
    value+=2
    print(aa)
print(aa[9])

for i in range(0,10):
    bb.append(aa[9-i])
    print(bb)

print("bb[0]은 %d, bb[99]는 %d 입력됨" %(bb[0], bb[9]))


'''

#7-7 다차원 배열
'''
list1=[ ]
list2=[ ]
value=1

for i in range(0,3):
    for k in range(0,4):
        list1.append(value)
        value += 1
    list2.append(list1)
    list1=[ ]
'''
'''
for i in range(0,3):
    for k in range(0,4):
        print("%3d" % list2[i][k], end=" ")
    print("")

'''
'''
#1차원 배열
list1=[]
for i in range(0,10):
    list1.append(i)
    print(list1)
'''

#2차원 배열
list1=[] #내부배열
list2=[] #외부배열 
value=1 #배열의 값을 위한 변수, 초기화 되지 않고 증가하는 변수  

for i in range(0,4): #외부 배열을 위한 반복문, 4번 반복 
    for k in range(0,5): #내부배열을 위한 반복문, 5번 반복  
        list1.append(value) #빈 리스트에 value 값 추가 
        value +=1 # value 1씩 증가 
        print(list1)
    list2.append(list1) #list 배열2에 list 배열1 추가 
    print(list2)
    list1=[] #1차 배열 지우기 


#2차원 리스트의 값 출력하기, 하나하나 출력하기
for i in range(0,4):
    for k in range(0,5):
        print("%3d" %list2[i][k], end="")
    print("")
    

#3차원 배열

list1=[] #1차배열
list2=[] #2차배열
list3=[] #3차배열
value=1 #배열의 값을 위한 변수, 초기화 되지 않고 증가하는 변수  

for x in range(0,2): #3차 배열을 위한 반복문 , 2번 반복 
    for i in range(0,4): #2차 배열을 위한 반복문, 4번 반복 
        for k in range(0,5): #1차 배열을 위한 반복문, 5번 반복  
            list1.append(value) #빈 리스트에 value 값 추가 
            value +=1 # value 1씩 증가 
            print(list1)
        list2.append(list1) #2차 배열에 1차 배열 추가  
        print(list2)
        list1=[] #1차 배열 비우기
    list3.append(list2) #3차 배열에 2차 배열 추가 
    list2=[] #2차 배열 비우기 
    print(list3)

    
#2차원 리스트의 값 출력하기, 하나하나 출력하기
for x in range(0,2):    
    for i in range(0,3):
        for k in range(0,4):
            print("%3d" %list3[x][i][k], end="")
        print("")
    print("")

        
    















