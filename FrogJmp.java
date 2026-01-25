// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        //현재 위치는 X, 가고 싶은 거린 y
        // 개구리의 이동거리는  x-> y 까지 갈때 D가 몇번 더해지는지 
        int cnt=0;
        int sum=0;
        if(X==Y){
            return 0;
        }
        Y = Y-X;
        
        if(Y%D==0){
            sum = Y/D;
        }else{
            sum = Y/D;
            sum++;
        }

        // while(true){
        //     if(Y<=sum){
        //         break;
        //     }else{
        //        sum += D;
        //        cnt++;
        //        //System.out.println(sum);     
        //     }

        // }
        return sum;
    }
}
