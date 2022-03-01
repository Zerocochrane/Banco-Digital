import lombok.Getter;
import lombok.Setter;

public class PessoaJuridica extends Cliente{

    @Getter @Setter
    String CNPJ;

    public PessoaJuridica(String nome, String tipo) {
        super(nome, tipo);
    }
}
