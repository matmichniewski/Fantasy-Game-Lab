package enums;

public enum PetType {
    DRAGON(60),
    UNICORN(80),
    DONKEY(20);

    private final int resistance;

    PetType(int resistance){
        this.resistance = resistance;
    }

    public int getResistance(){
        return resistance;
    }
}
