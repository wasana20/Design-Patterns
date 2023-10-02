// The existing class with the incompatible interface
class OldSystem {
    public void legacyMethod() {
        System.out.println("Legacy method is called.");
    }
}

// The target interface expected by the new system
interface NewSystem {
    void newMethod();
}

// The adapter class that adapts OldSystem to NewSystem
class Adapter implements NewSystem {
    private OldSystem oldSystem;

    public Adapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void newMethod() {
        // Call the legacyMethod of OldSystem from the newMethod
        oldSystem.legacyMethod();
    }
}

// The new system that expects the NewSystem interface
class NewClient {
    public void performAction(NewSystem system) {
        System.out.println("New system is performing an action.");
        system.newMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of the old system
        OldSystem oldSystem = new OldSystem();

        // Create an adapter to make the old system compatible with the new system
        Adapter adapter = new Adapter(oldSystem);

        // Create an instance of the new system
        NewClient newClient = new NewClient();

        // Use the new system with the adapted old system
        newClient.performAction(adapter);
    }
}
