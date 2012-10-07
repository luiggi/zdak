package ca.concordia.com249.contactmanager;

public class Contact {
	private static final int MAX_ARRAY_SIZE = 10;
	private String lastName;
	private String firstName;
	private String middleName;
	
	private Address[] addressList;
	private int addressIndex = 0;
	private SocialNetworkAccount[] socialNetworkAccounts;
	private int socialNetworkAccountIndex = 0;
	private PhoneNumber[] phoneNumbers;
	private int phoneNumberIndex = 0;

	public Contact(String lastName, String firstName, String middleName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.addressList = new Address[MAX_ARRAY_SIZE];
		this.socialNetworkAccounts = new SocialNetworkAccount[MAX_ARRAY_SIZE];
		this.phoneNumbers = new PhoneNumber[MAX_ARRAY_SIZE];
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	private boolean containsAddress(Address address) {
		for(int i=0; i<addressIndex; i++) {
			if(addressList[i].equals(address))
				return true;
		}
		return false;
	}
	
	public void addAddress(Address address) {
		if(!containsAddress(address) && addressIndex < MAX_ARRAY_SIZE) {
			addressList[addressIndex] = address;
			addressIndex++;
		}
	}

	private boolean containsSocialNetworkAccount(SocialNetworkAccount account) {
		for(int i=0; i<socialNetworkAccountIndex; i++) {
			if(socialNetworkAccounts[i].equals(account)) {
				return true;
			}
		}
		return false;
	}
	
	public void addSocialNetworkAccount(SocialNetworkAccount account) {
		if(!containsSocialNetworkAccount(account) && socialNetworkAccountIndex < MAX_ARRAY_SIZE) {
			socialNetworkAccounts[socialNetworkAccountIndex] = account;
			socialNetworkAccountIndex++;
		}
	}
	
	private boolean containsPhoneNumber(PhoneNumber phone) {
		for(int i=0; i<phoneNumberIndex; i++) {
			if(phoneNumbers[i].equals(phone)) {
				return true;
			}
		}
		return false;
	}
	
	public void addPhoneNumber(PhoneNumber phone) {
		if(!containsPhoneNumber(phone) && phoneNumberIndex < MAX_ARRAY_SIZE) {
			phoneNumbers[phoneNumberIndex] = phone;
			phoneNumberIndex++;
		}
	}
	
	public boolean hasSocialNetworkAccount(SocialNetworkType type) {
		for(int i=0; i<socialNetworkAccountIndex; i++) {
			if(socialNetworkAccounts[i].getSocialNetworkType().equals(type)) {
					return true;
			}
		}
		return false;
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o instanceof Contact) {
			Contact c = (Contact)o;
			return this.lastName.equals(c.lastName) &&
					this.firstName.equals(c.firstName) &&
					this.middleName.equals(c.middleName);
		}
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName).append(" ");
		if(middleName != null)
			sb.append(middleName).append(" ");
		sb.append(lastName);
		
		return sb.toString();
	}
}
