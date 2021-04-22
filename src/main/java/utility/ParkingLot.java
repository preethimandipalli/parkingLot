package utility;

public class ParkingLot {
    int totalCapacity;
    public ParkingLot(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
    public void add(Car car){
        if(totalCapacity >=1){
            car.status = "parked";
            totalCapacity-=1;
        }
    }
}
