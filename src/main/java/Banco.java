import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Banco{

    @Getter @Setter
    private String nome;
    @Getter @Setter
    private List<Conta> contas = new ArrayList<Conta>();

    public Banco(String nome){
        this.nome = nome;
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    public void imprimirClientes(){
        System.out.println("=== Lista de clientes na agência: " + nome +   " === ");
        for(Conta conta : contas){
            System.out.println("Nome: " + conta.getCliente().getNome() + " Tipo: " + conta.getCliente().getTipo());
        }
    }
}
