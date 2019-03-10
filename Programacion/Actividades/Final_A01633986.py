#1
def es_perfecto(x):
    cont=0
    w=0
    while w<(x/2):
        w+=1
        if x%w==0:
            cont+=w
    if x==cont:
        return True
    else:
        return False

#print(es_perfecto(28))

#2
def cuales_perfectos(lista):
    listavac=[]
    for i in lista:
        x=es_perfecto(i)
        if x==True:
            listavac.append(i)
    return(listavac)

#h=[2,6,28,56,496]
#print(cuales_perfectos(h))

#3
def divide_matriculas(lista):
    p=[]
    q=[]
    z=[]
    for i in lista:
        x=int(i[8])
        y=x%2
        if  y==0:
            p.append(i)
        else:
            q.append(i)
    z.append(p)
    z.append(q)
    return z

#lista=['A01662345', 'A06788334', 'A08967579', 'A01633986']
#print(divide_matriculas(lista))

#4
def frecuencia_entidad(lista): #no me sale para solo sacar los que necesito, si me saca los que hay pero no los que necesito
    z=[]
    x=[]
    r=[]
    for i in lista:
        y=[]
        prii=i[11]
        segi=i[12]
        esta=prii + segi
        x.append(esta)
        f=x.count(esta)
        r= esta + ',' + str(f)
        y.append(r)
        z.append(y)
    return z

#lista=['PEMM780912MBCLRR00','PEMM780912MBCLRR00','UIPF750108MQTBLB05','PAUB030430MCHCBN12','PAUB030430MCHCBN12']
#print(frecuencia_entidad(lista))

#5
def mezcla_ordenada(l1, l2):
    l3=l1+l2
    l3.sort()
    return l3

#x=[4,6,8,12]
#y=[1,3,11,15]
#print(mezcla_ordenada(x,y))

#6
def ganador_etapa (jugadores, tiempos): #me falto hacerlo para cada jugador por etapa
    listavacia = []
    for listas in tiempos:
        tiempo=min(listas)
        listavacia.append(tiempo)
    menor=min(listavacia)
    ganadortiempo=listavacia.index(menor)
    ganador=jugadores[ganadortiempo]
    return ganador

#7
def cuantas_frases(frases):
    cont=-1
    listafrases=frases.split(".")
    for i in listafrases:
        cont+=1
    return cont

#print(cuantas_frases('Hola que tal como estas. Yo bien y tu.'))

#8
def reporte(matriz):
    y=[]
    t='LMXJV'
    for i in matriz:
        x=(int(matriz[i])+1)
        for a in i:
            if a==0:
                v=(x + '-' + t[a])
                y.append(v)
    return y
