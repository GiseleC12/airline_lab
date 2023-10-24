import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

   Flight flight;
   Passenger passenger;

   @BeforeEach

    void setUp() {
      flight = new Flight("Dubai", 100000);
   }

      @Test
      void canGetDestination() {
         assertThat(flight.getDestination()).isEqualTo("Dubai");
      }

      @Test
      void canGetFlightId() {
         assertThat(flight.getFlightId()).isEqualTo(100000);
      }

//        @Test
//        void canAddPassengers () {
//
//           passenger = new Passenger("Tom", 12345, "tom@gmail.com");
//           Passenger passenger2 = new  Passenger("Tim", 12567, "tim@gmail.com");
//
//           flight.addPassenger(passenger);
//
//           assertThat(flight.getPassengers().size()).isEqualTo(2);
//        }

      @Test
      void canRemoveAllPassengers (){
         passenger = new Passenger("Tom", 12345, "tom@gmail.com");
         Passenger passenger2 = new  Passenger("Tim", 12567, "tim@gmail.com");
         flight.addPassenger(passenger);
         flight.addPassenger(passenger2);
         flight.removeAllPassengers(passenger);
         flight.removeAllPassengers(passenger2);

      assertThat(flight.getPassengers().size()).isEqualTo(0);
      }
}
