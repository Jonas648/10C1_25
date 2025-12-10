/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assets.objects;

import assets.GameAsset;
import javax.swing.ImageIcon;

/**
 *
 * @author administrator
 */
public class Item extends GameAsset{
    
    //Jakobsmuscheln, Waffe, Flosse?
    
    public Item(int x, int y, ImageIcon img, String name) {
        super(x, y, img, name);
    }

    @Override
    public void swim(int x, int y) {
    }
    
}
