package animales;

public class Lobo extends Animal {

    @Override
    public String getAlimentacion() {
        return "Carnívora";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }

    @Override
    public String getSonido() {
        return "Aullido";
    }
    
}
