import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Garage {

    private Protocol_Garage PG;
    public Garage(Protocol_Garage PG) {
        this.PG= PG;
    }


    public void startFixxing() {
        ArrayList<Vehicle> vehicles = DataBase.getVehicles();

        for (int i = 0; i < vehicles.size() - 1; i++) {


            int fixTime = vehicles.get(i).getFixTime();
            int elapsedTime = 0;

            System.out.println("Starting fixing for " + vehicles.get(i).getName() + ". Estimated time to fix: " + fixTime + " seconds.");

            while (elapsedTime < fixTime) {
                try {
                    Thread.sleep(1000);
                    elapsedTime++;
                    System.out.println(vehicles.get(i).getName() + " fixing in progress... " + elapsedTime + "/" + fixTime + " seconds.");
                } catch (InterruptedException e) {
                    System.out.println("fixing interrupted for " + vehicles.get(i).getName());
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            PG.fixed(vehicles.get(i));
            vehicles.get(i).fixed();




        }
        System.out.println("All vehicles have been repaired!");

    }
}