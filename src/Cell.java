import java.awt.*;

class Cell{
    // fields
    int x;
    int y;
    static int size = 35;

    //constructors
    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }
    void paint(Graphics g,int id){
        if(id=1){
            g.setColor(Color.WHITE);
        }else if(id =2) {
            g.setColor(Color.RED);
        }else if(id=3){
            g.setColor(Color.GREEN);
        }else{
            g.setColor(Color.GRAY);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    boolean contains(Point p){
        if (p != null){
            return (x < p.x && x+size > p.x && y < p.y && y+size > p.y);
        } else {
            return false;
        }
    }
}