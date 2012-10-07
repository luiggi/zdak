package ca.concordia.com249.contactmanager;

public class PhoneNumber {
	private PhoneType phoneType;
	private String countryCode;
	private String areaCode;
	private String phoneNumber;
	private String extension;
	
	public PhoneNumber(PhoneType phoneType, String countryCode,
			String areaCode, String phoneNumber, String extension) {
		this.phoneType = phoneType;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.phoneNumber = phoneNumber;
		this.extension = extension;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getExtension() {
		return extension;
	}

	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o instanceof PhoneNumber) {
			PhoneNumber phone = (PhoneNumber)o;
			if(this.phoneType.equals(phone.phoneType) &&
					this.countryCode.equals(phone.countryCode) &&
					this.areaCode.equals(phone.areaCode) &&
					this.phoneNumber.equals(phone.phoneNumber) ) {
				if(this.extension == null && phone.extension == null)
					return true;
				if(this.extension != null && phone.extension != null && this.extension.equals(phone.extension))
					return true;
			}
		}
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(phoneType).append(":").append("\n");
		sb.append(countryCode).append(" ").append(areaCode).append(" ").append(phoneNumber);
		if(extension != null)
			sb.append(" ext. ").append(extension);
		return sb.toString();
	}
}
