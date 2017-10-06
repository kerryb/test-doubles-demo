public class LapTimer {
  private Clock clock;
  private int lapTime;
  private LapDisplay fastestLapDisplay;
  private Integer fastestLapTime;

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
    if (fastestLapTime == null || lapTime < fastestLapTime) {
      fastestLapTime = lapTime;
      fastestLapDisplay.recordTime(lapTime);
    }
  }
}
