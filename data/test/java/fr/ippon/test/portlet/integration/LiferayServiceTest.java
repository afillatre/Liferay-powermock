package fr.ippon.test.portlet.integration;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.InitUtil;
import junitparams.JUnitParamsRunner;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.rule.PowerMockRule;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Dummy test for Liferay services
 *
 * @author afillatre@ippon.fr
 * @since 10/10/14
 */
public class LiferayServiceTest extends AbstractIntegrationTest {

    @Test
    public void testGetAllUsers() throws SystemException {
        assertThat(UserLocalServiceUtil.getUsers(0, 10)).isNotEmpty();
    }
}
