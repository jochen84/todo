package SE.EC.Johan.data;

import org.junit.Assert;
import org.junit.Test;

public class TodoSequencerTest {


    @Test
    public void next_todoIdTest(){
        int expected = 1;
        int actual = TodoSequencer.nextTodoId();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void reset(){
        int expected = 0;
        int actual = TodoSequencer.reset();
        Assert.assertEquals(expected,actual);

    }

}
