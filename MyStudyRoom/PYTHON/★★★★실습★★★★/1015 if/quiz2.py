while True:
    
    a=int(input("성별을 입력하세요: <남성1, 여성 2> : "))

    if a==1:
        

        b=int(input("체중입력"))
        if b>=85:
            print("과체중입니다 운동하세요")
        elif b>=50 and b<85:
            print("표준체중입니다 현페이스 유지하세요")
        else:
            print("표준체중 이하입니다 고기드세요")

        input("계속하려면 아무키나 입력하세요 ")



    else:
        

        c=int(input("체중입력"))
        if c>=68:
            print("과체중입니다 운동하세요")
        elif c>=40 and c<68:
            print("표준체중입니다 현페이스 유지하세요")
        else:
            print("표준체중 이하입니다 고기드세요")

        input("계속하려면 아무키나 입력하세요 ")
