package seminars.first.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.ARRAY;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.getProducts().add(new Product(2, "Dom"));
        shop.getProducts().add(new Product(45, "Poroshok"));
        shop.getProducts().add(new Product(107, "Rogozka"));
        shop.getProducts().add(new Product(7, "Drova"));
        shop.getProducts().add(new Product(18, "Pesok"));
        shop.getProducts().add(new Product(99, "Dusya"));

//   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
        //Проверим количество объектов в магазине:
        assertThat(shop.getProducts().size()).isEqualTo(6);

        //Проверим содержание имен в этом списке:
        assertThat(shop.getTitles()).contains("Dom", "Poroshok", "Rogozka", "Drova", "Pesok", "Dusya");
        assertThat(shop.getTitles()).containsSequence("Dom", "Poroshok", "Rogozka", "Drova", "Pesok", "Dusya");
        assertThat(shop.getTitles()).doesNotContain("Drain", "Pork", "Roza");
        assertThat(shop.getTitles()).doesNotHaveDuplicates();

//   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.

        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(107);

//   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).

        assertThat(shop.sortProductsByPrice()).containsSequence("Dom: 2", "Drova: 7", "Pesok: 18", "Poroshok: 45", "Dusya: 99", "Rogozka: 107");
        System.out.println(shop.sortProductsByPrice());

    }
}