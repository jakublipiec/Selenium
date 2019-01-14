package utility;

import com.github.javafaker.Faker;

public class DataFaker
{
    private Faker faker;

    public DataFaker()
    {
        faker = new Faker();
    }

    public String getRandomNumber(int min, int max)
    {
        return String.valueOf(faker.number().numberBetween(min, max));
    }

    public String getRandomNumber()
    {
        return String.valueOf(faker.number().randomDigit());
    }

    public String getChuckNorrisFact()
    {
        return faker.chuckNorris().fact();
    }

    public String getRandomFirstName() { return faker.name().firstName(); }

    public String getRandomLastname()
    {
        return faker.name().lastName();
    }

    public String getRandomGmail()
    {
        return getRandomFirstName()+getRandomLastname()+"@gmail.com";
    }

    public String getRandomPhoneNumber()
    {
        return faker.phoneNumber().phoneNumber();
    }

    public String getRandomAddress()
    {
        return faker.address().streetName();
    }

    public String getRandomCity()
    {
        return faker.address().cityName();
    }

    public String getRandomZipCode()
    {
        return faker.address().zipCode();
    }

    public String getRandomWebside()
    {
        return faker.internet().domainName();
    }

    public String getRandomShakespeareHamlet()
    {
        return faker.shakespeare().hamletQuote();
    }
}
