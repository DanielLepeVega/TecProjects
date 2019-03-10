def intensidad(escala):
    if escala<3.5:
        print('Generalmente no se siente, pero es registrado')
    elif escala>=3.5 and escala<=5.4:
        print('Puede sentirse pero sólo causa daños menores')
    elif escala>=5.5 and escala<=6.0:
        print("Ocasiona daños ligeros a edificios")
    elif escala>=6.1 and escala<=6.9:
        print("Ocasiona daños severos en áreas muy pobladas")
    elif escala>=7.0 and escala<=7.9:
        print("Causa graves daños")
    elif escala>=8.0:
        print("Destrucción total a comunidades cercanas")
    else:
        print("Error introduce una escala válida")
print("Programa para determinar los daños de acuerdo a una escala Richter")
escala=float(input("Introduce la escala de Richter: "))
intensidad(escala)
