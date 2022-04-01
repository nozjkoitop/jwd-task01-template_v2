package by.epam.task01.service.validation;

import by.epam.task01.entity.criteria.Criteria;
import by.epam.task01.entity.criteria.SearchCriteria;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class Validator {

    private static final Validator INSTANCE = new Validator();

    public static Validator getInstance() {
        return INSTANCE;
    }

    public boolean isValid(Criteria criteria) {
        String groupSearchName = criteria.getGroupSearchName();
        Set<String> criteriaNames = criteria.getCriteriaNames();

        for (Class<?> enumClass : SearchCriteria.class.getDeclaredClasses()) {
            Set<String> enumFields = new HashSet<>();
            if (enumClass.getSimpleName().equals(groupSearchName)) {
                int startEnumFieldsSize = getStartEnumFieldsSize(enumClass, enumFields);
                enumFields.addAll(criteriaNames);
                if (isSizeChanged(enumFields, startEnumFieldsSize)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getStartEnumFieldsSize(Class<?> enumClass, Set<String> enumFields) {
        for (Field enumField : enumClass.getDeclaredFields()) {
            enumFields.add(enumField.getName());
        }
        return enumFields.size();
    }

    private boolean isSizeChanged(Set<String> enumFields, int initialEnumFieldsSize) {
        return (enumFields.size() != initialEnumFieldsSize);
    }
}