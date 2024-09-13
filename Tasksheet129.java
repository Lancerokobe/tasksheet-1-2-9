interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Put gorilla food into cage.");
            return true;
        } else {
            System.out.println("Not the time to feed the gorilla.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        System.out.println("Pet at your own risk!");
    }
}

public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}