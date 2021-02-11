package rgbledring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LedRing {

	public static class Led
	{
		enum Status
		{
			On,
			Off,
		}

	}

	private List<Led.Status> ledList;
    private boolean[] leds;

	public LedRing(boolean[] leds) {
		this.leds = leds;
		ledList = new ArrayList<>();
	}

	public void setLevel(int level) {
		float percentPerLed = (100f / ledList.size());
		for (int i = 0; i < ledList.size(); i++) {
			final float ledActivationLevel = (percentPerLed * i);
            Led.Status currentLED = ledList.get(i);
			leds[i] = level > ledActivationLevel;
            ledList.set(i, Led.Status.On);
            if (level > ledActivationLevel) {

            }else {

            }
		}
	}

}
