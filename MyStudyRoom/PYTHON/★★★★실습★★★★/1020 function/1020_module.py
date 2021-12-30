#from 모듈명 import 함수1, 함수2, 함수3
#from 모듈명 import*

#from Func import func1, func2, func3
'''
#방법1
from Func import*
func1()
func2()
func3()


#방법2
import Func
Func.func1()
Func.func2()
Func.func3()


import sys
print(sys.builtin_module_names)

import math
dir(math)
'''
a=222

def func1():
    print(a)

def func2():
    a=111
    print(a)

func1()
func2()



