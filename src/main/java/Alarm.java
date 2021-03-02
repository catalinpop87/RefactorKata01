public class Alarm {
  Sensor sensor = new Sensor();

  boolean alarmOn = false;

  public Boolean isAlarmOn() {
    if (isGoodPressure(sensor.popNextPressurePsiValue())) {
      alarmOn = true;
    }
    return alarmOn;
  }
  private boolean isGoodPressure(double psiPressureValue) {
    return psiPressureValue < Sensor.LowPressureThreshold || Sensor.HighPressureThreshold < psiPressureValue;
  }
}
