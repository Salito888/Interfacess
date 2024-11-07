package co.edu.umanizales.animales;

public class Main {
    public static void main(String[] args) {
        Gallina gallina = new Gallina();
        gallina.respirar();
        gallina.caminar();

        Pinguino pinguino = new Pinguino();
        pinguino.respirar();
        pinguino.caminar();
        pinguino.nadar();

        Caballo caballo = new Caballo();
        caballo.respirar();
        caballo.caminar();

        Serpiente serpiente = new Serpiente();
        serpiente.respirar();
        serpiente.deslizar();
    }
}
