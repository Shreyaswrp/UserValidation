package com.dummytest;

import org.junit.Assert;
import org.junit.Test;

    public class UserRegTest {

        @Test
        public void givenFirstName_WhenProper_ShouldReturnTrue() {
            UserReg userValidation=new UserReg();
            boolean result=userValidation.validateFirstName("Shreya");
            Assert.assertEquals(true,result);
        }

        @Test
        public void givenFirstName_WhenShort_ShouldReturnFalse() {
            UserReg userValidation=new UserReg();
            boolean result=userValidation.validateFirstName("Hello");
            Assert.assertEquals(false,result);

        }
        @Test
        public void givenLastName_WhenProper_ShouldReturnTrue() {
            UserReg userValidation=new UserReg();
            boolean result=userValidation.validateLastName("Swaroop");
            Assert.assertEquals(true,result);
        }

        @Test
        public void givenLastName_WhenShort_ShouldReturnFalse() {
            UserReg userValidation=new UserReg();
            boolean result=userValidation.validateFirstName("Swrp");
            Assert.assertEquals(false,result);
        }

        @Test
        public void givenEmailId_WhenProper_ShouldReturnTrue() {
            UserReg userValidation=new UserReg();
            boolean result=userValidation.validateEmailId("shreyaswrp@gmail.com");
            Assert.assertEquals(true,result);
        }
    }


