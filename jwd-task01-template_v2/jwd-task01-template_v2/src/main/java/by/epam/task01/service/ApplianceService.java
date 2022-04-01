package by.epam.task01.service;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {

    List<Appliance> findAppliances(Criteria criteria);

}
