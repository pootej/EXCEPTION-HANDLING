/*Write a program which will illustrate ArrayIndexOutOfBoundsException. 
Create an array variable with n size, accept values from user and store 
values into array, finally print all values on console.  
 */
public class ArrayOutOfBondExce {
    public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
         try{
         for(int i=6;i<50;i++){ //exception
            System.out.println(arr[i]);
         }
        }
        catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Its not possible as the reason is");
         System.out.println(e);
        }
        
    }
    
}
