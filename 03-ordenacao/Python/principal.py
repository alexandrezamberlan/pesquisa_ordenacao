from util import Util
from ordenacao import Ordenacao
import time

lista_bolha = []
lista_normal = []
lista_selecao = []
Util.popular_lista_aleatoria(lista_bolha, 5000, 100, 20000)
Util.popular_lista_aleatoria(lista_normal, 5000, 100, 20000)
Util.popular_lista_aleatoria(lista_selecao, 5000, 100, 20000)


tempoInicio = time.time()
lista_normal.sort()
tempoFim = time.time()
print("Tempo da rotina ordenar por sort nativo: ", (tempoFim - tempoInicio) , "s")        

tempoInicio = time.time()
qtd_comparacoes, qtd_trocas = Ordenacao.bolha(lista_bolha)
tempoFim = time.time()
print("Tempo da rotina ordenar por bolha: ", (tempoFim - tempoInicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

tempoInicio = time.time()
qtd_comparacoes, qtd_trocas = Ordenacao.selecao(lista_selecao)
tempoFim = time.time()
print("Tempo da rotina ordenar por selecao: ", (tempoFim - tempoInicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  
