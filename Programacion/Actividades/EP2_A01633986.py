def coincidencias(a,b):
    i=0
    c=0
    while True:
        x = len(a) - 1
        y = len(b) - 1
        if i<=x and i<=y:
            if a[i] == b[i]:
                c+=1
        else:
            break
        i+=1
    return c

def cuantosVacios(n):
    a=0
    for lista in n:
        for num in lista:
            if num==0:
                a+=1
    return a

def divide(n):
    a=[]
    for i in range(len(n)):
        l=[]
        for j in range(len(n)):
            if n[i]>n[j]:
                l.append(n[i])
            a.append(l)
    return a

def validacionConRango(msj, mini, maxi):
    while True:
        try:
            valid = int(input(msj))
            if(valid <= maxi and valid >= mini):
                break
            else:
                print("Número no valido o fuera de rango")
        except ValueError:
            print("Número no valido o fuera de rango")
    return valid

def minutos_usuario():
    archivo=None
    try:
        archivo=open('log.csv')
    except:
        print('No se encuentra o no se puede abrir el archivo')

    if archivo:
        x=archivo.readlines()

        for i in x:
            z=i.split(',')
            s=0
            if z[0]=='cbueno':
                hora1=z[5]
                horas_1=hora1.split(':')
                h1=int(horas_1[0])
                m1=int(horas_1[1])
                hora2=z[6]
                horas_2=hora2.split(':')
                h2=int(horas_2[0])
                m2=int(horas_2[1])
                g=(h2-h1)*60
                t=m2-m1
                total=g+t
                s+=total
        return s
