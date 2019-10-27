package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AntTurnLeft extends Command{
	GameWorld gw;
	
	public AntTurnLeft(GameWorld gw) {
		super("AntTurnLeft");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		gw.turnLeft();
	}
}