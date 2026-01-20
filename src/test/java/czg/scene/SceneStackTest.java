package czg.scene;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class SceneStackTest {

    @Test
    public void testStack() {
        JPanel panel = new JPanel();
        SceneStack stack = new SceneStack(panel);

        Scene bottom = new Scene();
        Scene middle = new Scene();
        Scene top = new Scene();

        stack.push(bottom);
        stack.push(middle);
        stack.push(top);

        assertEquals(2, panel.getComponentZOrder(bottom));
        assertEquals(1, panel.getComponentZOrder(middle));
        assertEquals(0, panel.getComponentZOrder(top));

        stack.pop();

        assertEquals(1, panel.getComponentZOrder(bottom));
        assertEquals(0, panel.getComponentZOrder(middle));
    }

}
