/*Algorithm of brain kerningum
1. initialize the count = 0.
2. if integer not equal to zero then do
 -do bitwise & with (n-1) and assign the value back to n
 -n: =  n&=(n-1)
 -increment count by 1
 - return go to stem 2
3. return count
*/
public class BrainKerningum {
    static int countsetbit(int n ){
        int count = 0;
        while (n >0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    public static void main (String args[]){
        int i = 40;
        System.out.println(countsetbit(i));
    }
}
