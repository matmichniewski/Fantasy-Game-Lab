package players;

import behaviors.IDefend;
import enums.TreasureType;

import java.util.ArrayList;

public abstract class Creature {

    private String name;
    public int health;
    private String type;
    private ArrayList<TreasureType> items;

    public Creature(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        this.items = new ArrayList<TreasureType>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getType() {
        return type;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int countItems() {
        return this.items.size();
    }

    public int takeDamage(int damage) {
        return this.health -= damage;
    }

    public void addTreasure(TreasureType treasure) {
        this.items.add(treasure);
    }
}
