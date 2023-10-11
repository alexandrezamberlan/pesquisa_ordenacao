class Aluno:
    def __init__(self, nome,idade):
        self.nome = nome
        self.idade = idade

    def __str__(self):
        return "Aluno{" + self.nome + "," + self.idade +"}"

    def __eq__(self, o):       
        if isinstance(o, Aluno):
            return self.nome == o.nome and self.idade == o.idade
        return False

    def __lt__(self, o):
        return self.nome < o.nome or self.idade < o.idade


import os

lista = []

os.system("cls")

for i in range(0,3):
    nome = input("Nome: ")
    idade = input("Idade: ")

    aluno = Aluno(nome,idade)
    if not aluno in lista:
        lista.append(aluno)
    else:
        print("Aluno com esses dados ja cadastrado")

lista.sort()

for i in lista:
    print(i)