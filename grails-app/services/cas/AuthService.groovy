package cas

import org.jasig.cas.client.validation.Assertion
import org.springframework.security.cas.userdetails.AbstractCasAssertionUserDetailsService
import org.springframework.security.core.userdetails.UserDetails

class AuthService extends AbstractCasAssertionUserDetailsService {

	def userService

	@Override
	protected UserDetails loadUserDetails(Assertion casAssert) {
		return userService.loadUsr(casAssert?.principal?.name, casAssert?.principal?.attributes)
	}
}