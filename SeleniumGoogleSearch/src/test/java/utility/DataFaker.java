package utility;

import com.github.javafaker.Faker;

public class DataFaker
{
    private Faker faker;

    public DataFaker()
    {
        faker = new Faker();
    }

    public String getFakeCity()
    {
        return faker.address().cityName();
    }
}
