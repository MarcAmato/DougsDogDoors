public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        // Create the BarkRecognizer and connect it too the door, and let it listen for some barking.
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        // Simulate the hardware hearing a bark.
        System.out.println("Fido starts barking.");
        recognizer.recognize("Woof");

        System.out.println("Fido has gone outside...\n");
        System.out.println("Fido's all done...\n");

        // Test the alternative path
        try {
            // Simulate time passing.
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {}

        // Test the process when Fido's outside just too make sure everything works like it should.
        System.out.println("\nFido starts barking...");
        recognizer.recognize("Woof");

        System.out.println("Fido's back inside...\n");
    }
}
