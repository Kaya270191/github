#Image Processing Program#

from tkinter import *
from tkinter.filedialog import * #파일 입출력
from tkinter.simpledialog import * #숫자나 문자 입출력창
from wand.image import * #imagemagick
from wand.color import Color

###함수 정의


#이미지 화면 배치
def displayImage(img, width, height):
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    canw = 600
    canh = 600

    if canvas != None:
        canvas.destroy()

    if(canw<width or canh<height):
        canw = width
        canh = height
        window.geometry(str(width)+"x"+str(height))
    
    canvas = Canvas(r_frame, width=canw, height=canh, bd=0, highlightthickness=0, bg='#ffffff')
    paper = PhotoImage(width=width, height=height)
    canvas.create_image((canw/2, canh/2), image=paper, state="normal") #width/2, height/2: paper의 canvas상 위치

    blob = img.make_blob(format='png')
    paper.put(blob)
    
    canvas.pack()

#file 함수 
def func_open():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY #전역변수를 함수 내에서 사용하겠다
    readFp = askopenfilename(parent=window, filetype=(("All image files", "*.jpg;*.jpeg;*.bmp;*.png;*.tif;*.gif"), ("All files", "*.*")))    
    photo = Image(filename=readFp)
    oriX = photo.width
    oriY = photo.height
    original = photo.clone()
    photo2 = photo.clone()
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)
    
def func_save():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    saveFp = asksaveasfile(parent=window, mode="w", defaultextension=".jpg", filetypes=(("JPG files", "*.jpg;*.jpeg"),("All files","*.*")))
    savePhoto = photo2.convert("jpg")
    savePhoto.save(filename=saveFp.name)
 
def func_exit():
    window.quit()
    window.destroy()


######################################## move, pen, crop 추가하기#############################################
    
#edit 함수
def func_tooriginal():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    photo2=photo.clone()
    displayImage(photo2, oriX, oriY)
    
def func_zoomin():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    scale = askinteger("scale", "scale(2-4): ", minvalue=2, maxvalue=4)
    photo2.resize(int(oriX*scale), int(oriY*scale))
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_zoomout():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    scale = askinteger("scale", "scale(2-4): ", minvalue=2, maxvalue=4)
    photo2.resize(int(oriX/scale), int(oriY/scale))
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_flip():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    photo2.flip()
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_flop():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    photo2.flop()
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_rotate():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    degree = askinteger("rotate", "angle(0-360): ", minvalue=0, maxvalue=360)
    photo2.rotate(degree)#background=Color('white')
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

#image 함수
def func_bright():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    value = askinteger("brighten", "value(100-200): ", minvalue=100, maxvalue=200)
    photo2.modulate(value, 100,100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_dark():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    value = askinteger("darken", "value(0-100): ", minvalue=0, maxvalue=100)
    photo2.modulate(value, 100,100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_clear():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    value = askinteger("saturate", "value(100-200): ", minvalue=100, maxvalue=200)
    photo2.modulate(100,value,100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_unclear():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    value = askinteger("unsaturate", "value(0-100): ", minvalue=0, maxvalue=100)
    photo2.modulate(100,value,100)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_sharpen():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    
    photo2.sharpen(radius=8, sigma=4)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)
    
def func_blur():
    global window, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    
    photo2.blur(radius=0, sigma=3)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_colorswap():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    matrix = [[0,0,1],[0,1,0],[1,0,0]] #r[r,g,b], g[r,g,b], b[r,g,b],
    photo2.color_matrix(matrix)
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)

def func_colorenhence():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

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
    
def func_bw():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY

    if photo2 == None:
        return
    photo2.type="grayscale"
    newX = photo2.width
    newY = photo2.height
    displayImage(photo2, newX, newY)


#메뉴 생성 메소드
def menu_create():
    global window, l_frame, r_frame, canvas, paper, photo, photo2, oriX, oriY, newX, newY
    mainMenu = Menu(window)
    window.config(menu = mainMenu)
    filelist= {"Open":func_open, "Save":func_save, "Exit":func_exit}
    editlist= {"Revert":func_tooriginal, "Zoom In":func_zoomin, "Zoom Out":func_zoomout, "Flip Horizontal":func_flip, "Flip Vertical":func_flop,
                "Rotate":func_rotate}
    imagelist= {"Brighten":func_bright, "Darken":func_dark, "Saturate":func_clear, "Desaturate":func_unclear, "Sharpen":func_sharpen,
                "Blur":func_blur, "Color Swap":func_colorswap, "Color Ehancement":func_colorenhence, "Black&White":func_bw}

    def menu_add(parent, labelN, commandN):
        parent.add_command(label=labelN, command=commandN)
    
    def whatMenu(menu, name, llist):
        menu = Menu(mainMenu, tearoff=0)
        mainMenu.add_cascade(label=name, menu=menu)
        for key in llist:
            menu_add(menu, key, llist[key])
        
    whatMenu("fileMenu", "File", filelist)
    whatMenu("editMenu", "Edit", editlist)
    whatMenu("imageMenu", "Image", imagelist)

    
###################################### 버튼 생성 메소드 (추가/수정하기) #############################################                
def create_btn():
    for i in range(20):
        button = Button(l_frame, text="↶", width=2, height=2, bg="lightgray", relief='flat', command=func_tooriginal)
        button.pack(side=TOP, anchor=W, ipadx=10)

    
###변수 선언
window, l_frame, r_frame, canvas, paper = None, None, None, None, None
photo, photo2 = None, None
oriX, oriY, newX, newY =0,0,0,0 #원본 이미지의 폭과 높이


###메인 코드
window = Tk()
window.geometry("640x600")
window.title("My Photoshop")
window.resizable(False, False)

#화면 분할
l_frame = Frame(window, relief='flat', width=40, height=600)
l_frame.pack(side='left', fill='both')
r_frame = Frame(window, relief='flat', width=600, height=600)
r_frame.pack(side='right', fill='both')

#메뉴생성
menu_create()

#버튼생성
create_btn()

window.mainloop()





