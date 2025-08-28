from util import Util
from ordenacao import Ordenacao
import time

lista = []

Util.popular_lista_aleatoria(lista, 100, 10, 200)
# lista_teste = []

# lista_teste.extend(lista)

# print(lista)
# print("outra lista")
# print(lista_teste)

#pente
tempo_inicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.pente(lista)
Util.exibir_lista(lista,"Pente")
tempo_fim = time.perf_counter()
print("Tempo da rotina ordenar por pente: ", (tempo_fim - tempo_inicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

