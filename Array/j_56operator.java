//OPERATORS-symbols that tell compiler to perform some operations
//operands+operator+operands(binary operators)

//1.binary operator-["+",'-','*','/','%']

//2.unary operators-*incremental ("++") 
                   //pre ++a("first change value then use value")
                   //post a++("first use value than change value")
                //*decremental ("--")
                //pre --a("first change value then use value")
                //post a--("first use value than change value")
                
//3.RELATIONAL OPERATOR-["==","!=",">","<",">=","<="]
//gives output as boolen value 

//4.LOGICAL OPERATOR-["&&","||","!"]

//5.BITWISE OPERATOR-["&"(binary and),"|"(binary or),"^"(binary Xor),"~"("binary one's complement"),"<<"(binary left shift),">>"(binary right shift)]

//.6ASSIGMENT OPERATOR-["=","+=","-=","*=","/="]

//bit manipulation-*get
                // *set
                //*clear
                //*update 
public class j_56operator {
    public static void main(String[] args) {
        int a=10;
        int b=10;
     //post increment
     System.out.println(a++);
     //pre increment
     System.out.println(++b);
     //post decrement
     System.out.println(a--);
     //post increment
     System.out.println(--b);
    }
    
}
