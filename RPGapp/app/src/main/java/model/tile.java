package model;

import java.util.ArrayList;

/**
 * Created by Ameya on 7/16/17.
 */

public class tile {

    ArrayList<item> tileItems;
    ArrayList<character> tileCharacters;
    ArrayList<tile> tileNeigbours;

    public tile() {
        this.tileCharacters = new ArrayList<character>();
        this.tileItems = new ArrayList<item>();
        this.tileNeigbours = new ArrayList<tile>();
    }

    public void addCharacter() {}

    public void removeCharacter() {}

    public void addItem() {}

    public void removeItem() {}

}
