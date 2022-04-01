package by.epam.task01.dao.builder;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.Refrigerator;
import by.epam.task01.entity.criteria.SearchCriteria;

public class RefrigeratorBuilder extends AbstractBuilder {

    public RefrigeratorBuilder(String dataFromDB) {
        super(dataFromDB);
    }

    @Override
    public Appliance build() {

        Integer powerConsumption = getIntValueFromDB(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString());

        Integer weight = getIntValueFromDB(SearchCriteria.Refrigerator.WEIGHT.toString());

        Integer freezerCapacity = getIntValueFromDB(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString());

        Double overallCapacity = getDoubleValueFromDB(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString());

        Integer height = getIntValueFromDB(SearchCriteria.Refrigerator.HEIGHT.toString());

        Integer width = getIntValueFromDB(SearchCriteria.Refrigerator.WIDTH.toString());

        return new Refrigerator.Builder(powerConsumption, weight, freezerCapacity, overallCapacity, height, width)
            .build();
    }
}
