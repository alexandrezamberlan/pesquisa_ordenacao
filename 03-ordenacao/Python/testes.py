from util import Util
from ordenacao import Ordenacao
import time

lista = []

Util.popular_lista_aleatoria(lista, 10, 10, 200)
# lista_teste = []

# lista_teste.extend(lista)

# print(lista)
# print("outra lista")
# print(lista_teste)

#agitacao
tempo_inicio = time.perf_counter()
qtd_comparacoes, qtd_trocas = Ordenacao.agitacao(lista)
Util.exibir_lista(lista,"Agitação")
tempo_fim = time.perf_counter()
print("Tempo da rotina ordenar por agitacao: ", (tempo_fim - tempo_inicio) , "s")      
print('Comparacoes:', qtd_comparacoes)
print('Trocas:', qtd_trocas)  

