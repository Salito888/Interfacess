package co.edu.umanizales.animales;

public class Serpiente implements Respira {
    @Override
    public void respirar() {
        System.out.println("La serpiente respira aire.");
    }

    // Método exclusivo de la serpiente
    public void deslizar() {
        System.out.println("La serpiente se desliza sigilosamente.");
    }
}

