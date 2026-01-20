package czg.scene;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SceneStack {

    private final JPanel contentPane;

    /**
     * Eigene Liste mit Szenen weil contentPane.getComponents()
     */
    private final List<Scene> scenes = new ArrayList<>();

    /**
     * Einen neuen Szenen-Stapel erstellen.
     * @param contentPane Das {@link JPanel}, welches die Szenen enthalten soll
     */
    public SceneStack(JPanel contentPane) {
        contentPane.removeAll();
        this.contentPane = contentPane;
    }

    /**
     * Zeigt eine weitere Szene über allen bestehenden Szenen an
     * @param scene Beliebige Szene
     */
    public void push(Scene scene) {
        // Zum Fenster hinzufügen
        contentPane.add(scene);

        // Ggf. letzte Szene verdecken
        Scene last = getLast();
        if(last != null && last.canBeCovered) {
            last.isCovered = true;
        }

        // Ins Fenster hinzufügen
        scenes.add(scene);

        // Update Z-Order of scenes. Highest z-order = drawn first, lowest z-order = draw last
        for (int i = 0; i < scenes.size(); i++) {
            contentPane.setComponentZOrder(scenes.get(i), scenes.size()-1-i);
        }
    }

    /**
     * Entfernt die oberste Szene
     */
    public void pop() {
        Scene last = getLast();
        if(last != null) {
            // Vom Fenster entfernen
            contentPane.remove(last);
            // Aus der Liste entfernen
            scenes.remove(scenes.size()-1);

            // Aktualisieren
            last = getLast();
            // Nicht mehr bedecken
            if(last != null)
                last.isCovered = false;
        } else
            System.err.println("Es wurde versucht, eine Szene zu entfernen, obwohl keine Szenen mehr auf dem Stapel sind!");
    }

    public void update() {
        for(Component c : contentPane.getComponents()) {
            if(c instanceof Scene) {
                ((Scene) c).update();
            }
        }
    }

    private Scene getLast() {
        return scenes.isEmpty() ? null : scenes.get(scenes.size()-1);
    }

}
