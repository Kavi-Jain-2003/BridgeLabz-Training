import java.util.*;

public class SensorMonitor {
    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(
            22.5, 35.8, 18.9, 42.1, 30.0
        );
        double threshold=30.0;
        readings.stream()
        .filter(reading->reading>threshold)
        .forEach(reading->System.out.println("Alert! High reading:"+reading));
  }
}