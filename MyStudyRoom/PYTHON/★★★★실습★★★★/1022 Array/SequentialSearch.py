#순차탐색, list 이용




def search(list, key): # list안의 key 값을 찾는 함수
    n=len(list) # list 의 길이는 n
        
    for i in range(n): # n 번만큼 반복 
        if key == list[i]: #만약 key값이 list안의 값과 같으면 
            return i  #일치하면 i 값 반환 

    return -1 #일치값이 없으면 -1
    
list=[0,10,20,30,40,50, 60, 90, -1, 2]
b= int(input("[0,10,20,30,40,50, 60, 90, -1, 2] : 숫자입력>>"))
print("리스트의 %d번째에 있습니다" %(search(list,b)+1))
