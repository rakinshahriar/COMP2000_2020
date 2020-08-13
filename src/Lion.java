import java.awt.*;
public class Lion implements Actor{
    Cell body;
    static int  id=2;
    public Lion(int locX,int locY){

    }
    public void roar(){
        System.out.println("Roar");
    }
    public void paint(Graphics g){
        body.paint(g,id);
    }
    
}