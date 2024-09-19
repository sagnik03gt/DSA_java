package string;

public class StringPractice {
    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in " + "the category:apperal and the slightly " + "more in demand category:makeup along with the category:furniture and..";

        String str2 =  "ssbaskdhaudhwidody";
        for(int i =str2.length()-1  ;i>=0;i--){
            System.out.println("charAt "+i+": "+str2.charAt(i));
        }
//        int i =0;
//        while(true){
//            int found = str.indexOf("category:",i);
//            if(found==-1) break;
//            int start = found+9;
//            int end = str.indexOf(" ",start);
//            System.out.println(str.substring(start,end));
//            i=end+1;
//        }
    }
}
