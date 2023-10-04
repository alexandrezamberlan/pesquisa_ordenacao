import time
import os
import random

def pesquisa_binaria(lista, valor):
    ini = 0
    fim = len(lista) - 1
    while (ini <= fim):
        meio = int((ini+fim)/2)
        if (valor == lista[meio]):
            return True
        if (valor < lista[meio]):
            fim = meio - 1
        else:
            ini = meio + 1

def popula(lista, quantidade):
    for i in range(0,quantidade):
        lista.insert(0,random.randint(0,1000))

def exibe(lista):
    for i in lista:
        print(i)

lista = []
os.system('cls')
quantidade = int(input('Quantos números quer gerar na lista: '))

tempoInicio = time.time()
popula(lista, quantidade)
tempoFim = time.time()
print("Tempo de processamento para popular: ", (tempoFim - tempoInicio) , "s")        


# tempoInicio = time.time()
# if (-10 in lista):
#     pass
# tempoFim = time.time()
# print("Tempo de processamento para pesquisar sequencial desordenado: ", (tempoFim - tempoInicio) , "s")        


tempoInicio = time.time()
lista.sort()
tempoFim = time.time()
print("Tempo de processamento para ordenar: ", (tempoFim - tempoInicio) , "s")        

# exibe(lista)

tempoInicio = time.time()
if (-10 in lista):
    pass
tempoFim = time.time()
print("Tempo de processamento para pesquisar sequencial ordenado: ", (tempoFim - tempoInicio) , "s")        


# exibe(lista)
valor = 10 #int(input('Valor de pesquisa'))
tempoInicio = time.time()
if (pesquisa_binaria(lista,valor)):
    print('achei....')

tempoFim = time.time()
print("Tempo de processamento para pesquisar binário: ", (tempoFim - tempoInicio) , "s")        