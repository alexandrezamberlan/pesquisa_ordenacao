class Pessoa:
    #construtor
    def __init__(self, nome,idade):
        self.nome = nome
        self.idade = idade

    def __str__(self):
        return "Pessoa{nome= %s. idade= %s}" % (self.nome, self.idade)
    
    