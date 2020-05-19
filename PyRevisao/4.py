'''
idade = int(input("Digite a idade !"))

saida = "Maior de idade"
if(idade<18):
    saida = "Menor de idade"
print(saida)


'''


n1 = float(input("Digite a nota 1 "))
n2 = float(input("Digite a nota 2 "))

media = (n1+n2)/2
saida = "Aprovado"
if(media<6):
    recuperacao = float(input("Digite a nota de recuperação "))
    if(recuperacao<6):
        saida = "Reprovado"
print(saida)


'''
n1 = int(input("Digite um número inteiro "))

saida = "Número inadequado "

if(n1%2 == 0 and n1>=0):
    saida = 2* n1
print(saida)
'''
