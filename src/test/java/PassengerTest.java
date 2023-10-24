import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {
    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger(
                "Cassey",
                123456789,
                "cassey@gmail.com");
    }

    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("Cassey");
    }

    @Test
    public void canSetName(){
        passenger.setName("Kate");
        assertThat(passenger.getName()).isEqualTo("Kate");
    }

    @Test
    public void canGetUniqueId(){
        assertThat(passenger.getUniqueId()).isEqualTo(123456789);
    }

   @Test
   public void canSetUniqueId(){
       passenger.setUniqueId(123334444);
       assertThat(passenger.getUniqueId()).isEqualTo(123334444);
   }

    @Test
    public void canGetEmail(){
        assertThat(passenger.getEmail()).isEqualTo("cassey@gmail.com");
    }

    @Test
    public void canSetEmail(){
        passenger.setEmail("kate@gmail.com");
        assertThat(passenger.getEmail()).isEqualTo("kate@gmail.com");
    }




}
