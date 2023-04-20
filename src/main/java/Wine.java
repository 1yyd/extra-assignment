public class Wine extends Product implements Interface1 {
    public Wine(float price) {
        super(price);
    }

    //реализация асбтрактного метода из абстрактного класса
    @Override
    public float totalCost(int amount, float discount) {
        float total;
        total = amount * price - (price * (discount / 100));
        System.out.print("Your total is: ");
        return total;
    }

    //переопределение обычного метода из абстрактного класса
    @Override
    public boolean isShippingFree(int weight, long distance) {
        System.out.print("Is your shipping free?: ");
        return super.isShippingFree(weight - 25, distance);
    }

    //реализация метода из интерфейса1
    @Override
    public float addWineGlasses(int glasses, float glassPrice) {
        price += glasses * glassPrice;
        System.out.print("You have added " + glasses + " wine glasses your total price is: ");
        return price;
    }

    //переопределение метода из абстрактного класса из интерфейса2
    @Override
    public float applyCoupon(float coupon) {
        System.out.print("You can't apply coupons to alcohol! You price is: " );
        return price;
    }

    //переопределение перегруженого метода из абстрактного класса из интерфейса2
    @Override
    public float applyCoupon(float coupon, int amount) {
        System.out.print("You can't apply 1 or more coupons to alcohol! You price is: ");
        return price;
    }

}
