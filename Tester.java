public class Tester{
  public static void main(String[] args){
    int[] a = new int[]{1,2,3,4,5,6};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    int[][] trial = new int[3][3];
    trial[0][0]=1;
    trial[0][1]=2;
    trial[0][2]=3;
    trial[1][0]=2;
    trial[1][1]=3;
    trial[1][2]=1;
    trial[2][0]=3;
    trial[2][1]=1;
    trial[2][2]=2;
    System.out.println(arrToString(ArrayOps.sumRows(trial)));
    System.out.println(arrToString(ArrayOps.largestInRows(trial)));
    System.out.println(ArrayOps.sum(trial));
    System.out.println(arrToString(ArrayOps.sumCols(trial)));
    System.out.println(ArrayOps.isRowMagic(trial));
    System.out.println(ArrayOps.isColMagic(trial));
  }

  public static String arrToString(int[] arr){
    String sentence = "{";
    for(int i=0;i<arr.length;i++){
      sentence = sentence + (arr[i]);
      if(i!=arr.length-1){sentence = sentence + ", ";}
    }
    sentence = sentence + "}";
    return sentence;
  }
}
