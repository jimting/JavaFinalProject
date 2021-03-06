// The pause GameState can only be activated
// by calling GameStateManager#setPaused(true).

package ntou.cs.Java2016.FinalProject;

import java.awt.Graphics2D;

public class PauseState extends GameState {
	
	public PauseState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {}
	
	public void update() {
		handleInput();
	}
	
	public void draw(Graphics2D g) {
		
		Content.drawString(g, "paused", 60, 30);
		
		Content.drawString(g, "arrow", 22, 76);
		Content.drawString(g, "keys", 26, 84);
		Content.drawString(g, ": move", 62, 80);
		
		Content.drawString(g, "F2", 22, 96);
		Content.drawString(g, ": Save", 62, 96);
		
		Content.drawString(g, "F1:", 46, 112);
		Content.drawString(g, "return", 78, 108);
		Content.drawString(g, "to menu", 78, 116);
		
	}
	public void handleInput() {
		if(Keys.isPressed(Keys.ESCAPE)) {
			gsm.setPaused(false);
			JukeBox.resumeLoop("music1");
		}
		if(Keys.isPressed(Keys.F1)) {
			gsm.setPaused(false);
			gsm.setState(GameStateManager.MENU);
		}
	}
	
}
