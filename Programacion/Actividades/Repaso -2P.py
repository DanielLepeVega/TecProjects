archivo=None
try:
    archivo=open('Text2.txt',encoding='UTF-8')
except:
    print('No se encuentra o no se puede abrir el archivo')

if archivo:
    x=archivo.readlines()
    for sec in x:
        z=sec.split(':')
        a=z[0]
        b=z[1]
        bb=b.split(' ')
        if len(bb)==3:
            apellido=bb[1]
            coma=','
            nombre1=bb[0]
            nombrec=apellido+coma+' '+nombre1
        elif len(bb)==4:
            nombre1=bb[0]
            nombre2=bb[1]
            coma=','
            apellido=bb[2]
            nombrec=apellido+coma+' '+nombre1+' '+nombre2
        c=z[2]
        d=z[3]
        e=z[4]
        ee=list(e)
        f=z[5]
        g=z[6]
        h=''
        gg=g.split(',')
        ggg=(int(gg[0])+int(gg[1])+int(gg[2])+int(gg[3])+int(gg[4]))/5
        if ee[5]=='3':
            h='Agosto-Diciembre '+e[0:4]
        elif ee[5]=='2':
            h='Enero-Mayo '+e[0:4]
        elif ee[5]=='1':
            h='Verano '+e[0:4]
        print(nombrec,'-',a,'-',c,'-',d,'o. ','Semestre ',c,'-',h,'-',ggg)
