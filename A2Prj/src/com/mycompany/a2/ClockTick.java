package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class ClockTick extends Command {
	GameWorld gw;
	
	public ClockTick(GameWorld gw) {
		super("ClockTick");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		gw.clockTicking();
	}
}
