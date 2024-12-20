package InheritanceDemo.Polymorphism.Overriding;

class Showroom {
    void channels() {
        System.out.println("Showroom: channels method");
    }

    void volumeControl() {
        System.out.println("Showroom: volumeControl method");
    }

    void settings() {
        System.out.println("Showroom: settings method");
    }
}

// Child class 1
class Onida extends Showroom {

  //  @Override
    void channels() {
        System.out.println("Onida: channels method");
    }

  //  @Override
    void volumeControl() {
        System.out.println("Onida: volumeControl method");
    }

  //  @Override
    void settings() {
        System.out.println("Onida: settings method");
    }
}

// Child class 2
class Samsang extends Showroom {
    @Override
    void channels() {
        System.out.println("Samsang: channels method");
    }

    @Override
    void volumeControl() {
        System.out.println("Samsang: volumeControl method");
    }

    @Override
    void settings() {
        System.out.println("Samsang: settings method");
    }
}

// Child class 3
class LG extends Showroom {
    @Override
    void channels() {
        System.out.println("LG: channels method");
    }

    @Override
    void volumeControl() {
        System.out.println("LG: volumeControl method");
    }

    @Override
    void settings() {
        System.out.println("LG: settings method");
    }
}


public class TestOverriding {

    public static void main(String[] args) {

        Showroom s = new LG(); // up casting
        s.channels();

    }
}
