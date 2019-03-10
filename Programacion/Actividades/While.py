def evaluarSerie(n):
    x=0
    a=0
    while (a<=n):
        x=x+a
        a+=1
    return x

def f1(n):
    x=1
    a=1
    while (a<=n):
        x=x*(a*2)
        a+=1
    return x

def h1(n):
    x=0
    a=0
    while (a<=n):
        if a%2==0:
            x=x-a
        else:
            x=x+a
        a+=1
    return x

def h2(n):
    a=0
    x=0
    while(a<=n):
        x=((2*a)+2)+x
        a+=1
    return x

def numeros_triangulares(n):
    a=1
    x=0
    while (a<=n):
        x=(a*(a+1))/2
        a+=1
        print(int(x))

def num_dig(n):
    a=0
    while True:
        if(n/(10**a)>=1 and n/(10**a)<=9):
            a+=1
            return a
            break
        else:
            a+=1

while True:
    print('1.Funcion evaluarSerie.')
    print('2.Funcion f1.')
    print('3.Funcion h1.')
    print('4.Funcion h2.')
    print('5.Funcion numeros_triangulares.')
    print('6.Funcion num_dig.')
    print('7.Salir.')

    op=int(input('Escribe las funciones que deseas utilizar: '))

    if op==1:
        n=int(input('Introduce un valor que a partir del 1 sera sumado hasta tu numero: '))
        print(evaluarSerie(n))

    elif op==2:
        n=int(input('Ingresa el numero que sera en una serie el ultimo a multiplicarse por 2: '))
        print(f1(n))

    elif op==3:
        n=int(input('Escribe el numero al que quieras llegar en donde los numeros pares se resten y los impares se sumen en la serie: '))
        print(h1(n))

    elif op==4:
        n=int(input('Introduce un valor que sera mulltiplicado en serie y sumado con 2 hasta tu numero: '))
        print(h2(n))

    elif op==5:
        n=int(input('Ingresa tu numero n para hacer n numero de lineas con el numero triangular: '))
        numeros_triangulares(n)

    elif op==6:
        n=int(input('Escribe un numero y te devuelvo cuantos digitos tiene: '))
        print(num_dig(n))

    elif op==7:
        print('Usted ha salido')

    break
