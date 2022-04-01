package by.epam.task01.dao.builder;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.Oven;
import by.epam.task01.entity.criteria.SearchCriteria;

public class OvenBuilder extends AbstractBuilder {

    public OvenBuilder(String dataFromDB) {
        super(dataFromDB);
    }

    @Override
    public Appliance build() {

        Integer powerConsumption = getIntValueFromDB(SearchCriteria.Oven.POWER_CONSUMPTION.toString());

        Integer weight = getIntValueFromDB(SearchCriteria.Oven.WEIGHT.toString());

        Integer capacity = getIntValueFromDB(SearchCriteria.Oven.CAPACITY.toString());

        Integer depth = getIntValueFromDB(SearchCriteria.Oven.DEPTH.toString());

        Double height = getDoubleValueFromDB(SearchCriteria.Oven.HEIGHT.toString());

        Double width = getDoubleValueFromDB(SearchCriteria.Oven.WIDTH.toString());

        return new Oven.Builder(powerConsumption, weight, capacity, depth, height, width)
            .build();
    }
}
