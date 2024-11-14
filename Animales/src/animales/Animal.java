package animales;

public abstract class Animal {
    protected String sonido;
    protected String alimentacion;
    protected String habitat;
    protected String nombreCientifico;

    public abstract String getSonido();
    public abstract String getAlimentacion();
    public abstract String getHabitat();
    public abstract String getNombreCientifico();
}