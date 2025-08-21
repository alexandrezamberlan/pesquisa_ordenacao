class Ordenacao:
    @staticmethod
    def bolha(lista):
        houve_troca = True
        qtd_comparacoes = 0
        qtd_trocas = 0
        while (houve_troca):    
            houve_troca = False
            for i in range (len(lista) - 1):
                qtd_comparacoes+=1
                if (lista[i] > lista[i+1]):
                    qtd_trocas+=1
                    houve_troca = True
                    tmp = lista[i]
                    lista[i] = lista[i+1]
                    lista[i+1] = tmp
                    
        return qtd_comparacoes, qtd_trocas #medem a complexidade do algoritmo
    
    @staticmethod
    def selecao(lista):
        qtd_comparacoes = 0
        qtd_trocas = 0
        for i in range(len(lista) - 1):
            posMenor = i
            for j in range(i+1, len(lista)):
                qtd_comparacoes+=1
                if (lista[j] < lista[posMenor]):
                    posMenor = j
            if (i != posMenor):
                qtd_trocas+=1
                tmp = lista[i]
                lista[i] = lista[posMenor]
                lista[posMenor] = tmp
                
        return qtd_comparacoes, qtd_trocas
    
    
    @staticmethod
    def insercao(lista):
        qtd_comparacoes = 0
        qtd_trocas = 0

        for i in range(1, len(lista)):
            tmp = lista[i]
            for j in range(i - 1, -2, -1):
                qtd_comparacoes+=1
                if (tmp < lista[j]):
                    lista[j + 1] = lista[j]
                    qtd_trocas+=1
                else:
                    break

            lista[j + 1] = tmp
            qtd_trocas+=1
            
        return qtd_comparacoes, qtd_trocas