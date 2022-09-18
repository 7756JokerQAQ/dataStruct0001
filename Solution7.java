package text;

class Solution7 {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int h=n;
        int count1=0;
        int count2=0;
        int i=0;
        while(true){
            if(citations[i]>=h) {
                count1++;  //

            }else{
                count2++;  //1

            }

            if(h>n-count2){
                i=0;
                count1=0;
                count2=0;
                h--;
            }else{
                i++;
            }

            if(count1==h){
                return count1;
            }
        }

    }
}
