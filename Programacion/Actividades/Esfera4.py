import math
print('Programa para determinar el volumen y el area de una esfera')
while 1:
    try:
        a=float(input('Radio de la esfera= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA DE SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

print('Volumen de la esfera= ',(4/3)*(math.pi)*(a**3))
print('Area de la esfera= ',4*math.pi*(a**2))
