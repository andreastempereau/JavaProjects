public class Number{
    private int numb;
    public Number(int n){
        n = numb;
    }
    public int numbLength(){
        String s = " " + numb;
        if(s.charAt(0) == '-') return s.length()-1;
            else return s.length();
    }
    public int count1s(){
        String s = " " + numb;
        int start = 1;
        int total = 0;
        while(start < s.length()){
            if(s.indexOf("1", start) > -1){
                start += s.indexOf("1", start);
                total++;
            }
            else break;
        }
        return total;
    }
    public int longestRun(){
        String s = " " + numb;
        int run = 1;
        int maxRun = 1;
        char current;
        for(int a =0; a<s.length() - 1; a++){
            current = s.charAt(a);
            if (s.charAt(a+1) == current) run ++;
                else run=1;
            if (run> maxRun) maxRun = run;
        }
        return maxRun;
    }
}
