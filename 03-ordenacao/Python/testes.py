from util import Util
from ordenacao import Ordenacao
import time

lista = []
lista_sort = []
lista_selecao = []

Util.popular_lista_aleatoria(lista, 5000, 100, 20000)
Util.popular_lista_aleatoria(lista_selecao, 5000, 100, 20000)
Util.popular_lista_aleatoria(lista_sort, 5000, 100, 20000)

#bolha
tempo_inicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.bolha(lista)
tempo_fim = time.perf_counter()
print("Tempo da rotina ordenar por bolha: ", (tempo_fim - tempo_inicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

#selecao
tempo_inicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.selecao(lista_selecao)
tempo_fim = time.perf_counter()
print("Tempo da rotina ordenar por selecao: ", (tempo_fim - tempo_inicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

#sort
tempo_inicio = time.perf_counter()
lista_sort.sort()
tempo_fim = time.perf_counter()
print("Tempo da rotina ordenar por sort nativo: ", (tempo_fim - tempo_inicio) , "s")      


