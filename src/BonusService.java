public class BonusService {
    public int calculate (int price) {
        int constant = 20;
        int miles = price/constant;
        return miles;
    }
}
