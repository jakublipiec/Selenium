package utility;

import com.github.javafaker.Faker;

public class DataFaker
{
    private Faker faker;

    public DataFaker()
    {
        faker = new Faker();
    }

    public String getNumber()
    {
        return String.valueOf(faker.number().randomDigit());
    }

    public String getChuckNorrisFact()
    {
        return faker.chuckNorris().fact();
    }


}
