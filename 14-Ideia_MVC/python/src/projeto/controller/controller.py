# ==========================================
# 3. CONTROLLER (Orquestrador do Sistema)
# ==========================================
import time

# Importa a classe do arquivo dentro da pasta model
from model.model import ListaModel

# Importa a classe do arquivo dentro da pasta view
from view.view import TerminalView

class MedicaoTempoController:
    """Responsável por unir o Model e a View, além de medir o tempo."""

    def __init__(self):
        self.model = ListaModel()
        self.view = TerminalView()

    def executar(self) -> None:
        """Executa o fluxo principal do programa imitando o 'main' do Java."""
        
        # Rotina 1: Números Aleatórios
        tempo_inicio = time.perf_counter_ns()
        self.model.popular_lista_aleatoria(quantidade=100000, inicio=100, fim=100000)
        tempo_fim = time.perf_counter_ns()
        
        # Calcula a diferença e converte de nanosegundos para milisegundos
        tempo_ms_1 = (tempo_fim - tempo_inicio) / 1_000_000
        self.view.exibir_tempo_rotina(1, tempo_ms_1)
        
        # Descomente abaixo se quiser exibir a lista gerada:
        # self.view.exibir_lista(self.model.get_lista_aleatoria(), "Lista aleatória:")

        # Rotina 2: Números Sequenciais
        tempo_inicio = time.perf_counter_ns()
        self.model.popular_lista_sequencial(quantidade=100000, inicio=1)
        tempo_fim = time.perf_counter_ns()
        
        tempo_ms_2 = (tempo_fim - tempo_inicio) / 1_000_000
        self.view.exibir_tempo_rotina(2, tempo_ms_2)
        
        # Descomente abaixo se quiser exibir a lista gerada:
        # self.view.exibir_lista(self.model.get_lista_sequencial(), "Lista sequencial:")