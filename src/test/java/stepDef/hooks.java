package stepDef;

import org.junit.*;
import static helper.Utility.*;

public class hooks {

    @Before
    public void beforeTest() {
        openChrome();
    }

    @After
    public void afterTest() throws InterruptedException {
        closeChrome();
    }
}
