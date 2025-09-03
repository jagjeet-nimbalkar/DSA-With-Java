package OOPs;

interface harbivore {
    void grass();
}

interface carnivore {
    void meat();
}

class Bear implements harbivore, carnivore {

    public void grass() {
        System.out.println("it can eat grass");
    }

    public void meat() {
        System.out.println("it also eat meat");
    }
}

public class practise {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.grass();
        b.meat();
    }
}
