package AbstractClasses;

public class Camera extends Machine{
    public void start() {
        System.out.println("Camera");

    };

    public void doStuff() {
        System.out.println("doing things");
    }

    public void shutdown() {
        System.out.println("shutting down");
    }
}
