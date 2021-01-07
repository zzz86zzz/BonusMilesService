
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int miles = service.calculate (5000);
        int constant = 20;
        System.out.println(miles);
    }
}