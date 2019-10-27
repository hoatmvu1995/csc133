package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AntCollideFlag extends Command
{
    GameWorld gw;

    public AntCollideFlag(GameWorld gw)
    {
        super("AntHitFlag");
        this.gw = gw;
    }

    @Override
    public void actionPerformed(ActionEvent evt)
    {
        gw.collideWithFlag();
    }
}
