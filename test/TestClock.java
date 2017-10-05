public class TestClock implements Clock {

	private int time;

	public void freezeTime(int time) {
		this.time = time;
	}

	@Override
	public int time() {
		return time;
	}
}