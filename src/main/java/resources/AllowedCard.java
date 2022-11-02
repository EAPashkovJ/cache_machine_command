package resources;

import java.util.ListResourceBundle;

public class AllowedCard extends ListResourceBundle {


    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"55554444333322221111", "5555"},
                {"12345678912333422123", "1234"},
                {"43215678910111213145", "4321"}
        };
    }
}

