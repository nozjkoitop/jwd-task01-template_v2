package by.epam.task01.dao;

import by.epam.task01.dao.impl.ApplianceDAOImpl;

public final class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }
}
