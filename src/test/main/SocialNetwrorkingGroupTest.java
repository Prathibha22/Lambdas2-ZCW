package main;



import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class SocialNetwrorkingGroupTest{

    @Test
    public void printPeople() {

           main.Person p = new main.Person("Koti", LocalDate.of(1986, 8, 17), main.Person.Sex.MALE, "koti@email.com");
            List<main.Person> lstPerson = new ArrayList<>();
            lstPerson.add(p);
            main.SocialNetwrorkingGroup ObjSN = new main.SocialNetwrorkingGroup(lstPerson);
            main.CheckPerson cp = new main.SearchUsingLambda();
            ObjSN.printPeople(lstPerson, cp);
            ObjSN.printPeople(
                    lstPerson,
                    new main.CheckPerson() {
                        public boolean test(main.Person p) {
                            return p.getGender() == main.Person.Sex.MALE &&
                                    p.getName().equals("Koti");
                        }
                    }
            );

//            ObjSN.printPeople(
//                    lstPerson,
//                    (main.Person pe) -> pe.getGender() == main.Person.Sex.MALE &&
//                            pe.getBirthday().getYear() < 1993 &&
//                            pe.getBirthday().getYear() > 1982
//            );
        }
}