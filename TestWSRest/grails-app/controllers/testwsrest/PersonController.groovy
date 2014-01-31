package testwsrest

import grails.converters.*

class PersonController {
	def personService //java variable convention gets dependency injected automatically

    def show() {
		def result = personService.getPerson(params.id.toLong()) 
		//println "Controller Result " result
		render result as JSON
	}
	
	def showAll() {
		render personService.getPersonsList() as JSON
	}
}
