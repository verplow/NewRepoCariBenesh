
public class StoreData {
	//fields
	private String storeNumber;		
	private String districtName;	 // breaks stores up into regional districts
	
	/**
	 * @param inStoreNum		the store number to set
	 * @param inStoreName	the store name to set
	 * @param inDistrict		the store district to set
	 */
	public StoreData(String inStoreNum, String inDistrictName)
	{
		this.storeNumber = inStoreNum;
		this.districtName = inDistrictName;
	}

	/**
	 * default constructor
	 */
	public StoreData()
	{}
	
	/**
	 * @return the storeNumber
	 */
	public String getStoreNumber() {
		return storeNumber;
	}

	/**
	 * @param storeNumber the storeNumber to set
	 */
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}

	/**
	 * @return the district
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrictName(String inDistrictName) {
		this.districtName = inDistrictName;
	}
	
	/**
	 * @return StoreData 
	 */
	public String toString()
	{
		return "Store: [" + storeNumber + "], District Name: [" + districtName + "]";
	}
}
