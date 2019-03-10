listanombre=[]
listaedad=[]
listaauto=[]
listasn=[]

def solicitainfo():
    for i in range(no_clientes):
        print('Cliente numero: ',i+1)
        nombre=input('Ingresa el nombre: ')
        edad=input('Ingresa la edad: ')
        telefono=input('Ingresa el telefono (Ingresa el telefono a 10 digitos): ')
        auto=input('Ingresa la marca de interes del auto: ')
        sn=input('Primer auto S/N: ')
        listanombre.append(nombre)
        listaedad.append(edad)
        listaauto.append(auto)
        listasn.append(sn)

def menu():
    print('--- MENU DE ADMINISTRACION ---')
    print('1. Quien fue el cliente mas viejo que visito la tienda.')
    print('2. Cuantos clientes que me visitaron ya tienen carro.')
    print('3. Cuantos clientes se interesaron en un carro especifico.')
    print('4. Agregar nuevo registro de cliente')
    print('5. Salir')

def cliente_viejo():
    e=max(listaedad)
    print('La persona con mayor edad es: ',e,' años')
    print(' ')

def carro():
    n=0
    x='s'
    for i in listasn:
        if i==x:
            n+=1
    print('Hay ',n,' clientes con carro')
    print(' ')

def auto():
    d=input('Que carro quieres buscar: ')
    b=0
    for i in listaauto:
        if d==i:
            b+=1
    print(b,'personas tienen',d,'de auto')
    print(' ')

no_clientes=int(input('Cuantos clientes te visitaron hoy: '))
solicitainfo()
while True:
    menu()
    op=int(input('Ingresa que opcion deseas usar: '))
    if op==1:
        cliente_viejo()
    elif op==2:
        carro()
    elif op==3:
        auto()
    elif op==4:
        no_clientes=int(input('Cuantos clientes te visitaron hoy: '))
        solicitainfo()
    elif op==5:
        print('Usted ha salido del programa')
        break
