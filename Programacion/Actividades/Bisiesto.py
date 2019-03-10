print('Programa para determinar si un año es bisiesto o no')
while 1:
    try:
        x=int(input('Ingresa un año '))
        break
    except ValueError:
        print('Solo puedes ingresar valores numericos enteros')
if x%4==0 and not x%100==0 or x%400==0:
    print(x,'Es un año bisiesto')
elif x%100==0:
    print(x,'No es un año bisiesto')
else:
    print(x,'No es un año bisiesto')
