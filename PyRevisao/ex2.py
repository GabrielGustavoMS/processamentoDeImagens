# Exemplo da média 6 com prova de recuperação caso > 1

nota1 = float(input("Digite a 1ª nota do aluno "))
nota2 = float(input("Digite a 2ª nota do aluno "))

media = (nota1+nota2)/2

provaRec = 0

if(media<=6 and media >1):
    print("Aluno está de rec ")
    provaRec = float(input("Digite a nota da prova rec"))

if(media>=6 or provaRec>=6):
    print("aluno aprovado")
else:
    print("aluno reprovado")

print("Media do aluno foi ",media," a prova sub teve nota: ",provaRec)
print("Fim")
