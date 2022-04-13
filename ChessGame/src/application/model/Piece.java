package application.model;

import java.util.HashMap;
import java.util.Set;

public class Piece {

    private String name;
    public HashMap<Character, Integer> position;

    public Piece(String name, HashMap<Character, Integer> position){
        this.name = name;
        position = new HashMap<>();
    }

    public String getName(){return this.name;}

    public String toString(){
        return this.name;
    }
}
