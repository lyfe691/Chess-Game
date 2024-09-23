package piece;

import main.GamePanel;

public class Bishop extends Piece {
    public Bishop(int color, int row, int col) {
        super(color, row, col);

        if (color == GamePanel.WHITE) {
            image = getImage("/piece/w-bishop");
        } else {
            image = getImage("/piece/b-bishop");
        }
    }
}
