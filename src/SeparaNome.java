import java.util.*;;

public class SeparaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a lista de nomes separado por vírgula: ");
        String listaRecebida = scanner.nextLine(); //pega a lista de nomes

        String[] listaSeparada = listaRecebida.split(",");//separa por ,
        List<String> listaOrdenada = new ArrayList<>(Arrays.asList(listaSeparada));//converte para um arrayList
        Collections.sort(listaOrdenada); //ordena.

        //imprime
        for (String nome : listaOrdenada) {
            System.out.println(nome.trim());// trim usado para remover espaços
        }
    }
}
