package accessModifier;

public class ImmutablePractice {

    private String cardHolderName;
    private long cardNumber;
   private String exprDate;


   public String getCardHolderName(){
       return cardHolderName;
   }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExprDate() {
        return exprDate;
    }
}
