import lombok.Getter;
import lombok.Setter;

public abstract class Cliente implements iCliente{

    @Getter @Setter
    protected String nome;
    @Getter @Setter
    protected String tipo;

    public Cliente(String nome, String tipo) {
        this.tipo = tipo;
        this.nome = nome;
    }

    @Override
    public Conta abrirContaCorrente() {
        Conta cc = new ContaCorrente(this);
        return cc;
    }

    @Override
    public Conta abrirContaPoupanca() {
        Conta cp = new ContaPoupanca(this);
        return cp;
    }
}
