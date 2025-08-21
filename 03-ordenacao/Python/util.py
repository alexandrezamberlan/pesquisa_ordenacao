import random

class Util:
    @staticmethod
    def popular_lista_aleatoria(lista, quantidade, inicio, fim):
        for _ in range(quantidade):
            lista.append( random.randint(inicio, fim) ) 
            
    @staticmethod
    def exibir_lista(lista, frase):
        print(frase)
        for item in lista:
            print(item)