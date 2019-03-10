def creaMatriz1(n):
    a=[]
    for i in range(n):
        l=[]
        for b in range(n):
            l.append(-1)
        a.append(l)
    return a

##n=int(input('Introduce el valor de n que representa el numero de renglon y columnas: '))
##x=creaMatriz1(n)
##for i in range(n):
    ##print(x[i])


def creaMatriz2(n):
    a=[]
    for i in range(n):
        l=[]
        for b in range(n):
            l.append(b+1)
        a.append(l)
    return a

def cuentaPares(n):
    x=0
    for i in n:
        for a in i:
            if a%2==0:
                x+=1
    return x

def sumaMatriz(n):
    x=0
    for i in n:
        for a in i:
            x+=a
    return x

def cuentaPositivos(n):
    x=0
    for i in n:
        for a in i:
            if a>=0:
                x+=1
    return x

def cambiaNegativos(n):
    b=0
    c=0
    for i in n:
        for a in i:
            if a<0:
                n[b][c]=0
            c+=1
        c=0
        b+=1
    return n

def cuentaRepeticiones(n):
    z=int(input('Escribe un valor para ver si esta en la lista: '))
    x=0
    for i in n:
        for a in i:
            if a==z:
                x+=1
    return x

def busca(n,x):
    for i in n:
        for a in i:
            if a==x:
                return True
            else:
                z=False
    return z
def sumaMayores5(n):
    x=0
    for i in n:
        for a in i:
            if a>=5:
                x+=a
    return x

def cambiaCeros(n):
    a=0
    b=0
    c=0
    for i in n:
        for j in i:
            if j==0:
                for h in i:
                    c+=h
                c=c*(a+1)
                n[a][b]=c
            b+=1
        b=0
        a+=1
    return n
