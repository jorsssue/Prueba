package animales;

public class Gato extends Animal{

    @Override
    public String getAlimentacion() {
        return "Ratones";
    }

    @Override
    public String getHabitat() {
        return "Doméstico";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }

    @Override
    public String getSonido() {
        return "maullido";
    }
    
}
