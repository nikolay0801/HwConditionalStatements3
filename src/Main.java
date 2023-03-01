public class Main {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryFrom1 = 20;
        int deliveryFrom2 = 50;
        int deliveryFrom3 = 60;
        int deliveryFrom4= 0;
        if (deliveryFrom1 <=20) {
            System.out.println("Потребуется 1 день,для доставки карты клиенту");
        }
        if (deliveryFrom2 ==50 ) {
            System.out.println("Потребуется 2 дня,для доставки карты клиенту");
        }
        if ( deliveryFrom3 >= 60) {
            System.out.println("Потребуется 3 дня,для доставки карты клиенту");
        } else if ( deliveryFrom4 ==0) {
            System.out.println("Доставка свыше 100 км не осуществляеться");
        }
    }
    }
