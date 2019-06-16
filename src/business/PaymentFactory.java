package business;

public class PaymentFactory {
    public Payment createInstance(PaymentType paymentType){
        switch (paymentType){
            case BOLETO:
                return new PaymentBoleto();
            case PAYPAL:
                return new PaymentPayPal();
            case DEBITCARD:
                return new PaymentDebitCard();
            case CREDITCARD:
                return new PaymentCreditCard();
            default:
                return null;
        }
    }
}
