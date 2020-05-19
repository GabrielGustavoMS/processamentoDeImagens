#Exemplo dia da semana
print("Programa para converter nº de 1 a 7 em dia da semana ")





def diaSemana():
    dia = int(input("Digite o nº do dia da semana"))
    if(dia ==1):
        print("Domingo")
    elif(dia == 2):
        print("2ª")
    elif(dia == 3):
        print("3ª")
    elif(dia == 4):
        print("4ª")
    elif(dia == 5):
        print("5ª")
    elif(dia == 6):
        print("6ª")
    elif(dia == 7):
        print("Sábado")
    else:
        print("Dia inválido")
        return diaSemana()
    
  
diaSemana()
