package co.edu.umanizales.animales;

public class Gallina implements Respira, Camina {
    @Override
    public void respirar() {
        System.out.println("La gallina respira aire.");
    }

    @Override
    public void caminar() {
        System.out.println("La gallina está caminando por el corral.");
    }
}
