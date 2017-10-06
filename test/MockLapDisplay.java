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

  public void assertRecordTimeWasNotCalled() {
    if (recordTimeWasCalled) {
      throw new AssertionError("recordTime(" + recordedTime + ") was called unexpectedly");
    }
  }

  public void assertRecordTimeWasCalledWith(int time) {
    assertRecordTimeWasCalled();
    if (recordedTime != time) {
      throw new AssertionError("Expected recordTime(" + time + "), but was called with " + recordedTime);
    }
  }

  public void reset() {
    recordTimeWasCalled = false;
    recordedTime = 0;
  }
}
