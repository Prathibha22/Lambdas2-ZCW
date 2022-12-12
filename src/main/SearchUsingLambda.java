package main;

import java.time.LocalDate;
import java.util.function.Predicate;

public class SearchUsingLambda implements CheckPerson{
    Predicate<Integer> ageOver50 = x -> x > 50;
    @Override
    public boolean test(Person p) {
        return ageOver50.test( LocalDate.now().getYear()-p.birthday.getYear());
    }
}
