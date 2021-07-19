package Test16;

public class MainBoard {
	public static void main(String args[]) {
		Player player = new Player();
		player.play(1);
		
		PlayerLevel playerlevel = new AdvancedLevel();
		player.upgradeLevel(playerlevel);
		player.play(2);
		
		playerlevel = new SuperLevel();
		player.upgradeLevel(playerlevel);
		player.play(3);
	}
}
