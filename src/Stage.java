import java.awt.*;

public class Stage{

    Grid ground;
    Lion L;
    Puppy P;
    Rabbit R;


    public Stage(int locX,int locY){
        L=new Lion(locX,locY);
        P=new Puppy (100+locX,100+locY);
        R=new Rabbit(100+locX,locY);
        ground=new Grid();


    }
    public Stage() {
	}
	public void paint(Graphics g){
        ground.paint(g);
        L.paint(g);
        P.paint(g);
        R.paint(g);
    }
}