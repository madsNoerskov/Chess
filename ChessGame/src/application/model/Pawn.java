package application.model;

import java.util.HashMap;

public class Pawn extends Piece{


    public Pawn(String name, HashMap<Character, Integer> position) {
        super(name, position);
    }

    public void move(Character hPosition, int vPosition){
        int tempVPosition = position.get(hPosition);
        if ((tempVPosition + 2) < vPosition){
            position.put(hPosition, vPosition);
        }
    }

    public void kill(Character hPosition, int vPosition){

    }

}
