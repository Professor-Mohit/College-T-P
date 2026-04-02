// Hacker Earth - Fun Game

import java.util.ArrayList;
import java.util.Scanner;

class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        
        ArrayList<Integer> result = new ArrayList<>();
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            a.add(sc.nextInt());
          
        }
       
        while ( !a.isEmpty()){
            if (a.get(0) < a.get(a.size()-1)) {
                a.remove(0);
                result.add(2);
            } else if (a.get(0) > a.get(a.size() - 1)) {
                a.remove(Math.max(a.size()-1,0));
                result.add(1);
            } else {
                if (a.size() == 1) {
                    a.remove(0);
                } else {
                    a.remove(0);
                    a.remove(a.size() - 1);
                }
                result.add(0);
            }
          
        }
        for (int k = 0;k <result.size(); k++) {
          System.out.print(result.get(k)+" ");
        }
    }

}