def valida_num(string):
    while 1:
        try:
            a=int(input(string))
            break
        except ValueError:
            print('Vuelve a ingresar tu numero, porque tiene que ser entero')
    return a

def mayor_Ingresado():
    lista=[0]
    n = valida_num('Ingresa un numero: ')
    while n>=0:
        n = valida_num('Ingresa un numero: ')
        if n >= 0:
            lista.append(n)
        else:
            n=n
            mayor=max(lista)
    return mayor

def mayor_Ingresado1():
    num1=0
    comp=0
    while num1>=0:
        num1 = valida_num('Ingresa un numero: ')
        if num1>=comp:
            comp=num1
    return comp

def palabras(string,num):
    a=string.split(' ')
    b=0
    for palabra in a:
        x=len(palabra)
        if x==num:
            b+=1
    return b

def extension_frecuente(lista):
    listavr=[]
    listava=[]
    for c in lista:
        s=c.split('.')
        listava.append(s)
    print(listava)
    input()
    for a in lista:
        print(a)
        input()
        n=a.split('.')
        c=a.count(n[1])
        print(c)
        input()
        listavr.append(c)
        print(listavr)
        input()
    return listavr

lista=['datos.txt','tarea.docx','programa.py','log.txt']
print(extension_frecuente(lista))

def duplica_lista(lista):
    listavac= lista + lista
    return listavac

def reporte(listaCalf):
    listaReporte = []
    n = 1
    for alumno in listaCalf:
        individual = str(n) + "-"
        if(alumno[0] == 0):
          individual = individual + "L"
        if(alumno[1] == 0):
          individual = individual + "M"
        if(alumno[2] == 0):
          individual = individual + "X"
        if(alumno[3] == 0):
          individual = individual + "J"
        if(alumno[4] == 0):
          individual = individual + "V"
        n += 1
        listaReporte.append(individual)
    return listaReporte
