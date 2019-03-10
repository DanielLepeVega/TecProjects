import math

def ecuacionCuadratica (a,b,c):
    if a == 0:
        if b == 0:
            print("No es una ecuación")
        else:
            print("Es una ecuacion lineal")
            x = -c / b
            print("Tu X es: ", x)
    else:
        if (math.pow(b,2) - 4 * a * c) < 0:
            print("Solucion imaginaria: ")
            x1_i = (-b/2*a)
            x2_i = (math.sqrt((math.pow(b,2) - 4 * a * c) * -1))
            print("Tu X1 es: ", x1_i, "+", x2_i, "j")
            print("Tu X2 es: ", x1_i, "-", x2_i, "j")
        else:
            x1 = (-b + math.sqrt((math.pow(b,2) - 4 * a * c)))/ (2 * a)
            x2 = (-b - math.sqrt((math.pow(b,2) - 4 * a * c)))/ (2 * a)
            print("Tu X1 es: ",x1,"\nTu X2 es: ",x2)

archivo=None
try:
    archivo=open('Text1.txt',encoding='UTF-8')
except:
    print('No se encuentra o no se puede abrir el archivo')

if archivo:
    x=archivo.readlines()
    print('Las variables que usaras son: ',x[0],x[1],x[2])
    for renglon in x:
        z=renglon.split(',')
        a=float(z[0])
        b=float(z[1])
        c=float(z[2])
        print('\n')
        print('El valor de a es: ',a,'El valor de b es: ',b,'El valor de c es: ',c)
        ecuacionCuadratica(a,b,c)
