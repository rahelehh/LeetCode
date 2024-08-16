package intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i=0;
        String firstOfRange="";
        String item = "";
        while(i< nums.length){
            firstOfRange = String.valueOf(nums[i]);
            while(i+1< nums.length && nums[i+1] == nums[i]+1)
                i++;
            if(firstOfRange.equals(String.valueOf(nums[i])))
                item=firstOfRange;
            else
                item = firstOfRange+"->"+nums[i];
            result.add(item);
            i++;
        }
        return result;
    }
}
