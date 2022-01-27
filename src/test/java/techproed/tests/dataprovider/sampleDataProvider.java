package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampleDataProvider {

    @Test(dataProvider = "LoginDataProvider")

    public void loginTEST(String email, String nameconvention){

        System.out.println(email+ "  "+nameconvention);

   }

    @DataProvider(name="LoginDataProvider")

    public Object[][] getDate(){

    Object [] [] data = {{ "abc@gmai.com", "abc"},{"xyz@gmail.com", "xyz"},{"mno@gmail.com", "mno"}};

    return data;

    }
}
