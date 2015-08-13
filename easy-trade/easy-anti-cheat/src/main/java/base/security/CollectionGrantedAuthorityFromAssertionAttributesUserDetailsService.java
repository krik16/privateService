package base.security;



import java.util.ArrayList;
import java.util.List;

import org.jasig.cas.client.validation.Assertion;
import org.springframework.security.cas.userdetails.AbstractCasAssertionUserDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import com.rongyi.core.common.util.StringUtil;

/**
 * Populates the {@link org.springframework.security.core.GrantedAuthority}s for a user by reading a list of attributes that were returned as
 * part of the CAS response.  Each attribute is read and each value of the attribute is turned into a GrantedAuthority.  If the attribute has no
 * value then its not added.
 *
 * @author Scott Battaglia
 * @since 3.0
 */
public final class CollectionGrantedAuthorityFromAssertionAttributesUserDetailsService extends AbstractCasAssertionUserDetailsService {

    private static final String NON_EXISTENT_PASSWORD_VALUE = "NO_PASSWORD";

    private final String[] attributes;

    private boolean convertToUpperCase = true;

    public CollectionGrantedAuthorityFromAssertionAttributesUserDetailsService(final String[] attributes) {
        Assert.notNull(attributes, "attributes cannot be null.");
        Assert.isTrue(attributes.length > 0, "At least one attribute is required to retrieve roles from.");
        this.attributes = attributes;
    }

    @Override
    protected UserDetails loadUserDetails(final Assertion assertion) {
        final List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();

        for (final String attribute : this.attributes) {
            final Object value = assertion.getPrincipal().getAttributes().get(attribute);
            if (value == null) {
                continue;
            }
            String newValue = new String("");
            newValue = value.toString().replaceAll("\\[|\\]", "");
            List<String> list = StringUtil.string2List(newValue.toString(), ",");
            for (final Object o : list) {
                grantedAuthorities.add(new SimpleGrantedAuthority(this.convertToUpperCase ? o.toString().toUpperCase() : o.toString()));
            }

        }

        return new User(assertion.getPrincipal().getName(), NON_EXISTENT_PASSWORD_VALUE, true, true, true, true, grantedAuthorities);
    }

    /**
     * Converts the returned attribute values to uppercase values.
     *
     * @param convertToUpperCase true if it should convert, false otherwise.
     */
    public void setConvertToUpperCase(final boolean convertToUpperCase) {
        this.convertToUpperCase = convertToUpperCase;
    }
}
