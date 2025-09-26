package NewLearning;

public class BasicJava {
    public static int linearSearch(int num[],int find){
        for(int i=0;i<num.length;i++){
            if (num[i]==find){
                return i;
            } 
        }return -1;
    }

    public static void main(String[]args){
        int arr[]={8,5,2,7,6};
        int find=6;
        int output = linearSearch(arr,find);
        System.out.println(output);

    }
}
