package by.epam.task01.service.impl;

import by.epam.task01.dao.ApplianceDAO;
import by.epam.task01.dao.DAOFactory;
import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;
import by.epam.task01.service.ApplianceService;
import by.epam.task01.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    private final Validator validator = Validator.getInstance();
    private final DAOFactory factory = DAOFactory.getInstance();

    @Override
    public List<Appliance> findAppliances(Criteria criteria) {

        if (!validator.isValid(criteria)) {
            throw new RuntimeException();
        }

        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        return applianceDAO.findAppliances(criteria);
    }

}
