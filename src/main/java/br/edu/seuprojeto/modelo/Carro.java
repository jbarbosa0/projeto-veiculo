package br.edu.seuprojeto.modelo;

public class Carro extends Veiculo {

    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    // Sobrescrita do método da superclasse
    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção completa no carro: óleo, filtros e alinhamento.");
    }

    public void ligarLimpadorDeParabrisa() {
        System.out.println("Limpador de para-brisa do carro ligado.");
    }

    // Getters e Setters
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", numeroPortas=" + numeroPortas +
                '}';
    }
}
