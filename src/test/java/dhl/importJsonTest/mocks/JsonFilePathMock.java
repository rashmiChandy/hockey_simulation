package dhl.importJsonTest.mocks;

import dhl.inputOutput.importJson.interfaces.IJsonFilePath;

public class JsonFilePathMock implements IJsonFilePath {

    private static IJsonFilePath uniqueInstance = null;

    private JsonFilePathMock(){

    }

    public static IJsonFilePath instance(){
        if (null == uniqueInstance){
            uniqueInstance = new JsonFilePathMock();
        }
        return uniqueInstance;
    }

    private static final String FILEPATH = "src/test/java/dhl/mocks/MockData2.json";
    public static final String INCORRECTJSONFILEPATH = "src/test/java/dhl/mocks/IncorrectMockData.json";

    public String getFilePath() {
        return FILEPATH;
    }

    public String getIncorrectJsonfilepath() {
        return INCORRECTJSONFILEPATH;
    }

    public String getLeagueArrayKey() {
        return "leagueName";
    }

    public String getConferenceArrayKey() {
        return "conferences";
    }

    public String getFreeAgentArrayKey() {
        return "freeAgents";
    }

}