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

  public static int[] sumRows(int[][] matrix){
    int tempSum = 0;
    int[] returnIndex = new int[matrix.length];
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){
        tempSum+=matrix[i][j];
      }
      returnIndex[i]=tempSum;
      tempSum = 0;
    }
    return returnIndex;
  }

  public static int[] largestInRows(int[][] matrix){
    int[] array = new int[matrix.length];
    for(int i=0;i<matrix.length;i++){
      array[i]=largest(matrix[i]);
    }
    return array;
  }

}
