package piece;

import main.GamePanel;

public class Pawn extends Piece {
    public Pawn(int color, int row, int col) {
        super(color, row, col);

        // call the images
        if(color == GamePanel.WHITE){
            // no need to add png sice its already decalred in the String Path in the Piece Class
            image = getImage("/piece/w-pawn");
        } else {
            image = getImage("/piece/b-pawn");
        }

    }
}
