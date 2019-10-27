package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AntBrake extends Command{
	GameWorld gw;
	
	public AntBrake(GameWorld gw) {
		super("AntBrakeCommand");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		gw.brake();
	}
}
