import java.util.Scanner;
public class TabakStrategy implements AgeStrategy{
    @Override
    public void age() {
        Scanner in = new Scanner(System.in);
        System.out.println("Skolko let?");
        int vozrast = in.nextInt();
        if(vozrast<18){
            System.out.println("zapret prodaji");

        }else{
            System.out.println("razreshenie prodaji");
        }
    }
}
