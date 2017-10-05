import static org.junit.Assert.*;

import org.junit.Test;

public class LapTimerTest {

	private LapTimer lapTimer;

	@Test
	public void first_lap_time_is_time_from_clock() {
		assertEquals(123, lapTimer.lastLapTime());
	}
}