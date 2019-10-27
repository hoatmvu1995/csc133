package com.mycompany.a2;

import com.codename1.charts.models.Point;
import com.codename1.charts.util.ColorUtil;

public final class Ant extends MovableGameObject implements ISteerable{ 
	private static final int DAMAGE = 5;
	private static final int ANT_SIZE = 20;
	private static final int CONSUMPTION_RATE = 2;
	private static final int MAX_SPEED = 10;
	private static final int INITIAL_FOOD = 100;
	private static final int INITIAL_DIRECTION = 0;
	private static final int INITIAL_HEALTH = 10;
	private static final int INITIAL_SPEED = 5;
	private static final int INITIAL_ANT_COLOR = ColorUtil.rgb(255, 0, 0);
	
	private int foodLevel = INITIAL_FOOD;
	private int healthLevel = INITIAL_HEALTH;
	private int lastFlagReached;
	private int speedLimit;
	
	private static Ant instance = new Ant(Tool.CENTER_SCREEN);
	
	private Ant(Point location) {
		setLocation(location);
		calculateSpeedLimit();
		size = ANT_SIZE;
		color = INITIAL_ANT_COLOR;
		heading = INITIAL_DIRECTION;
		speed = INITIAL_SPEED;
		lastFlagReached = 1;
	}
	
	/*
	 * Calculate the ant's color based on the health level.
	*/
	private void calculateColor() {
		color = ColorUtil.rgb(healthLevel * 20, 0, 0);
	}
	
	/*
	 * Calculate the ant's speed, base on current speed of the ant;
	*/
	private void calculateSpeed() {
		setSpeed(speed);
	}
	
	
	/*
	 * Calculate the speed of the ant base on its health
	*/
	private void calculateSpeedLimit() {
		float speedLimitChanging = (float) (1f / INITIAL_HEALTH) * healthLevel;
		
		speedLimit = Math.round(speedLimitChanging * MAX_SPEED);
		speedLimit = Math.min(speedLimit, MAX_SPEED);
	}
	
	
	/*
	 * reset the health level of the ant whenever the lives reduce by 1. 
	*/
	public void resetHealthLevel() {
		
		if (healthLevel == 0) {
			this.healthLevel = INITIAL_HEALTH;
		}
		
	}
	
	
	/*
	 * Design Patter: Singleton
	 * @return only one instance of Ant.
	*/
	public static Ant getInstance() {
		return instance;
	}

	
	/*
	 * Reduce the food level by its consumpsion rate
	 * The food level can't never be negative
	*/
	public void foodConsumeRate() {
		foodLevel = foodLevel - CONSUMPTION_RATE;
		foodLevel = Math.max(foodLevel, 0);
	}
	
	public int getFood() {
		return foodLevel;
	}
	
	public int getHealthLevel() {
		return healthLevel;
	}
	
	/*
	 *@return the flag number where the ant has reached
	*/
	public int getLastFlagReached() {
		return lastFlagReached;
	}
	
	/*
	 * Everytime, the ant collide to the next flag, this assume that the next flag will 
	 * be the next consecutive order. For example, the ant was at Flag 1, when the ant, 
	 * collide to a next flag, it assume the next flag is Flag 2. 
	*/
	public void collideToNextFlag() {
		lastFlagReached++;
	}
	
	
	/*
	 * the ant's health level will be reduced by certain amount of damage.
	*/
	public void colldieToSpider() {
		setHealth(healthLevel - DAMAGE);
	}
	
	/*
	 * Mutator with a validation that the food level can't be lower than 0
	*/
	public void setFoodLevel(int food) {
		this.foodLevel = Math.max(food, 0);
	}
	
	/*
	 * Mutator with a validation that the health level can't be lower than 0
	 * Calculate the speed, speedLimit, and the color of the Ant base on the health
	*/
	public void setHealth(int health) {
		this.healthLevel = Math.max(health, 0);
		
		calculateSpeedLimit();
		calculateSpeed();
		calculateColor();
	}
	
	
	@Override
	public void setHeading(int heading) {
		this.heading = heading;
	}
		

	/*
	 * set the Ant's speed
	 * validation that make sure the speed can't be lower than 0
	 * lock the speed into a specific range, where the an't speed can't be larger than speed limit.
	*/
	@Override
	public void setSpeed(int speed) {
		speed = Math.max(speed, 0);
		
		this.speed = Math.min(speed,  speedLimit);
	}
	
	@Override
	public String toString()
	{
		return "Ant: "
				+ super.toString()
				+ ", speedLimit=" + speedLimit
				+ ", maxSpeed=" + MAX_SPEED
				+ ", health=" + healthLevel
				+ ", foodConsumptionRate=" + CONSUMPTION_RATE;
	}
}


