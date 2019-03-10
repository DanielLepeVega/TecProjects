import math

def funcion(x):
    a=math.sqrt(4+x)
    b=math.sqrt(4-x)
    if x<0:
        return a
    elif x>=0:
        return b

def imc(peso,altura):
    a=peso/(altura**2)
    print(a)
    if a<18.5:
        print('Peso bajo')
    elif a>=18.5 and a<25:
        print('Ideal')
    elif a>=30 and a <35:
        print('Sobrepeso')
    elif a>=35 and a<40:
        print('Obesidad severa')
    elif a>=40:
        print('Obesidad moribunda')

def encripta(cadena):
    cadena=cadena.lower()
    cadena=cadena.replace("a","4")
    cadena=cadena.replace("e","3")
    cadena=cadena.replace("i","1")
    cadena=cadena.replace("o","&")
    cadena=cadena.replace("u",">")
    print(cadena)

def mas_palabras(cadena1,cadena2):
    a=len(cadena1)
    b=len(cadena2)
    if a>b:
        print(1)
    elif a==b:
        print(0)
    elif a<b:
        print(-1)

print('1. Funcion(x)')
print('2. Indice de masa corporal imc(peso,altura)')
print('3. Encripta(cadena)')
print('4. Comparacion de cadenas mas_palabras(cadena1, cadena2)')

op=input('Introduce la funcion que deseas utilizar: ')

if op=='1':
    x=int(input('Intoduce el valor de x:'))
    if x>=-4 and x<=4:
        print(funcion(x))
    else:
        print('Introduce valores que no den resultado imaginario')

elif op=='2':
    peso=int(input('Introduce tu peso en kg: '))
    altura=float(input('Introduce tu altura en metros: '))
    print(imc(peso,altura))

elif op=='3':
    cadena=input('Introduzca aqui su cadena para encriptar: ')
    encripta(cadena)

elif op=='4':
    cadena1=input('Introduzca aqui la cadena 1: ')
    cadena2=input('Introduzca aqui la cadena 2: ')
    mas_palabras(cadena1,cadena2)

else:
    print('Ese programa no esta disponible, introduzca un programa valido')
