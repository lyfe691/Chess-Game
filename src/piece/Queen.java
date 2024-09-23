package piece;

import main.GamePanel;

public class Queen extends Piece {
    public Queen(int color, int row, int col) {
        super(color, row, col);

        if (color == GamePanel.WHITE){
            image = getImage("/piece/w-queen");
        } else {
            image = getImage("/piece/b-queen");
        }
    }
}
