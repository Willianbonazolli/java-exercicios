public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    public Veiculo(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(double incremento) {
        this.velocidade += incremento;
        System.out.printf("Acelerando... velocidade atual: %.1f km/h%n", this.velocidade);
    }

    public void frear(double decremento) {
        this.velocidade = Math.max(0, this.velocidade - decremento);
        System.out.printf("Freando... velocidade atual: %.1f km/h%n", this.velocidade);
    }

    public void exibirDados() {
        System.out.println("Modelo    : " + modelo);
        System.out.println("Marca     : " + marca);
        System.out.println("Ano       : " + ano);
        System.out.printf("Velocidade: %.1f km/h%n", velocidade);
    }

    public static void main(String[] args) {
        Veiculo v = new Veiculo("Civic", "Honda", 2023);
        v.exibirDados();
        v.acelerar(60);
        v.acelerar(40);
        v.frear(30);
        v.frear(100); // não passa de 0
    }
}
