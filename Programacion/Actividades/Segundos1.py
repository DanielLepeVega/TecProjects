while 1:
    try:
        a=int(input('Numero de segundos: '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

print('Dias= ',a//86400)
b=a%86400
print('Horas= ',b//3600)
c=b%3600
print('Minutos= ',c//60)
d=c%60
print('Segundos= ',d)
