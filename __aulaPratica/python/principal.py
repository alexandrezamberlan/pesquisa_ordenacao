from util import Util
from ordenacao import Ordenacao

import threading
import os

os.system("cls")
lista_bolha = []
lista_insercao = []
lista = []

tamanho = 60000

Util.gerar_numeros_lista(lista_bolha, tamanho, 20),
Util.gerar_numeros_lista(lista_insercao, tamanho, 20),
Util.gerar_numeros_lista(lista, tamanho, 20)


threading.Thread(
    target=lambda: (
        Ordenacao.bolha(lista_bolha),
        print("feito... com bolha")
    )
).start()

threading.Thread(
    target=lambda: (
        Ordenacao.insercao(lista_insercao),
        print("feito... com insercao")
    )
).start()

threading.Thread(
    target=lambda: (
        lista.sort(),
        print("feito... sort python")
    )
).start()


