package J05;

/**
 * @author sora
 * @create 2021-04-13 9:43
 */
public class J05 {
    public String replaceSpace(String s){
        char[] a = new char[s.length() * 3];
        int size = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
                a[size++] = '%';
                a[size++] = '2';
                a[size++] = '0';
            }else {
                a[size++] = c;
            }
        }
        String s1 = new String(a,0,size);
        return s1;
    }

    public static void main(String[] args) {
        J05 j05 = new J05();
        String s = new String("We are happy.");
        System.out.println(j05.replaceSpace(s));
    }
}
