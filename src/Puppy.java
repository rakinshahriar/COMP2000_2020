import java.awt.*;
public class Puppy implements Actor {
    Cell body;
    static int id = 3;

    public Puppy(int locX, int locY) {

    }
    public void roar(){
        System.out.println("Bark");
    }
    public void paint(Graphics g){
        body.paint(g,id);
    }
    
}