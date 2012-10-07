package ca.concordia.com249.contactmanager;

public class ContactManager {
	private static final int MAX_ARRAY_SIZE = 100;
	private Contact[] contacts;
	private int contactIndex = 0;
	
	public ContactManager() {
		this.contacts = new Contact[MAX_ARRAY_SIZE];
	}
	
	public int numberOfContacts() {
		return contactIndex;
	}

	private boolean containsContact(Contact contact) {
		for(int i=0; i<contactIndex; i++) {
			if(contacts[i].equals(contact))
				return true;
		}
		return false;
	}
	
	public void addContact(Contact contact) {
		if(!containsContact(contact) && contactIndex < MAX_ARRAY_SIZE) {
			contacts[contactIndex] = contact;
			contactIndex++;
		}
	}
	
	public void searchContacts(String substring) {
		for(int i=0; i<contactIndex; i++) {
			Contact c = contacts[i];
			if(c.getFirstName().toLowerCase().contains(substring.toLowerCase()) || 
					c.getLastName().toLowerCase().contains(substring.toLowerCase()) ) {
				System.out.println(c);
			}
		}
	}
	
	public void findContactsInSocialNetwork(SocialNetworkType type) {
		for(int i=0; i<contactIndex; i++) {
			Contact c = contacts[i];
			if(c.hasSocialNetworkAccount(type)) {
				System.out.println(c);
			}
		}
	}
	
	public Contact[] sortContacts() {
		Contact sortedContacts[] = new Contact[contactIndex];
		for(int i=0; i<contactIndex; i++) {
			Contact item = contacts[i];
			int hole = i;
			while(hole > 0 && compareContacts(sortedContacts[hole - 1], item) > 0) {
				sortedContacts[hole] = sortedContacts[hole - 1];
				hole = hole - 1;
			}
			sortedContacts[hole] = item;
		}
		return sortedContacts;
	}
	
	private int compareContacts(Contact c1, Contact c2) {
		if(!c1.getLastName().equals(c2.getLastName()))
			return c1.getLastName().compareTo(c2.getLastName());
		else {
			return c1.getFirstName().compareTo(c2.getFirstName());
		}
	}
}
