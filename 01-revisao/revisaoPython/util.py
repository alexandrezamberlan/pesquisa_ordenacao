import random

class Util:
    """ Classe com métodos estáticos para gerar números e/ou palavras aleatórios
    """

    @staticmethod
    def gerar_palavras_arquivo(nome_arquivo, quantidade, tamanho):
        # Abrindo o arquivo em modo de escrita ('w'). 
        # Isso cria o arquivo se ele não existir ou o sobrescreve se ele já existir.
        with open(nome_arquivo, 'w', encoding='utf-8') as arquivo:
            for i in range(0,quantidade):
                arquivo.write( Util.gerar_palavra(tamanho) + '\n' )            

        print(f"As palavras foram salvas em {nome_arquivo}.")

    @staticmethod
    def gerar_numeros_arquivo(nome_arquivo, quantidade, tamanho):
        # Abrindo o arquivo em modo de escrita ('w'). 
        # Isso cria o arquivo se ele não existir ou o sobrescreve se ele já existir.
        with open(nome_arquivo, 'w', encoding='utf-8') as arquivo:
            for i in range(0,quantidade):
                arquivo.write( str(random.randint(0,tamanho)) + '\n' )            

        print(f"Os números foram salvos em {nome_arquivo}.")

    @staticmethod
    def gerar_numeros_lista(lista, quantidade, tamanho):
        """ Método estático que popula um lista com números inteiros aleatórios

        Args:
            lista (int): contém os números gerados
            quantidade (int): quantos números se deseja gerar
            tamanho (int): quantidade de dígitos do número a ser gerado
        """
        for i in range(0,quantidade):
            lista.append( random.randint(0,tamanho) )
     
    @staticmethod
    def gerar_palavra(tamanho):
        """ Método estático que gera uma palavra aleatória a partir de um tamanho

        Args:
            tamanho (int): quantidade de caracteres da palavra
        """
        letras = 'abcdefghijklmnopqrstuvwxyz '
        palavra = ''
        
        for i in range(0,tamanho):
            letra_sorteada = letras[ random.randint(0,len(letras)-1) ]            
            palavra += str(letra_sorteada)
        
        return palavra

    @staticmethod
    def gerar_palavras_lista(lista, quantidade, tamanho):
        """ Método estático que popula um lista com palavras aleatórias

        Args:
            lista (string): contém as palavras geradas
            quantidade (int): quantas palavras se deseja gerar
            tamanho (int): quantidade de caracteres da palavra a ser gerada
        """
        for i in range(0,quantidade):
            lista.append( Util.gerar_palavra(tamanho) )

    @staticmethod
    def exibir(lista, frase):
        """ Método estático que exibe elemento de qualquer lista

        Args:
            lista (generica): contém números ou palavras
            frase (string): título a ser exibido pelo método
        """
        print(frase)
        for item in lista:
            print(item)