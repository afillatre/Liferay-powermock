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
 * Base class for unit tests
 *
 * @author afillatre@ippon.fr
 * @since 10/10/14
 */
@RunWith(JUnitParamsRunner.class)
public abstract class AbstractUnitTest {

    @Rule
    public PowerMockRule powerMockRule = new PowerMockRule();
}
