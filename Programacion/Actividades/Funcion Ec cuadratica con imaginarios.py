def ecuacionCuadratica (a,b,c):
    if a == 0:
        if b == 0:
            print("No es una ecuación")
        else:
            print("Es una ecuacion lineal")
            x = -c / b
            print("Tu X es: ", x)
    else:
        if (math.pow(b,2) - 4 * a * c) < 0:
            print("Solucion imaginaria\n")
            x1_i = (-b/2*a)
            x2_i = (math.sqrt((math.pow(b,2) - 4 * a * c) * -1))
            print("Tu X1 es: ", x1_i, "+", x2_i, "j")
            print("Tu X2 es: ", x1_i, "-", x2_i, "j")
        else:
            x1 = (-b + math.sqrt((math.pow(b,2) - 4 * a * c)))/ (2 * a)
            x2 = (-b - math.sqrt((math.pow(b,2) - 4 * a * c)))/ (2 * a)
            print("Tu X1 es: ",x1,"\nTu X2 es: ",x2)
