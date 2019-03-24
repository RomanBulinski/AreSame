public class Main {



    public static boolean comp(int[] a, int[] b) {

        if( a.length != b.length ){
            return false;
        }
        int index =0;
        if(  Math.pow(a[a.length-1], 2)  == b[index]  ){
            index++;
        }else{
            return false;
        }
        while(index < a.length ){
            if( Math.pow(a[index-1], 2) == b[index]    ){
                index++;
            }else{
                return false;
            }
        }
        return true;
    }

}
