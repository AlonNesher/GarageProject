class Truck extends Vehicle {
    public Truck() {
        super();
    }

    @Override
    public int getFixTime() {
        return 10;
    }

    @Override
    public void fixed() {
        System.out.println("Truck 6 wheels fixed");
    }
}