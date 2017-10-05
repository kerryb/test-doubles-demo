public class MockLapDisplay implements LapDisplay {
	private boolean recordTimeWasCalled;
	private int recordedTime;

	@Override
	public void recordTime(int time) {
		recordTimeWasCalled = true;
		this.recordedTime = time;
	}

	public void assertRecordTimeWasCalled() {
		if (!recordTimeWasCalled) {
			throw new AssertionError("recordTime was not called");
		}
	}

	public void assertRecordTimeWasCalledWith(int time) {
		assertRecordTimeWasCalled();
		if (recordedTime != time) {
			throw new AssertionError("Expected recordTime(" + time + "), but was called with " + recordedTime);
		}
	}
}