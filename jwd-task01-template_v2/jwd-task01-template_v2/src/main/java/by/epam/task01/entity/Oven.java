package by.epam.task01.entity;

import java.util.Objects;

public class Oven extends Appliance {

    private final Integer powerConsumption;
    private final Integer weight;
    private final Integer capacity;
    private final Integer depth;
    private final Double height;
    private final Double width;

    public Oven(Builder builder) {
        powerConsumption = builder.powerConsumption;
        weight = builder.weight;
        capacity = builder.capacity;
        depth = builder.depth;
        height = builder.height;
        width = builder.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Oven oven = (Oven) o;
        return Objects.equals(powerConsumption, oven.powerConsumption) &&
               Objects.equals(weight, oven.weight) &&
               Objects.equals(capacity, oven.capacity) &&
               Objects.equals(depth, oven.depth) &&
               Objects.equals(height, oven.height) &&
               Objects.equals(width, oven.width);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %d\n%s = %d\n%s = %d\n%s = %d\n%s = %.1f\n%s = %.1f\n",
                             this.getClass().getSimpleName(),
                             "POWER CONSUMPTION", powerConsumption,
                             "WEIGHT", weight,
                             "CAPACITY", capacity,
                             "DEPTH", depth,
                             "HEIGHT", height,
                             "WIDTH", width);
    }

    public static class Builder {

        private final Integer powerConsumption;
        private final Integer weight;
        private final Integer capacity;
        private final Integer depth;
        private final Double height;
        private final Double width;

        public Builder(Integer powerConsumption,
                       Integer weight,
                       Integer capacity,
                       Integer depth,
                       Double height,
                       Double width) {
            this.powerConsumption = powerConsumption;
            this.weight = weight;
            this.capacity = capacity;
            this.depth = depth;
            this.height = height;
            this.width = width;
        }

        public Oven build() {
            return new Oven(this);
        }
    }
}

