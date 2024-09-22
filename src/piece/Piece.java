package piece;

import main.Board;

import java.awt.image.BufferedImage;

public class Piece {

    public BufferedImage image;
    public int x, y;
    public int col, row, preCol, preRow;
    public int color;


    public Piece(int color, int col, int row){

        this.color = color;
        this.col = col;
        this.row = row;
        x = getX(col);
        y = getY(row);
    }
    public int getX(int col){
        return col * Board.SQUARE_SIZE;
    }
    public int getY(int row){
        return row * Board.SQUARE_SIZE;
    }
}
