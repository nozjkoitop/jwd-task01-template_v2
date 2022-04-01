package by.epam.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance {

    private final Integer powerConsumption;
    private final String filterType;
    private final String bagType;
    private final String wandType;
    private final Integer motorSpeedRegulation;
    private final Integer cleaningWidth;

    public VacuumCleaner(Builder builder) {
        powerConsumption = builder.powerConsumption;
        filterType = builder.filterType;
        bagType = builder.bagType;
        wandType = builder.wandType;
        motorSpeedRegulation = builder.motorSpeedRegulation;
        cleaningWidth = builder.cleaningWidth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
               Objects.equals(filterType, that.filterType) &&
               Objects.equals(bagType, that.bagType) &&
               Objects.equals(wandType, that.wandType) &&
               Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation) &&
               Objects.equals(cleaningWidth, that.cleaningWidth);
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s = %d\n%s = %s\n%s = %s\n%s = %s\n%s = %d\n%s = %d\n",
                             this.getClass().getSimpleName(),
                             "POWER CONSUMPTION", powerConsumption,
                             "FILTER TYPE", filterType.toUpperCase(),
                             "BAG TYPE", bagType.toUpperCase(),
                             "WAND TYPE", wandType.toUpperCase(),
                             "MOTOR SPEED REGULATION", motorSpeedRegulation,
                             "CLEANING WIDTH", cleaningWidth);
    }

    public static class Builder {

        private final Integer powerConsumption;
        private final String filterType;
        private final Integer motorSpeedRegulation;
        private final Integer cleaningWidth;
        private String bagType = "X4Y";
        private String wandType = "all-in-one";

        public Builder(Integer powerConsumption,
                       String filterType,
                       Integer motorSpeedRegulation,
                       Integer cleaningWidth) {
            this.powerConsumption = powerConsumption;
            this.filterType = filterType;
            this.motorSpeedRegulation = motorSpeedRegulation;
            this.cleaningWidth = cleaningWidth;
        }

        public Builder bagType(String bagType) {
            this.bagType = bagType;
            return this;
        }

        public Builder wandType(String wandType) {
            this.wandType = wandType;
            return this;
        }

        public VacuumCleaner build() {
            return new VacuumCleaner(this);
        }
    }
}
