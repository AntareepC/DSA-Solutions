class Solution {
    public int[] RearrangeBySign(int[] arr) {
        int n=arr.length,pos=0,neg=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++) {
            if(arr[i]<0) {
                res[neg]=arr[i];
                neg=neg+2;
            } else {
                res[pos]=arr[i];
                pos=pos+2;
            }
        }
        return res;
    }
}