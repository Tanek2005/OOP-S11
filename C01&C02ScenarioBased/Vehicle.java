class Vehicle {
    private String model;
    private int year;
    private int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0)
            this.speed = speed;
        else
            System.out.println("Speed cannot be negative!");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setModel("Tesla Model 3");
        v.setYear(2023);
        v.setSpeed(120);

        System.out.println("Vehicle Model: " + v.getModel());
        System.out.println("Year: " + v.getYear());
        System.out.println("Speed: " + v.getSpeed() + " km/h");
    }
}