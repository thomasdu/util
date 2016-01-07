public class Utils {
	
	/**
	 * 有序数组的二分查找， 数组元素比如实现Comparable<T>接口, 时间复杂度O(log n)
	 * 返回 数组下标
	 * @param collections
	 * @param v
	 * @return
	 */
	public static <T extends Comparable<T>> Integer binarySearchV(List<T> collections,T vt)
	{
		Integer len = collections.size();
		
		Integer mid = (len-1)/2;
		Integer begin = 0;
		Integer end = len-1;
		
		while(begin<=end)
		{
			T item_mid = collections.get(mid);
			if(item_mid.compareTo(vt) > 0)
			{//before half
				end = mid-1;
				mid = (end + begin)/2;
			}
			else if(item_mid.compareTo(vt) < 0)
			{//after half
				begin = mid+1;
				mid = (end + begin)/2;
			}
			else 
			{//equal				
				return mid;
			}
		}
		
		return null;
	}
	
	/**
	 * 有序数组的二分查找， 数组元素比如实现Comparable<Long>接口, 时间复杂度O(log n)
	 * @param collections
	 * @param vt
	 * @return
	 */
	public static <T extends Comparable<Long>> Integer binarySearchLong(List<T> collections,Long vt)	
	{
		Integer len = collections.size();
		
		Integer mid = (len-1)/2;
		Integer begin = 0;
		Integer end = len-1;
		
		while(begin<=end)
		{
			T item_mid = collections.get(mid);
			if(item_mid.compareTo(vt) > 0)
			{//before half
				end = mid-1;
				mid = (end + begin)/2;
			}
			else if(item_mid.compareTo(vt) < 0)
			{//after half
				begin = mid+1;
				mid = (end + begin)/2;
			}
			else 
			{//equal
				return mid;
			}
		}
		
		return null;
	}
	
}
