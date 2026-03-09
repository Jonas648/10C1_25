/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package czg.scenes;

import czg.objects.BackdropObject;
import czg.objects.ButtonObject;
import czg.objects.ExamplePlayerObject;
import czg.util.Images;

import static czg.MainWindow.HEIGHT;
/**
 *
 * @author guest-4vhbtk
 */
public class InforaumScene extends BaseScene{
    public InforaumScene(){
        objects.add(new BackdropObject(Images.get("/assets/background/Info-Raum.png")));
    }
}