package testwsrest

import testwsrest.Person

class PersonService {
	//could be a repository to handle crud on entities as DAO, for now just testing this
	Person person = new Person();
	
    def getPerson(Long id) {
		def result = [id:1, name:"Juan Perez"]//person.get(id) 
		//println "Service Result " result
		return result
    }
	
	def getPersonsList() {
		def map = [[id:1, name:"Carlos Gomez"],[id:2, name:"Juan Perez"]] //DAO NOT WORKING YET
		return map
	}
}
