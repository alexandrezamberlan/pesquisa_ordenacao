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
