package by.epam.task01.dao.builder;

import by.epam.task01.dao.Parser;

import java.util.Map;

public abstract class AbstractBuilder implements Builder {

    private final Map<String, Object> specification;

    public AbstractBuilder(String dataFromDB) {
        this.specification = Parser.parseLineToSpecification(dataFromDB);
    }

    protected String getStringValueFromDB(String criteriaName) {
        return (String) specification.get(criteriaName);
    }

    protected Integer getIntValueFromDB(String criteriaName) {
        return Integer.parseInt((String) specification.get(criteriaName));
    }

    protected Double getDoubleValueFromDB(String criteriaName) {
        return Double.parseDouble((String) specification.get(criteriaName));
    }
}

