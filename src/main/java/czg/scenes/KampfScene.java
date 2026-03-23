/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package czg.scenes;
import czg.objects.BackdropObject;

/**
 *
 * @author guest-cgqpg1
 */
public class KampfScene extends BaseScene{
    public KampfScene(){
        //Einfügen des Hintergrunds
        objects.add(new BackdropObject(Images.get("/assets/background/Kampfgang.png")));
        
        //
        objects.add(new InventarObject(Images.get("/assets/minigames/general/button_exit.png")));
    }
}


