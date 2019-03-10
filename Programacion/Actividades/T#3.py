Python 3.6.2 (v3.6.2:5fd33b5, Jul  8 2017, 04:14:34) [MSC v.1900 32 bit (Intel)] on win32
Type "copyright", "credits" or "license()" for more information.
>>> 
>>> ''hola'*3
'holaholahola'
>>> palabra='soy un string'
>>> print(len(palabra))
13
>>> print(palabra(0))
Traceback (most recent call last):
  File "<pyshell#4>", line 1, in <module>
    print(palabra(0))
TypeError: 'str' object is not callable
>>> print(palabra[0])
s
>>> print(palabra[-1])
g
>>> print(palabra[2])
y
>>> print(palabra[1:5])
oy u
>>> print(palabra[4:])
un string
>>> print(palabra[:3])
soy
>>> print(palabra[0:6:2])
syu
>>> print(palabra[:6:2])
syu
>>> print(palabra[0::2])
syu tig
>>> print(palabra[::-1])
gnirts nu yos
>>> print(palabra.capitaliza())
Traceback (most recent call last):
  File "<pyshell#18>", line 1, in <module>
    print(palabra.capitaliza())
AttributeError: 'str' object has no attribute 'capitaliza'
>>> print(palabra.capitalize())
Soy un string
>>> print(palabra.count('o'))
1
>>> print(palabra.endswith('tring'))
True
>>> 
>>> print(palabra.endswith('a'))
False
>>> tr in palabra
Traceback (most recent call last):
  File "<pyshell#24>", line 1, in <module>
    tr in palabra
NameError: name 'tr' is not defined
>>> 'tr' in palabra
True
>>> print(palabra.find('y'))
2
>>> print(palabra.find('ai'))
-1
>>> print(palabra.islower())
True
>>> otra=palabra.upper()
>>> print(otra)
SOY UN STRING
>>> print(otra.islower())
False
>>> print(palabra.lower())
soy un string
>>> print(palabra)

