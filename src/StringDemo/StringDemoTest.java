package StringDemo;
public class StringDemoTest{
    public static void main(String [] args){
        String Name = "Ahsan Ahmed";
        int age = 30;
        System.out.println("Hello there,\nMy name is "+ Name+ " and i'm "+ age+ " years old.");
        
        int[] myInt = new int[10];
        
        myInt[0] = 10;
        myInt[1] = 20;
        
     for (int i : myInt){
         System.out.println("Hello "+ i);
     }
     
     
     for(int i = 0; i <= 10; i++){
         System.out.println(i);
     }
        
    }
}