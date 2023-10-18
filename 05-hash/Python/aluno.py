class Aluno:
    def __init__(self, matricula, nome):
        self.matricula = matricula
        self.nome = nome
        
    def __eq__(self, other):
        if isinstance(other, Aluno):
            return self.matricula == other.matricula
        return False
    
    def __gt__(self, other):
        if self.matricula == other.matricula:
            return self.nome > other.nome
        return self.matricula > other.matricula
    
    def __str__(self):
        return "Aluno{" + "matricula=" + str(self.matricula) + ", nome=" + self.nome + '}'
    
    def __hash__(self):    
        return hash((self.matricula))