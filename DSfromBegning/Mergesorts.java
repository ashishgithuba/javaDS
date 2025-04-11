public class Mergesorts {
    public static void main(String[] args) {
      int []array1={10,20,30};
      int []array2={40,60,80,100,120};
      int[]meragearray=new int[array1.length+array2.length];

      for(int i=0;i<array1.length;i++)
      {
meragearray[i]=array1[i];
      }
      for(int i=0;i<array2.length;i++)
     {
        meragearray[array1.length+i]=array2[i];
     } 

     for(int i=0;i<meragearray.length;i++)
     {
        System.out.print(meragearray[i]+ " ");
     }
    }
    
}
