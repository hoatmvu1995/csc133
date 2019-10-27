package com.mycompany.a2;

import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.Command;
import com.mycompany.a2.GameWorld;

public class AntCollideFoodStation extends Command{

    GameWorld gw;

    public AntCollideFoodStation(GameWorld gw)
    {
        super("AntHitFoodStation");
        this.gw = gw;
    }

    @Override
    public void actionPerformed(ActionEvent evt)
    {
        gw.collidingWithFoodStation();
    }
}
