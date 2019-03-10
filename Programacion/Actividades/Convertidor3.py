while 1:
    try:
        a=float(input('Medida en pies= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

print('Equivalente en Yardas= ',a/3,'Yd')
b=a*12
print('Equivalente en Pulgadas= ',b,'In')
print('Equivalente en Metros= ',b*.0254,'m')
