import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileReadTester 
{
	//Delimiters used in the CSV file
    private static final String COMMA_DELIMITER = ",";

	public static void main (String[] args)
	{
		//fields
		String storeFile = "storeData.csv";
		String vendorFile = "vendorData.csv";
		String rankFile = "salesData.csv";
		
		//Create Lists for holding StoreData, VendoData, RankData objects
	    ArrayList<StoreData> storeList = new ArrayList<>();
	    ArrayList<VendorData> vendorList = new ArrayList<>();
	    ArrayList<RankData> rankList = new ArrayList<>();
				
		// read store information
		BufferedReader storeBR = null;
		
        try
        {
            //Reading the csv file
            storeBR = new BufferedReader(new FileReader(storeFile));       
            String line = "";
            //Read to skip the header
            storeBR.readLine();
            //Reading from the second line
            while ((line = storeBR.readLine()) != null) 
            {
                String[] storeDetails = line.split(COMMA_DELIMITER);
                
                if(storeDetails.length > 0 )
                {
                    //Save the store details in StoreData object
                    StoreData store = new StoreData(storeDetails[0],
                            storeDetails[1]);
                    storeList.add(store);
                }
            }
        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                storeBR.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occurred while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
	
        // get Vendor Data	
        	// read store information
    		BufferedReader vendorBR = null;
    		
    		try
    		{
    			vendorBR = new BufferedReader(new FileReader(vendorFile));
            String line = "";
            //Read to skip the header
            vendorBR.readLine();
            //Reading from the second line
            while ((line = vendorBR.readLine()) != null) 
            {
                String[] vendorDetails = line.split(COMMA_DELIMITER);
                
                if(vendorDetails.length > 0 )
                {
                    //Save the vendor details in VendorData object
                    VendorData vendor = new VendorData(vendorDetails[1],
                            vendorDetails[0]);
                    vendorList.add(vendor);
                }
            }
    		}
    		catch(Exception ee)
        {
            ee.printStackTrace();
        }
        finally
        {
            try
            {
                vendorBR.close();
            }
            catch(IOException ie)
            {
                System.out.println("Error occurred while closing the BufferedReader");
                ie.printStackTrace();
            }
    		}
    
	    // read store information
	    	BufferedReader rankBR = null;
	    		
	    	try
	    	{
	    		rankBR = new BufferedReader(new FileReader(rankFile));
	        String line = "";
	        //Read to skip the header
	        rankBR.readLine();
	        //Reading from the second line
	        while ((line = rankBR.readLine()) != null) 
	        {
	            String[] rankDetails = line.split(COMMA_DELIMITER);
	                
	            if(rankDetails.length > 0 )
                	{
                		//Save the rank details in RankData object
                		RankData rank = new RankData(rankDetails[2],rankDetails[0],rankDetails[1],Double.parseDouble(rankDetails[3]));
                    	rankList.add(rank);
                	}
            	}
    		}
    		catch(Exception ee)
    		{
    			ee.printStackTrace();
        	}
    		finally
        	{
            	try
            	{
            		rankBR.close();
            	}
            	catch(IOException ie)
            	{
            		System.out.println("Error occured while closing the BufferedReader");
                		ie.printStackTrace();
            	}
    		}
	    		
    		//print the Rank List
        /*	Collections.sort(rankList);
    		for(RankData rdata : rankList)
    		{
    			System.out.println(rdata);
    		}*/
    		
	    	// use quicksort to print rankList
	    // not working with tester yet.
	    	
    		//print the vendor list
    		for(VendorData vdata : vendorList)
    		{
    			System.out.println(vdata);
    		}
    		
    		//print the store list
    		/*for(StoreData sdata : storeList)
    		{
    			System.out.println(sdata);
    		}*/
    	}	
}



