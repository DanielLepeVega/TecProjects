from datetime import datetime, timedelta
import time

#1 extra
def inicioSemana ():
    inicioSemana = datetime.now() - timedelta (days=7)
    inicioSemana = str(inicioSemana)
    inicioSemana = inicioSemana[0:10]
    año = inicioSemana[0:4]
    mes = inicioSemana[5:7]
    dia = inicioSemana[8:10]
    inicioSemana = dia + '-' + mes + '-' + año
    return inicioSemana
#2 extra
def finSemana ():
    finSemana = datetime.now() + timedelta (days=7)
    finSemana = str(finSemana)
    finSemana = finSemana[0:10]
    año = finSemana[0:4]
    mes = finSemana[5:7]
    dia = finSemana[8:10]
    finSemana = dia + '-' + mes + '-' + año
    return finSemana
#3 extra
def abrirArchivo(n):
    archivo = None
    try:
        z = open(n, enconding = 'UTF-8')
    except:
        print ("No se encuentra o no se puede abrir el archivo")
#4 extra
def validaEntradaparaMenu():
    while 1:
        try:
            op=int(input('Ingresa el numero de la funcion que quieres usar: '))
            return op
            break
        except ValueError:
            print('ERROR EN EL PROGRAMA SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')
#5 extra
def MatrixCero ():
    w, h, d = 3, 7, 5;
    Matrix = [[[0 for x in range(w)] for y in range(h)] for z in range(d)]
    return Matrix
#6 extra
def validacionConRango(msj, mini, maxi):
    while True:
        try:
            valid = int(input(msj))
            if(valid <= maxi and valid >= mini):
                return valid
                break
            else:
                print("Número no valido o fuera de rango")
        except ValueError:
            print("Número no valido o fuera de rango")

#1
def ingresa_datos():
    while 1:
        try:
            linea = validacionConRango('Ingresa el numero de linea (1 - 5): ',1,5)
            turno = validacionConRango("Ingresa el turno (1.- Mañana 2.- Tarde 3.- Noche): ",1,3)
            productos = int(input("Ingresa el numero de productos: "))
            stop = int(input("Ingresa el numero de veces que se detuvo la linea: "))
            break
        except ValueError:
            print('ERROR EN EL PROGRAMA SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')
    fecha = datetime.now()
    x = "Linea " + str(linea) + ", " + "turno " + str(turno) + "," + fecha.strftime ('%d-%m-%Y') + ", " + str(productos) + ", " + str(stop) + "\n"
    y=open('Archivo.txt','a')
    y.write(x)
    y.close()

#2
def llenaMatrix ():
    y = open('Archivo.txt')
    z = y.readlines()
    for i in z:
        p = i.split(',')
        h = 0
        for j in p:
            if (h == 0):
                # tenemos "Linea"
                x = int(j[6])
            elif (h == 1):
                # tenemos "turno"
                z=int(j[7])
            elif (h == 2):
                # numero del 0 al 6
                pattern = '%d-%m-%Y'
                y = int(time.mktime(time.strptime(j, pattern)))
                t = time.strftime("%A", time.gmtime(y))
                if t == "Monday":
                    y = 0
                elif t == "Tuesday":
                    y = 1
                elif t == "Wednesday":
                    y = 2
                elif t == "Thursday":
                    y = 3
                elif t == "Friday":
                    y = 4
                elif t == "Saturday":
                    y = 5
                elif t == "Sunday":
                    y = 6
            elif (h == 3):
                a = int(j)
            elif (h == 4):
                b = int(j)
            h +=1
    #    print ("mi linea es: ", x)
    #    print ("mi dia es: ",y)
    #    print ("mi turno es: ",z)
    #    print (a)
    #    print (b)
    #    print("x-1:",x-1,"y:",y,"z-1:",z-1)
        Matrix[x-1][y][z-1] = [a,b]

#2.1
def resumen():
    fecha = datetime.now()
    a = open('Resumen.txt','w')
    semana = 'Semana del ' + str(inicioSemana()) + " al " + str(fecha.strftime ('%d-%m-%Y'))
    a.write (semana)
    a = open ("Resumen.txt","a")
    for i in range (0,5):
        for h in range (0,3):
            suma1 = 0
            suma2 = 0
            k = 0
            diaMayor = 0
            for n in range (0,7):
                suma3 = 0
                suma1 += int(Matrix [i][n][h][0])
                suma2 += int(Matrix [i][n][h][1])
                suma3 += int(Matrix [i][n][h][1])
                if k < int(Matrix [i][n][h][1]):
                    k = int(Matrix [i][n][h][1])
                    diaMayor = n

            txtLin = str("\nLinea: " + str(i + 1) + "\n")
            txtTurn = str("Turno: " + str(h + 1) + "\n")
            txtProd = str("Total de productos de la semana: " + str(suma1) + "\n")
            txtDet = str("Veces que se detuvo la línea: " + str(suma2) + "\n")
            txtDiaM = str("Día en que más veces se detuvo la línea: " + str(diaMayor + 1) + "°" + " dia de la semana" + "\n")
            a.write (txtLin)
            a.write (txtTurn)
            a.write (txtProd)
            a.write (txtDet)
            a.write (txtDiaM)
    a.close()

def consultaParciales (linea,turno,dia):
    x = Matrix[linea-1][dia-1][turno-1]
    txtLin1 = str("\nLinea: " + str(linea) + "\n")
    txtTurn1 = str("Turno: " + str(turno) + "\n")
    txtProd1 = 0

#------------------MAIN------------------
# X = lineas ------ Y = dia --------- Z = turno
w, h, d = 3, 7, 5;
Matrix = [[[0 for x in range(w)] for y in range(h)] for z in range(d)]
while True:
    print('-----------------------------------------------------------------------------------------------------------------------')
    print('Menu de las funciones de la empresa')
    print('1. Ingresar datos de la linea.')
    print('2. Hacer resumen.')
    print('3. Reiniciar semana.')
    print('4. Consultas parciales.')
    print('5. Salir.')

    op=validaEntradaparaMenu()
    if op == 1:
        ingresa_datos()

    elif op == 2:
        llenaMatrix()
        resumen()

    elif op == 3:
        MatrixCero ()
        fecha = datetime.now()
        semana = 'Semana del ' + str(fecha.strftime ('%d-%m-%Y')) + " al " + str(finSemana())
        q = open("Resumen.txt","w")
        q.write("")
        q = open('Resumen.txt','a')
        q.write(semana)
        q.close()

    elif op == 4:
        while 1:
            try:
                linea__ = int(input('Ingresa el numero de linea para consulta parcial (1 - 5): '))
                turno__ = int(input("Ingresa el turno para consulta parcial (1.- Mañana 2.- Tarde 3.- Noche): "))
                break
            except ValueError:
                print('ERROR EN EL PROGRAMA SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

    elif op == 5:
        print('Usted ha salido')
        break

    else:
        print('Esa funcion no existe')
