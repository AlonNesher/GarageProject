import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static  ArrayList<Vehicle> vehicles;

    public DataBase() {
        vehicles = new ArrayList<>();
    }

    public static void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public static ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
