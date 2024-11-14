package animales;

public class Perro extends Canido {

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Doméstica";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }
    
}
