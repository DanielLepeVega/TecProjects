print('Programa para comparar 3 numeroa')
while 1:
    try:
        x=int(input("Ingresa el primer numero= "))
        y=int(input('Ingresa el segundo numero='))
        z=int(input('Ingresa el tercer numero= '))
        break
    except ValueError:
        print('Solo puedes ingresar valores numericos enteros')
if x==y and x!=z:
    print('Hay 2 numeros iguales')
elif y==z and x!=y:
    print('Hay 2 numeros iguales')
elif x==y and y==z:
    print('Los 3 numeros son iguales')
elif x==z and x!=y:
    print('Hay 2 numeros iguales')
else:
    print('Ningun numero es igual')
