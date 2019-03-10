import random
c=1
n=random.randint(0,100)
while (c<=5):
    a=int(input('Trata de adivinar el numero: '))
    c+=1
    if a==n:
        print('Adivinaste el numero es ',a)
        break
    elif a<n:
        print('El numero es mayor que ',a)
    elif a>n:
        print('El numero es menor que ',a)
if c==6:
    print('No adivinaste el numero era: ',n)
