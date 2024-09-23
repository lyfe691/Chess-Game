package piece;

import main.GamePanel;

public class Knight extends Piece {
    public Knight(int color, int row, int col) {
        super(color, row, col);

        if (color == GamePanel.WHITE){
            image = getImage("/piece/w-knight");
        } else {
            image = getImage("/piece/b-knight");
        }
    }
}
