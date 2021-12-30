#1. 사용할 모듈 import
from tkinter import*
from tkinter.filedialog import*
from tkinter.simpledialog import*
from wand.image import*



#2. 함수 부분
#2-1 모든 함수가 쓸 변수 선언
window, canvas, paper = None, None, None
photo, photo2 = None, None                  #photo는 원본 이미지, photo2는 결과 이미지 
oriX, oriY, newX, newY = 0, 0, 0, 0         #oriX, oriY 는 원본 이미지 폭, 높이 / newX, newY 는 결과 이미지 폭, 높이 

#2-2 함수 정의부: 하위 메뉴 선택시 호출할 함수 선언
##이미지디스플레이 
def displayImage(img, width, height):       #displayImage(이미지, 가로사이즈, 세로사이즈): 이미지를 화면에 출력하는 함수 
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    
    if canvas != None :     #캔버스가 깨끗하지 않으면  destroy() 함수로 초기화 해줘 
        canvas.destoy()
        
    canvas = Canvas(window,  width= width, height = height, bd=0, highlightthickness=0) #새 canvas 생성, 이미지의 가로 세로 사이즈대로 생성 / 캔버스의 흰색 테두리 없애기  bd=0, highlightthickness=0  
    paper = PhotoImage(width = width, height = height)                              # 새 canvas에 붙일 paper 생성, 이미지의 가로 세로 사이즈대로 생성 
    blob = img.make_blob(format='png')                  # img.make_blob(format='png')방식으로 처리할 경우 이미지 처리 시간이 빨라짐, 투명한 배경 지원
    paper.put(blob)
    canvas.create_image((width/2, height/2), image = paper, state="normal")  #새 캔버스에 paper 붙임(이후 paper위에 처리된 이미지를 출력)

    canvas.pack(expand=1, anchor=CENTER)        #불러운 이미지가 화면에 가운데 정렬
    
''' 점묘법으로 이미지 불러오기 
    blob = img.make_blob(format="RGB")           #새 canvas와 paper 위에 이미지 출력 
    for i in range(0, width):                #make_blob(format=None)는 이미지를 바이너리 코드로 변환해주는 함수
        for k in range(0, height):
            r = blob[(i*3*width)+(k*3)+0]       #blob[0],blob[3],blob[6], blob[9]...의 값을 r에 저장 
            g = blob[(i*3*width)+(k*3)+1]       #blob[1],blob[4],blob[7], blob[10]...의 값을 r에 저장 
            b = blob[(i*3*width)+(k*3)+2]       #blob[2],blob[5],blob[8], blob[11]...의 값을 r에 저장
                                                                    #papaer 에 칼라로 점을 찍어줌, 세로로 높이만큼 찍고 가로를 너비만큼 반복
            paper.put("#%02x%02x%02x" % (r,g,b) , (k, i))
'''            
    

##파일 열기 
def func_open():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY     #전역변수 선언
    readFp = askopenfilename(parent =window, filetypes=(("모든 그림 파일", "*.jpg;*.jpeg;*.bmp;*.png;*.tif;*.gif"),  ("모든 파일", "*.*") )) 

    photo = Image(filename=readFp)     #photo 는 처음 불러오는 원본 이미지 
    oriX = photo.width                              #원본 이미지 가로 사이즈를 oriX에 저장 
    oriY = photo.height                             #원본 이미지 세로 사이즈를 oriX에 저장

    photo2 = photo.clone()                          #photo2는 결과 이미지/ photo를 복사하여 photo2에 저장 
    newX = photo2.width                             #결과 이미지 가로 사이즈를 newX에 저장
    newY = photo2.height                            #결과 이미지 세로 사이즈를 newY에 저장
    displayImage(photo2, newX, newY)        #displayImage()함수 호출 - 화면에 이미지를 출력
     

 #파일이름 표시
    a = readFp #파일경로를 읽어 a 에 저장
    b = a.split('/') #a에서  / 를 기준으로 잘라서 배열에 저장
    b.reverse() #b 배열 뒤집기
    filename=b[0] #b 배열의 첫번째가 파일 이름이 됨. 

    print(a)
    print(b)
    print(b[0])

    filename = Label(window, text=filename)
    #filename.configure(text=filename ) 
    filename.pack(padx=5, pady=5) #텍스트 라벨 표시


