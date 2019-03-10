def valida_con_rango(msg,min,max):
    while 1:
        try:
            a=int(input('Introduce el limite inferior: ','Introduce el limite superior: '))
            break
        except ValueError:
            print('Solo ingresa valores numericos')

valida_con_rango()

msg=int(input('Ingresa el limite inferior de tu dato: '))
min=int(input('Ingresa el limite superior de tu dato: '))
max=int(input('Introduce un dato para probar si esta dentro del rango: '))
