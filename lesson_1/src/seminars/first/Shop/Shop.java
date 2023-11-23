package seminars.first.Shop;

import java.util.*;


public class Shop {
    private List<Product> products;

    public Shop() {
        this.products = new ArrayList<Product>();
    }


    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод возвращающий имена товаров списком
    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Product product : products
        ) {
            titles.add(product.getTitle());
        }
        return titles;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<String> sortProductsByPrice() {

        List<String> titles = new ArrayList<>(); //  создаем список имен товаров на выходе
        List<Integer> prices = new ArrayList<>(); //  создаем список цен

        // создаем список цен
        for (Product product : products) {
            prices.add(product.getCost());
        }
        // сортируем список цен
        Collections.sort(prices);

        // Создаем список имен товаров, сравнивая по совпадению цен
        for (int i = 0; i < prices.size(); i++) {    //   2,3,4,5,8
            for (int j = 0; j < prices.size(); j++) {
                if (prices.get(i) == products.get(j).getCost()) {
                    titles.add(products.get(j).getTitle() + ": " + products.get(j).getCost()); // наименование и цена товара
                }
            }

        }
        return titles;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        int maxCost = 0;
        int maxIndex = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() > maxCost) {
                maxCost = products.get(i).getCost();
                maxIndex = i;
            }
        }
        return products.get(maxIndex);
    }


}

