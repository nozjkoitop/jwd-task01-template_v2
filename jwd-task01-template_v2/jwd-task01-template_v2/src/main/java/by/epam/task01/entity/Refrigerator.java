package by.epam.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private final Integer powerConsumption;
    private final Integer weight;
    private final Integer freezerCapacity;
    private final Double overallCapacity;
    private final Integer height;
    private final Integer width;

    public Refrigerator(Builder builder) {
        powerConsumption = builder.powerConsumption;
        weight = builder.weight;
        freezerCapacity = builder.freezerCapacity;
        overallCapacity = builder.overallCapacity;
        height = builder.height;
        width = builder.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
               Objects.equals(weight, that.weight) &&
               Objects.equals(freezerCapacity, that.freezerCapacity) &&
               Objects.equals(overallCapacity, that.overallCapacity) &&
               Objects.equals(height, that.height) &&
               Objects.equals(width, that.width);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %d\n%s = %d\n%s = %d\n%s = %.1f\n%s = %d\n%s = %d\n",
                             this.getClass().getSimpleName(),
                             "POWER CONSUMPTION", powerConsumption,
                             "WEIGHT", weight,
                             "FREEZER CAPACITY", freezerCapacity,
                             "OVERALL CAPACITY", overallCapacity,
                             "HEIGHT", height,
                             "WIDTH", width);
    }

    public static class Builder {

        private final Integer powerConsumption;
        private final Integer weight;
        private final Integer freezerCapacity;
        private final Double overallCapacity;
        private final Integer height;
        private final Integer width;

        public Builder(Integer powerConsumption,
                       Integer weight,
                       Integer freezerCapacity,
                       Double overallCapacity,
                       Integer height,
                       Integer width) {
            this.powerConsumption = powerConsumption;
            this.weight = weight;
            this.freezerCapacity = freezerCapacity;
            this.overallCapacity = overallCapacity;
            this.height = height;
            this.width = width;
        }

        public Refrigerator build() {
            return new Refrigerator(this);
        }
    }
}
