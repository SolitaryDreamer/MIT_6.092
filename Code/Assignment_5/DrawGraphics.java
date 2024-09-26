import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> box = new ArrayList<>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box.add(new BouncingBox(200, 50, Color.RED));
        box.add(new BouncingBox(150, 150, Color.BLUE));
        box.add(new BouncingBox(50, 200, Color.GREEN));
        box.get(0).setMovementVector(1, 0);
        box.get(1).setMovementVector(-1, -1);
        box.get(2).setMovementVector(0, 1);
    }
    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        for (BouncingBox bouncingBox : box) {
            bouncingBox.draw(surface);
        }
    }
}
