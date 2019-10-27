package com.mycompany.a2;

import com.codename1.charts.util.ColorUtil;


/**
 * class represent a spider instance object with black color
 * random location, random heading, random speed, and random size
 */
public final class Spider extends MovableGameObject{
	public Spider() {
		color = ColorUtil.rgb(0,0,0);
		setLocation(Tool.randomLocation());
		heading = Tool.rangeIntGenerating(0,  359);
		speed = Tool.rangeIntGenerating(5, 10);
		setRandomSize();
	}
	
	/**
	 * spider is also a movable object, so it also inherited the ability to move
	 * spider has their own way of moving around. This move method contraint 
	 * how the spider move within the screeen resolution
	 */
	@Override
	public void move() {
		heading = heading + Tool.rangeIntGenerating(-5, 5);
		super.move();
		
		if (!Tool.isWithinDefaultResolution(location)) {
			location = Tool.lockToResolution(location);
			
			heading -= 180;
		}
	}
	
	/**
	 * has only one color
	 */
	@Override
	public final void setColor(int color) {}
	
	@Override
	public String toString() {
		return "Spider: " + super.toString();
	}
	
}
