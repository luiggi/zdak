package ca.concordia.com249.contactmanager;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ContactManager manager = new ContactManager();
		
		Contact contact1 = new Contact("Tsantalis", "Nikolaos", null);
		Contact contact2 = new Contact("Rigby", "Peter", "C.");
		Contact contact3 = new Contact("Tsantalis", "Atha", null);
		
		Address address1 = new Address(AddressType.WORK, "St. Catherine St. West", "1515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		Address address2 = new Address(AddressType.WORK, "St. Catherine St. West", "1515", "EV 3.112", "Montreal", "H3G 1M8", "Canada");
		
		contact1.addAddress(address1);
		contact1.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkType.SKYPE, "tsantalis"));
		contact1.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkType.GOOGLE_PLUS, "tsantalis"));
		
		contact1.addAddress(address2);
		contact2.addSocialNetworkAccount(new SocialNetworkAccount(SocialNetworkType.GOOGLE_PLUS, "rigbypc"));
		
		manager.addContact(contact1);
		manager.addContact(contact2);
		manager.addContact(contact3);
		
		manager.searchContacts("ts");
		manager.findContactsInSocialNetwork(SocialNetworkType.SKYPE);
		
		Contact[] contacts = manager.sortContacts();
		for(Contact c : contacts)
			System.out.println(c);
	}

}
