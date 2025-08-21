from util import Util
from ordenacao import Ordenacao
import time

lista_bolha = []
lista_normal = []
lista_selecao = []
lista_insercao = []

Util.popular_lista_aleatoria(lista_bolha, 10000, 100, 20000)
Util.popular_lista_aleatoria(lista_normal, 10000, 100, 20000)
Util.popular_lista_aleatoria(lista_selecao, 10000, 100, 20000)
Util.popular_lista_aleatoria(lista_insercao, 10000, 100, 20000)

#sort
tempoInicio = time.perf_counter()
lista_normal.sort()
tempoFim = time.perf_counter()
print("Tempo da rotina ordenar por sort nativo: ", (tempoFim - tempoInicio) , "s")        

#bolha
tempoInicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.bolha(lista_bolha)
tempoFim = time.perf_counter()
print("Tempo da rotina ordenar por bolha: ", (tempoFim - tempoInicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

#selecao
tempoInicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.selecao(lista_selecao)
tempoFim = time.perf_counter()
print("Tempo da rotina ordenar por selecao: ", (tempoFim - tempoInicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

#insercao
tempoInicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.insercao(lista_insercao)
tempoFim = time.perf_counter()
print("Tempo da rotina ordenar por insercao: ", (tempoFim - tempoInicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  
