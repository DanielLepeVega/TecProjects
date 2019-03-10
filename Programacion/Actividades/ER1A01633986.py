print('Programa para encontrar la suma de una seerie de numeros consecutivos')
while 1:
    try:
        a=int(input('El primer numero= '))
        d=int(input('La diferencia entre cada numero= '))
        n=int(input('Numero de terminos a sumar= '))
        break
    except ValueError:
        print('Solo puedes introducir numeros enteros')    
c=((n/2)*((2*a)+(n-1)*d))
print('Suma= ',c)
