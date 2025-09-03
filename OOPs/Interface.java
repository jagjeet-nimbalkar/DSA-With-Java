package OOPs;

public class Interface {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.move();
    }
}

// create interface
interface chasePlayer {
    void move();
}

class Queen implements chasePlayer {
    public void move() {
        System.out.println("up,dowm,left,right,diagonal(all dir) ");
    }
}

class Rook implements chasePlayer {
    public void move() {
        System.out.println("up,dowm,left,right");
    }
}

class King implements chasePlayer {
    public void move() {
        System.out.println("up,dowm,left,right,diagonal(by 1 step) ");
    }
}