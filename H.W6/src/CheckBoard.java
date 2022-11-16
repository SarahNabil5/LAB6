/*
import java.awt.*;
import java.awt.color.*;


public class CheckBoard {
    private int size ;
    public CheckBoard(int s){
        size=s;
    }
    public void draw(Graphics2D g2)
    {
        int xleft;
        int ytop;
        int row;
        int col ;
        for(row=0 ; row <8 ; row++){
            for(col=0 ; col <8 ; col++){
                xleft=col*size;
                ytop=row*size;
                if((row%2)==(col%2))
                    g2.setColor(color.white);
                else
                    g2.setColor(color.black);
                g2.fillRect(xleft, ytop,size,size);


            }
        }
    }
}*/
