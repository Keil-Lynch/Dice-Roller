public class DiceRoller {
	public static void main(String[] args) {
	    
        int dice1;   
        int dice2;   
        int roll;  
        
        dice1 = (int)(Math.random()*6) + 1;
        dice2 = (int)(Math.random()*6) + 1;
        roll = dice1 + dice2;
        
        System.out.println("The first die comes up " + dice1);
        System.out.println("The second die comes up " + dice2);
        System.out.println("Your total roll is " + roll);

    }  
 
}