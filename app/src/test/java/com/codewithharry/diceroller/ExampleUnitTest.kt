package com.codewithharry.diceroller

import junit.framework.TestCase.assertTrue
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun generates_number(){
        val myfirstdice=dice(6)
        val dicroll= myfirstdice.roll()
        assertTrue("The no is not bw 1 and 6 ",dicroll in 1..6)


    }
}