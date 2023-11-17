package domain;


import java.util.List;
import com.alibaba.fastjson.JSON;

public class ToolUtils {

    public void logList(List<Integer> list) {
        for (Integer o : list) {
            System.out.println(JSON.toJSONString(o));
        }
    }
}
