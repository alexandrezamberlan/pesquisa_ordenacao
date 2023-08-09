from aluno import Aluno

class Util:
    @staticmethod
    def exibir_lista(alunos):
        for item in alunos:
            print(item)

    @staticmethod
    def ler_arquivo_popular_lista(alunos):
        try:
            nome_arquivo = input("Informe caminho e nome do arquivo base:")
            leitor = open(nome_arquivo, "r", encoding='utf8')
            for linha in leitor:
                vetor_linha = linha.split(";")
                alunos.append(Aluno(vetor_linha[0], int(vetor_linha[1])))
            
            leitor.close()
        except:
            print("Arquivo inexistente ou problema de leitura.. Digite novamente\n")
            Util.ler_arquivo_popular_lista(alunos)