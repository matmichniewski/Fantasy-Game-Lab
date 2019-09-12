package rooms;

import enums.EnemyType;
import enums.TreasureType;

import java.util.ArrayList;

public class DragonTower {

    private String name;
    private ArrayList<TreasureType> items;
    private EnemyType enemy;

    public DragonTower(String name, EnemyType enemy){
        this.name = name;
        this.enemy = enemy;

    }
}
