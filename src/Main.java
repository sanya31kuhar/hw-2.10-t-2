public class Main {

    public static void main(String[] args) {

        MapStringInteger msi = new MapStringInteger();
        msi.addPair("125", 1);
        msi.addPair("125", 2);
        msi.addPair("258", 7);
        msi.addPair("377", 7);

        System.out.println(msi);
    }
}
