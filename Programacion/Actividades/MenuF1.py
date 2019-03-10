import math
def segundos(seg):
    mint=seg//60
    seg=seg%60
    hrs=mint//60
    mint=mint%60
    dia=hrs//24
    hrs=hrs%24
    print("Dias: %d Horas: %d Minutos: %d Segundos: %d" % (dia,hrs,mint,seg))

def convertidor(pies,unidadM):
    if unidadM== "yardas":
        yardas=pies/3.0
        return yardas
    elif unidadM=='metros':
        return (pies*12*2.54)/100
    elif unidadM=='pulgadas':
        return pies*12

def multiplo(numero,divisor):
    if numero%divisor==0:
        return True
    else:
        return False
        #return numero%divisor==0

def esfera(radio):
    vol=math.pi*radio**3*4/3
    print('Volumen= ',vol)

def compara(num1,num2):
    if num1<num2:
        return -1
    elif num1==num2:
        return 0
    else:
        return 1

print("Programa con menu")
print("1. Convertir segundos")
print("2. Convertidor de pies")
print("3. Volumen de esfera")
print("4. Multiplo de")
print("5. Compara 2 numeros")
op=input("Opcion: ")
if op=='1':
    s=int(input("Cantidad de segundos: "))
    segundos(s)
elif op=='2':
    pies=float(input('Cantidad de pies: '))
    medida=input('Ingresa la unidad de medida (metros, yardas, pulgadas):')
    if medida=='yardas' or medida=='metros' or medida=='pulgadas':
        resultado=convertidor(pies,medida)
        print(resultado,'en',medida,'es igual a= ',pies,'pies')
    else:
        print('Error medida desconocida')
elif op=='3':
    radio=float(input('Introduce el radio en cm: '))
    esfera(radio)
elif op=='4':
    num=int(input('Numero a revisar: '))
    div=int(input('Divisor: '))
    if multiplo(num,div):
        print(num,'Es multiplo de',div)
    else:
        print(num,'No es multiplo de',div)
elif op=='5':
    num1=int(input('Ingresa el primer numero: '))
    num2=int(input('Ingresa el segundo numero: '))
    comparacion=compara(num1,num2)
    if comparacion==-1:
        print('El numero',num1,'es menor que',num2)
    elif comparacion==0:
        print('El numero',num1,'es igual que',num2)
    elif comparacion==1:
        print('El numero',num1,'es mayor que',num2)
else:
    print('Error, programa no disponible')
