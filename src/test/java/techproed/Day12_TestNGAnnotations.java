package techproed;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Day12_TestNGAnnotations {

    /*
     *@Test : It creates a test case.
     *@BeforeMethod : runs before each @Test annotation. Same as @Before annotation in JUnit
     *@AfterMethod  : runs after  each @Test annotation. Same as @After annotation in JUnit
     *@Ignore       : It skips the test case
     *@Test(enabled = false) : disables the test case. You CANNOT run that test anymore
     *
     *
     *@Test(priority=1)
     * TestNG runs in alphabetical order by default
     * Use priority KEYWORD to order test cases
     * priority is used to prioritize the test case that is in the same class
     *
     * Why do you need @BeforeMethod?
     * - Pre conditions : Create driver, implicitly wait, maximize window, used to avoid repetition
     * Why do you need @AfterMethod?
     * - Post conditions: closing driver, REPORT GENERATION, is used to avoid repetition
     * Why do you need @Test annotation?
     * -To create test scripts/test cases.
     *
     * */

    @BeforeMethod
    public void setUp(){
        System.out.println("This is BeforeMethod()");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("This is AfterMethod()");
    }
    @Test(enabled = false) //remember this removed to 'run' button
    @Ignore  //same thing skips the step.

    public void test1(){
        System.out.println("This is test- 1");
    }
    @Test
    public void test2(){
        System.out.println("This is test- 2");
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("This is test 3");
    }
    @Test(priority = 2)      //(enabled = false)// This statement is removed the run button.
              // @Ignore and the @Test(enabled=false) are the same thing, they would not let this test case to run.
    public void test4() {
        System.out.println("This is test- 4");
    }
    @Test(priority = 3)
    public void test5(){
        System.out.println("This is test 5");
    }

}