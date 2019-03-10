def sumatoria(n):
    suma=0
    for i in range(1,n+1):
        suma+=i
    return suma

def serie(n):
    suma=0
    for h in range(1,n+1):
        if h%2==0:
            suma-=n
        else:
            suma+=n
    return suma

def tablaDel(n):
    for num in range(1,11):
        mul=num*n
        print(n,'X',num,'=',mul)

def sumando(entradas):
    suma=0
    for i in range(1,entradas+1):
        x=int(input('Introduce un numero: '))
        suma+=x
    print(suma)

def cuantasVocales(cadena1):
    vocales=['a','e','i','o','u']
    cadena1=cadena1.lower()
    x=0
    for i in range(len(cadena1)):
        for a in range(len(vocales)):
            if cadena1[i] == vocales[a]:
                x+=1
    return x

def masVocales(cadena1,cadena2):
    vocales=['a','e','i','o','u']
    cadena1=cadena1.lower()
    cadena2=cadena2.lower()
    y=0
    x=0

    y=cuantasVocales(cadena1)
    x=cuantasVocales(cadena2)

    if y>x:
        print('La primera palabra/oracion tiene mas vocales que la segunda')
    elif y==x:
        print('La primera palabra/oracion tiene igual de vocales que la segunda')
    elif x>y:
        print('La segunda palabra/oracion tiene mas vocales que la segunda')

def reemplaza (old,new,cadena):
    nueva=''
    for i in cadena:
        if i==old:
            nueva+=new
        else:
            nueva+=i
    return nueva

def comunes(cadena1,cadena2):
    x=''
    lista1=list(cadena1)
    lista2=list(cadena2)
    for letra1 in lista1:
        for letra2 in lista2:
            if(letra1==letra2):
                if letra1 in x:
                    x=x
                else:
                    x+=letra1
    x=list(x)
    return x

def divideenTam(cadena,n):
    nueva=''
    for pos in range(len(cadena)):
        if pos==(n-1):
            nueva=nueva+cadena[pos]+'-'
        else:
            nueva+=cadena[pos]
    return nueva

print('1. Sumatoria.')
print('2. Serie.')
print('3. Tabla del.')
print('4. Sumando n entadas.')
print('5. cuantasVocales. ')
print('6. masVocales. ')
print('7. reemplaza. ')
print('8. comunes')
print('9. divideenTam. ')
op=input('Introduce la funcion que deseas utilizar: ')

if op=='1':
    n=int(input('Introduce un valor que se va a sumar desde el cero hasta llegar a tu valor: '))
    resultado=sumatoria(n)
    print(resultado)

elif op=='2':
    n=int(input('Escribe el numero inicial de la serie, donde los impares se suman y los pares se restan: '))
    res=serie(n)
    print(res)

elif op=='3':
    n=int(input('Escoge el numero que quieres sacar la tabla de ese numero del 1 al 10: '))
    res=tablaDel(n)
    print(res)

elif op=='4':
    entradas=int(input('Introduce un valor que represente los valores que vas a usar: '))
    sumando(entradas)

elif op=='5':
    cadena1=input('Introduce una cadena: ')
    print(cuantasVocales(cadena1))

elif op=='6':
    cadena1=input('Introduce tu palabra/oracion 1: ')
    cadena2=input('Introduce tu palabra/oracion 2: ')
    masVocales(cadena1,cadena2)

elif op=='7':
    old=input('Introduce lo que quieres reemplazar: ')
    new=input('Introduce lo nuevo por lo que lo reemplazaras: ')
    cadena=input('Ingresa el texto completo: ')

elif op=='8':
    cadena1=input('Ingresa tu primera palabra/oracion: ')
    cadena2=input('Ingresa tu segunda palabra/oracion: ')
    print(comunes(cadena1,cadena2))

elif op=='9':
    cadena=input('Introduce tu palabra/oracion: ')
    n=int(input('Ingresa el numero de espacios en el que lo deseas separar: '))
    print(divideenTam(cadena,n))

else:
    print('Error esa funcion no existe')
