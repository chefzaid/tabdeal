/**
 * 
 */
package ma.tabdyl.user


class Account extends User { 

	User user
	String login
	String password
	Gender gender
	AccountType type
	Boolean receiveMessages
	Boolean receiveNews
	Date birthDate
	String occupation
	String wishList
	Date dateCreated
	Rating rating
	Boolean isDeleted
	
	static constraints = {
		login size: 6..16, blank: false, unique: true
		password size: 6..16, blank: false
	}
}
