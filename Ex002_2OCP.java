//https://youtu.be/GIIPo509Vpk?t=1253

public class Ex002_2OCP {

    public static void main(String[] args) {
        double price = 100;
        System.out.println("Цена продукта " + price);
        System.out.println("Цена для обычного клиента " + new BaseClient().getDiscount(price));
        System.out.println("Цена для серебренного клиента " + new SilverPartner().getDiscount(price));
        System.out.println("Цена для ВИП клиента " + new VIPPartner().getDiscount(price));
    }
}
    class BaseClient{
        public double getDiscount(double price) {
            return price * 0.95;
        }
    }
    class SilverPartner extends BaseClient {

        @Override
        public double getDiscount(double price) {
            return super.getDiscount(price) * 0.9;
        }
    }
    class VIPPartner extends SilverPartner {

        @Override
        public double getDiscount(double price) {
            return super.getDiscount(price) * 0.9;
        }
    }
