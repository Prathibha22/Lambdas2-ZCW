package main;

import java.util.List;

public class SocialNetwrorkingGroup  {
    List<Person> lstPerson;

    public SocialNetwrorkingGroup(List<Person> lstPerson) {
        this.lstPerson = lstPerson;
    }

    public List<Person> getLstPerson() {
        return lstPerson;
    }

    public void setLstPerson(List<Person> lstPerson) {
        this.lstPerson = lstPerson;
    }
    public void printPeople(List<Person> people, CheckPerson tester) {
        for (Person p : people) {
            p.printPerson();
        }
    }
}
