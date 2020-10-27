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

  public static int sum(int[][] arr){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      sum+=(sumRows(arr))[i];
    }
    return sum;
  }

  public static int[] sumCols(int[][] matrix){
    int[] array = new int[matrix[0].length];
    int tempSum = 0;
    for(int i=0;i<matrix[0].length;i++){
      for(int j=0;j<matrix.length;j++){
        tempSum+=matrix[j][i];
      }
      array[i] = tempSum;
      tempSum=0;
    }
    return array;
  }

  public static boolean isRowMagic(int[][] matrix){
    int[] array = sumRows(matrix);
    boolean allEqual = true;
    for(int i=0;i+1<array.length;i++){
      if(!(array[i]==array[i+1])){allEqual=false;}
    }
    return allEqual;
  }

  public static boolean isColMagic(int[][] matrix){
    int[] array = sumCols(matrix);
    boolean allEqual = true;
    for(int i=0;i+1<array.length;i++){
      if(!(array[i]==array[i+1])){allEqual=false;}
    }
    return allEqual;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col){
    int[] array1 = sumRows(matrix);
    int[] array2 = sumCols(matrix);
    if(array1[row]==array2[col]){return true;}else{return false;}
  }

}
