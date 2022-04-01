package by.epam.task01.dao;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> findAppliances(Criteria criteria);
}
