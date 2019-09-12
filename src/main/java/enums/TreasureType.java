package enums;

public enum TreasureType {
    GOLD(5),
    BREAD(3),
    COFFEEBEANS(8);

    private final int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
