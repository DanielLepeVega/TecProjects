def sudoku(matriz):
    contador1=0
    contador2=0
    contador331=0
    contador332=0
    contador333=0
    contador334=0
    contador335=0
    contador336=0
    contador337=0
    contador338=0
    contador339=0
    ctc1=0
    ctc2=0
    ctc3=0
    ctc4=0
    ctc5=0
    ctc6=0
    ctc7=0
    ctc8=0
    ctc9=0

    for i in matriz:
        for a in i:
            contador1 = contador1 + a
        contador1=contador1
        if contador1 == 45:
            ctc1=matriz[0][0]+matriz[1][0]+matriz[2][0]+matriz[3][0]+matriz[4][0]+matriz[5][0]+matriz[6][0]+matriz[7][0]+matriz[8][0]
            ctc2=matriz[0][1]+matriz[1][1]+matriz[2][1]+matriz[3][1]+matriz[4][1]+matriz[5][1]+matriz[6][1]+matriz[7][1]+matriz[8][1]
            ctc3=matriz[0][2]+matriz[1][2]+matriz[2][2]+matriz[3][2]+matriz[4][2]+matriz[5][2]+matriz[6][2]+matriz[7][2]+matriz[8][2]
            ctc4=matriz[0][3]+matriz[1][3]+matriz[2][3]+matriz[3][3]+matriz[4][3]+matriz[5][3]+matriz[6][3]+matriz[7][3]+matriz[8][3]
            ctc5=matriz[0][4]+matriz[1][4]+matriz[2][4]+matriz[3][4]+matriz[4][4]+matriz[5][4]+matriz[6][4]+matriz[7][4]+matriz[8][4]
            ctc6=matriz[0][5]+matriz[1][5]+matriz[2][5]+matriz[3][5]+matriz[4][5]+matriz[5][5]+matriz[6][5]+matriz[7][5]+matriz[8][5]
            ctc7=matriz[0][6]+matriz[1][6]+matriz[2][6]+matriz[3][6]+matriz[4][6]+matriz[5][6]+matriz[6][6]+matriz[7][6]+matriz[8][6]
            ctc8=matriz[0][7]+matriz[1][7]+matriz[2][7]+matriz[3][7]+matriz[4][7]+matriz[5][7]+matriz[6][7]+matriz[7][7]+matriz[8][7]
            ctc9=matriz[0][8]+matriz[1][8]+matriz[2][8]+matriz[3][8]+matriz[4][8]+matriz[5][8]+matriz[6][8]+matriz[7][8]+matriz[8][8]

            if ctc1==45 and ctc2==45 and ctc3==45 and ctc4==45 and ctc5==45 and ctc6==45 and ctc7==45 and ctc8==45 and ctc9==45:
                contador331= matriz[0][0]+ matriz[0][1]+ matriz[0][2]+ matriz[1][0]+ matriz[1][1]+ matriz[1][2]+ matriz[2][0]+ matriz[2][1]+ matriz[2][2]
                contador332= matriz[0][3]+ matriz[0][4]+ matriz[0][5]+ matriz[1][3]+ matriz[1][4]+ matriz[1][5]+ matriz[2][3]+ matriz[2][4]+ matriz[2][5]
                contador333= matriz[0][6]+ matriz[0][7]+ matriz[0][8]+ matriz[1][6]+ matriz[1][7]+ matriz[1][8]+ matriz[2][6]+ matriz[2][7]+ matriz[2][8]
                contador334= matriz[3][0]+ matriz[3][1]+ matriz[3][2]+ matriz[4][0]+ matriz[4][1]+ matriz[4][2]+ matriz[5][0]+ matriz[5][1]+ matriz[5][2]
                contador335= matriz[3][3]+ matriz[3][4]+ matriz[3][5]+ matriz[4][3]+ matriz[4][4]+ matriz[4][5]+ matriz[5][3]+ matriz[5][4]+ matriz[5][5]
                contador336= matriz[3][6]+ matriz[3][7]+ matriz[3][8]+ matriz[4][6]+ matriz[4][7]+ matriz[4][8]+ matriz[5][6]+ matriz[5][7]+ matriz[5][8]
                contador337= matriz[6][0]+ matriz[6][1]+ matriz[6][2]+ matriz[7][0]+ matriz[7][1]+ matriz[7][2]+ matriz[8][0]+ matriz[8][1]+ matriz[8][2]
                contador338= matriz[6][3]+ matriz[6][4]+ matriz[6][5]+ matriz[7][3]+ matriz[7][4]+ matriz[7][5]+ matriz[8][3]+ matriz[8][4]+ matriz[8][5]
                contador339= matriz[6][6]+ matriz[6][7]+ matriz[6][8]+ matriz[7][6]+ matriz[7][7]+ matriz[7][8]+ matriz[8][6]+ matriz[8][7]+ matriz[8][8]

                if contador331==45 and contador332==45 and contador332==45 and contador333==45 and contador334==45 and contador335==45 and contador336==45 and contador337==45 and contador338==45 and contador339==45:
                    return 1

                else:
                    return 0
            else:
                return 0
        else:
            return 0

        contador1=0
        contador2=0

matriz=[[8,9,7,1,6,2,4,5,3],[5,1,3,8,7,4,9,6,2],[2,4,6,9,3,5,1,8,7],[3,6,9,7,8,1,5,2,4],
        [7,5,2,4,9,6,3,1,8],[1,8,4,5,2,3,7,9,6],[6,7,5,3,1,8,2,4,9],[4,3,8,2,5,9,6,7,1],
        [9,2,1,6,4,7,8,3,5]]

print(sudoku(matriz))
