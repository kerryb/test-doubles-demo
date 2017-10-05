public class LapTimer {

	private Clock clock;
	private int lapTime;

	public LapTimer(Clock clock) {
		this.clock = clock;
	}

	public Object lastLapTime() {
		return lapTime;
	}

	public void lineCrossed() {
		this.lapTime = clock.time();
	}
}