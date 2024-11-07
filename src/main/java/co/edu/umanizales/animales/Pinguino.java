package co.edu.umanizales.animales;

public class Pinguino implements Respira, Camina, Nada {
    @Override
    public void respirar() {
        System.out.println("El pingüino respira aire.");
    }

    @Override
    public void caminar() {
        System.out.println("El pingüino se tambalea al caminar.");
    }

    @Override
    public void nadar() {
        System.out.println("El pingüino nada con agilidad en el agua.");
    }
}

