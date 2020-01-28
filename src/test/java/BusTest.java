import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person;
    private BusStop busStop;


    @Before

    public void before(){
        bus = new Bus("Charing Cross", 2 );
        person = new Person();
        busStop = new BusStop("High St");
    }
    @Test
    public void passengerStartsAtZero(){
        assertEquals(0, bus.passengerCount());
    }
    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void cannotAddPassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
    }
    @Test
    public void removePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.passengerCount());
    }
    @Test
    public void canPickUp(){
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1,bus.passengerCount());
        assertEquals(0, busStop.queueCount());

    }
}
