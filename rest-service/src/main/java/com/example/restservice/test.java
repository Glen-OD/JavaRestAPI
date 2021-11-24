package com.example.restservice;

import org.junit.jupiter.api.Test;

class test {
    

    @Test
    void hello()
    {
        Greeting controller = new Greeting(1,"Test 1234");
        Double response = controller.getAverageLength("Test 1234");
        assertEquals(4.0,response);
    }

}
