import random

# ==========================================
# 1. MODEL (Regras de Negócio e Dados)
# ==========================================
class ListaModel:
    """Responsável por gerenciar os dados e a geração das listas."""
    
    def __init__(self):
        self.lista_aleatoria = []
        self.lista_sequencial = []

    def popular_lista_aleatoria(self, quantidade: int, inicio: int, fim: int) -> None:
        """Gera números aleatórios dentro de uma faixa."""
        self.lista_aleatoria = [random.randint(inicio, fim - 1) for _ in range(quantidade)]

    def popular_lista_sequencial(self, quantidade: int, inicio: int) -> None:
        """Gera números sequenciais crescentes."""
        self.lista_sequencial = list(range(inicio, quantidade))

    def get_lista_aleatoria(self) -> list:
        return self.lista_aleatoria

    def get_lista_sequencial(self) -> list:
        return self.lista_sequencial