import random

class Util:
    """ Classe com métodos estáticos para gerar números e/ou palavras aleatórios
    """
     
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