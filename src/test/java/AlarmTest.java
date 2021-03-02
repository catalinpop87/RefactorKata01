import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class AlarmTest {

    @Test
    public void foo() {
        Alarm alarm = new Alarm();
        assertTrue(alarm.isAlarmOn());
    }
}
