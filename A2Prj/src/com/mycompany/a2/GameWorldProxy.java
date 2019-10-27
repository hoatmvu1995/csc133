package com.mycompany.a2;

import java.util.Observable;

public class GameWorldProxy extends Observable implements IGameWorld{
	private GameWorld gw;
	
	public GameWorldProxy(GameWorld gw) {
		this.gw = gw;
	}

	@Override
	public Ant getAnt() {
		return gw.getAnt();
	}

	@Override
	public int getAntLives() {
		return gw.getAntLives();
	}

	@Override
	public int getClock() {
		return gw.getClock();
	}

	@Override
	public boolean getSound() {
		return gw.getSound();
	}
	
	@Override
	public int getFoodLevel() {
		return gw.getFoodLevel();
	}
	
	@Override
	public int getHealthLevel() {
		return gw.getHealthLevel();
	}
	
	@Override
	public GameObjectCollection getGameObjects() {
		return gw.getGameObjects();
	}
	
	@Override
	public void setDimension(int width, int height) {
		gw.setDimension(width, height);
	}
	
	@Override
	public void getDimension() {
		gw.getDimension();
	}
	
	@Override
	public void printMap() {
		gw.printMap();
	}
}
