package oata;

import org.junit.Test;

import static org.junit.Assert.fail;

public class hellotest {

    @Test
    public void testNothing() {
        System.out.println("Testing nothing~");
    }

    @Test
    public void testWillAlwaysFail() {
        fail("An error message");
    }

}
