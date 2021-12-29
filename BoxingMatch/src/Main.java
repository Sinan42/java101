public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("f1" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("f2" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
        r.gameLine();

    }
}
