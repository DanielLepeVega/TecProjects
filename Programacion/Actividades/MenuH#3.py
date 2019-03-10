def palindrome(palabra):
    p1=palabra.replace(' ','')
    p2=p1[::-1]
    print(p1==p2)

def esVocal(caracter):
    return caracter in 'aeiouAEIOU'

def cuantasVocales(cadena):
    cadena=cadena.lower()
    print(cadena.count('a')+cadena.count('e')+cadena.count('i')+cadena.count('o')+cadena.count('u'))

def suprimeVocales(oracion):
    oracion=oracion.lower()
    oracion=oracion.replace('a','')
    oracion=oracion.replace('e','')
    oracion=oracion.replace('i','')
    oracion=oracion.replace('o','')
    oracion=oracion.replace('u','')
    print(oracion)

print('1. Programa para determinar si una palabra o frase es palindrome.')
print('2. Programa para saber si un caracter es una vocal.')
print('3. Programa que devuelve la cantidad de vocales en una palabra o frase.')
print('4. Programa para suprimir las vocales de una palabra u oracion.')

op=input("Ingresa la funcion que deseas usar: ")

if op=='1':
    palabra=input('Escriba aqui su palabra o frase: ')
    palindrome(palabra)
elif op=='2':
    caracter=input('Dame un caracter: ')
    if (len(caracter)==1) and esVocal(caracter):
        print('Es vocal')
    else:
        print('Es mas de un caracter o no es vocal')
elif op=='3':
    cadena=input('Ingresa tu palabra o frase: ')
    cuantasVocales(cadena)

elif op=='4':
    oracion=input('Introduce una oracion o palabra: ')
    suprimeVocales(oracion)

else:
    print('Error esa instruccion no es valida')
