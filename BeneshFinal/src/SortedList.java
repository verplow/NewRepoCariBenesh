import java.util.ArrayList;

public class SortedList {
	
	
	private ArrayList<RankData> rankList = new ArrayList<RankData>();
	
	/**
	 * @param inRankList constructor
	 */
	public SortedList(ArrayList<RankData> inRankList)
	{
		this.rankList = inRankList;
	}
	
	/**
	 * @return list
	 */
	public ArrayList<RankData> getArrayList()
	{
		return this.rankList;
	}
	
	/**
	 * @param inRankList
	 * @return sorted arrayList
	 */
	public ArrayList<RankData> quickSort(ArrayList<RankData> inRankList)
	{
		if (inRankList.size() <=1)
		{
			return inRankList;
		}
		
		ArrayList<RankData> sorted = new ArrayList<RankData>();
		ArrayList<RankData> left = new ArrayList<RankData>();
		ArrayList<RankData> right = new ArrayList<RankData>();
		RankData pivot = inRankList.get(inRankList.size()-1);	// use last RankData object as pivot
		
		for (int i = 0; i < inRankList.size()-1; i++)
		{
			// compare i to pivot and add to subList
			if (inRankList.get(i).compareTo(pivot) < 0)
				left.add(inRankList.get(i));
			else
				right.add(inRankList.get(i));
		}
		
		left = quickSort(left);
		right = quickSort(right);
		
		left.add(pivot);
		left.addAll(right);
		sorted = left;
		
		return sorted;
	}
}
