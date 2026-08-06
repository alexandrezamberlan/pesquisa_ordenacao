# ==========================================
# PONTO DE ENTRADA (Execução)
# ==========================================

# Importa o controller a partir da pasta dele
from controller.controller import MedicaoTempoController

if __name__ == "__main__":
    programa = MedicaoTempoController()
    programa.executar()