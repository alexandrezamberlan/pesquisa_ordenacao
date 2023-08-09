class Peca:
    def __init__(self, codigo, descricao, categoria):
        self.codigo = codigo
        self.descricao = descricao
        self.categoria = categoria

    def __eq__(self, other):
        if isinstance(other, Peca):
            return self.codigo == other.codigo
        return False
    
    def __gt__(self, other):
        if self.codigo == other.codigo:
            return self.descricao > other.descricao
        return self.codigo > other.codigo
    
    def __str__(self):
        return "Peca{" + "codigo=" + self.codigo + ", descricao=" + self.descricao + ", categoria=" + self.categoria + '}'
    
    def __hash__(self):
        return hash((self.codigo, self.descricao))