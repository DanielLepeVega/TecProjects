def valida_entero():
    while True:
        try:
            num=int(input())
            return num
        except ValueError:
            print("Dato invalido, solo valor numerico")
