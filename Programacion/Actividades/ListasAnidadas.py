def creaMatriz1(n):
    a=[]
    for i in range(n):
        l=[]
        for b in range(n):
            l.append(-1)
        a.append(l)
    return a

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
    for i in range(len(n)):
        for a in range(len(n[i])):
            if n[i][a]<0:
                n[i][a]=0
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
    for i in range(len(n)):
        for j in range(len(n[i])):
            if n[i][j]==0:
                n[i][j]=n[i][j]
    return n

def creaMatriz3(n):
    a=[]
    for i in range(n):
        l=[]
        for b in range(n):
            l.append(i+1)
        a.append(l)
    return a

print('1. creaMatriz 1')
print('2. creaMatriz 2')
print('3. cuentaPares')
print('4. sumaMatriz')
print('5. cuentaPositivos')
print('6. cambiaNegativos')
print('7. cuentaRepeticiones')
print('8. busca')
print('9. sumaMayores5')
print('10. cambiaCeros')
print('11. creaMatriz 3')


op=int(input('Ingresa el numero de la funcion que deseas usar: '))

if op==1:
    n=int(input('Introduce el valor de n que representa el numero de renglon y columnas: '))
    x=creaMatriz1(n)
    for i in range(n):
        print(x[i])

elif op==2:
    n=int(input('Introduce el valor de n que representa el numero de renglon y columnas: '))
    x=creaMatriz2(n)
    for i in range(n):
        print(x[i])

elif op==3:
    n=[[1,2,3],[4,5,6],[7,8,9]]
    print(cuentaPares(n))

elif op==4:
    n=[[1,2,3],[4,5,6],[7,8,9]]
    print(sumaMatriz(n))

elif op==5:
    n=[[1,2,3],[4,5,6],[7,8,9]]
    print(cuentaPositivos(n))

elif op==6:
    n=[[1,-2,3],[4,-5,6],[7,-8,9]]
    print(cambiaNegativos(n))

elif op==7:
    n=[[1,2,3],[4,2,6],[7,8,9]]
    print(cuentaRepeticiones(n))

elif op==8:
    n=[[1,2,3],[4,5,6],[7,8,9]]
    print(busca(n,2))

elif op==9:
    n=[[1,2,3],[4,5,6],[7,8,9]]
    print(sumaMayores5(n))

elif op==10:
    n=[[1,2,3],[0,5,6],[7,8,9]]
    print(cambiaCeros(n))

elif op==11:
    n=int(input('Introduce el valor de n que representa el numero de renglon y columnas: '))
    x=creaMatriz3(n)
    for i in range(n):
        print(x[i])
