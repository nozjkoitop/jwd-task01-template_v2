package by.epam.task01.dao.builder;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.TabletPC;
import by.epam.task01.entity.criteria.SearchCriteria;

public class TabletPCBuilder extends AbstractBuilder {

    public TabletPCBuilder(String dataFromDB) {
        super(dataFromDB);
    }

    @Override
    public Appliance build() {

        Integer batteryCapacity = getIntValueFromDB(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString());

        Integer displayInches = getIntValueFromDB(SearchCriteria.TabletPC.DISPLAY_INCHES.toString());

        Integer memoryRom = getIntValueFromDB(SearchCriteria.TabletPC.MEMORY_ROM.toString());

        Integer flashMemoryCapacity = getIntValueFromDB(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString());

        String color = getStringValueFromDB(SearchCriteria.TabletPC.COLOR.toString());

        return new TabletPC.Builder(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity)
            .color(color)
            .build();
    }
}
