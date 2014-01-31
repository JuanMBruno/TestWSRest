class UrlMappings {

	static mappings = {
		//$ binds variable to param, ? makes param optional
		"/showPerson/$id" {
			//resource = 'person'
			controller = 'Person' //controller mapping name, Controller word gets add by grials at runtime
			action = 'show' //method in controller 
		}
		
		"/showPerson/" {
			controller = 'Person' //controller mapping name, Controller word gets add by grials at runtime
			action = 'showAll' //method in controller
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
