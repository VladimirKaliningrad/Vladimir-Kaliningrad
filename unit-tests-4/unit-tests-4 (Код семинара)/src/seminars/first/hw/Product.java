package seminars.first.hw;

public class Product implements Comparable<Product> { // добавляем возможность сравнивать объекты Product
    private Integer cost; // Стоимость продукта    int -> Integer
    private String title; // Название

    // Геттеры, сеттеры:
    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //  Задаем критерии упорядочивания объектов:
    //  compareTo в Java сравнивает вызывающий объект с объектом,
    //  переданным в качестве параметра и возвращает в результате выполнения сравнения целое число:
    //  положительное, если вызывающий объект больше объекта, переданного в качестве параметра;
    //  отрицательное, если вызывающий объект меньше объекта, переданного в качестве параметра;
    //  0, если объекты равны
    @Override
    public int compareTo(Product product) {
        return this.getCost().compareTo(product.getCost());
    }
}