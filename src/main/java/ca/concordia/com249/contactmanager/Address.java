package ca.concordia.com249.contactmanager;

public class Address {
	private AddressType addressType;
	private String streetName;
	private String streetNumber;
	private String apartmentNumber;
	private String city;
	private String postalCode;
	private String country;
        private String unitNumber;
	
	
	public Address(AddressType addressType, String streetName,
			String streetNumber, String apartmentNumber, String city,
			String postalCode, String country) {
		this.addressType = addressType;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.apartmentNumber = apartmentNumber;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public String getStreetName() {
		return streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getCountry() {
		return country;
	}

	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o instanceof Address) {
			Address address = (Address)o;
			if(this.addressType.equals(address.addressType) &&
					this.streetName.equals(address.streetName) &&
					this.streetNumber.equals(address.streetNumber) &&
					//this.apartmentNumber.equals(address.apartmentNumber) &&
					this.city.equals(address.city) &&
					this.postalCode.equals(address.postalCode) &&
					this.country.equals(address.country) ) {
				if(this.apartmentNumber == null && address.apartmentNumber == null)
					return true;
				if(this.apartmentNumber != null && address.apartmentNumber != null && this.apartmentNumber.equals(address.apartmentNumber))
					return true;
			}
		}
		return false;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(addressType).append(":").append("\n");
		sb.append(streetNumber).append(" ").append(streetName);
		if(apartmentNumber != null)
			sb.append(" ").append(apartmentNumber);
		sb.append("\n");
		sb.append(city).append(" ").append(postalCode).append(" ").append(country);
		return sb.toString();
	}
}
