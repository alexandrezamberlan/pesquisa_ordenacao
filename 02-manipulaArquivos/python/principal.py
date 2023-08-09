from util import Util
from ordenacao import Ordenacao

alunos = []
Util.ler_arquivo_popular_lista(alunos)
Ordenacao.bolha(alunos)
Util.exibir_lista(alunos)

