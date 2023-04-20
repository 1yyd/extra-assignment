public class Test {
    public static void main(String[] args) {
        Wine wine1 = new Wine(54.5F);
        System.out.println(wine1.isShippingFree(12, 300));
        System.out.println( wine1.totalCost(10, 15));
        System.out.println(wine1.applyCoupon(10));
        System.out.println(wine1.applyCoupon(10,2));
        System.out.println(wine1.addWineGlasses(2, 12));

/*        System.out.println( wine1.newPrice(54.5F, 15));*/
/*        System.out.println( wine1.addFee( false,"Imported"));*/


    }
}
/* абстрактный класс продукт
поле цена
абст метод sellCost принимает кол-во ед. продукта  и скидку возвращает выручка
обычный метод принимает вес и расстояния до клиента и возвращает булиан (платная/бесплатаня доставка)
*
*
*/