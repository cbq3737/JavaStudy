package Test16;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level =new BeginnerLevel();
	}
	public PlayerLevel getLevel() {
		return this.level;
	}
	public void upgradeLevel(PlayerLevel playerlevel) {
		this.level = playerlevel;
	}
	public void play(int count) {
		level.go(count);
	}
}
