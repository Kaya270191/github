from tkinter import*
from tkinter.filedialog import*
from tkinter.simpledialog import*
from wand.image import*
from wand.drawing import Drawing
import PIL


window = Tk()
window.geometry("832x465")
window.title("미니 포토샵(Ver 0.2)"

             
##확대 - 버튼
btnZoomin = PhotoImage(file="../gif/zoomin.png")
btnLabel1 = Label(window, image= btnZoomin)
btnLabel1.place(x=50, y=50) #확대 버튼 표시
btnLabel1.place(x=50, y=50) #확대 버튼 표시 

window.mainloop()
