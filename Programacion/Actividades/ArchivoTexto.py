archivo=None
try:
    archivo=open('ArchivoTexto.txt',encoding='UTF-8')
except:
    print('No se encuentra o no se puede abrir el archivo')
if archivo:
    for linea in archivo:
        print(linea.rstrip())
