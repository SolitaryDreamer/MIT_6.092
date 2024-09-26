import java.awt.Color;
import java.awt.Graphics;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DrawGraphics {

    //ArrayList<Bouncer> movingSprite = new ArrayList<Bouncer>();
    //ArrayList<StraightMover> StraightMovers = new ArrayList<StraightMover>();
    ArrayList<Mover> movers = new ArrayList<Mover>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        /*
        movingSprite.add(new Bouncer(100, 170, box1));
        movingSprite.get(0).setMovementVector(3, 1);
        StraightMovers.add(new StraightMover(170, 100, box1));
        StraightMovers.get(0).setMovementVector(-1,-3);
         */
        movers.add(new Bouncer(100, 170, box1));
        movers.get(0).setMovementVector(3, 1);
        movers.add(new StraightMover(170, 100, box1));
        movers.get(1).setMovementVector(-1,-3);
        Oval box2 = new Oval(15, 15, Color.BLUE);
        /*
        movingSprite.add(new Bouncer(20, 100, box2));
        movingSprite.get(1).setMovementVector(-3, 5);
        StraightMovers.add(new StraightMover(100, 20, box2));
        StraightMovers.get(1).setMovementVector(5,-3);
         */
        movers.add(new Bouncer(20, 100, box2));
        movers.get(2).setMovementVector(-3, 5);
        movers.add(new StraightMover(100, 20, box2));
        movers.get(3).setMovementVector(5,-3);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        /*
        for (Bouncer b : movingSprite) {
            b.draw(surface);
        }
        for (StraightMover sm : StraightMovers) {
            sm.draw(surface);
        }
         */
        for (Mover m : movers) {
            m.draw(surface);
        }
    }
}