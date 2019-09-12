package players;

import behaviors.IAttack;
import enums.PetType;
import enums.SpellType;

public class Wizard extends Creature {

    private SpellType spell;
    private PetType pet;

    public Wizard(String name, int health, String type) {
        super(name, health, type);
        this.pet = pet;
        this.spell = spell;
    }


}
