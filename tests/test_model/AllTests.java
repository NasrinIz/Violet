package test_model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddConnection.class, TestBidirectional.class, TestCouplingMeasure.class,
				TestMenu.class, TestRecursive.class})


public class AllTests {

}
