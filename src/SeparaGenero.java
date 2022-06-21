import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

public class SeparaGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> entradaTeclado = null;
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        System.out.println("Digite os dados <nome - genero> separados por vírgula:");
        String entrada = scanner.nextLine();

        entradaTeclado = Arrays.asList(entrada.replaceAll("\\s+","").split(","));


        for (String nome : entradaTeclado) {
            if (nome.trim().toLowerCase(Locale.ROOT).contains("-m")) {
                masculino.add(nome);
            } else {
                feminino.add(nome);
            }
        }

        System.out.println("HOMENS:");
        for (String h: masculino) {
            System.out.println(h);
        }

        System.out.println();
        System.out.println("MULHERES:");
        for (String m: feminino) {
            System.out.println(m);
        }
        System.out.println("-----------------------");
    }
}
