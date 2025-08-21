import matplotlib.pyplot as plt
import time

from util import Util
from ordenacao import Ordenacao

lista_bolha = []
lista_normal = []
lista_selecao = []
lista_insercao = []

tamanho = 10000

Util.popular_lista_aleatoria(lista_bolha, tamanho, 100, 20000)
Util.popular_lista_aleatoria(lista_normal, tamanho, 100, 20000)
Util.popular_lista_aleatoria(lista_selecao, tamanho, 100, 20000)
Util.popular_lista_aleatoria(lista_insercao, tamanho, 100, 20000)

#sort
tempoInicio = time.perf_counter()
lista_normal.sort()
tempoFim = time.perf_counter()
tempo_sort = tempoFim - tempoInicio
print("Tempo da rotina ordenar por sort nativo: ",  tempo_sort, "s")        

#bolha
tempoInicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.bolha(lista_bolha)
tempoFim = time.perf_counter()
tempo_bolha = tempoFim - tempoInicio
print("Tempo da rotina ordenar por bolha: ", tempo_bolha , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

#selecao
tempoInicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.selecao(lista_selecao)
tempoFim = time.perf_counter()
tempo_selecao = tempoFim - tempoInicio
print("Tempo da rotina ordenar por selecao: ", tempo_selecao , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

#insercao
tempoInicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.insercao(lista_insercao)
tempoFim = time.perf_counter()
tempo_insercao = tempoFim - tempoInicio
print("Tempo da rotina ordenar por insercao: ", tempo_insercao , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  


plt.figure(figsize=(10, 7))
plt.plot(tempo_sort, tamanho, marker="o", linestyle="-", label=f"sort")
plt.plot(tempo_bolha, tamanho,marker="o", linestyle="-", label=f"bolha")
plt.plot(tempo_selecao, tamanho,marker="o", linestyle="-", label=f"selecao")
plt.plot(tempo_insercao, tamanho,marker="o", linestyle="-", label=f"insercao")


plt.title(f"Comparação de Algoritmos de Ordenação\n(Entrada: Listas desordenadas e aleatorias)")
plt.xlabel("Tempo de Execução (segundos)")
plt.ylabel("Tamanho da Lista (n)")
plt.legend()
plt.grid(axis='y', linestyle=':')
plt.show()