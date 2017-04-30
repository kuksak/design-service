package com.example.webservice;

import com.example.webservice.domain.Design;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Sakshi Kukreti on 28-04-2017.
 */
public class DesignTest {

    @Test
    public void test() {
        Design design1 = new Design(1l, "TEST", "SAKSHI");
        Design design2 = new Design(1l, "TEST", "SAKSHI");
        assertTrue(design1.compareTo(design2) == 0);
    }
}
