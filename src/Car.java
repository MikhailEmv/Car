public class Car {
    private int speed;
    public Car() {
        this.speed = 10;
    }
    public Car(int speed) {
        this.speed = speed;
    }
    public void writeMessage() {
        System.out.printf("Hello, dude, now your speed is kind of %s km/h", speed);
        System.out.println("Yes");
    }
}
