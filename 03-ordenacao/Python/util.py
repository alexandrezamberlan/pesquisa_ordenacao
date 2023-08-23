import random
import time
import os

from ordenacao import Ordenacao

class Util:
    @staticmethod
    def menu(listas):       
        os.system("cls")
        print("1 - Gerar numeros aleatorios")
        print("2 - Carregar numeros de arquivo")
        opcao = input("Opção: ")
        if (opcao == "1"):
            quantidade_numeros = int(input("Quantidade de numeros: "))
            for lista in listas:
                Util.popular_lista(lista, quantidade_numeros)                
        elif (opcao == "2"):
            nome_arquivo = input("Nome do arquivo: ")
            Util.popular_lista_arquivo(listas, nome_arquivo)   

    @staticmethod
    def popular_lista_arquivo(listas, nome_arquivo):
        leitor = open(nome_arquivo, "r")
        for linha in leitor:
            for i in listas:
                i.append(int(linha))

        leitor.close()

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

        # tempoInicio = time.time()
        # Ordenacao.bolha(listas[1])
        # tempoFim = time.time()
        # print("Tempo de processamento do Bolha: ", (tempoFim - tempoInicio) , "s")        

        # tempoInicio = time.time()
        # Ordenacao.selecao(listas[2])
        # tempoFim = time.time()
        # print("Tempo de processamento do Seleção: ", (tempoFim - tempoInicio) , "s")        
        # # Util.exibir_lista(listas[2])

        # tempoInicio = time.time()
        # Ordenacao.insercao(listas[3])
        # tempoFim = time.time()
        # print("Tempo de processamento do Inserção: ", (tempoFim - tempoInicio) , "s")        
        # # Util.exibir_lista(listas[3])

        tempoInicio = time.time()
        Ordenacao.pente(listas[1])
        tempoFim = time.time()
        print("Tempo de processamento do pente: ", (tempoFim - tempoInicio) , "s")        
        # Util.exibir_lista(listas[1])
        

        
