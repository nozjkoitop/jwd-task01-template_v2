package by.epam.task01.dao.impl;

import by.epam.task01.dao.ApplianceDAO;
import by.epam.task01.dao.Parser;
import by.epam.task01.dao.builder.controller.BuilderController;
import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final BuilderController controller = BuilderController.getInstance();
    private final Parser parser = Parser.getInstance();

    @Override
    public List<Appliance> findAppliances(Criteria criteria) {
        List<Appliance> appliancesByGroup = findByGroupSearchName(criteria);
        return new ArrayList<>(appliancesByGroup);
    }

    public List<Appliance> findByGroupSearchName(Criteria criteria) {
        List<Appliance> appliancesByGroup = new ArrayList<>();

        for (String applianceInfo : parser.getDatabaseLinesByGroup(criteria.getGroupSearchName())) {
            appliancesByGroup.add(controller.build(applianceInfo));
        }

        return appliancesByGroup;
    }
}