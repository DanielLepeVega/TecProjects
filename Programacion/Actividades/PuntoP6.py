import math
print('Programa para calcular la distancia entre dos puntos en un plano')
while 1:
    try:
        a=int(input('X1= '))
        b=int(input('Y1= '))
        c=int(input('X2= '))
        d=int(input('Y2= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA DE SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

print('Distancia entre puntos= ',math.sqrt(((c-a)**2)+((d-b)**2)))
