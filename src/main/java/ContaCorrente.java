public class ContaCorrente extends Conta {

    @Override
    public void extrato() {
        System.out.println("=== Estrato da Conta Corrente ===");
        super.imprimirInfoComum();
    }

}
