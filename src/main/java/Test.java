public class Test {
    public static void main(String[] args) {

        Wine wine1 = new Wine(54.5F);
        System.out.println(wine1.isShippingFree(12, 300));
        System.out.println( wine1.totalCost(10, 15));
        System.out.println(wine1.applyCoupon(10));
        System.out.println(wine1.applyCoupon(10,2));
        System.out.println(wine1.addWineGlasses(2, 12));


    }
}
