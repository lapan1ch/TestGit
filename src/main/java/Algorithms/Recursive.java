package Algorithms;

public class Recursive {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        int sum =  recursiveSum(array,0);
        System.out.println(sum);
    }


  public static int recursiveSum(int[] array, int index){
  if (index >= array.length){
      return 0;
  } else {
      return array[index] + recursiveSum(array,index + 1);
  }
}

}
