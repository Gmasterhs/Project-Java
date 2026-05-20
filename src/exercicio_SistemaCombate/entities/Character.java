package exercicio_SistemaCombate.entities;

public abstract class Character
{
    private String name;
    private Integer level;
    private Double baseStrength;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getBaseStrength() {
        return baseStrength;
    }

    public void setBaseStrength(Double baseStrength) {
        this.baseStrength = baseStrength;
    }

     //Constructor

    public Character(String name, Integer level, Double baseStrength) {
        this.name = name;
        this.level = level;
        this.baseStrength = baseStrength;
    }

    //Methods

    public abstract Double calculateDamage();
}
