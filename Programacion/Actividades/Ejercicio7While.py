print('Vamos a jugar un juego, yo te adivino un numero en el que pienses')
x=(int(input('Introduce el valor minimo: ')))
y=(int(input('Introduce el valor maximo: ')))
print('Piensa en un numero entre',x,'y',y,'y presiona Enter')
input()
a= False

while a== False:
    z=int((y-x)/2)
    print('Tu numero es ',z,'?')
    k=input('Escribe si es mayor, menor o igual: ')
    if k=='menor':
        x=x+z
    elif k=='mayor':
        y=y+z
    elif k=='igual':
        a== True
        print(z,' Es tu numero que pensaste.')
        break
