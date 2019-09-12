package rooms;

import enums.EnemyType;
import enums.TreasureType;

import java.util.ArrayList;

public class HallOfGlory {

    private String name;
    private ArrayList<TreasureType> items;
    private EnemyType enemy;

    public HallOfGlory(String name, EnemyType enemy){
        this.name = name;
        this.items = new ArrayList<TreasureType>();
    }
}
