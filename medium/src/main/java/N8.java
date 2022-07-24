/**
 * @author sora
 * @create 2021-03-28 21:34
 */
public class N8 {
    public int myAtoi(String str){
        int len = str.length();
        char[] charArray = str.toCharArray();

        int index = 0;
        if(charArray[index] == ' ' && index < len){
            index++;
        }
        if(index == len) return 0;

        int flag = 1;
        char firstFlag = charArray[index];
        if( firstFlag == '+'){
            index++;
        }else if(firstFlag == '-'){
            index++;
            flag = -1;
        }

        int res = 0;
        while(res < len){
            char currChar = charArray[index];
            if(currChar > '9' || currChar < '0'){
              break;
            }
            if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10 ))
                return Integer.MAX_VALUE;
            if(res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') < -Integer.MIN_VALUE % 10 ))
                return Integer.MIN_VALUE;

            res = res * 10 + flag * (currChar - '0');
            index++;
        }
        return res;


        }
    }

