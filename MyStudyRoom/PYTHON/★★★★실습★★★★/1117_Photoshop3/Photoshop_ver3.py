#1. 사용할 모듈 import
from tkinter import*
from tkinter.filedialog import*
from tkinter.simpledialog import*
from wand.image import*
from wand.drawing import Drawing
import PIL


#2. 함수 부분
#2-1 모든 함수가 쓸 변수 선언
window, canvas, paper = None, None, None
photo, photo2 = None, None                  #photo는 원본 이미지, photo2는 결과 이미지 
oriX, oriY, newX, newY = 0, 0, 0, 0         #oriX, oriY 는 원본 이미지 폭, 높이 / newX, newY 는 결과 이미지 폭, 높이 
x1,y1,x2,y2=None,None,None,None


#2-2 함수 정의부: 하위 메뉴 선택시 호출할 함수 선언
##이미지디스플레이 
def displayImage(img, width, height):       #displayImage(이미지, 가로사이즈, 세로사이즈): 이미지를 화면에 출력하는 함수 
    global window, canvas, paper, photo, photo2, photo3, oriX, oriY, newX, newY
    
    if canvas != None :     #캔버스가 깨끗하지 않으면  destroy() 함수로 초기화 해줘 
        canvas.destroy()
        
    canvas = Canvas(window,  width= width, height = height, bd=0, highlightthickness=0) #새 canvas 생성, 이미지의 가로 세로 사이즈대로 생성 / 캔버스의 흰색 테두리 없애기  bd=0, highlightthickness=0  
    paper = PhotoImage(width = width, height = height)                              # 새 canvas에 붙일 paper 생성, 이미지의 가로 세로 사이즈대로 생성 
    blob = img.make_blob(format='png')                  # img.make_blob(format='png')방식으로 처리할 경우 이미지 처리 시간이 빨라짐, 투명한 배경 지원
    paper.put(blob)
    canvas.create_image((width/2, height/2), image = paper, state="normal")  #새 캔버스에 paper 붙임(이후 paper위에 처리된 이미지를 출력)

    canvas.pack(expand=1, anchor=CENTER)        #불러운 이미지가 화면에 가운데 정렬




##파일 열기 전 버튼 비활성화
    
def func_clear() :
    if photo2 == None :
        return
    canvas.destroy()
    
    mainMenu.entryconfigure("imageMenu1", state=DISABLED)
    mainMenu.entryconfigure("imageMenu2", state=DISABLED)
    mainMenu.entryconfigure("imageMenu3", state=DISABLED)
    mainMenu.entryconfigure("editMenu", state=DISABLED)

    fileMenu.entryconfigure("파일 저장", state=DISABLED)


##파일 열기 
def func_open():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY             #전역변수 선언
    readFp = askopenfilename(parent =window, filetypes=(("모든 그림 파일", "*.jpg;*.jpeg;*.bmp;*.png;*.tif;*.gif"),  ("모든 파일", "*.*") ))

                                            #photo는 처음 불러들인 원본 이미지
    photo = Image(filename=readFp)
    oriX = photo.width      #원본 이미지의 가로 사이즈를 oriX에 저장
    oriY = photo.height     #원본 이미지의 세로 사이즈를 oriY에 저장

                                            #photo2는 처리 결과를 저장할 변수 
    photo2 = photo.clone() #원본 이미지의 photo를 복사하여 photo2에 저장
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출

    #파일이름 표시
    a = readFp #파일경로를 읽어 a 에 저장
    b = a.split('/') #a에서  / 를 기준으로 잘라서 배열에 저장
    b.reverse() #b 배열 뒤집기
    filename=b[0] #b 배열의 첫번째가 파일 이름이 됨. 

    startname.configure(text=b[0])

    
    print(a)
    print(b)
    print(b[0])

    #버튼 활성화
    fileMenu.entryconfigure("파일 저장", state=ACTIVE)
    
    mainMenu.entryconfigure("이미지 처리1", state=ACTIVE)
    mainMenu.entryconfigure("이미지 처리2", state=ACTIVE)
    mainMenu.entryconfigure("이미지 처리3", state=ACTIVE)
    mainMenu.entryconfigure("편집", state=ACTIVE)

  
