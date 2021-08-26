import java.util.Random;
public class Util {
    public static void popular(int quantidade, ArrayList<Integer> lista) {
        Random gerador = new Random();
        for (int i = 0; i < quantidade; i++) {
            lista.add(gerador.nextInt(100));
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
