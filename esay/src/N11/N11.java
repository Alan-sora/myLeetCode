package N11;

/**
 * @author sora
 * @create 2021-04-14 9:59
 */
public class N11 {
    public int minArray(int[] numbers) {
        if(numbers == null || numbers.length == 0) return 0;
        if(numbers.length == 1) return numbers[0];
        for(int i = 0;i < numbers.length - 1;i++){
            if(numbers[i] > numbers[i + 1]) return numbers[i + 1];
        }
        return numbers[0];
    }
}