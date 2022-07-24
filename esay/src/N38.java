import org.junit.Test;

/**
 * @author sora
 * @create 2021-03-27 22:19
 */
public class N38 {
    public String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        result.append(1);
        for (int i = 1; i < n; i++) {
            // 记录当前行的字符串
            StringBuilder s = new StringBuilder();
            // 记录每个数字的开始索引
            int start = 0;
            for (int j = 1; j < result.length(); j++) {
                // 当数字发生改变时执行
                if (result.charAt(j) != result.charAt(start)) {
                    s.append(j - start).append(result.charAt(start));
                    start = j;
                }
            }
            // 字符串最后一个数字
            s.append(result.length() - start).append(result.charAt(start));
            result = s;
        }
        return result.toString();


    }

    @Test
    public void myTest(){
        N38 n38 = new N38();
        System.out.println(n38.countAndSay(4));
    }

}
