package players;

import behaviors.IDefend;
import behaviors.IHeal;
import enums.HealingType;

public class Cleric extends Creature implements IHeal, IDefend {

    private HealingType medicine;

    public Cleric(String name, int health, String type, HealingType medicine){
        super(name, health, type);
        this.medicine = medicine;
    }

    public int heal(Creature cleric){
        return this.health += medicine.getHealing();
    }

    public int defend(int damage){
        return this.health -= damage;
    }


}
