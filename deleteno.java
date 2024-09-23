import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the size of Array: ");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        int i = 0;
        while(i<arr.length){
            System.out.print("Enter data at: "+(i+1)+": ");
            arr[i] = input.nextInt();
            i++;
        }
        
        System.out.print("enter no you want to delete: ");
        int delete = input.nextInt();
        int[] newarr = deletenumber(arr,delete);
        System.out.print("here is ypur new arr");
        
         i=0;
        while(i<arr.length){
            System.out.print(arr[i]+ " ");
            i++;
        }
        System.out.println();
    }
    
    public static int[] deletenumber(int[] arr, int delete){
        int occ = occ(arr ,delete);
        if(occ == 0){
            return arr;
        }
        
        int newsize = arr.length-occ;
        int[] newarr = new int[newsize];
        
        
        int i = 0; int j = 0;
        while(i<arr.length){
            if(arr[i]!=delete){
                newarr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newarr;
        }
        
        public static int occ(int arr[] ,int delete){
            int i = 0;
             delete = 0;
            while(i<arr.length){
                if(arr[i] == delete){
                    delete++;
                }
                i++;
            }
            return delete;
        }
}
