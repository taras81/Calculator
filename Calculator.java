import java.util.Scanner;

public class Calculator {
   
    	public static void main(String[] args) {
      	Choice C = new Choice();
       	C.greatting();
       	C.getChoise();
    } 
    
}



 class Choice {
    private int choice;
    
    public void greatting(){
           
            System.out.println("Please, choose numerals' type you would like to work with");
            System.out.println("1 - Arabik numbers 2 - Roman numbers 3 - Exit");
    }
    public void getChoise(){
       Scanner userInput = new Scanner (System.in); 
       boolean ch = true;
        try{
          while(ch ==true){  
            
         this.choice=userInput.nextInt(); 
            switch (choice){
                
                case 1:
                   System.out.println("the choice is "+ choice); 
                   Arabic ar = new Arabic();
                   ar.Count();
                   greatting();
                   break;
                case 2:
                   System.out.println("the choice is "+ choice); 
                   Roman rom = new Roman();
                   rom.Count();
                   greatting();
                   break;
                case 3:
                   System.out.println("the choice is "+ choice); 
                   ch = false;
                   break;
                default:
                     System.out.println("You did not entered required symbol!");
                     greatting();
                     break;
            }
          }
         } catch (Exception ex){
             System.out.println("You did not entered required symbol!");
         }
        }
        
            
       } 
    
 
class Arabic {
    float firstNum, secondNum;
    char sign;
    //Scanner userInput = new Scanner (System.in); 
    public void Count(){
        try{
    Scanner userInput = new Scanner (System.in);
    System.out.println("Please, enter your first arabic number"); 
    firstNum=userInput.nextFloat();
        }catch (Exception e){
                //System.out.println("Something went wrong"+ e);
                System.out.println("The symbol you have entered is not supported\nProgram will be terminated2");
                System.exit(0);
        }
      try{
    Scanner userInput = new Scanner (System.in);
    System.out.println("Please, enter your sign (+ : - : * : /)"); 
    sign=userInput.next().charAt(0);
        }catch (Exception e){
                System.out.println("Something went wrong"+ e);
                System.out.println("The symbol you have entered is not supported\nProgram will be terminated");
                System.exit(0);
        }
      try{
    Scanner userInput = new Scanner (System.in);
    System.out.println("Please, enter your second arabic number"); 
    secondNum=userInput.nextFloat();
        }catch (Exception e){
                System.out.println("Something went wrong"+ e);
                System.out.println("The symbol you have entered is not supported\nProgram will be terminated");
                System.exit(0);
        }
     switch (sign){
         case '*':
            System.out.println("The answer is: "+ (firstNum*secondNum));
            break;
         case '/':
            System.out.println("The answer is: "+ (firstNum/secondNum));
            break;
         case '+':
            System.out.println("The answer is: "+ (firstNum+secondNum));
            break;
         case '-':
            System.out.println("The answer is: "+ (firstNum-secondNum));
            break;
         default:
             System.out.println("You have entered wrong sign ");
             System.exit(0);
     }
      
      
    }
 }  

 class Roman {
    int firstNum, secondNum;
    char sign;   
        public static int parserRoman(String romanNumber){
            int result=0;
            String rNum = romanNumber.toUpperCase();
                switch (rNum){
                case "I":
                  result = 1;
                  break;
                case "II":
                  result = 2;
                  break;
                case "III":
                  result = 3;
                  break;
                case "IV":
                  result = 4;
                  break;
                case "V":
                  result = 5;
                  break;
                case "VI":
                  result = 6;
                  break;
                case "VII":
                  result = 7;
                  break;
                case "VIII":
                  result = 8;
                  break;
                case "IX":
                  result = 9;
                  break;
                case "X":
                  result = 10;
                  break;
                default:
                  System.out.println("The symbol you have entered is not supported\nProgram will be terminated");
                  System.exit(0);
                }
             return result;   
        }


 void Count(){
        try{
    
    Scanner userInput = new Scanner (System.in);
    System.out.println("Please, enter your first roman number"); 
    firstNum=parserRoman(userInput.next());
        }catch (Exception e){
                System.out.println("Something went wrong"+ e);
		System.exit(0);
        }
      try{
    Scanner userInput = new Scanner (System.in);
    System.out.println("Please, enter your sign (+ : - : * : /)"); 
    sign=userInput.next().charAt(0);
        }catch (Exception e){
                System.out.println("Something went wrong"+ e);
		System.exit(0);
        }
      try{
    Scanner userInput = new Scanner (System.in);
    System.out.println("Please, enter your second arabic number"); 
    secondNum =  parserRoman(userInput.next());
        }catch (Exception e){
                System.out.println("Something went wrong"+ e);
		System.exit(0);
        }
     switch (sign){
         case '*':
            System.out.println("The answer is: "+ (firstNum*secondNum));
            break;
         case '/':
            System.out.println("The answer is: "+ (firstNum/secondNum));
            break;
         case '+':
            System.out.println("The answer is: "+ (firstNum+secondNum));
            break;
         case '-':
            System.out.println("The answer is: "+ (firstNum-secondNum));
            break;
         default:
             System.out.println("You have entered wrong sign ");
             break;
     
      
       
     }
 }
 }
   