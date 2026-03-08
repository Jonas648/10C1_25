/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package czg.objects;

import czg.scenes.BaseScene;
import czg.util.Images;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guest-0wphjm
 */
public class PlayerObject extends BaseObject{
    //Festlegen der benötigten Variablen (Lebenspunkte, veränderliche Charaktereigentschaften)
    public String name;
    public List<ItemObject> inventar;
    
    public static PlayerObject INSTANCE = new PlayerObject(Images.get("/assets/characters/PlayerBase.png"), 0, 0, "tmp", new ArrayList<>());

    public PlayerObject() {
        super(Images.get("/assets/characters/PlayerBase.png"));
    }
    
    
    public PlayerObject(Image sprite, int x, int y, String name, ArrayList<ItemObject> inventar){
          super (sprite, x, y);
          this.name = name;
          this.inventar = inventar;
    }

    @Override
    public void update(BaseScene scene) {
       // if(isClicked())
            //SceneStack.INSTANCE.push(new InventarScene());
    }
    
}
