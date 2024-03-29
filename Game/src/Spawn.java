import java.util.Random;

public class Spawn {

	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	private int scoreKeep;
	
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void tick() {
		scoreKeep++;
		
		if(scoreKeep >= 500) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel() + 1);
			
			if(hud.getLevel() == 2) {
				handler.addObject(new BasicEnemy(r.nextInt(Main.WIDTH - 50), r.nextInt(Main.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 3) {
				handler.addObject(new BasicEnemy(r.nextInt(Main.WIDTH - 50), r.nextInt(Main.HEIGHT - 50), ID.BasicEnemy, handler));
			}else if(hud.getLevel() == 4) {
				handler.addObject(new FastEnemy(r.nextInt(Main.WIDTH - 50), r.nextInt(Main.HEIGHT - 50), ID.FastEnemy, handler));	
			}else if(hud.getLevel() == 5) {
				handler.addObject(new SmartEnemy(r.nextInt(Main.WIDTH - 50), r.nextInt(Main.HEIGHT - 50), ID.SmartEnemy, handler));	
			}
			
			
		}
		
	}
	
}
