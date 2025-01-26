import  java.util.Scanner;

public class MainScreen {

    private static DataBase DB = new DataBase();


    public static void StartMain(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Garage Protocol");
        boolean running = true;

        while (running) {
            System.out.println("\nChoose a vehicle type to add:");
            System.out.println("1. Motorcycle");
            System.out.println("2. Car");
            System.out.println("3. Truck");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            Vehicle vehicle = null;
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    vehicle = new Motorcycle();
                    break;
                case 2:
                    vehicle = new Car();
                    break;
                case 3:
                    vehicle = new Truck();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting the protocol. Goodbye!\n\n");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 0.");
                    continue;
            }
            //PG.fixed();
            DataBase.addVehicle(vehicle);
        }
        Protocol_Garage protocolGarage = new Protocol_Garage() {
            @Override
            public void fixed(Vehicle vehicle) {
                System.out.println(vehicle.getName() + " has been successfully fixed!");
            }
        };

        Garage garage = new Garage(protocolGarage);
        garage.startFixxing();



        System.out.println("Vehicles:\n");
        for (int i = 0; i < DataBase.getVehicles().size(); i++) {
            if(DataBase.getVehicles().get(i) instanceof Motorcycle)
            {
                System.out.println((i + 1) +". is Motorcycle");
            }
            if(DataBase.getVehicles().get(i) instanceof Car)
            {
                System.out.println((i + 1) +". is Car");
            }
            if(DataBase.getVehicles().get(i) instanceof Truck)
            {
                System.out.println((i + 1) +". is Truck");
            }
        }
    }


}
