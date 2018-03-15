package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class HelloScreen extends BasicGameState {
	
	public static int id = 1;
	
	private float x = 350;
	private float y = 300;

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame stg, Graphics g) throws SlickException {
		g.drawString("Halloo",(float)(x+100*Math.sin((double)gc.getTime()/200)),y);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return HelloScreen.id;
	}
	
}
