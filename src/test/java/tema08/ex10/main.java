package tema08.ex10;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<TestCase> testCase = new ArrayList<>();

        testCase.add(new LoginTest("valid user"));
        testCase.add(new LoginTest("invalid user"));
        testCase.add(new SearchTest("Search 1"));
        testCase.add(new SearchTest("Search 2"));

        for (TestCase test : testCase) {
            test.runTest();
            System.out.println("-------------------");
        }
    }
}
