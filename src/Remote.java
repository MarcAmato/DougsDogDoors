import java.util.Timer;
import java.util.TimerTask;

// Allow a remote control to operate the dog door.
public class Remote {

    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        // Check the state of the door before opening/closing.
        if(door.isOpen()) {
            door.close();
        } else {
            door.open();

            // Create a new Timer so we can schedule the dog door closing
            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                // All the task does is close the door, and then turn off the timer.
                public void run() {
                    door.close();
                    timer.cancel();
                }
            }, 5000);
        }
    }
}

