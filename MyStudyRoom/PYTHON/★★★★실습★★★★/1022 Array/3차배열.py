list1=[] #1차배열
list2=[] #2차배열
list3=[] #3차배열
value=1 #배열의 값을 위한 변수, 초기화 되지 않고 증가하는 변수  

for x in range(0,2): #3차 배열을 위한 반복문 , 2번 반복 
    for i in range(0,4): #2차 배열을 위한 반복문, 3번 반복 
        for k in range(0,5): #1차 배열을 위한 반복문, 4번 반복  
            list1.append(value) #빈 리스트에 value 값 추가 
            value +=1 # value 1씩 증가 
            print(list1)
        list2.append(list1) #2차 배열에 1차 배열 추가  
        print(list2)
        list1=[] #1차 배열 비우기
    list3.append(list2) #3차 배열에 2차 배열 추가 
    list2=[] #2차 배열 비우기 
    print(list3)

        
    

    #3차원 리스트의 값 출력하기, 하나하나 출력하기
for x in range(0,2):    
    for i in range(0,3):
        for k in range(0,4):
            print("%3d" %list3[x][i][k], end="")
        print("")
    print("")
