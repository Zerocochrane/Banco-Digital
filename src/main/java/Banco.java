import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco{

    private String nome;
    private List<Conta> contas = new ArrayList<Conta>();

    List<Integer> itens = Arrays.asList( 11, 10, 16, 5, 85 );

    public String getNome() {
        return nome;
    }
    public List<Conta> getContas() {
        return contas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    for(Integer item : itens){
        System.out.print(item);
    }

}
