package com.mycompany.a2;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.Tool;

/*
 * Flag class to represent the flag objects with certain default properties such as color and size
 * Also, it has a sequenceNumber to represent itself 
*/
public final class Flag extends FixedGameObject{
	private static final int SIZE = 10;
	private static final int FLAG_COLOR = ColorUtil.rgb(0, 0, 255);
	
	private int sequenceNumber;
	
	/*
	 * the instance flags are created with a given sequence Order and location
	 * the location is specific by the developer, and it will be validate 
	 * however, it is to be fit within the screen resolution
	*/
	public Flag(int sequenceNumber, Point location) {
		this.location = Tool.lockToResolution(location);
		this.color = FLAG_COLOR;
		this.sequenceNumber = sequenceNumber;
		this.size = SIZE;
	}
	
	/*
	 * the color of the flag can't be changed by anyone.
	*/
	@Override
	public final void setColor(int color) {}
	
	@Override
	public String toString() {
		return "Flag: " + super.toString() + ", seqNumber=" + sequenceNumber;
	}
}
