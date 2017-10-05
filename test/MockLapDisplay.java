public class MockLapDisplay implements LapDisplay {
	private boolean recordTimeWasCalled;

	@Override
	public void recordTime(int time) {
		recordTimeWasCalled = true;
	}

	public boolean recordTimeWasCalled() {
		return recordTimeWasCalled;
	}
}