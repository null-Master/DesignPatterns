package v2.builder;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by wangym on 2017/2/28.
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("servingSize", servingSize)
                .add("servings", servings)
                .add("calories", calories)
                .add("fat", fat)
                .add("sodium", sodium)
                .add("carbohydrate", carbohydrate)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NutritionFacts that = (NutritionFacts) o;

        if (servingSize != that.servingSize) return false;
        if (servings != that.servings) return false;
        if (calories != that.calories) return false;
        if (fat != that.fat) return false;
        if (sodium != that.sodium) return false;
        return carbohydrate == that.carbohydrate;
    }

    @Override
    public int hashCode() {
        int result = servingSize;
        result = 31 * result + servings;
        result = 31 * result + calories;
        result = 31 * result + fat;
        result = 31 * result + sodium;
        result = 31 * result + carbohydrate;
        return result;
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static class Builder {
        //Required parameters
        private final int servingSize;
        private final int servings;

        //Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }
        public Builder fat (int val) {
            this.fat = val;
            return this;
        }
        public Builder carbohydrate (int val) {
            this.carbohydrate = val;
            return this;
        }
        public Builder sodium (int val) {
            this.sodium = val;
            return this;
        }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
