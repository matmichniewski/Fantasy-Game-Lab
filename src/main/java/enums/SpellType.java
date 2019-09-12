package enums;

public enum SpellType {
    LIGHTNINGSTRIKE(30),
    FIREBALL(50),
    ACIDSPLASH(30);

    private final int damage;

    SpellType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
