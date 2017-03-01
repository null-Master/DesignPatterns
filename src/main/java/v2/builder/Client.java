package v2.builder;

/**
 * Created by wangym on 2017/2/28.
 */
public class Client {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);
    }
}
