package ca.concordia.com249.contactmanager;

public class SocialNetworkAccount {
	private SocialNetworkType socialNetworkType;
	private String accountID;
	
	public SocialNetworkAccount(SocialNetworkType socialNetworkType,
			String accountID) {
		this.socialNetworkType = socialNetworkType;
		this.accountID = accountID;
	}
	
	public SocialNetworkType getSocialNetworkType() {
		return socialNetworkType;
	}

	public String getAccountID() {
		return accountID;
	}

	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o instanceof SocialNetworkAccount) {
			SocialNetworkAccount account = (SocialNetworkAccount)o;
			return this.socialNetworkType.equals(account.socialNetworkType) &&
					this.accountID.equals(account.accountID);
		}
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(socialNetworkType).append(": ").append(accountID);
		return sb.toString();
	}
}
