/**
 * Created by h205p2 on 8/31/17.
 */
public class Runner {

    public static void main(String args[]){

        //System.out.println(startHi("hi there"));
        //System.out.println(startHi("hello there"));
        //System.out.println(delDel("adelbc"));
        //System.out.println(countXX("axxbcxxxxxx"));
        //System.out.println(extraEnd("hello"));
        int[] testArr;
        testArr = new int[3];
        testArr[0] = 1;
        testArr[1] = 2;
        testArr[2] = 3;
        System.out.println(midThree(testArr));
        //System.out.println(in1To10(5, false));
        //System.out.println(luckySum(2, 13, 5));
        //System.out.println(catDog("catdogcatdog"));
        //System.out.println(notReplace("This is"));
        //System.out.println(shiftLeft([1,2,3,4]));
    }

    public static boolean startHi(String str){
        if(str.length() < 2){
            return false;
        }
        if("h".equals(str.substring(0,1)) && "i".equals(str.substring(1,2))){
            return true;
        }
        return false;
    }

    public static String delDel(String str) {

        String rtnStr = str;
        if(str.length() < 4){
            return str;
        }
        if("del".equals(str.substring(1,4))){
            rtnStr = str.charAt(0) + str.substring(4);
        }
        return rtnStr;
    }

    public static int countXX(String str){
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if("x".equals(str.substring(i, i+1)) && "x".equals(str.substring(i+1, i+2))){
                count++;
            }
        }
        return count;
    }

    public static String extraEnd(String str){
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public static int[] midThree(int[] nums) {
        int[] rtnArr = new int[3];
        int middle = nums.length / 2;
        rtnArr[0] = nums[middle - 1];
        rtnArr[1] = nums[middle];
        rtnArr[2] = nums[middle + 1];
        return rtnArr;
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode){
            if(n <= 1 || n>= 10){
                return true;
            }
            return false;
        }
        if(n>=1 && n<= 10){
            return true;
        }
        return false;
    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            return sum;
        }
        sum += a;
        if(b == 13){
            return sum;
        }
        sum+=b;
        if(c == 13){
            return sum;
        }
        sum+=c;
        return sum;
    }

    public static boolean catDog(String str) {
        int catCt = 0;
        int dogCt = 0;
        for(int i = 0; i < str.length() - 2; i++){
            if("cat".equals(str.substring(i, i + 3))){
                catCt++;
            }
            if("dog".equals(str.substring(i, i + 3))){
                dogCt++;
            }
        }
        if(catCt == dogCt){
            return true;
        }
        return false;
    }

    public static String notReplace(String str) {
        String newStr  = "";
        if(str.length() == 0){
            return newStr;
        }
        for(int i = 0; i < str.length() - 2; i++){
            int index = str.indexOf("is", i);
            if(index == 0){
                if(!Character.isLetter(str.charAt(i+2))){
                    newStr += "is not";
                    i += 2;
                };
            }
            else if(index == i){
                if(!Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))){
                    newStr += "is not";
                    i += 2;
                };
            }
           newStr += str.substring(i, i+1);
        }
        if("is".equals(str)){
            newStr += "is not";
        }
        else if("is".equals((str.substring((str.length()-2)))) && !Character.isLetter(str.charAt(str.length()-3))){
            newStr += "is not";
        }
        else{
            newStr += str.substring((str.length()-2));
        }
        return newStr;
    }

    public static int[] shiftLeft(int[] nums) {
        if(nums.length < 1){
            return nums;
        }
        int[] rtnArray = new int[nums.length];
        rtnArray[nums.length - 1] = nums[0];
        for(int i = 1; i < nums.length; i++){
            rtnArray[i-1]= nums[i];
        }
        return rtnArray;
    }

    public static int[] fix34(int[] nums) {
        int[] rtnArray = new int[nums.length];
        int threeCt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 3) {
                threeCt++;
                rtnArray[i]=3;
                rtnArray[i+1]=4;
            }
        }
        int[] secondArray = new int[nums.length - (2 * threeCt)];
        int arrayCt = 0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] != 3) && (nums[i] != 4)) {
                secondArray[arrayCt] = nums[i];
                arrayCt++;
            }
        }
        int placeCt = 0;
        for(int i = 0; i < rtnArray.length; i++){
            if(rtnArray[i]==0){
                rtnArray[i] = secondArray[placeCt];
                placeCt++;
            }
        }

        return rtnArray;
    }


}
