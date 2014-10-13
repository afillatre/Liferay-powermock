package fr.ippon.test.portlet.unit;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.InitUtil;
import junitparams.JUnitParamsRunner;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;

import static org.assertj.core.api.Assertions.assertThat;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Use this class to test anything you want. Who cares...
 *
 * @author afillatre
 * @since 27/06/14
 */
@PrepareForTest({
        PowerMockTest.class
})
public class PowerMockTest extends AbstractUnitTest {

    private String name;

    public PowerMockTest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Test
    public void testMockConstructor() throws Exception {
        assertThat(new PowerMockTest().getName()).isNull();

        String noArg = "No arguments";

        final PowerMockTest v1 = spy(new PowerMockTest());
        v1.setName(noArg);
        whenNew(PowerMockTest.class).withNoArguments().thenReturn(v1);

        assertThat(new PowerMockTest().getName()).isEqualTo(noArg);
    }
}
