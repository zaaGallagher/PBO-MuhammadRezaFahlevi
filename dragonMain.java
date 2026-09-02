public class dragonMain {
    public static void main(String[] args) {

        Dragon d1 = new Dragon();
        Dragon d2 = new Dragon();

        System.out.println("Posisi awal Dragon 1:");
        d1.printStatus();

        System.out.println("\nDragon bergerak ke kanan sejauh 5 langkah:");
        d1.changeDirection(2); // Kanan
        d1.move(5);
        d1.printStatus();

        System.out.println("\nDragon bergerak ke bawah sejauh 2 langkah:");
        d1.changeDirection(1);
        d2.changeDirection(3);
        d2.move(3);
        d2.printStatus();
    }
}