package laporan7;

public abstract class bentuk {
	
	protected int x;
	protected int y;
	
	public void geser(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("x = " + x + "y = " + y);
	}
	
	public abstract float hitungluas();
	public abstract void tulis();

}
