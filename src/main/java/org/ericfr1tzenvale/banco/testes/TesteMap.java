import java.util.HashMap;
import java.util.Map;
import org.ericfr1tzenvale.banco.model.Conta;
import org.ericfr1tzenvale.banco.model.ContaCorrente;
import org.ericfr1tzenvale.banco.model.ContaPoupanca;

public class TesteMap {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente c1 = new ContaCorrente("Juarez", 121212, 2000);
        ContaCorrente c2 = new ContaCorrente("Palbo", 212121, 23231);

        // Mapa sem generics (necessita cast)
        Map map = new HashMap();
        map.put("diretor", c1);
        map.put("gerente", c2);

        ContaCorrente contaExtraida = (ContaCorrente) map.get("diretor");
        System.out.println("Extraído sem Generics com cast:");
        System.out.println(contaExtraida);

        // Mapa com generics (seguro e sem cast)
        Map<String, Conta> mapGenerics = new HashMap<>();
        ContaCorrente c3 = new ContaCorrente("Pablio", 212121, 23231);
        ContaPoupanca cp = new ContaPoupanca(2000, 121212, "Mel");

        mapGenerics.put("funcionario", c3);
        mapGenerics.put("chefe", cp);

        // Iterando sobre os valores do mapa
        System.out.println("\nExtraído usando Generics:");
        mapGenerics.values().forEach(conta -> System.out.println(conta));

        // Alternativamente, usando Map.Entry
        System.out.println("\nIterando com Map.Entry:");
        mapGenerics.forEach((chave, conta) -> 
            System.out.println(chave + ": " + conta.getSaldo())
        );
    }
}
