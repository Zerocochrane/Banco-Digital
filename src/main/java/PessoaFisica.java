import lombok.Getter;
import lombok.Setter;

public class PessoaFisica  extends Cliente{

    @Getter @Setter
    String CPF;

    public PessoaFisica(String nome, String tipo) {
        super(nome, tipo);
    }
}
