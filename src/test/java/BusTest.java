import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;

    @Before
    public void before() {
        bus = new Bus("Balerno", 5);
        passenger = new Person();
    }

    @Test
    public void busHasDestination() {
        assertEquals("Balerno", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(5, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengersCount());
    }

    @Test
    public void canAddPassengerToPassengers() {
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        assertEquals(5, bus.passengersCount());
    }

    @Test
    public void busCannotAddPassengersOverCapacity() {
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);
        bus.addPassengerToQueue(passenger);

        assertEquals(true, bus.capacityExceeded());
    }

    @Test
    public void canBusAddPassenger() {
        bus.takePassengerFromQueue(passenger);
        
    }
}
