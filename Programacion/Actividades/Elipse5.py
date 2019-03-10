import math
print('Programa para determinar la circunferencia de una elipse')
while 1:
    try:
        a=float(input('Radio mayor= '))
        b=float(input('Radio menor= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')
print('Circunferencia de la elipse= ',math.pi*(math.sqrt((2**2)*((a+b)**2))))
