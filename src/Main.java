public class Main {
    public static void main(String[] args) {
        double d1 = 20;
        double d2 = 25;
        double k = 10;
        double diff = Math.PI * (Math.pow(d2 / 2, 2) - Math.pow(d1 / 2, 2));

        System.out.println("На " + Math.round(diff * k) + " калорий меньше в пицце диаметром 20 см, чем в пицце диаметром 25 см, если 1 кв.см. пиццы равен 10 калориям");
    }
}
