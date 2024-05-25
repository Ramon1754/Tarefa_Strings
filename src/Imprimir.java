import java.util.List;
import java.util.stream.Collectors;

public class Imprimir {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoa();

        lista.stream()
                .forEach(pessoa -> System.out.println(pessoa));

        System.out.println("********");
        System.out.println("********");

        List<Pessoa> listaFeminino = lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());

        listaFeminino.forEach(System.out::println);
    }
}
