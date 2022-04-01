package by.epam.task01.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Parser {

    private static final Parser INSTANCE = new Parser();
    private static final String DATASOURCE_NAME = "appliances_db.txt";
    private static final String SPECIFICATION_LIMIT = ",";
    private static final String VALUE_LIMIT = "=";
    private static final String LINE_LIMIT = ";";
    private static final String GROUP_LIMIT = ":";
    private static final String REGEX_EMPTY = "";
    private static final String REGEX_GROUP = "\\w+:";
    private static final String REGEX_SPACE = "\\s+";
    private static final Integer VALUE_POSITION_IN_DB = 1;
    private static final Integer NAME_POSITION_IN_DB = 0;

    private static final List<String> DATABASE_LINES = new ArrayList<>();

    static {
        loadDatabaseToList();
    }

    private Parser() {
    }

    private static void loadDatabaseToList() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFullDBPath()))) {
            while (bufferedReader.ready()) {
                String applianceInfo = bufferedReader.readLine();
                DATABASE_LINES.add(applianceInfo);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static String getFullDBPath() {
        URL dbUrl = getInstance().getClass().getClassLoader().getResource(DATASOURCE_NAME);
        return Objects.requireNonNull(dbUrl).getPath();
    }

    public static String defineApplianceGroup(String applianceInfo) {
        String lineWithoutSpaces = applianceInfo.replaceAll(REGEX_SPACE, REGEX_EMPTY);
        Pattern applianceGroupPattern = Pattern.compile(REGEX_GROUP);
        Matcher applianceGroupMatcher = applianceGroupPattern.matcher(lineWithoutSpaces);
        String applianceGroupName = null;
        if (applianceGroupMatcher.find()) {
            applianceGroupName = applianceGroupMatcher.group().replace(GROUP_LIMIT, REGEX_EMPTY);
        }
        return applianceGroupName;
    }

    public static Map<String, Object> parseLineToSpecification(String applianceInfo) {
        Map<String, Object> specificationFromDB = new HashMap<>();
        String lineWithReplaces = applianceInfo.replaceAll(REGEX_SPACE, REGEX_EMPTY)
            .replaceAll(REGEX_GROUP, REGEX_EMPTY)
            .replace(LINE_LIMIT, REGEX_EMPTY);
        String[] specifications = lineWithReplaces.split(SPECIFICATION_LIMIT);
        for (String specification : specifications) {
            String[] nameAndValue = specification.split(VALUE_LIMIT);
            specificationFromDB.put(nameAndValue[NAME_POSITION_IN_DB], nameAndValue[VALUE_POSITION_IN_DB]);
        }
        return specificationFromDB;
    }

    public static Parser getInstance() {
        return INSTANCE;
    }

    public List<String> getDatabaseLinesByGroup(String groupName) {
        List<String> linesByGroup = new ArrayList<>();
        for (String line : DATABASE_LINES) {
            if (line.startsWith(groupName)) {
                linesByGroup.add(line);
            }
        }
        return linesByGroup;
    }

}
