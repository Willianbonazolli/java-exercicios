public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        }

        System.out.println("Saldo insuficiente ou valor inválido.");
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", 12345, 500.0);

        conta.mostrarDados();
        conta.depositar(250.0);
        conta.sacar(100.0);
        System.out.println("Saldo final: R$ " + conta.consultarSaldo());
    }
}
