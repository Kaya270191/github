#튜플 : 한 번 만들고 나면 변결할 수 없는 집합
#리스트는 대괄호[ ], 튜플은 소괄호( ), 딕셔너리는 중괄호{ }로 생성
#튜플은 값을 수정할 수 없으며 읽기만 가능하므로 읽기 전용의 자료를 저장할 때 사용

mytuple=(1,2,3)
print(type(mytuple)) #데이터 형식 출력
print(mytuple) #튜플 전체 출력 
print(mytuple[0]) #튜플과 리스트의 공통점: 인덱스로 값을 불러올 수 있음
#mytuple[1]=20 #튜플은 값을 수정할 수 없음. 에러 출력

mytuple1=1,2,3 #튜플은 일반적으로 소괄호()없어도 됨.보다 명확하게 하기 위해 소괄호 사용 권장 
print(type(mytuple1))
print(mytuple1)


mytuple2=(1,) #튜플의 요소가 하나밖에 없을 때는 반드시 콤마(,)를 넣어줘야 함 
print(type(mytuple2))
#mytuple2.clear() 튜플은 삭제가 불가능 

#딕셔너리 : 인덱스가 아닌 키로 값을 지정
#리스트의 인덱스 대신 키 사용, 딕셔너리는 키를 이용하여 값을 찾아낼 때 편리
#딕셔너리는 리스트와 달리 값을 순서를 지켜주지 않는다.

#학생 정보의 리스트 표현
student1= [20,'홍길동','빅데이터']


#학생 정보의 딕셔너리  표현
student2= {'나이':20, '이름':'홍길동', '전공':'빅데이터'}
print(student2['전공']) #키 값으로 불러줘야함
print(student2['나이'], student2['이름'], student2['전공']) 
#print(student2[1])#인덱스로 호출시 에러남, 키로 출력 

#딕셔너리에 값 추가
student2['연락처'] = '010-123-4567' #새로운 키와 값 대입: 새로운 키가 마지막에 추가 
print(student2)
student2['연락처'] = '010-123-0000' #키존의 키에 값 대입: 기존 키 값 변경 
print(student2)

#딕셔너리는 remove(), append() 함수를 적용할 수 없다 
#student2.append('010-123-4567')  

student2.pop('전공') #pop() 함수로 딕셔너리의 특정키의 값 삭제 
print(student2)
del(student2['이름']) #del 구문으로 딕셔너리의 특정키의 값 삭제 
print(student2)


#딕셔너리와 리스트는 수정 가능 , 튜플은 수정이 불가능 
student2.clear() #clear() 함수를 사용하면 딕셔너리와 리스트의 내용이 모두 지워짐 
print(student2)
student1.clear()
print(student1)


