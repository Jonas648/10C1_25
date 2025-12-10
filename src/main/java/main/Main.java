/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

import assets.actors.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
        
        Player p = new Player(0, 0, null, "Peter");
        System.out.println(p.getName());
        p.setName("fghjklö");
        System.out.println(p.getName());
    }
}
