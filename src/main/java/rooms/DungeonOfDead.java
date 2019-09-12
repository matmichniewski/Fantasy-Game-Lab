package rooms;

import enums.EnemyType;
import enums.TreasureType;

import java.util.ArrayList;

public class DungeonOfDead {

    private String name;
    private ArrayList<TreasureType> items;
    private EnemyType enemy;

    public DungeonOfDead(String name, EnemyType enemy){
        this.name = name;
        this.items = new ArrayList<TreasureType>();
    }
}
