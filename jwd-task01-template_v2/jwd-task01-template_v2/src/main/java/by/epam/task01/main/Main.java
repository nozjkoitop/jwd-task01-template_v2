package by.epam.task01.main;

import by.epam.task01.entity.Appliance;
import by.epam.task01.entity.criteria.Criteria;
import by.epam.task01.entity.criteria.SearchCriteria;
import by.epam.task01.service.ApplianceService;
import by.epam.task01.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);

        appliance = service.findAppliances(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(SearchCriteria.Oven.class.getSimpleName());
        criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
        criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

        appliance = service.findAppliances(criteriaOven);

        PrintApplianceInfo.print(appliance);

        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
        criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
        criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

        appliance = service.findAppliances(criteriaOven);// find(Object...obj)

        PrintApplianceInfo.print(appliance);

    }

}
