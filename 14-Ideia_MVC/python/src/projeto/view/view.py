# ==========================================
# 2. VIEW (Interface com o Usuário / Terminal)
# ==========================================
class TerminalView:
    """Responsável apenas por exibir dados no terminal."""

    @staticmethod
    def exibir_tempo_rotina(numero_rotina: int, tempo_ms: float) -> None:
        """Exibe o tempo de execução formatado."""
        print(f"Tempo (ms) rotina {numero_rotina}: {tempo_ms:.2f}")

    @staticmethod
    def exibir_lista(lista: list, frase: str) -> None:
        """Exibe o conteúdo de uma lista e o total de registros."""
        print(frase)
        for item in lista:
            print(item)
        print("--------------------------")
        print(f"Total de registros: {len(lista)}")