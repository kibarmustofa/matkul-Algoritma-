public class DragonMain14 {
    public static void main(String[] args) {
        Dragon14 dragon = new Dragon14(3, 5, 10, 10);

        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();

        for (int i = 0; i < 12; i++) {
            dragon.moveRight();
            dragon.printPosition();
        }
        for (int i = 0; i < 12; i++) {
            dragon.moveDown();
            dragon.printPosition();
        }
    }
}
