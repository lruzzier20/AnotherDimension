public class Tester{
  public static void main(String[] args){
    int[] a = new int[]{1,2,3,4,5,6};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    int[][] trial = new int[3][5];
    trial[0][0]=1;
    trial[0][1]=2;
    trial[0][2]=3;
    trial[0][3]=4;
    trial[0][4]=5;
    trial[1][0]=6;
    trial[1][1]=7;
    trial[1][2]=8;
    trial[1][3]=9;
    trial[1][4]=10;
    trial[2][0]=11;
    trial[2][1]=12;
    trial[2][2]=13;
    trial[2][3]=14;
    trial[2][4]=15;
    System.out.println(arrToString(ArrayOps.sumRows(trial)));
    System.out.println(arrToString(ArrayOps.largestInRows(trial)));
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