##저장하기 
def func_save():
    global window, canvas, paper, photo, photo2, photo3, oriX, oriY #전역 변수 선언
                                                                #photo2는 func_open() 함수를 실행하면 생성됨
                                                                #파일을 열지 않았다면 저장하기를 눌렀을 때 함수를 빠져나감
    if photo2 ==None:
        return
    
    saveFp = asksaveasfile (parent = window, mode = "w", defaultextension = ".jpg", filetypes = (("JPG 파일", "*.jpg;*.jpeg"),  ("모든 파일", "*.*") ))
    savePhoto = photo2.convert("jpg")
    savePhoto.save(filename=saveFp.name)

##종료
def func_exit():
    window.quit()
    window.destroy()


##확대
def func_zoomin():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
   
    if photo2 ==None:
        return
  
    #askinteger() 함수를 실행해 대화 상자로 확대할 배수 입력받음 
    scale = askinteger("확대배수", "확대할 배수를 입력하세요(2~4)", minvalue=2, maxvalue=4)
    photo2.resize(int(newX * scale), int(newY * scale)) # 원본 이미지의 가로 세로 사이즈에 배수를 곱하여 크기 변경
    newX = photo2.width                                                  #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY)                        #화면에 이미지를 출력하는 displayImage() 함수 호출
                                                                                    #넘겨받은 이미지의 크기와 동일하게 윈도우 창의 크기를 조절 
    


##확대 1.5배-버튼
def  func_zoomin2():    
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2.resize(int(newX * 1.5), int(newY * 1.5))
    newX = photo2.width                                                  
    newY = photo2.height
    displayImage(photo2, newX, newY)                      
                                                                   
    

##축소 
def func_zoomout():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    
    if photo2 ==None:
        return
  
    #askinteger() 함수를 실행해 대화 상자로 나눌  배수 입력받음 
    scale = askinteger("축소배수", "축소할 배수를 입력하세요(2~4)", minvalue=2, maxvalue=4)
    photo2.resize(int(newX / scale), int(newY / scale))             # 원본 이미지의 가로 세로 사이즈에 배수를 나눠  크기 변경
    newX = photo2.width                                                             #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY)                                     #화면에 이미지를 출력하는 displayImage() 함수 호출
                                                                                                    #넘겨받은 이미지의 크기와 동일하게 윈도우 창의 크기를 조절 


##축소 1.5배-버튼
def  func_zoomout2():    
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2.resize(int(newX / 1.5), int(newY / 1.5))
    newX = photo2.width                                                  
    newY = photo2.height
    displayImage(photo2, newX, newY)                      
                                                                   


    

#상하 반전 : flip
def func_mirror1():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    
    if photo2 ==None:
        return
    photo2.flip()
    newX = photo2.width                             #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height    
    displayImage(photo2, newX, newY)    #화면에 이미지를 출력하는 displayImage() 함수 호출
        
#좌우 반전 : flop
def func_mirror2():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2.flop()
    newX = photo2.width                         #변경된 photo2의 가로값을 newX에 다시 저장 
    newY = photo2.height
    displayImage(photo2, newX, newY) #화면에 이미지를 출력하는 displayImage() 함수 호출
    
#회전: degree
def func_rotate():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    degree = askinteger("회전", "회전할 각도를 입력하세요", minvalue = 0, maxvalue =360)
    photo2.rotate(degree)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)    #화면에 이미지를 출력하는 displayImage() 함수 호출

#회전: degree -버튼 함수 
def func_rotate2():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2.rotate(90)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)    #화면에 이미지를 출력하는 displayImage() 함수 호출


