
public class VendorData {
	//fields
	private String vendorID;
	private String vendorGroup;
	
	/**
	 * @param inVendorID
	 * @param inVendorGroup
	 */
	public VendorData(String inVendorID, String inVendorGroup)
	{
		this.vendorID = inVendorID;
		this.vendorGroup = inVendorGroup;
	}
	
	/**
	 * default constructor
	 */
	public VendorData()
	{}
	
	/**
	 * @return the vendorID
	 */
	public String getVendorID() {
		return vendorID;
	}
	/**
	 * @param vendorID the vendorID to set
	 */
	public void setVendorID(String inVendorID) {
		this.vendorID = inVendorID;
	}
	/**
	 * @return the vendorName
	 */
	public String getVendorGroup() {
		return vendorGroup;
	}
	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorGroup(String inVendorGroup) {
		this.vendorGroup = inVendorGroup;
	}
	
	/** 
	 * @return vendor information
	 */
	public String toString() {
		return "Vendor ID: [" + vendorID + "], Vendor group: [" + vendorGroup + "]";
	}
}
