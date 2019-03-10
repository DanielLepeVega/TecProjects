from random import randint
def combina_listas(lista1,lista2):
    x = lista1
    y = lista2
    z = []
    c1 = 0
    x1=len(lista1)
    x2=len(lista2)
    comp=0
    if x1>x2:
        comp=x1
    else:
        comp=x2
    while (c1<comp):
        if c1<=(x1-1):
            z.append(x[c1])
        if c1<=(x2-1):
            z.append(y[c1])
        c1 += 1
    return z

lista1=[5,8,10,20,50]
lista2=[1,3,9]

def numeros_rango(mini,maxi):
    l=[]
    x=int(input("Ingresa un numero en del rango: "))
    while x>=mini and x<=maxi:
        l.append(x)
        x = int(input("Ingresa un numero en del rango: "))
    return l

def numeros_Suman(n):
    x=1
    y=(n//2)
    l=[]
    a=0
    while a<n:
        z=randint(x,y)
        a += z
        l.append(z)
    return l

def cuenta_palabras(lista,n):
    l=[]
    for i in lista:
        b=0
        for a in i:
            if n==a:
                b+=1
        l.append(b)
    return l

listaa=[[1,2,1,5],[1,1,1,2],[1,2,1]]
print(cuenta_palabras(listaa,1))

def multiplos_de_5(lista):
    for i in range(len(lista)):
        for j in range(len(lista[i])):
            if lista[i][j]%5 !=0:
                lista[i][j]=0
    return lista

listaaa=[[1,2,1,5],[1,1,1,2],[1,2,1]]
print(multiplos_de_5(listaaa))

strings = ["datos.txt","datos.txt","strings.doc", "rep.txt"]
def extension_frecuente(strings):
	x = 0
	y = 0
	for i in range(0,4):
		if strings[i].endswith("txt"):
			x += 1
		elif strings[i].endswith("doc"):
			y += 1
	if x > y:
		return "TXT"
	else:
		return "DOC"

print(extension_frecuente(strings))

#def ordena_ABC(lista):
