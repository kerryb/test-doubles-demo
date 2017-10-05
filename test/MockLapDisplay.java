public class MockLapDisplay implements LapDisplay {
	private boolean recordTimeWasCalled;

	@Override
	public void recordTime(int time) {
		recordTimeWasCalled = true;
	}

	public void assertRecordTimeWasCalled() {
		if (!recordTimeWasCalled) {
			throw new AssertionError("recordTime was not called");
		}
	}
}