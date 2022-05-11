public class SwapArr {
    public static void main(String[] args){
        //demo1: swap value within an array:
        System.out.println("demo1: swap value within an array:");
        int[] aNum = {10, 20, 30, 40, 50};
        for(int i=0; i<aNum.length; i++){System.out.println(aNum[i]);}
        System.out.println();
        //start swap array within aNum:
        int lowindex=0;
        int highindex=aNum.length-1;
        System.out.println("lowindex: "+lowindex+", highindex: "+highindex);
        while(lowindex<highindex){
            //store the origional value in tmp variables:
            int lowVal=aNum[lowindex];
            int highVal=aNum[highindex];
            System.out.println("lowValue: "+lowVal+", highValue: "+highVal);
            //assign the new swapped value to target element:
            aNum[lowindex]=highVal;
            aNum[highindex]=lowVal;
            System.out.println("aNum[lowindex]: "+aNum[lowindex]+", aNum[highindex]: "+aNum[highindex]);
            lowindex+=1;
            highindex-=1;
            System.out.println("lowindex: "+lowindex+", highindex: "+highindex);
        }//end while
        for(int i=0; i<aNum.length; i++){System.out.println(aNum[i]);}
        System.out.println();

        //demo2: swap value between 2 array:
        System.out.println("demo2: swap value between 2 array");
        int[] aNum2 = {10, 20, 30, 40, 50};
        int[] bNum2 = {60, 70, 80, 90, 100};
        System.out.println("aNum2:");
        for(int i=0; i<aNum2.length; i++){System.out.println(aNum2[i]);}
        System.out.println("bNum2:");
        for(int i=0; i<bNum2.length; i++){System.out.println(bNum2[i]);}
        System.out.println();
        //initialize variables for swapping values between 2 arrays:
        int[] tmparrval=new int[aNum2.length];//assume both array's length are the same before use this method
        int lowindex2=0;
        int highindex2=aNum2.length-1;
        System.out.println("tmparrval len: "+tmparrval.length+" ; lowindex2: "+lowindex2+"; highindex2: "+highindex2);
        while(lowindex2<=highindex2){
            //store the origional value in tmp variables:
            tmparrval[lowindex2]=aNum2[lowindex2];
            //swap values between 2 arrays:
            aNum2[lowindex2]=bNum2[lowindex2];
            bNum2[lowindex2]=tmparrval[lowindex2];
            
            System.out.println("aNum2[lowindex2]: "+aNum2[lowindex2]+
            " , bNum2[lowindex2]: "+bNum2[lowindex2]+
            " , lowindex2: "+lowindex2);
            
            lowindex2+=1;
        }//end while
        System.out.println("aNum2:");
        for(int i=0; i<aNum2.length; i++){System.out.println(aNum2[i]);}
        System.out.println();
        System.out.println("bNum2:");
        for(int i=0; i<bNum2.length; i++){System.out.println(bNum2[i]);}

    }//end main
    
}
