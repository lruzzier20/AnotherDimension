public class ArrayOps{
  public static int sum(int[] givenArray){
      int total = 0;
      for(int i=0;i<givenArray.length;i++){
        total = total + givenArray[i];
      }
      return total;
  }
}
