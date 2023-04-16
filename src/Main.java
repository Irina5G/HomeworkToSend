public class Main {
    public static void main(String[] args) {
                printDaysOfDelivery (95);
    }

   public static int printDaysOfDelivery (int deliveryDistance) {

       if (deliveryDistance > 80) {
           System.out.println("Доставка невозможна");
       } else {
           int daysOfDelivery = deliveryDistance / 20 + 1;
           System.out.println("Потребуется дней: " + daysOfDelivery);
       }
return deliveryDistance;
   }
}