package com.sweeney.daragh.student_reg;

import junit.framework.TestCase;

public class getUsernameTest extends TestCase{
   
    public void testApp()
    {
    	//test to see if the student object prints the user name correctly
    	student john = new student( "John", 21, 15, 4, 1996, 1234);
        assertEquals(john.getUsername(),"John21");
    }
}