##저장하기 
def func_save():
    global window, canvas, paper, photo, photo2, oriX, oriY              #전역 변수 선언
    if photo2 ==None:                                                                           #photo2는 func_open() 함수를 실행하면 생성됨
        return                                                                                          #파일을 열지 않았다면 저장하기를 눌렀을 때 함수를 빠져나감                                                                  
    saveFp = asksaveasfile (parent = window, mode = "w", defaultextension = ".jpg", filetypes = (("JPG 파일", "*.jpg;*.jpeg"),  ("모든 파일", "*.*") ))
    savePhoto = photo2.convert("jpg")
    savePhoto.save(filename=saveFp.name)


##종료하기 
def func_exit():
    window.quit()
    window.destroy()

def func_zoomin():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
  
    #askinteger() 함수를 실행해 대화 상자로 확대할 배수 입력받음 
    scale = askinteger("확대배수", "확대할 배수를 입력하세요(2~4)", minvalue=2, maxvalue=4)
    photo2.resize(int(newX * scale), int(newY * scale)) # 원본 이미지의 가로 세로 사이즈에 배수를 곱하여 크기 변경
    newX = photo2.width #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    #넘겨받은 이미지의 크기와 동일하게 윈도우 창의 크기를 조절 
    window.geometry(str(newX)+"x"+str(newY))



def func_zoomout():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
  
    #askinteger() 함수를 실행해 대화 상자로 나눌  배수 입력받음 
    scale = askinteger("축소배수", "축소할 배수를 입력하세요(2~4)", minvalue=2, maxvalue=4)
    photo2.resize(int(newX / scale), int(newY / scale)) # 원본 이미지의 가로 세로 사이즈에 배수를 나눠  크기 변경
    newX = photo2.width #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    #넘겨받은 이미지의 크기와 동일하게 윈도우 창의 크기를 조절 
    window.geometry(str(newX)+"x"+str(newY))

#상하 반전 : flip
def func_flip():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    photo2.flip()
    newX = photo2.width #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
        
#좌우 반전 : flop
def func_flop():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    photo2.flop()
    newX = photo2.width #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    
#회전: degree
def func_rotate():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    degree = askinteger("회전", "회전할 각도를 입력하세요", minvalue = 0, maxvalue =360)
    photo2.rotate(degree)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    #넘겨받은 이미지의 크기와 동일하게 윈도우 창의 크기를 조절 
    

    
#이미지 처리2> 밝게/ 어둡게
#대화창을 통해 정수를 입력받아 그 수만큼 이미지의 명도를 조정
#Wand 라이브러리에서 제공하는 modulate(명도값, 채도값, 색상값)함수를 사용
#명도는 modulate(명도값, 100, 100)함수를 사용 
#원본의 명도값이 100이므로 100이상은 밝게, 100이하는 어둡게 처리
#밝게 modulate(밝기값, 100,100)함수에 100~200 값 입력 

