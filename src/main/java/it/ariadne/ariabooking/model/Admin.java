package it.ariadne.ariabooking.model;

public class Admin extends User {
	
	public Admin(String username, String password, String name, String surname, String eMail, String phoneNumber) {
		super(username, password, name, surname, eMail, phoneNumber);
		setIsAdmin(true);
	}

	private static final long serialVersionUID = 1L;
	
	// ======================================================================================================== Constructor
	
	
}
