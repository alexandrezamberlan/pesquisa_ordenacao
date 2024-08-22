class Ordenacao:
    @staticmethod
    def bolha(lista=[]):
        houveTroca = True
        while (houveTroca):
            houveTroca = False
            for i in range(0, len(lista) -1):
                if (lista[i] > lista[i + 1]):
                    houveTroca = True
                    aux = lista[i]
                    lista[i] = lista[i + 1]
                    lista[i + 1] = aux

    @staticmethod
    def insercao(lista=[]):   
        for i in range(1, len(lista)):
            aux = lista[i]
            for j in range(i-1, 0, -1):
                if (aux >= lista[j]):
                    break
                lista[j+1] = lista[j]
            
            lista[j+1] = aux #momento da insercao
