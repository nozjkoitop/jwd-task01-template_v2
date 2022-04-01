package by.epam.task01.dao.builder.controller;

import by.epam.task01.dao.builder.LaptopBuilder;
import by.epam.task01.dao.builder.OvenBuilder;
import by.epam.task01.dao.builder.RefrigeratorBuilder;
import by.epam.task01.dao.builder.SpeakersBuilder;
import by.epam.task01.dao.builder.TabletPCBuilder;
import by.epam.task01.dao.builder.VacuumCleanerBuilder;
import by.epam.task01.dao.Parser;
import by.epam.task01.entity.Appliance;

public class BuilderController {

    private static final BuilderController INSTANCE = new BuilderController();


    private BuilderController() {

    }

    public static BuilderController getInstance() {
        return INSTANCE;
    }

    public Appliance build(String dataFromDB) {

        String applianceGroup = Parser.defineApplianceGroup(dataFromDB);

        return switch (applianceGroup) {

            case "Laptop" -> new LaptopBuilder(dataFromDB).build();

            case "Oven" -> new OvenBuilder(dataFromDB).build();

            case "Refrigerator" -> new RefrigeratorBuilder(dataFromDB).build();

            case "Speakers" -> new SpeakersBuilder(dataFromDB).build();

            case "TabletPC" -> new TabletPCBuilder(dataFromDB).build();

            case "VacuumCleaner" -> new VacuumCleanerBuilder(dataFromDB).build();

            default -> throw new RuntimeException();
        };
    }
}

