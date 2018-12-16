package utility;

import java.util.HashMap;
import java.util.Map;

public class PageData
{
    public static final class RADIO_BUTTON_DEMO_PAGE
    {
        public static Map<String, String> radioButtonDemoPanelCorrectMessages;
        static
        {
            radioButtonDemoPanelCorrectMessages = new HashMap<String, String>();
            radioButtonDemoPanelCorrectMessages.put("NOTHING_CHOSEN", "Radio button is Not checked");
            radioButtonDemoPanelCorrectMessages.put("MALE_CHOSEN", "Radio button 'Male' is checked");
            radioButtonDemoPanelCorrectMessages.put("FEMALE_CHOSEN", "Radio button 'Female' is checked");
        }

        public static Map<String, String> groupRadioButtonsDemoPanelCorrectMessages;
        static
        {
            groupRadioButtonsDemoPanelCorrectMessages = new HashMap<String, String>();
            groupRadioButtonsDemoPanelCorrectMessages.put("NOTHING_CHOSEN", "Sex :\nAge group:");
            groupRadioButtonsDemoPanelCorrectMessages.put("MALE_CHOSEN", "Sex : Male\nAge group:");
            groupRadioButtonsDemoPanelCorrectMessages.put("FEMALE_CHOSEN", "Sex : Female\nAge group:");
            groupRadioButtonsDemoPanelCorrectMessages.put("FIRST_AGE_GROUP_CHOSEN", "Sex :\nAge group: 0 - 5");
            groupRadioButtonsDemoPanelCorrectMessages.put("SECOND_AGE_GROUP_CHOSEN", "Sex :\nAge group: 5 - 15");
            groupRadioButtonsDemoPanelCorrectMessages.put("THIRD_AGE_GROUP", "Sex :\nAge group: 15 - 50");
            groupRadioButtonsDemoPanelCorrectMessages.put("MALE_AND_FIRST_AGE_GROUP_CHOSEN", "Sex : Male\nAge group: 0 - 5");
            groupRadioButtonsDemoPanelCorrectMessages.put("MALE_AND_SECOND_AGE_GROUP_CHOSEN", "Sex : Male\nAge group: 5 - 15");
            groupRadioButtonsDemoPanelCorrectMessages.put("MALE_AND_THIRD_AGE_GROUP_CHOSEN", "Sex : Male\nAge group: 15 - 50");
            groupRadioButtonsDemoPanelCorrectMessages.put("FEMALE_AND_FIRST_AGE_GROUP_CHOSEN", "Sex : Female\nAge group: 0 - 5");
            groupRadioButtonsDemoPanelCorrectMessages.put("FEMALE_AND_SECOND_AGE_GROUP_CHOSEN", "Sex : Female\nAge group: 5 - 15");
            groupRadioButtonsDemoPanelCorrectMessages.put("FEMALE_AND_THIRD_AGE_GROUP_CHOSEN", "Sex : Female\nAge group: 15 - 50");
        }
    }
}
