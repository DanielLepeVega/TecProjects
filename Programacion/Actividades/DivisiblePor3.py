print('Programa para determinar si un numero es divisible entre 3')
while 1:
    try:
        x=int(input("Ingresa el numero= "))
        break
    except ValueError:
        print('Solo puedes ingresar valores numericos enteros')
if x%3==0:
    print(x, "Es divisible por 3")
else:
    print(x,"No es divisible entre 3")
