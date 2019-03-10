import random
def valida_entradas(n):
    while 1:
        try:
            n=int
            break
        except ValueError:
            print('Solo ingresa valores numericos')

def tirada(n):
    z=0
    a=1
    while (a<=n):
        x=random.randint(1,6)
        print('Tiro ',a,': ',x,'puntos')
        a+=1
        z+=x
        print('Puntos acumulados: ',z)

def desordenaPalabra(n):
    x=''
    lista=list(n)
    for letra in range(len(lista)):
        x+=random.randint(0,lista)
    return x

while True:
    print('1. Funcion tirada.')
    print('2. Funcion desordenaPalabra.')
    print('3. Salir')

    op=int(input('Escribe el numero de la funcion que deseas usar: '))

    if op==1:
        n=int(input('Introduce el numero de veces que deseas tirar: '))
        valida_entradas(n)
        tirada(n)

    elif op==2:
        n=input('Introduce una palabra que quieras desordenar: ')
        print(desordenaPalabra(n))

    elif op==3:
        print('Usted ha salido')

    break
