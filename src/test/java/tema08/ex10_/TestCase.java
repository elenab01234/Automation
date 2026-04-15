package tema08.ex10_;

//Exercițiul 10 – Mini framework
//Creează:
//- TestCase → protected name + metodă runTest()
//- clase copil: LoginTest, SearchTest (override runTest)
//- în main: rulează mai multe teste

public class TestCase {
    protected String name;

    public TestCase(String name) {
        this.name = name;
    }

    public void runTest() {
        System.out.println("Running test " + name);
    }
}
