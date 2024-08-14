from util import Util
from ordenacao import Ordenacao

import threading
import os

os.system("cls")
listaBolha = []
lista = []

Util.gerar_numeros_lista(listaBolha, 10000, 20),
Util.gerar_numeros_lista(lista, 10000, 20)


threading.Thread(
    target=lambda: (
        Ordenacao.bolha(listaBolha),
        print("feito... com bolha")
    )
).start()

threading.Thread(
    target=lambda: (
        lista.sort(),
        print("feito... sort python")
    )
).start()


