package model;
import java.util.*;

/**
 * Created by Ameya on 7/16/17.
 */

public class session {
    String name;
    String password;
    ArrayList<player> playerList;

    public session(String name, String password) {
        this.name = name;
        this.password = password;
        this.playerList = new ArrayList<player>();

    }

    public void addPlayer(player player){
        playerList.add(player);
    }
}