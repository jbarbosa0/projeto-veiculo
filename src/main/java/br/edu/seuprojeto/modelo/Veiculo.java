package br.edu.seuprojeto.modelo;

public abstract class Veiculo { // Usamos abstract para que a classe não seja instanciada diretamente

    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano);
    }
    
    // Método abstrato que será sobrescrito nas subclasses
    public abstract void realizarManutencao();

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // ... (adicione os demais getters e setters)
}