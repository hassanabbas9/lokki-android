package cc.softwarefactory.lokki.android.espresso;

import android.content.res.Resources;
import cc.softwarefactory.lokki.android.espresso.utilities.TestUtils;

public abstract class MainActivityBaseTest extends MockHttpServerBaseTest {

    protected Resources getResources() {
        return getInstrumentation().getTargetContext().getResources();
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        TestUtils.clearAppData(getInstrumentation().getTargetContext());
        TestUtils.setUserRegistrationData(getInstrumentation().getTargetContext());
    }

    @Override
    protected void tearDown() throws Exception {
        TestUtils.clearAppData(getInstrumentation().getTargetContext());
        super.tearDown();
    }

}
