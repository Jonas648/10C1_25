package czg.objects;

import czg.scenes.BaseScene;
import czg.util.Input;

import java.awt.*;

/**
 * Ein Drag-Objekt, bestehend aus einer Position und einem Bild,
 * welches mit der Maus gezogen werden kann.
 */
public class DragObject extends BaseObject {
    /**
     * Variablen für die Logik des Ziehens.
     */
    private boolean isDragged = false;
    private Point lastMousePos;

    /**
     * Einen neues Drag-Objekt erstellen und in die Mitte des Bildschirms platzieren.
     * Die Größe des Objektes entspricht der Größe des Bildes.
     * @param sprite Bild
     */
    public DragObject(Image sprite) {
        super(sprite);
    }

    /**
     * Einen neues Drag-Objekt erstellen und an die angegebene Stelle platzieren.
     * Die Größe des Objektes entspricht der Größe des Bildes.
     * @param sprite Bild
     * @param x X-Position
     * @param y Y-Position
     */
    public DragObject(Image sprite, int x, int y) {
        super(sprite, x, y);
    }

    /**
     * Einen neues Drag-Objekt erstellen.
     * @param sprite Bild
     * @param x X-Position
     * @param y Y-Position
     * @param width Breite
     * @param height Höhe
     */
    public DragObject(Image sprite, int x, int y, int width, int height) {
        super(sprite, x, y, width, height);
    }

    @Override
    public void update(BaseScene scene) {
        if(isClicked()) {
            if (isDragged) {
                isDragged = false;
            } else {
                System.out.println("clicked");
                lastMousePos = Input.INSTANCE.getMousePosition();
                isDragged = true;
            }
        }

        if (isDragged) {
            Point currentMousePos = Input.INSTANCE.getMousePosition();
            Point mouseDiff = new Point(currentMousePos.x - lastMousePos.x, currentMousePos.y - lastMousePos.y);
            this.x += mouseDiff.x;
            this.y += mouseDiff.y;

            lastMousePos = currentMousePos;
        }
    }
}