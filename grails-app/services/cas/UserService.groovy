package cas

import grails.plugin.springsecurity.userdetails.GrailsUserDetailsService
import org.springframework.security.core.userdetails.UserDetails
import grails.plugin.springsecurity.SpringSecurityUtils
import org.springframework.security.core.authority.SimpleGrantedAuthority

class UserService implements GrailsUserDetailsService {

	UserDetails loadUserByUsername(String username, boolean loadRoles) {
		loadUsr(username, [:])
	}

	UserDetails loadUserByUsername(String username) {
		loadUsr(username, [:])
	}

	protected UserDetails loadUsr(String username, Map<String, Object> cas_attrs) {
		print cas_attrs
		print username
		username = username?.trim()
		def roles = [new SimpleGrantedAuthority(SpringSecurityUtils.NO_ROLE)]

		return new MyUser(username, cas_attrs, roles)
	}
}