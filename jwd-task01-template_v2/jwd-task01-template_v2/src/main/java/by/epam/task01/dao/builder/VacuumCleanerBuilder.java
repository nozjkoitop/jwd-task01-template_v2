package by.epam.task01.dao.builder;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.VacuumCleaner;
import by.epam.task01.entity.criteria.SearchCriteria;

public class VacuumCleanerBuilder extends AbstractBuilder {

    public VacuumCleanerBuilder(String dataFromDB) {
        super(dataFromDB);
    }

    @Override
    public Appliance build() {

        Integer powerConsumption = getIntValueFromDB(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString());

        String filterType = getStringValueFromDB(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());

        String bagType = getStringValueFromDB(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());

        String wandType = getStringValueFromDB(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());

        Integer motorSpeedRegulation = getIntValueFromDB(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString());

        Integer cleaningWidth = getIntValueFromDB(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString());

        return new VacuumCleaner.Builder(powerConsumption, filterType, motorSpeedRegulation, cleaningWidth)
            .bagType(bagType)
            .wandType(wandType)
            .build();
    }
}
