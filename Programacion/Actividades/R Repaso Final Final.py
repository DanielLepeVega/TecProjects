def valida_num (msg):
    while True:
        try:
            num=int(input(msg))
            break
        except:
            print("numero no valido, ingrese un numero entero")

    return num


def mayor_Ingresado ():
    numeros=[0]
    flag = True
    while flag == True:
        num=valida_num("Escriba un numero , escriba un numero negativo para terminar: ")
        if num >= 0 :
            numeros.append(num)
        else:
            flag = False
            mayor=max(numeros)
    return mayor


def palabra (str, num):
    contador=0
    palabras = str.split(sep=None)
    for items in palabras:
        if len(items) == num:
            contador += 1
    return contador





def extenssion_frecuente (lista):
    listaVacia =[]
    lista2=[]
    frecuencia1=[]
    for items in lista:
        index=items.index(".")
        listaVacia.append(items[index:len(items)])
    for items in listaVacia:
        if items  not in lista2:
            lista2.append(items)
            print(lista2)
    for items in lista2:
        num=listaVacia.count(items)
        frecuencia1.append(num)
    mayor=frecuencia1.index(max(frecuencia1))
    masfrecuente = lista2[mayor]
    return masfrecuente

def duplica_lista (lista):
    listavacia = []
    for x in range (2):
        for items in lista:
            listavacia.append(items)
        x=x+1
    return listavacia

def ganador (jugadores, tiempos):
    listavacia = []
    for listas in tiempos:
        tiempo=min(listas)
        listavacia.append(tiempo)
    menor=min(listavacia)
    ganadortiempo=listavacia.index(menor)
    ganador=jugadores[ganadortiempo]
    return ganador


def con_prefijo (str,prefijo):
    listaVacia = []
    palabras = str.split(' ')
    for items in palabras:
        if items[0:len(prefijo)] == prefijo:
            listaVacia.append(items)
    return listaVacia


def nomenclatura (str1,num1,num2):
    edificio = []
    pisos=[]

    for y in range (num1):
        for x in range (num2+1):
            String = str1+str(y)+"-"+'0'+str(x)
            pisos.append(String)
            x += 1
        y += 1
        edificio.append(pisos)
    return edificio

print(nomenclatura('A',3,6))

#str1=input()
#num1=int(input())
#num2=int(input())
#print(nomenclatura(str1, num1, num2))

#str=input()
#num=int(input())
#print(palabra(str, num))


#num=valida_num("ingresa un numero: ")
#print(num)

#print(mayor_Ingresado())

#str = input()
#num = int(input())
#print(palabra(str, num))

#lista =["lolo.py","lolo1.py","jaja.txt","jesus.txt","123.py"]
#print(extenssion_frecuente(lista))

#lista=[1,2,3]
#print(duplica_lista(lista))

#jugadores=["oliver","luis","pedro","raul","saul"]
#tiempos=[[10,2,3,4,5],[6,7,8,9,10],[4,5,6,8,9],[6,6,6,6,6,],[1,2,34,5,6]]
#print(ganador(jugadores, tiempos))

#str=input()
#prefijo=input()
#print(con_prefijo(str, prefijo))
