while 1:
    try:
        a=int(input('Cantidad de pesos= '))
        break
    except ValueError:
        print('ERROR EN EL PROGRAMA DE SOLO PUEDES INTRODUCIR NUMEROS, NO LETRAS')

print('Billetes de $1000= ',a//1000)
b=a%1000
print('Billetes de $500= ',b//500)
c=b%500
print('Billetes de $200= ',c//200)
d=c%200
print('Billetes de $100= ',d//100)
e=d%100
print('Billetes de $20= ',e//20)
f=e%20
print('Monedas de $10= ',f//10)
g=f%10
print('Monedas de $5= ',g//5)
h=g%5
print('Monedas de $2= ',h//2)
i=h%2
print('Monedas de $1= ',i//1)