#이미지 처리2> 밝게/ 어둡게
#대화창을 통해 정수를 입력받아 그 수만큼 이미지의 명도를 조정
#Wand 라이브러리에서 제공하는 modulate(명도값, 채도값, 색상값)함수를 사용
#명도는 modulate(명도값, 100, 100)함수를 사용 
#원본의 명도값이 100이므로 100이상은 밝게, 100이하는 어둡게 처리
#밝게 modulate(밝기값, 100,100)함수에 100~200 값 입력 

#밝게
def func_bright():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    if photo2 ==None:
        return
    value = askinteger("밝게", "값을 입력하세요(원본:100~밝게:200)", minvalue = 100, maxvalue =200)
    photo2.modulate(value, 100, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) 
    
#어둡게
def func_dark():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    if photo2 ==None:
        return
    value = askinteger("어둡게", "값을 입력하세요(어둡게:0~원본:100)", minvalue = 0, maxvalue =100)
    photo2.modulate(value, 100, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) 


#선명하게, modulate(100, 채도값, 100)함수에 100~200값 입력
def func_clear():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    value = askinteger("선명하게", "값을 입력하세요(100~200)",  minvalue =100, maxvalue = 200)
    photo2.modulate(100, value, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)  

#탁하게, modulate(100, 채도값, 100)함수에 0~100값 입력
def func_unclear():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    value = askinteger("탁하게", "값을 입력하세요(0~100)",  minvalue =0, maxvalue = 100)
    photo2.modulate(100, value, 100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)   


#픽셀값을 입력하면 사이즈 조정 
def func_resize():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    value1 = askinteger("리사이즈", "리사이즈할 가로를 입력")
    value2 = askinteger("리사이즈", "리사이즈할 세로를 입력")
    photo2.resize(value1, value2)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY) 
    
#흐리게 하기     
def func_blur ():
    global window,canvas, paper, photo, photo2, oriX, oriY, newX, newY
    if photo2==None:
        return

    value=askinteger("Blur","값을 입력하세요(0~10)",minvalue=0,maxvalue=10)
    photo2.blur(sigma=value)
    newX=photo2.width
    newY=photo2.height
    displayImage(photo2,newX,newY)

#텍스트 추가하기    
def func_text():
    global window,canvas, paper, photo, photo2, oriX, oriY, newX, newY
    if photo2==None:
        return
    
    draw = Drawing()
    draw.font_size = 20
    #draw.font_color="White"
    value=askstring("Text","텍스트를 입력해 주세요")
    
    draw.text(50,50,' '+value+' ')
    draw(photo2)
    newX=photo2.width
    newY=photo2.height
    displayImage(photo2,newX,newY)

    
#흑백 변경
#이미지의 type값을 grayscale로 설정하거나 
#photo2.modulate(100,0,100)으로 설정
    
def func_bw():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2.type = "grayscale" 
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

    
#원본사진으로 
def func_back(): 
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    photo2 = photo.clone() #원본 이미지를 복사해서 photo2에 저장
    newX = oriX
    newY = oriY
    displayImage(photo2, newX, newY)

#빈 페이지로
def func_backback():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    canvas.destroy()
    startname.configure(text="")
   
    


 #날카로운 이미지로   
def func_sharpen():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    
    photo2.sharpen(radius=8, sigma=4)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

#색상을 빨강, 파랑, 노랑으로 선택
def func_colorenhence():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    value = askinteger("color enhancement", "red:0, blue:1, yellow:2", minvalue=0, maxvalue=2)
    listc=["red", "blue"]
    if value==2:
        photo2.evaluate(operator="rightshift", value=1, channel ="blue")
    else:
        photo2.evaluate(operator="leftshift", value=1, channel =listc[value])

    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

#사진 색조 조절 
def func_colorregulator(): 
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY 
    if photo2 ==None:
        return
    value = askinteger("색반전", "값을 입력하세요(1~100)",  minvalue =0, maxvalue = 100)
    photo2.modulate(100, 100, value)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)   


