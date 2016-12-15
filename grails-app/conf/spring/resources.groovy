// Place your Spring DSL code here
beans = {
	userDetailsService(cas.UserService)

	authenticationUserDetailsService(cas.AuthService) {
		userService = ref('userService')
	}
}
