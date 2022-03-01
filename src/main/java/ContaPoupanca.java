public class ContaPoupanca extends Conta {

    @Override
    public void extrato() {
        System.out.println("=== Estrato da Conta Poupança ===");
        super.imprimirInfoComum();
    }

}
