package java8.Section6.Stream;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CountryTest {

    @Test
    public void countries() {
        Country country1 = new Country("Canada", "North America", 38634481, 10.0);
        Country country2 = new Country("Brazil", "South America", 215865480, 8.5);
        Country country3 = new Country("Mexico", "North America", 128032195, 2.0);
        Country country4 = new Country("Ethiopia", "Africa", 125099394, 1.1);
        Country country5 = new Country("Indonesia", "Southeast Asia", 276503437, 1.9);
        Country country6 = new Country("Ukraine", "Europa", 36138156, 0.603);

        List<Country> listOfCountries = Arrays.asList(country1, country2, country3,
                country4, country5, country6);

//        Predicate<Country> predicatePopulations = country -> country.populations > 30000000;
//        filterCountries(listOfCountries, country -> country.name.contains("U"));


         listOfCountries = listOfCountries.stream().sorted(
                (x,y)-> x.getName().compareTo(y.getName())
        ).collect(Collectors.toList());
        System.out.println(listOfCountries);

    }

    public void filterCountries(List<Country> listOfCountries, Predicate<Country> predicate) {
        for (Country country : listOfCountries) {
            if (predicate.test(country)) {
                System.out.println(country);
            }
        }
    }
}
