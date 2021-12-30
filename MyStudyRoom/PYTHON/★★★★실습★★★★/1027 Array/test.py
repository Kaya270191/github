

list1 = [23, 50, 11, 99, 6]
list2 = [ ]

a=list1[0]


for x in range(0,len(list1)):
    
    k= len(list1) - x

    for i in range(0, k): #list1에서 최소값 찾기
        if a > list1[i]:
            a = list1[i]        
    print("최소값은%d " %a)
        
   

    






        
    



        



    

  
        



    

