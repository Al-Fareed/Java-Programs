public class strReArrangement {
    public static void main(String[] args) {
        String str=new String("aBCd");
        String con=new String();
        int[] a=new int[10];
        for (int i = 0; i < str.length(); i++) 
        {
            for (int j = 0; j < args.length; j++) 
            {
                int val=str.charAt(i);
                int nxtVal=str.charAt(j);
                System.out.println(val);
                if(val<nxtVal)
                {
                    int temp=val;
                    val=nxtVal;
                    nxtVal=temp;
                    System.out.println(nxtVal);
                    a[i]=nxtVal;
                }
            }
        }
        
        
    }
    
}
