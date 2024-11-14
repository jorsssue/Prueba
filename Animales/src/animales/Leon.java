package animales;

public class Leon extends Felino {

    @Override
    public String getAlimentacion() {
        return "Carnivora";
    }

    @Override
    public String getHabitat() {
        return "Pradera";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }

    @Override
    public String getSonido() {
        return "Rugido";
    }
    
}
