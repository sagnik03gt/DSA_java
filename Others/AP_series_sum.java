import java.util.ArrayList;

public class AP_series_sum {
    public static void main(String[] args) {
        apsum(2, 2, 4);
    }
    static void apsum(int a,int d,int n){
        ArrayList<Integer> aparray = new ArrayList<>();
        int sum=0;
        for(int i = a ;i<=d*n;i+=d){
            aparray.add(i);
        }
        System.out.println(aparray.toString());
        for(int i =0;i<aparray.size();i++){
            sum+=aparray.get(i);
        }
        System.out.println("sum of the A.P series: "+sum);
    }
}
