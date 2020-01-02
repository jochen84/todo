package SE.EC.Johan.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person testPerson;

    @Before
    public void init(){
        testPerson = new Person(5,"Johan", "Svensson");
    }

    @Test
    public void test_GetFirstName(){
        String expected = "Johan";
        String actual = testPerson.getFirstName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_GetLastName(){
        String expected = "Svensson";
        String actual = testPerson.getLastName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_GetPersonId(){
        int expected = 5;
        int actual = testPerson.getPersonId();
        Assert.assertEquals(expected,actual);
    }

}
