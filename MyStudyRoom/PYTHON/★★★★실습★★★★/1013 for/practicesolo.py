while True:
    try: 
        score=int(input("점수 몇 점?"))

        if score<0 or score>100:
            continue

        if score >= 90:
            print(" A " , end=" ")
        elif score >= 80:
            print(" B " , end=" ")
        elif score >= 70:
            print(" B " , end=" ")
        elif score >= 60:
            print(" B " , end=" ")
        else:
            print("F")
        print("학점입니다.")
    except ValueError:
        print("숫자 입력해 줘 ")
        continue
