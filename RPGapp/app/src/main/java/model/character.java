package model;
import java.util.*;

/**
 * Created by Ameya on 7/16/17.
 */

public class character {

    String name;
    String charClass;
    //itemList items[];
    public ArrayList<item> itemList;

    // Stats for characters needs to be instantiated here as well


    public character(String name, String charClass){
        this.name = name;
        this.charClass = charClass;
        // New character instantiated with empty inventory
        ArrayList<item> myList = new ArrayList<item>();
        this.itemList = new ArrayList<item>();
    }


    // Functions following this line haven't been implemented
    // Their return types and parameters are subject to change
    public void Attack() {}

    public void Trade() {}

    public void removeItem() {}

    public void addItem() {}

    public void displayInventory() {}


}