def func_bright():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    value = askinteger("밝게", "값을 입력하세요(원본:100~밝게:200)", minvalue = 100, maxvalue =200)
    photo2.modulate(value, 100, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출  
    

def func_dark():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    value = askinteger("어둡게", "값을 입력하세요(어둡게:0~원본:100)", minvalue = 0, maxvalue =100)
    photo2.modulate(value, 100, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출  


#선명하게, modulate(100, 채도값, 100)함수에 100~200값 입력
def func_clear():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    value = askinteger("선명하게", "값을 입력하세요(100~200)",  minvalue =100, maxvalue = 200)
    photo2.modulate(100, value, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출  

#탁하게, modulate(100, 채도값, 100)함수에 0~100값 입력
def func_unclear():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    value = askinteger("탁하게", "값을 입력하세요(0~100)",  minvalue =0, maxvalue = 100)
    photo2.modulate(100, value, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출  



def func_resize():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    if photo2 ==None:
        return
    value1 = askinteger("리사이즈", "리사이즈할 가로를 입력")
    value2 = askinteger("리사이즈", "리사이즈할 세로를 입력")
    photo2.resize(value1, value2)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    
    
def func_blur ():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    if photo2 ==None:
        return
    photo2.vintage1
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    
    
def func_blur1():
    pass

    
#흑백 변경
#이미지의 type값을 grayscale로 설정하거나 
#photo2.modulate(100,0,100)으로 설정
    
def func_bw():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역 변수 선언
    #파일을 열지 않았다면 줌인 함수를 빠져나감
    if photo2 ==None:
        return
    photo2.type = "grayscale" 
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    

def func_back(): #원본으로 
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2 = photo.clone() #원본 이미지를 복사해서 photo2에 저장
    newX = oriX
    newY = oriY
    displayImage(photo2, newX, newY) 
    
def func_sketch1():
    pass

def func_sketch2():
    pass

def func_colorregulator(): #사진 색조 조절 
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    value = askinteger("색반전", "값을 입력하세요(1~100)",  minvalue =0, maxvalue = 100)
    photo2.modulate(100, 100, value)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)   




#3. 메인 코드 부분
window = Tk()
window.geometry("832x465")
window.title("My cute PhotoShop")

##배경 이미지 설정하기
backGround = PhotoImage(file="../gif/roses.png") 
backGroundlabel = Label(window, image = backGround)

#3-1 메인 메뉴 생성& 디스플레이
mainMenu = Menu(window)                                  #메인메뉴이름 = Menu(부모윈도우)
window.config(menu = mainMenu)                      #window.config(menu = 메인메뉴이름)

#3-2 상위 메뉴 생성- add_cascade() 메인메뉴와 상위메뉴를 연결 
fileMenu = Menu(mainMenu, tearoff=0)                #상위메뉴이름 = Menu(메인메뉴이름)
mainMenu.add_cascade(label = "파일",  menu = fileMenu) #상위메뉴이름.add_cascade(label = "라벨이름", menu = 상위메뉴이름)

#3-3 하위 메뉴 생성- add.command() 하위메뉴 항목 생성 
fileMenu.add_command(label = "파일 열기", command= func_open) #상위메뉴이름.add_command(label = "라벨이름", command= 호출함수)
fileMenu.add_command(label = "파일 저장", command= func_save)
fileMenu.add_command(label = "프로그램 종료", command= func_exit)



imageMenu1= Menu(mainMenu, tearoff=0)                                                #상위메뉴 imageMenu1 생성 / tearoff=0 메뉴에 점선 없애기
mainMenu.add_cascade(label = "이미지 처리1", menu = imageMenu1)    #메인 메뉴와 imageMenu1를 연결

imageMenu1.add_command(label = "확대", command= func_zoomin)       #상위메뉴 imageMenu1 의 하위메뉴 생성 
imageMenu1.add_command(label = "축소", command= func_zoomout)
imageMenu1.add_separator() #구분선 삽입 
imageMenu1.add_command(label = "상하 반전", command= func_flip)
imageMenu1.add_command(label = "좌우 반전", command= func_flop)
imageMenu1.add_separator() #구분선 삽입 
imageMenu1.add_command(label = "회전", command= func_rotate)


imageMenu2= Menu(mainMenu, tearoff=0)                                                 #상위메뉴 imageMenu2생성
mainMenu.add_cascade(label = "이미지 처리2", menu = imageMenu2)    #메인 메뉴와 imageMenu2를 연결

imageMenu2.add_command(label = "밝게", command= func_bright)          #상위메뉴 imageMenu2 의 하위메뉴 생성 
imageMenu2.add_command(label = "어둡게", command= func_dark)
imageMenu2.add_separator() #구분선 삽입 
imageMenu2.add_command(label = "선명하게", command= func_clear)
imageMenu2.add_command(label = "탁하게", command= func_unclear)
imageMenu2.add_separator() #구분선 삽입 
imageMenu2.add_command(label = "흑백", command= func_bw)

                                                                                                                        #상위메뉴imageMenu3 생성 
imageMenu3 = Menu(mainMenu, tearoff=0)                                                  #메인메뉴
mainMenu.add_cascade(label="이미지 처리3", menu =imageMenu3)         #메인메뉴와 imageMenu3 을 연결 
imageMenu3.add_command(label="리사이즈" , command=func_resize)      #하위메뉴


#하위메뉴 아래 하위메뉴 
subMenu=Menu(imageMenu3, tearoff=0)
imageMenu3.add_cascade(label= "추가적 기능", menu =subMenu)
imageMenu3.add_command(label="색상조정" , command=func_colorregulator) 


#하위메뉴 아래 하위메뉴 안 메뉴
subMenu.add_command(label="스케치1", command=func_sketch1)
subMenu.add_command(label="스케치2", command=func_sketch2)


#상위메뉴5-하위메뉴
editMenu = Menu(mainMenu, tearoff=0)
mainMenu.add_cascade(label="편집", menu =editMenu )
editMenu.add_command(label="되돌리기" , command=func_back)


backGroundlabel.place(x=-2, y=-2) #배경 표시

window.mainloop()

