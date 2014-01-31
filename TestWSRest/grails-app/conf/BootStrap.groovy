import testwsrest.Person

class BootStrap {

    def init = { servletContext ->
		new Person(id : 1, name : "Juan Perez")
		new Person(id : 2, name : "Carlos Gomez")
    }
    def destroy = { 
		
    }
}
