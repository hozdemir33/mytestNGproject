package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import javax.sound.midi.Soundbank;


public class Practice12Assetions {

    @Test
    public void assetionsHard(){
        System.out.println("This is hard assertion");
        Assert.assertEquals(4,4);//true
        Assert.assertTrue("Maven".contains("h"));//FAILED
        System.out.println("This is line 13.");
        Assert.assertEquals(3,3);//true
        System.out.println("This is line 17");

    }
    @Test
    public void assertionsSolft(){

        //  1. Create a SoftAssert object  WE MUST CREATE THIS FIRST
        SoftAssert softAssert = new SoftAssert();

        System.out.println("this is line 28");
        softAssert.assertEquals(3,4);//FAILED
        System.out.println("this is line 30");
        softAssert.assertTrue("java".contains("m"));//FALSE
        softAssert.assertFalse("nano".contains("a"));
        softAssert.assertEquals(3,4);//FALSE
        softAssert.assertNotSame("3",3);

    }
}
