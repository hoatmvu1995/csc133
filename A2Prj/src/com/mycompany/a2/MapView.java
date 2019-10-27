package com.mycompany.a2;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.plaf.Border;
import com.mycompany.a2.GameWorld;

import java.util.Observable;
import java.util.Observer;

public class MapView extends Container implements Observer{
	
	public MapView() {
		getAllStyles().setBorder(Border.createLineBorder(3, ColorUtil.rgb(255, 0, 0)));
	}
	
    @Override
    public void update(Observable o, Object data)
    {
        IGameWorld gw = (IGameWorld) data;
        gw.setDimension(this.getWidth(), this.getHeight());
        gw.printMap();
        
        repaint();
    }

}
