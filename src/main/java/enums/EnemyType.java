package enums;

public enum EnemyType {
    TROLL(40),
    ORC(60),
    EVILWIZZARD(90),
    WITCH(50);

    private final int damage;

    EnemyType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
