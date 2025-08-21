from util import Util
from ordenacao import Ordenacao
import time

lista_insercao = []

Util.popular_lista_aleatoria(lista_insercao, 10, 100, 20000)

#insercao
tempoInicio = time.time()
qtd_comparacoes, qtd_trocas = Ordenacao.insercao(lista_insercao)
tempoFim = time.time()
print("Tempo da rotina ordenar por insercao: ", (tempoFim - tempoInicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  
Util.exibir_lista(lista_insercao,"Lista ordenada pelo insercao")
