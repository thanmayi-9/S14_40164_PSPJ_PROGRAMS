public class array {
    public static void main(String[] args){
        int[] marks = {90,89, 87,86,85};
        int target = 89;
        int count = 0;
        int max = marks[0];
        //traversal 
        for(int i =0; i<marks.length;i++){
            System.out.println("Element is "+marks[i]);
        }
        //searching 
        for(int i =0; i<marks.length;i++){
            if(marks[i]==target){
                System.out.println("Found at the index : "+i);
            }
        }
        //counting
        for(int i =0;i<marks.length;i++){
             if(marks[i]>87){
                count++;
        }
    }
     System.out.println("Passed students : "+count);
        // extreme
        for(int i =0; i<marks.length; i++){
             if(marks[i]>max){
                max = marks[i];
             }
        }
        System.out.println("Maximum mark :"+max);
        
    }
}
