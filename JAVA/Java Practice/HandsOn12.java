import java.util.*;

interface Compartment {
    void notice(); 
}

class FirstClass implements Compartment {
    public void notice() {
        System.out.println("First class");
    }
}

class Ladies implements Compartment {
    public void notice() {
        System.out.println("Ladies");
    }
}

class General implements Compartment {
    public void notice() {
        System.out.println("General");
    }
}

class LuggageClasses implements Compartment {
    public void notice() {
        System.out.println("Luggage");
    }
}

public class HandsOn12 {
    public static void main(String[] args) {
        Compartment[] C = new Compartment[10];
        Random r = new Random();

        for (int i = 0; i < C.length; i++) {
            int T = r.nextInt(4) + 1;

            if (T == 1) {
                C[i] = new FirstClass();
            } else if (T == 2) {
                C[i] = new Ladies();
            } else if (T == 3) {
                C[i] = new General();
            } else {
                C[i] = new LuggageClasses();
            }
        }

        for (int i = 0; i < C.length; i++) {
            System.out.print("Compartment " + (i + 1) + ": ");
            C[i].notice(); 
        }
    }
}
