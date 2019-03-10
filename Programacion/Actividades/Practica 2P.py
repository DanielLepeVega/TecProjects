def cambiaCeros(n):
    a=0
    b=0
    for lista in n:
        for num in lista:
            if num==0:
                n[a][b]=-1
            b+=1
        b=0
        a+=1
    return n

n=[[1,2,3],[0,5,6],[7,8,9]]
print(cambiaCeros(n))
