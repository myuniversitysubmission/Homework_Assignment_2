package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        MultipleExceptionsTest.class,
        RethrowExceptionTest.class,
        ResourceManagementTest.class,
        ChainedExceptionTest.class
})
public class AllTests {
}
