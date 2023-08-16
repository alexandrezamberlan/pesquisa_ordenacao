import random
import time

from ordenacao import Ordenacao

class Util:
    @staticmethod
    def menu(listas):       
        print("1 - Gerar numeros aleatorios")
        print("2 - Carregar numeros de arquivo")
        opcao = input("Opção: ")
        if (opcao == "1"):
            quantidade_numeros = int(input("Quantidade de numeros: "))
            for lista in listas:
                Util.popular_lista(lista, quantidade_numeros)                
        elif (opcao == "2"):
            nomeArquivo = input("Nome do arquivo: ")

    @staticmethod
    def popular_lista(lista, n):        
        for i in range(n):
            lista.append(random.randint(0, 1000))

    
    @staticmethod
    def exibir_lista(lista):
        for i in lista:
            print(i)
        
    @staticmethod
    def ordenar(listas):                
        tempoInicio = time.time()
        listas[0].sort()
        tempoFim = time.time()
        print("Tempo de processamento do sort do Python: ", (tempoFim - tempoInicio) , "s")        

        tempoInicio = time.time()
        Ordenacao.bolha(listas[1])
        tempoFim = time.time()
        print("Tempo de processamento do Bolha: ", (tempoFim - tempoInicio) , "s")        
        
