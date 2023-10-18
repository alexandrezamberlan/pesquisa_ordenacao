import random
import time

tabela_hash = set()

def popular_hash(tabela, n):
    for i in range(0,n):
        tabela.add(i)

def exibir_hash(tabela):
    for i in tabela:
        print(i)


qtd = 20000000

popular_hash(tabela_hash, qtd)
# exibir_hash(tabela_hash)
print('Tamanho hash: ', len(tabela_hash))


tempoInicio = time.time()
print(tabela_hash.__contains__(-9))
tempoFim = time.time()
print("Tempo de processamento do contains do Python: ", (tempoFim - tempoInicio) , "s")  