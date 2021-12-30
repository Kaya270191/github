#입력받은 리스트나 제시된 리스트를 순서대로 배열하기

a = [23, 50, 11, 99, 6]
result = [ ] # 빈 리스트 만들기 


while a: # a 리스트에 값이 남아있는 동안 계속 
    n=len(a) #리스트 a의 개수 구하기
    min_index=0 #최소값 인덱스, 반복할 때마다 초기값 0번째로 지정

    for i in range(1,n): #list1에서 최소값 찾기
        if a[min_index] > a[i]:
            min_index= i
    value=a.pop(min_index) #최소값을 꺼내서 value에 저장
    result.append(value) #result에 value값을 추가 
        
    print("min_index", min_index)
    print("a",a)
    print("result", result)
print("선택 정렬 알고리즘 결과", result)
        



    

  
        



    
