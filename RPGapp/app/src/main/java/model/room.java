package model;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Ameya on 7/16/17.
 */

public class room {

    // This class needs to change..

    ArrayList<tile> tilesList;
    int x_size;
    int y_size;
    String name;


    void room(int x, int y, String name){
        this.x_size = x;
        this.y_size = y;
        this.name = name;

        createRoom();

    }

    // This function would need to handle creating an arrayList of tiles..
    public void createRoom() {}


}
