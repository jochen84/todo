package SE.EC.Johan.data;

import org.junit.Assert;
import org.junit.Test;

public class PersonSequencerTest {


    @Test
    public void test_nextPersonId(){

        int expected = 1;
        int actual = PersonSequencer.nextPersonId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_resetPersonId(){

        int expected = 0;
        int actual = PersonSequencer.reset();
        Assert.assertEquals(expected,actual);
    }
}
