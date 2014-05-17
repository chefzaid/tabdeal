package ma.tabdyl.user

class User {
	
	String name
	String email
	String phone

    static constraints = {
		name size: 3..32, blank: false, unique: true
		email email: true, blank: false, unique: true
		phone size: 10..10, blank: false
    }
}
