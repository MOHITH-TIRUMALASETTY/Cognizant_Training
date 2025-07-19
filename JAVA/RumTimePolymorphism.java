class Shape {
    void Area() {
        System.out.println("Inside Shape");
    }
}

class Circle extends Shape {
    void Area() {
        System.out.println("Inside circle");
    }
}

public class RumTimePolymorphism {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.Area();

    }
}
