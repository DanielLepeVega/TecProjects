import math
print('Programa para resolver un binomio cuadrado perfecto mediante la formula general')
while 1:
    try:
        a=int(input('Ingresa el valor de "a"= '))
        b=int(input('Ingresa el valor de "b"= '))
        c=int(input('Ingresa el valor de "c"= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA DE SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

print('X1= ',((-(b)+(math.sqrt((b**2)-(4*a*c))))/(2*a)))
print('X2= ',((-(b)-(math.sqrt((b**2)-(4*a*c))))/(2*a)))
