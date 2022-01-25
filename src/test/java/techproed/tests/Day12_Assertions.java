package techproed.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;

public class Day12_Assertions {
    @Test
    public void hardAssert(){
//        import org.testng.Assert;  Hard assertion
        System.out.println("This is line 9");
        Assert.assertEquals(5,5);//fail
        System.out.println("This is line 11");// Hard assert fails, next lines will not run
    }

    @Test
    public void softAssert(){
//        1. Create a SoftAssert object  WE MUST CREATE THIS FIRST
        SoftAssert softAssert = new SoftAssert();



        System.out.println("This is line 21");
        softAssert.assertEquals(5,5);//fail
        System.out.println("This is line 23");
        softAssert.assertTrue("java".contains("a"));//fail
        System.out.println("This is line 25");
        softAssert.assertEquals(5,5);//pass

        //        Be careful when you use soft assertion
        //        We must use assertAll() to check which one pass which one fails

      /*
      What is soft assertion? : Verifying all test cases using soft assertion.
      In this type of assertion, we use soft assert object.
      We also use assertAll to actually see if any soft assert fails.
      What is difference between hard and soft assertion?

        Hard Assert= If hard assert fails, the test case will not continue to run.
        SoftAssert =If soft assert fails, the test case will continue to run.We must create the object.

      Which assertion do you prefer to use? Why?

      Ahmet's answer: I prefer hard assertion, b/c if a step fails, I should immediately check the issue without wasting my time
      Sometimes, I use soft assert when I write my initial test cases.
      Then I see what fails what pass at the end.
       */


        softAssert.assertAll();


    }
    @AfterMethod

    public void tearDown() {
        Driver.closeDriver();

    }
}
