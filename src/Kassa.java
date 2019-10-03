import java.util.Scanner;
public class Kassa {
    Scanner in = new Scanner(System.in);
    AgeStrategy ageStrategy;
    int pak;
    public void paket() {
        System.out.print("Paket nujen?   1-da    2-net");
        pak = in.nextInt();
        if(pak==1){
            System.out.print("Paket 5 rub");
        }else{
            System.out.print("ok");
        }
    }
    public void age() {
        ageStrategy.age();
    }
    public void setAgeStrategy(AgeStrategy ageStrategy) {
        this.ageStrategy = ageStrategy;
    }
}
