package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.mycompany.a2.GameWorld;

public class AntCollideSpider extends Command{
	GameWorld gw;
	
	public AntCollideSpider(GameWorld gw) {
		super("AntHitSpider");
		this.gw = gw;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		gw.collidingWithSpider();
	}
}
