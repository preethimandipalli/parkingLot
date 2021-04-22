package utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestParking {
    ParkingLot parkingLot = new ParkingLot(10);
    @Test
    void TestToCheckIfCarIsParked(){
        String registrationNumber = "TS1541";
        Car car = new Car(registrationNumber,"notParked");
        String expected= "parked";

        parkingLot.add(car);
        String actual = car.status;

        assertEquals(expected,actual);
    }

}
