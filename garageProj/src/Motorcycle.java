class Motorcycle extends Vehicle {
    public Motorcycle() {
        super();
    }

    @Override
    public int getFixTime() {
        return 3;
    }

    @Override
    public void fixed() {
        System.out.println("Motorcycle 2 wheels fixed");
    }
}