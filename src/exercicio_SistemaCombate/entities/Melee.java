package exercicio_SistemaCombate.entities;

public class Melee extends Caracter
{
    private Double weaponBonus;

    //Construtores

    public Melee(String name, Integer level, Double baseStrength, Double weaponBonus) {
        super(name, level, baseStrength);
        this.weaponBonus = weaponBonus;
    }

    //Gettsrs and Setters

    public Double getWeaponBonus() {
        return weaponBonus;
    }

    public void setWeaponBonus(Double weaponBonus) {
        this.weaponBonus = weaponBonus;
    }

    //Methods

    @Override
    public Double calculateDamage()
    {
        return (getBaseStrength() * getLevel()) + weaponBonus;
    }
}

