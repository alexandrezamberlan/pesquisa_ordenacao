
from util import Util

lista = []
lista_bolha = []
lista_selecao = []
lista_insercao = []
lista_pente = []

minhas_listas = []
minhas_listas.append( lista )
#minhas_listas.append( lista_bolha )
#minhas_listas.append( lista_selecao )
#minhas_listas.append( lista_insercao )
minhas_listas.append( lista_pente )

#rotinas de popular lista: numeros aleatorios ou numeros de arquivos
Util.menu( minhas_listas )

#ordenar temporizando
Util.ordenar( minhas_listas )
