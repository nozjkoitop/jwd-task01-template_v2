package by.epam.task01.dao.builder;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.Speakers;
import by.epam.task01.entity.criteria.SearchCriteria;

public class SpeakersBuilder extends AbstractBuilder {

    public SpeakersBuilder(String dataFromDB) {
        super(dataFromDB);
    }

    @Override
    public Appliance build() {

        Integer powerConsumption = getIntValueFromDB(SearchCriteria.Speakers.POWER_CONSUMPTION.toString());

        Integer numberOfSpeakers = getIntValueFromDB(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString());

        String frequencyRange = getStringValueFromDB(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());

        Integer cordLength = getIntValueFromDB(SearchCriteria.Speakers.CORD_LENGTH.toString());

        return new Speakers.Builder(powerConsumption, frequencyRange)
            .numberOfSpeakers(numberOfSpeakers)
            .cordLength(cordLength)
            .build();
    }
}
