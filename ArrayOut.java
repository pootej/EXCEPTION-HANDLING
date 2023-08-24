/*Write a program to find prime numbers from given two arrays and store in 3rd array. 
Handle ArrayIndexOutOfBoundsException while storing values into 3rd array*/


class Array{
    int count=0;

    void copy(){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int arr1[]={12,13,14,15,16,17};
    int arr2[]=new int[arr.length+arr1.length];
    for(int i=0;i<arr.length;i++){
        arr2[i]=arr[i];     
    }
    for(int j=0;j<arr1.length;j++){
        arr2[j]=arr1[j];     
    }
    
    try{
        for(int k=0;k<arr2.length+15;k++){
            count=0;
       for(int l=2;l<=20;l++){
        if(arr2[k]%l==0){
            count++;
            break;

        }
        if(count==0 && arr2[k] > 1){
            System.out.println("Prime Number is "+arr2[k]);
        }
       }
    }
}
catch(ArrayIndexOutOfBoundsException E){
    System.out.println("CANT PROCEED AS THE REASON IS");
    System.out.println(E);

}
    
}
}
class ArrayOut{
    public static void main(String[] args) {
        Array obj = new Array();
        obj.copy();
    }
}