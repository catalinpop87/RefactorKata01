import java.util.Random;

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class Sensor {
    public static final double OFFSET = 16;
    public static final double LowPressureThreshold = 17;
    public static final double HighPressureThreshold = 21;

    public double popNextPressurePsiValue() {
        return OFFSET + samplePressure( );
    }

    private static double samplePressure() {
        // placeholder implementation that simulate a real sensor in a real tire
        Random basicRandomNumbersGenerator = new Random();
        return getPressureTelemetryValue(basicRandomNumbersGenerator);
    }

    private static double getPressureTelemetryValue(Random basicRandomNumbersGenerator) {
        return 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
    }
}
