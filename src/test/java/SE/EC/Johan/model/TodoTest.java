package SE.EC.Johan.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoTest {

    private Todo testTodo;

    @Before
    public void init(){
        testTodo = new Todo(1,"Whatsthis");
    }

    @Test
    public void test_getId(){
        int expected = 1;
        int actual = testTodo.getTodoId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_Set_and_Get_Description(){
        testTodo.setDescription("Testet");
        String actual = "Testet";
        String expected = testTodo.getDescription();
        Assert.assertEquals(expected,actual);
    }
}
