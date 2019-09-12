package enums;

public enum WeaponType {
    SWORD(40),
    HARDSOCK(25),
    AXE(60),
    MACHETE(50),
    CROSSBOW(70),
    DAGGER(45),
    BAT(20),
    BRICK(5),
    HOTTAR(35);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

}
