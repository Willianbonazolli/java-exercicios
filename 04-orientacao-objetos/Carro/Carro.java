public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Carro(String marca, String modelo, int ano, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void acelerar(double velocidade) {
        System.out.println("O carro acelerou para " + velocidade + " km/h.");
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem + " km");
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 15000);
        carro.exibirDetalhes();
        carro.acelerar(80);
    }
}
