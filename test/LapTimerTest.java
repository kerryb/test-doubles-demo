import static org.junit.Assert.*;

import org.junit.Test;

public class LapTimerTest {
	private TestClock clock = new TestClock();
	private LapTimer lapTimer = new LapTimer(clock);

	@Test
	public void first_lap_time_is_time_from_clock() {
		clock.freezeTime(123);
		lapTimer.lineCrossed();
		assertEquals(123, lapTimer.lastLapTime());
	}
	
	@Test
	public void second_lap_time_is_difference_from_previous_time() {
		clock.freezeTime(123);
		lapTimer.lineCrossed();
		clock.freezeTime(456);
		lapTimer.lineCrossed();
		assertEquals(333, lapTimer.lastLapTime());
	}
}