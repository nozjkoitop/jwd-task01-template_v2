package by.epam.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {

    private final String groupSearchName;
    private final Map<String, Object> criteria = new HashMap<>();

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public Set<String> getCriteriaNames() {
        return criteria.keySet();
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Map<String, Object> getCriteria() {
        return criteria;
    }
}

