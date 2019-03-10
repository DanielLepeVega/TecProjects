import math
print('Programa para determinar el largo de una escalera')
while 1:
    try:
        a=float(input('Altura de la pared en la que esta la escalera= '))
        b=float(input('Angulo que se forma entre la escalera y la pared= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA DE SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

c=b*(math.pi/180)
print('Largo de la escalera= ',a/math.sin(c))
