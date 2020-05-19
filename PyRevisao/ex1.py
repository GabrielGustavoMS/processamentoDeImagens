## 1) Exemplo dos 2 números para saber se é menor ou maior

print("Programa para verificar relação entre 2 números ====\n");
num1 = int(input("Digite um número ")) # Entrada de dados - entra sempre com string
num2 = int(input("Digite um número ")) # Entrada de dados - entra sempre com string



if(num1>num2):
    print("O nº ",num1," é maior que ",num2)
elif(num1 == num2):
    print("O nº ",num1," é igual a ",num2)
else:
    print ("O nº ",num2," é maior que ",num1)
