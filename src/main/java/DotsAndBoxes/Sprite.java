package DotsAndBoxes;
import java.awt.Graphics;

import java.awt.Polygon;
import java.awt.Color;


public class Sprite {
    Polygon shape;
    Color color;
    int width;
    int height;
    int x;
    int y;

    public Sprite() {
        shape = new Polygon();
        width = 0;
        height = 0;
        x = 0;
        y = 0;
        color = Color.DARK_GRAY;
    }

    public void render(Graphics g) {
        g.setColor(color);

        Polygon renderedShape = new Polygon();
        for (int i = 0; i < shape.npoints; i++) {
            int renderedX = shape.xpoints[i] + x + width / 2;
            int renderedY = shape.ypoints[i] + y + height / 2;
            renderedShape.addPoint(renderedX, renderedY);
        }
        g.fillPolygon(renderedShape);
    }

    public boolean containsPoint(int x, int y) {
        return shape.contains(x - this.x - width / 2, y - this.y - height / 2);
    }
}