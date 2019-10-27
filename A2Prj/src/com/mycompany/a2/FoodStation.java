package com.mycompany.a2;

import com.codename1.charts.util.ColorUtil;
import com.mycompany.a2.FixedGameObject;
import com.mycompany.a2.Tool;


/*
 * The class is use to represent the food station instance object
 * The food station is extends from the FixGameObject, so it's can't be move
 * There will be some certain attributes, the has been defaultly provided
*/
public final class FoodStation extends FixedGameObject{
	private static final int FOODSTATION_COLOR = ColorUtil.rgb(0, 255, 0);
	private static final int MIN_CAPACITY = 10;
	private static final int MAX_CAPACITY = 50;
	
	private int capacity;
	
	
	/*
	 * the location of the food station will be generated randomly, BUT 
	 * it will be lock to the screen resolution.
	 * The size and the capacity of Food Station will be generated randomly 
	 * based on default values.
	*/
	public FoodStation() {
		location = Tool.randomLocation();
		size = this.capacity = Tool.rangeIntGenerating(MIN_CAPACITY, MAX_CAPACITY);
		color = FOODSTATION_COLOR;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = Math.max(capacity, 0);
	}
	
	@Override
	public String toString() {
		return "Food Station: " + super.toString() + ", capacity= " + capacity;
	}
}
