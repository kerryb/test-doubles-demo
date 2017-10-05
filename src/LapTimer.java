public class LapTimer {

	private Clock clock;
	private int lapTime;
	private LapDisplay fastestLapDisplay;

	public LapTimer(Clock clock, LapDisplay fastestLapDisplay) {
		this.clock = clock;
		this.fastestLapDisplay = fastestLapDisplay;
	}

	public Object lastLapTime() {
		return lapTime;
	}

	public void lineCrossed() {
		lapTime = clock.time() - lapTime;
		updateDisplayIfFastestLap();
	}

	private void updateDisplayIfFastestLap() {
		fastestLapDisplay.recordTime(lapTime);
	}
}