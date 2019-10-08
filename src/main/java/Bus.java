import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int passengersCount() {
        return this.passengers.size();
    }

    public void addPassengerToQueue(Person passenger) {
            this.passengers.add(passenger);
    }

    public boolean capacityExceeded() {
        if (this.passengersCount() > this.capacity){
            return true;
        } else {
            return false;}
    }
}
