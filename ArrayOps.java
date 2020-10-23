public class ArrayOps{
  public static int sum(int[] givenArray){
      int total = 0;
      for(int i=0;i<givenArray.length;i++){
        total = total + givenArray[i];
      }
      return total;
  }

  public static int largest(int[] givenArray){
    int largest = 0;
    for(int i=0;i<givenArray.length;i++){
      if(givenArray[i]>largest){largest=givenArray[i];}
    }
    return largest;
  }
}
