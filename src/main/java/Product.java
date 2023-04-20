public abstract class Product implements Interface2 {
    protected float price;

    public Product(float price) {
        this.price = price;
    }

    //реализация метода из интерфейса 2
    public float applyCoupon(float coupon) {
        price = price - coupon;
        System.out.print("You have applied a coupon for " + coupon + " rubles. Your total price is " + price);

        return price;
    }

    //перегрузка метода
    public float applyCoupon(float coupon, int amount) {
        price -= (coupon * amount);
        System.out.print("You have applied " + amount +
                " coupons for " + coupon + " rubles. Your total price is " + price);
        return price;
    }
    //определение асбтрактного метода
    public abstract float totalCost(int amount, float discount);

    //определение простого метода
    public boolean isShippingFree(int weight, long distance) {
        return weight < 50 || distance < 1000;
    }

}


