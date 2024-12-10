package poly.ex.pay;

public class PayChoice {
    private PayChoice(){}
    public static Pay findPay(String option){
        return switch (option){
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "toss" -> new TossPay();
            default -> new DefaultPay();
        };
    }
}
