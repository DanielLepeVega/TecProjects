def multtiplica(n, m):
    if(n==0):
        return 0
    else:
        return m + mult(n-1,m)

def Asender(x):
    if (x==0):
        print (0)
    else:
        (Asender(x-1))
    print (x)

def enDescendente2(n):
    if(n==0):
        print(0)
    elif(n==1):
        print(1)
    else:
        print(n)
        enDescendente2(n-2)

def divisionporRestas(n, m):
    if(n == m):
        return m
    else:
        return n - divisionporRestas(n - m, m)

def sumaharmonica(n):
    if n==1:
        return 1
    else:
        return 1/n + sumaharmonica(n-1)

def cuentadigitos(n):
     if(n<10):
        return 1
     else:
        return 1 + cuentadigitos (n/10)

def cuentacuantas(n, m):
    if len(n)==0:
        return 0
    elif n[0]==m:
        return 1 + cuentacuantas(n[1:],m)
    else:
        return cuentacuantas (n[1:],m)

def potencia(n,m):
    if m==0:
        return 1
    else:
        return n*potencia(n,m-1)

def sumadeDigitos(n):
    if n==0:
        return (n)
    else:
        return (int(n%10+sumadeDigitos(n/10)))

def Vocales(n):
    if not n:
        return 0
    else:
        return (1 if n[0] in 'aeiouAEIOU' else 0) + Vocales(n[1:])

def decimalABin(n):
    if n==0:
        return "0"
    else:
        return decimalABin(n//2) + str(n%2)

print(sumaharmonica(2))
