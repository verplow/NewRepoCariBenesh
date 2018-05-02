import java.util.ArrayList;
import java.util.List;

public class RankData implements Comparable<RankData>{
	//fields
	private double grossProfit;
	//private StoreData store;
	//private VendorData vendor;
	private String vendID;
	private String storeNum;
	private String distName;
	
	/**
	 * Create ArrayList to hold Rankings
	 */
	List<RankData> rankList = new ArrayList<RankData>();
	
	/**
	 * @param inStoreNum  store number
	 * @param inDistName  district name
	 * @param inVendID 	 vendor ID
	 * @param inGrossProfit 	gross profit for that store and that vendor
	 */
	public RankData(String inStoreNum, String inDistName, String inVendID, double inGrossProfit)
	{	
		//convert to int
		this.grossProfit = inGrossProfit;
		this.storeNum = inStoreNum;
		this.vendID = inVendID;
		this.distName = inDistName;
	}

	/**
	 * @return the grossProfit
	 */
	public double getGrossProfit() {
		return grossProfit;
	}

	/**
	 * @param grossProfit the grossProfit to set
	 */
	public void setGrossProfit(double inGrossProfit) {
		// convert to int
		this.grossProfit = inGrossProfit;
	}
	
	/**
	 * @return the store
	 */
	public String getStoreNum() {
		return storeNum;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.storeNum = store;
	}

	/**
	 * @return the distName
	 */
	public String getDistName() {
		return distName;
	}

	/**
	 * @param distName the distName to set
	 */
	public void setDistName(String distName) {
		this.distName = distName;
	}
	
	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendID;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String inVendor) {
		this.vendID = inVendor;
	}
	
	@Override
	public int compareTo(RankData comparesTo)
	{
		double compareProfit=((RankData)comparesTo).getGrossProfit();
		return (int) (compareProfit - this.grossProfit);
		
	}
	
	@Override
	public String toString()
	{
		return "Store: [" + this.storeNum + "], District: [" + this.distName + "], Vendor: [" + this.vendID + "], Gross Profit: [" + this.grossProfit + "]";
	}

	/**
	 * default compareTo method
	 */
	/*@Override
	public int compareTo(RankData arg0) {
		// TODO Auto-generated method stub
		return 0;
	}*/
}
