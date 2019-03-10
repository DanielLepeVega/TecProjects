import math
print('Programa para resolver un binomio cuadrado perfecto mediante la formula general')
while 1:
    try:
        a=float(input('Ingresa el valor de "a"= '))
        b=float(input('Ingresa el valor de "b"= '))
        c=float(input('Ingresa el valor de "c"= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA DE SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')
if a==0:
    if b==0:
        print('No es una ecuacion')
    else:
        x=-c/b
        print('El valor lineal de x es= ',x)
elif ((b**2)-(4*a*c))<0:
    print('Solucion imaginaria')
    print('X1= ',complex(-b/(2*a),+((math.sqrt((b**2)-(4*a*c))))/(2*a)))
    print(complex(-b/(2*a),-(math.sqrt((b**2)-(4*a*c))))/(2*a))
else:
    print('X1= ',((-(b)+(math.sqrt((b**2)-(4*a*c))))/(2*a)))
    print('X2= ',((-(b)-(math.sqrt((b**2)-(4*a*c))))/(2*a)))
