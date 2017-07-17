package model;
import java.util.*;

/**
 * Created by Ameya on 7/16/17.
 */

public class player extends user {

    String name;
    character Character;
    ArrayList<character> characterList;

    public player(String username, String name) {
        super(username);
        this.name = name;
        this.characterList = new ArrayList<character>();
    }

    public character createCharacter(String name, String charClass){

        character new_Character = new character(name, charClass);
        this.characterList.add(new_Character);
        return new_Character;
    }

    public character getCharacter(){
        return this.Character;
    }
}
