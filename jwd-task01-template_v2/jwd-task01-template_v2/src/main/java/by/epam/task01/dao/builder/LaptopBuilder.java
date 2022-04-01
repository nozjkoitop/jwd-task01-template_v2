package by.epam.task01.dao.builder;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.Laptop;
import by.epam.task01.entity.criteria.SearchCriteria;

public class LaptopBuilder extends AbstractBuilder {

    public LaptopBuilder(String dataFromDB) {
        super(dataFromDB);
    }

    @Override
    public Appliance build() {

        Double batteryCapacity = getDoubleValueFromDB(SearchCriteria.Laptop.BATTERY_CAPACITY.toString());

        String os = getStringValueFromDB(SearchCriteria.Laptop.OS.toString());

        Integer memoryRom = getIntValueFromDB(SearchCriteria.Laptop.MEMORY_ROM.toString());

        Integer systemMemory = getIntValueFromDB(SearchCriteria.Laptop.SYSTEM_MEMORY.toString());

        Double cpu = getDoubleValueFromDB(SearchCriteria.Laptop.CPU.toString());

        Integer displayInchs = getIntValueFromDB(SearchCriteria.Laptop.DISPLAY_INCHS.toString());

        return new Laptop.Builder(batteryCapacity, memoryRom, systemMemory, cpu, displayInchs)
            .os(os)
            .build();
    }
}
