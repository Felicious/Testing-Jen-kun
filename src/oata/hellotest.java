package oata;

import org.junit.Test;

import static org.junit.Assert.fail;

public class hellotest {

    @Test
    public void testNothing() {
        printf("Testing nothing~");
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

}
