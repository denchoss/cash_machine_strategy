import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kassa produktoviy = new Produktoviy();
        Kassa auto_magazin = new Auto_magazin();
        Kassa    tabak = new Tabak();
        tabak.setAgeStrategy(new TabakStrategy());
        produktoviy.setAgeStrategy(new OtherStrategy());
        auto_magazin.setAgeStrategy(new OtherStrategy());
        Scanner in = new Scanner(System.in);
        System.out.println("Kakoy magaz?    1-produktoviy    2-auto_magazin    3-tabak");
        int shop=in.nextInt();
        switch(shop){
            case 1:
                produktoviy.age();
                produktoviy.paket();
                break;
            case 2:
                auto_magazin.age();
                auto_magazin.paket();
                break;
            case 3:
                tabak.age();
                tabak.paket();
                break;
            default:
                break;
        }

    }
}
