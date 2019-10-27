package com.mycompany.a2;

public interface IGameWorld {
	public Ant getAnt();
	public int getAntLives();
	public int getClock();
	public boolean getSound();
	public int getFoodLevel();
	public int getHealthLevel();
	public void getDimension();
	public void setDimension(int width, int height);
	public GameObjectCollection getGameObjects();
	public void printMap();
	
}
