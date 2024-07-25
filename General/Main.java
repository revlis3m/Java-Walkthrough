package General;

public class Main {
    public static void main(String[] args) {
        Solo<Integer> val = new Solo<Integer>(12);
        int number = val.getValeur();

        // Solo<Integer> val = new Solo<Integer>("toto");
        // int nbre = val.getValeur();

        Solo<String> valS = new Solo<String>("TOTOTOTO");
        Solo<Float> valF = new Solo<Float>(12.2f);
        Solo<Double> valD = new Solo<Double>(12.202568);
    }
}
