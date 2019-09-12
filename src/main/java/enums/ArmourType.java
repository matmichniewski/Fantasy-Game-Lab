package enums;

public enum ArmourType {
    SILVERSHIELD(30),
    DIAMONDSHIELD(80),
    ADAMANTIUMARMOUR(91);

    private final int resistance;

    ArmourType(int resistance){
        this.resistance = resistance;
    }

    public int getResistance(){
        return resistance;
    }


}
