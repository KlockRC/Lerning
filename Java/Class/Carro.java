
public class Carro {
    private String modelo;
    private String cor;
    private String placa;
    private String ano;
    private Double velocidade;

    public Carro(String modelo, String cor, String placa, String ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.ano = ano;
        this.velocidade = 0.0;
    }
    public void acelerar(double aumento) {
        if (aumento > 0) {
            this.velocidade += aumento;
            System.out.println(this.modelo + " acelerado com " + aumento);
        }
    }
    public String getModelo() {
        return this.modelo;
    }
}
