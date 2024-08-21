import java.util.ArrayList;
import java.util.Random;


public class PrincipalOrdenaAlunos {
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        Random gerador = new Random();
        Aluno um = new Aluno(Util.gerarPalavra(10), gerador.nextInt(18,70));
    }
}
