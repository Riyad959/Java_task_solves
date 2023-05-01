//method overloading hoile

public class plus {
    public int add(int x, int y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(double x, double y) {
        return x + y;
    }
}


//method overriding hoile

public class tom_jarry {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

public class tom extends Animal {
    public void makeSound() {
        System.out.println("meow meow");
    }
}

public class bob extends tom_jarry {
    public void makeSound() {
        System.out.println("vau vau");
    }
}

//////////////////////////////super class