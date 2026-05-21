package exercicio_SistemaCombate.entities;

public class Mystic extends Caracter
{
    private Double focusBonus;

    //Constructor

    public Mystic(String name, Integer level, Double baseStrength, Double focusBonus) {
        super(name, level, baseStrength);
        this.focusBonus = focusBonus;
    }

    //Gettsrs and Seters

    public Double getFocusBonus() {
        return focusBonus;
    }

    public void setFocusBonus(Double focusBonus) {
        this.focusBonus = focusBonus;
    }

    // Methods
    @Override
    public Double calculateDamage() {
        return (getBaseStrength() * getLevel() + focusBonus*1.5);
    }
}
