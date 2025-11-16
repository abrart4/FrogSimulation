public class Main {
    public static void main(String[] args) {
        FrogSimulation frog = new FrogSimulation(24, 5);
        System.out.println(frog.simulate());
        System.out.println(frog.runSimulations(67 * 41 * 45 * 61));
        // i should graph this
    }
}
