// Command Line Interface
public class practicle_2 {
    public static void main(String[] args) {
        float count=0;
        for (int i=0;i<args.length;i++){
            count=count+Float.parseFloat(args[i]);
        }
        float per=count/args.length;
        System.out.println(per);
        if(per<100 & per>80){
            System.out.println("result-"+per+"% class 1");
        }
        else if(per<80 &per>60){
            System.out.println("result-"+per+"% class 2");
        }
        else if(per<60 & per>40){
            System.out.println("result-"+per+"% class 3");
        }
        else if(per<40 & per>30){
            System.out.println("result-"+per+"% class 4");
        }
        else{
            System.out.println("fail "+per+"%");
        }


    }
    
}
