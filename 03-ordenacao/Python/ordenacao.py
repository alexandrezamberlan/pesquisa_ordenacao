#contem os metodos estaticos de ordenacao
class Ordenacao:
    @staticmethod
    def bolha(lista):
        houveTroca = True
        while (houveTroca):
            houveTroca = False
            for i in range(0, len(lista) - 1):
                if (lista[i] > lista[i+1]):
                    houveTroca = True
                    tmp = lista[i]
                    lista[i] = lista[i+1]
                    lista[i+1] = tmp

#     public static void selecao(ArrayList<Integer> lista) {
#         /*
#          *  Instável
#             Memória Interna
#             Alta complexidade (muito esforço) - O(n^2)
#             A estrutura possui 2 partes/porções (1a é a ordenada 2a parte é a desordenada)
#             Adequado para vetores e listas

#             Trabalha com conceito de trocas não contíguas. É considerado seleção porque ele seleciona os menores para
#             o início da estrutura
#          */
#         int i,j
#         int posMenor
#         int tmp
#         for (i = 0 i < lista.size() - 1 i++) {
#             posMenor = i
#             for (j = i+1; j < lista.size(); j++) {
#                 if (lista.get(j) < lista.get(posMenor)) {
#                     posMenor = j;
#                 }
#             }
#             if (i != posMenor) {
#                 tmp = lista.get(i);
#                 lista.set(i, lista.get(posMenor));
#                 lista.set(posMenor, tmp);
#             }
#         }
#     }

#     public static void insercao(ArrayList<Integer> lista) {
#         int i, j, tmp;
    
#         for (i = 1; i < lista.size(); i++) {
#             tmp = lista.get(i);
#             for (j = i - 1; j >= 0; j--) {
#                 if (tmp < lista.get(j)) {
#                     lista.set(j + 1, lista.get(j));
#                 } else break;
#             }
#             lista.set(j + 1, tmp);
#         }
#     }

# }




