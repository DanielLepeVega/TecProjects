print('Programa para determinar si un numero es divisible entre otro numero')
while 1:
    try:
        x=int(input("Ingresa el primer numero= "))
        y=int(input('Ingresa el segundo numero='))
        break
    except ValueError:
        print('Solo puedes ingresar valores numericos enteros')
if x%y==0:
    print(x, "Es divisible por ",y)
else:
    print(x,"No es divisible entre ",y)
