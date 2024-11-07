package co.edu.umanizales.animales;

public class Caballo implements Respira, Camina {
    @Override
    public void respirar() {
        System.out.println("El caballo respira aire.");
    }

    @Override
    public void caminar() {
        System.out.println("El caballo está trotando en el campo.");
    }
}

