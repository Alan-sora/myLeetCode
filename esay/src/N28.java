/**
 * @author sora
 * @create 2021-03-25 22:12
 */
public class N28 {
    public int strStr(String haystack, String needle) {
        int lh = haystack.length();
        int ln = needle.length();
        for (int start = 0; start < lh - ln + 1;start++){
            if(haystack.substring(start,start + ln).equals(needle)) return start;
        }
        return -1;

    }


}
