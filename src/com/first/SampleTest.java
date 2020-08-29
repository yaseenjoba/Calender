package com.first;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 public class SampleTest {
    @Test
    public void isLeapYear(){
        Calender calender = new Calender();
        // 2020 is a leap year.
        calender.setYear(2020);
        assertEquals(true,calender.isLeapYear());
        // 2019 is not a leap year.
        calender.setYear(2019);
        assertEquals(false,calender.isLeapYear());
        // 2000 is a leap year.
        calender.setYear(2000);
        assertEquals(true,calender.isLeapYear());

    }

}
