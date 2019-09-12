package players;

import behaviors.IAttack;
import behaviors.IDefend;
import enums.ArmourType;
import enums.WeaponType;

public class Knight extends Creature implements IAttack {

    private WeaponType weapon;
    private ArmourType armour;

    public Knight(String name, int health, String type, WeaponType weapon, ArmourType armour) {
        super(name, health, type);
        this.weapon = weapon;
        this.armour = armour;
    }

    public int attack(){
        return this.weapon.getDamage();
    }

    public int defend(int damage){
        if(armour.getResistance() >= damage){
            return this.health;
        } else {
        return this.health -= damage;
        }
    }
}
