package by.epam.task01.service;

import by.epam.task01.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ApplianceService getApplianceService() {
        return applianceService;
    }
}