#워터마크 사진 선택
def func_watermarkChoose():
    global window,canvas, paper, photo, photo2,photo3, oriX, oriY
    readFp = askopenfilename(parent=window, filetypes=(("모든 그림 파일", "*.jpg;*.jpeg;*.bmp;*.png;*.tif;*.gif"),  ("모든 파일", "*.*") ))
    photo3 = Image(filename=readFp)

#워터마크 사진 추가 
def func_watermarkIn():
    global window,canvas, paper, photo, photo2, photo3, oriX, oriY,newX,newY
    
    if photo3 == None :
        messagebox.showinfo("ERROR!!","워터마크 이미지가 없습니다")
    else :   
        photo3.resize( int(oriX / 4) , int(oriY / 4) )
        photo2.watermark(photo3,0.5,oriX-newX, oriY-newY)
        displayImage(photo2, oriX, oriY)

##브러시
def  func_brush(event):
    value=askinteger("색상","빨강:1, 파랑:2, 노랑:3, 검정4", minvalue=1, maxvalue=4)
    if value==1:
        func_redpen()
    elif value==2:
        func_bluepen()
    elif value==3:
        func_yellowpen()
    elif value==4:
        func_blackpen()

###검정펜###
def func_blackpen() :
    global pencolor
    pencolor="black"
    canvas.bind("<B1-Motion>",paint)

###빨간펜###
def func_redpen() :
    global pencolor
    pencolor="red"
    canvas.bind("<B1-Motion>",paint)

###파란펜###
def func_bluepen() :
    global pencolor
    pencolor="blue"
    canvas.bind("<B1-Motion>",paint)

###노란펜###
def func_yellowpen() :
    global pencolor
    pencolor="yellow"
    canvas.bind("<B1-Motion>",paint)

##펜 색을 받아 그림 그리는 함수 
def paint(event):
    global pencolor
    x1,y1=event.x-1, event.y-1
    x2,y2=event.x+1, event.y+1
    canvas.create_oval(x1,y1,x2,y2, fill = pencolor, outline=pencolor)
    




#메인 코드 부분
window = Tk()
window.geometry("832x465")
window.title("미니 포토샵(Ver 0.2)")
canvas=None

#메인 코드 부분 
#1. 메인 메뉴 자체  생성 및 화면에 디스플레이
#메뉴 자체 이름 = Menu(부모 윈도우)
#부모 윈도우.config(menu=메뉴자체이름)
mainMenu = Menu(window)
window.config(menu = mainMenu)


backGround = PhotoImage(file="../gif/roses.png") #배경 이미지 설정하기
backGroundlabel = Label(window, image = backGround)

#사진 이름 들어갈 자리
startname = Label(window, text="", bg = "moccasin" )
startname.place(x=80,y=5) #텍스트 라벨 표시



###버튼 만들기

#종료 버튼
btnClosePh = PhotoImage(file="../gif/close.png") 
btnClosePhh = Button(window, image=btnClosePh, cursor="heart", command = func_backback)

#확대 - 버튼
btnZoomin = PhotoImage(file="../gif/zoomin.png") 
btnZoomin1 = Button(window, image=btnZoomin, cursor="heart", command = func_zoomin2)

#축소 - 버튼 
btnZoomout = PhotoImage(file="../gif/zomout.png") 
btnZoomout1 = Button(window, image=btnZoomout, cursor="heart", command = func_zoomout2)

#회전90도 - 버튼 
btnRotate = PhotoImage(file="../gif/rotate.png") 
btnRotate1 = Button(window, image=btnRotate, cursor="heart", command = func_rotate2)

#브러쉬-버튼
btnBrush = PhotoImage(file="../gif/brush.png") 
btnBrush1 = Button(window, image=btnBrush, cursor="heart")
btnBrush1.bind("<Button>", func_brush)


#2. 상위메뉴1 생성 
#상위메뉴 이름 = Menu(메뉴 자체 이름)
#add_cascade() 메소드는 메뉴자체와 상위 메뉴를 연결
#tearoff=0 메뉴에 점선 없애기
fileMenu = Menu(mainMenu, tearoff=0) 
mainMenu.add_cascade(label= "파일", menu = fileMenu)

