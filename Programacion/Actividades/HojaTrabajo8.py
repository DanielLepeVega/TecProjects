def multiplica(a,b):
    if a==0 or b==0:
        return 0
    else:
        return a + multiplica(a,b-1)

def enDescendente(n):
    if n==0:
        print(0, end=' ')
    else:
        print(n, end=' ')
        enDescendente(n-1)

def enAscendente(n):
    if n==0:
        print(0, end=' ')
    else:
        enAscendente(n-1)
        print(n, end=' ')

def divisionporRestas(a,b):
    if a<b:
        return 0
    else:
        return divisionporRestas(a-b,b) + 1

def sumaHarmonica(n):
    if n==0:
        return 0
    else:
        return sumaHarmonica(n-1) + 1/n

def cuantosDigitos(n):
    if n<10:
        return 1
    else:
        return 1 + cuantosDigitos(n/10)

def decimalABin(n):
    if n==0:
        return "0"
    else:
        return decimalABin(n//2) + str(n%2)

def sumaDigitos(n):
    if n==0:
        return 0
    else:
        return n%10 + sumaDigitos(n//10)

def vocales(palabra):
    a='aeiouAEIOU'
    if palabra=='':
        return 0
    else:
        return (1 if palabra[0] in a else 0) + vocales(palabra[1:])

def potencia(x,y):
    if y==0:
        return 1
    else:
        return potencia(x,y-1)*x

#Las siguientes 2 no cuentan por que las hicimos en clase

def invierteLista(lista,inicio,fin):
    if inicio<fin:
        temp=lista[inicio]
        lista[inicio]=lista[fin]
        lista[fin]=temp
        invierteLista(lista,inicio + 1,fin - 1)

def cuentaCuantas(cadena,caracter):
    if len(cadena)==0:
        return 0
    elif cadena[0]==caracter:
        return 1 + cuentaCuantas(cadena[1:],caracter)
    else:
        return cuentaCuantas(cadena[1:],caracter)
