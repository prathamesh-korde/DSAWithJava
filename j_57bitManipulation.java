//bit manipulation-*get
                // *set
                //*clear
                //*update 
public class j_57bitManipulation{
    public static void main(String[] args) {
        //1.get bit                                                                                                           
        //get the 3rd bit(position=2) of a number n.(n=0101)
        //bit mask:1<<pos
        //operation:and
        int n=5;//0101
        int pos=2;
        int bitMask=1<<pos;//bit mask:1<<i (00100)
        System.out.println("get bit-");
        if((bitMask & n)==0){//operation:And
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
        //2.set bit
        //set the secound bit (position=1) of a number n.(n=0101)
        //bit mask:1<<i
        //operation:OR
        int num=5;//0101
        int i=1;
        int bitmask=1<<i; //(0010)
        int newNum=(bitmask | num);
        System.out.println("set bit-");
        System.out.println(newNum);
        //3.clear bit 
        //clear the 3rd bit (position=2) of a number n.(n=0101)
        //bitMask=i<<i
        //operation<<AND with NOT
        int numBer=5;//0101
        int j=2;
        int bit_mask=1<<j;//0100
        int bitMask_not= ~(bit_mask);//1011
        int new_num=(bitMask_not & numBer);
        System.out.println("clear bit");
        System.out.println(new_num);     
    }

}