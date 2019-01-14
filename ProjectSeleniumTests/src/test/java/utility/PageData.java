package utility;

import java.util.HashMap;
import java.util.Map;

public final class PageData
{
    public static final class SELECT_DROPDOWN_LIST_PAGE
    {
        public static Map<Integer, String> selectListDemoMessages;
        static
        {
            selectListDemoMessages = new HashMap<>();
            selectListDemoMessages.put(1, "Day selected :- Sunday");
            selectListDemoMessages.put(2, "Day selected :- Monday");
            selectListDemoMessages.put(3, "Day selected :- Tuesday");
            selectListDemoMessages.put(4, "Day selected :- Wednesday");
            selectListDemoMessages.put(5, "Day selected :- Thursday");
            selectListDemoMessages.put(6, "Day selected :- Friday");
            selectListDemoMessages.put(7, "Day selected :- Saturday");
        }
    }

    public static final class RADIO_BUTTON_DEMO_PAGE
    {
        public static Map<String, String> radioButtonDemoPanelCorrectMessages;
        static
        {
            radioButtonDemoPanelCorrectMessages = new HashMap<>();
            radioButtonDemoPanelCorrectMessages.put("NOTHING_CHOSEN", "Radio button is Not checked");
            radioButtonDemoPanelCorrectMessages.put("MALE_CHOSEN", "Radio button 'Male' is checked");
            radioButtonDemoPanelCorrectMessages.put("FEMALE_CHOSEN", "Radio button 'Female' is checked");
        }

        public static Map<String, String> groupRadioButtonsDemoPanelCorrectMessages;
        static
        {
            groupRadioButtonsDemoPanelCorrectMessages = new HashMap<>();
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

    public static final class JAVASCRIPT_ALERTS_PAGE
    {
        public static Map<String, String> javaScriptConfirmBoxCorrectMessages;
        static
        {
            javaScriptConfirmBoxCorrectMessages = new HashMap<>();

            javaScriptConfirmBoxCorrectMessages.put("ALERT_ACCEPT", "You pressed OK!");
            javaScriptConfirmBoxCorrectMessages.put("ALERT_DISMISS", "You pressed Cancel!");
        }

        public static Map<String, String> javaScriptAlertBoxWithNameCorrectMessages;
        static
        {
            javaScriptAlertBoxWithNameCorrectMessages = new HashMap<>();

            javaScriptAlertBoxWithNameCorrectMessages.put("BASE_INFO", "You have entered ");
        }
    }

    public static final class BOOTSTRAP_ALERTS_PAGE
    {
        public static Map<String, String> alertColors;
        static
        {
            alertColors = new HashMap<>();

            alertColors.put("SUCCESS", "#dff0d8");
            alertColors.put("WARNING", "#fcf8e3");
            alertColors.put("DANGER", "#f2dede");
            alertColors.put("INFO", "#d9edf7");
        }
    }

    public static final class CHECKBOX_DEMO_PAGE
    {
        public static Map<String, String> values;
        static
        {
            values = new HashMap<>();

            values.put("CHECK_ALL", "Check All");
            values.put("UNCHECK_ALL", "Uncheck All");
            values.put("SUCCESS", "Success - Check box is checked");
        }
    }
}
