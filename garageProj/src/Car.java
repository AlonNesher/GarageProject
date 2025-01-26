class Car extends Vehicle {
    public Car() {
        super();
    }

    @Override
    public int getFixTime() {
        return 5;
    }

    @Override
    public void fixed() {
        System.out.println("Car 4 wheels fixed");
    }
}