#3. 하위메뉴 생성
#상위메뉴이름.add_command(label="하위 메뉴 이름", command =함수명)
#add.command() 메소드는 하위 메뉴 항목 생성
fileMenu.add_command(label="파일 열기", command=func_open)
fileMenu.add_command(label="파일 저장", command = func_save, state=DISABLED)
fileMenu.add_separator() #구분선 삽입
fileMenu.add_command(label="프로그램 종료", command= func_exit)



#상위메뉴2-하위메뉴 
imageMenu1 = Menu(mainMenu, tearoff=0)
mainMenu.add_cascade(label="이미지 처리1", menu =imageMenu1, state=DISABLED)
imageMenu1.add_command(label="확대" , command=func_zoomin)
imageMenu1.add_command(label="축소" , command =func_zoomout)
imageMenu1.add_separator() #구분선 삽입
imageMenu1.add_command(label="상하반전", command = func_mirror1 )
imageMenu1.add_command(label="좌우반전", command = func_mirror2)
imageMenu1.add_command(label="회전", command = func_rotate )



#상위메뉴3-하위메뉴
imageMenu2 = Menu(mainMenu, tearoff=0)
mainMenu.add_cascade(label="이미지 처리2", menu =imageMenu2, state=DISABLED)
imageMenu2.add_command(label="밝게" , command=func_bright)
imageMenu2.add_command(label="어둡게" , command =func_dark)
imageMenu2.add_separator() #구분선 삽입
imageMenu2.add_command(label="선명하게", command = func_clear)
imageMenu2.add_command(label="탁하게", command = func_unclear)
imageMenu2.add_separator() #구분선 삽입
imageMenu2.add_command(label="흑백", command = func_bw)


#상위메뉴4- 하위메뉴
imageMenu3 = Menu(mainMenu, tearoff=0) #메인메뉴
mainMenu.add_cascade(label="이미지 처리3", menu =imageMenu3, state=DISABLED) #상위메뉴 
imageMenu3.add_command(label="리사이즈" , command=func_resize) #하위메뉴


#하위메뉴 아래 하위메뉴 
subMenu=Menu(imageMenu3, tearoff=0)
subMenu2= Menu(imageMenu3, tearoff=0)
imageMenu3.add_cascade(label= "추가적 기능", menu =subMenu)
imageMenu3.add_command(label="색상조정" , command=func_colorregulator)
imageMenu3.add_separator() #구분선 삽입
imageMenu3.add_cascade(label= "워터마크", menu =subMenu2)



#하위메뉴 아래 하위메뉴 안 메뉴- 추가적 기능
subMenu.add_command(label="블러처리", command=func_blur)
subMenu.add_command(label="텍스트 추가", command=func_text)
subMenu.add_command(label="날카로운 이미지", command=func_sharpen)
subMenu.add_command(label="색상 강조", command=func_colorenhence)


#하위메뉴 아래 하위메뉴 안 메뉴- 워터마크
subMenu2.add_command(label="이미지선택", command=func_watermarkChoose)
subMenu2.add_command(label="이미지추가", command=func_watermarkIn)


#상위메뉴5-하위메뉴
editMenu = Menu(mainMenu, tearoff=0)
mainMenu.add_cascade(label="편집", menu =editMenu,state=DISABLED)
editMenu.add_command(label="되돌리기" , command=func_back)
editMenu.add_command(label="빈페이지" , command=func_backback)


backGroundlabel.place(x=-2, y=-2) #배경 표시
btnClosePhh.place(x=0, y=0)#사진 닫기 버튼 표시
btnZoomin1 .place(x=0, y=35) #줌인 버튼 표시
btnZoomout1 .place(x=0, y=105) #줌아웃 버튼 표시
btnRotate1.place(x=0, y=175) #회전 버튼 표시
btnBrush1.place(x=0, y=206) #브러시 버튼 표시 

window.mainloop()

