package cas

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.User

class MyUser extends User {

	public final Map<String, Object> cas_attrs

	public MyUser(String username, Map<String, Object> cas_attrs, Collection<? extends GrantedAuthority> roles) {
		super(username, '', roles)
		this.cas_attrs = cas_attrs
	}
}