package enums;

public enum HealingType {
    HERBS(20),
    POTION(60),
    BANDAID(10),
    WHISKY(100);

    private final int healing;

    HealingType(int healing){
        this.healing = healing;
    }

    public int getHealing(){
        return healing;
    }
}
