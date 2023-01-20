import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] X = {"ceo","alco","caaeio","ceai"};
        String[] Y = {"ec","oc","ceo"};
        boolean flag1 =true;

        int count=0;
     for(int i=0;i<X.length;i++){
            flag1=true;
            int[] ch = new int[26];
            for(int j=0;j<X[i].length();j++){
                ch[X[i].charAt(j)-97]=1;
            }
            for(int j=0;j<Y.length;j++) {
                    for (int k = 0; k < Y[j].length(); k++) {
                        if (ch[Y[j].charAt(k) - 97] == 0) {
                            flag1=false;
                        }
                    }
            }
            if(flag1==true){
                count++;
            }
        }
        System.out.println(count);

    }
}
