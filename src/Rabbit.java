import java.awt.*;
public class Rabbit implements Actor{
    Cell body;
    static int  id=1;

    public Rabbit(int locX,int locY){

    }
    public void roar(){
        System.out.println("Rabbit Noise");
    }
    public void paint(Graphics g){
        body.paint(g,id);
    }
    
}