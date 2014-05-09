package ma.tabdyl.model.beans

import ma.tabdyl.model.enums.AccountType;
import ma.tabdyl.model.enums.Gender;
import ma.tabdyl.model.enums.Rating;

class Account extends User {
	
	String login
	String password
	Gender gender
	AccountType type
	Boolean receiveMessages
	Boolean receiveNews
	Date birthDate
	String occupation
	List<String> wishList
	Date dateCreated
	Rating rating
	Boolean isDeleted
	
    static constraints = {
    }
}
