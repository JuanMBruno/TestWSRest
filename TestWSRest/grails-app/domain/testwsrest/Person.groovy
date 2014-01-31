package testwsrest

import grails.rest.*


class Person {
	Long id
	String name
	
	static constraints = {
		name blank:false
	}
}
