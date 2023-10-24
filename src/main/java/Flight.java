import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengers;
//     private int price;



    public Flight(String destination, int flightId, int price){
        this.destination = destination;
        this.flightId = flightId;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger){
     passengers.add(passenger);
    }

    public void removeAllPassengers(Passenger passenger){

        this.passengers.remove(passenger);
    }
}
