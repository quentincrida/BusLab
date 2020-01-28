import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Main St");
        person = new Person();
    }
    @Test
    public void queueStartsAtZero(){
        assertEquals(0, busStop.queueCount());
    }
    @Test
    public void canAddPersonToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.queueCount());
    }
    @Test
    public void canRemovePersonFromQueue(){
        busStop.addToQueue(person);
        busStop.addToQueue(person);
        busStop.removePerson(person);
        assertEquals(1, busStop.queueCount());
    }
}
