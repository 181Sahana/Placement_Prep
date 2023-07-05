package Recurssion;

public class findoccurance {
    public static int first = -1;
    public static int last = -1;

    public static void FindOccurance(String s, int idx, char ele){
        if(idx == s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = s.charAt(idx);
        if(currchar == ele){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }

        FindOccurance(s, idx+1, ele);
    }

    public static void main(String args[]){
        String s = "aaabvgdddccreaavvdayuaaaabgt";
        FindOccurance(s, 0, 'a');
    }
}
