package piece;

import main.GamePanel;

public class King extends Piece {
    public King(int color, int row, int col) {
        super(color, row, col);

        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-king");
        } else {
            image = getImage("/piece/b-king");
        }
    }
}
