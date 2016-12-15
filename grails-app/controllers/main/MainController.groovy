package main

import grails.plugin.springsecurity.annotation.Secured

@Secured('IS_AUTHENTICATED_FULLY')
class MainController {

	def springSecurityService

	def index() {
		render springSecurityService.principal.properties
		render springSecurityService.principal.cas_attrs
	}
}