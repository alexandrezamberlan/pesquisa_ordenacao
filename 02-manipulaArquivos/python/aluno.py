class Aluno:
    #metodo construtor
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade
        self.gerar_email()

    def gerar_email(self):
        vetor_palavras = self.nome.split(" ")
        if (len(vetor_palavras) > 1):
            self.email = vetor_palavras[0].lower() + "." + vetor_palavras[1].lower() + "@ufn.edu.br"
        else:
            self.email = vetor_palavras[0].lower() + "@ufn.edu.br"
    
    #override do toString
    def __str__(self):
        return self.nome + " - " + self.email
    