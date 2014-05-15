package ma.tabdyl.model.beans

import ma.tabdyl.model.enums.AccountType;
import ma.tabdyl.model.enums.Gender;
import ma.tabdyl.model.enums.Rating;

class Account extends User { //Inheritance
	
	String login
	String password
	Gender gender
	//enum
	AccountType type
	Boolean receiveMessages
	Boolean receiveNews
	Date birthDate
	String occupation
	//Collection
	List<String> wishList
	Date dateCreated
	Rating rating
	Boolean isDeleted
	
    static constraints = {
		login size: 6..16, blank: false, unique: true
		password size: 6..16, blank: false
    }
}
