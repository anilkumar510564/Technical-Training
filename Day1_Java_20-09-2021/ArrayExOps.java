public class ArrayExOps {
    public static void main(String[] args) {
        int mi,avn=0;
        float mf,avf=0f;
        int []array={1,2,3,4,5};
        float []arr={1.2f,2.3f,3.4f,4.5f,5.6f};
        System.out.println("Middle element of integer array:");
        mi=array[(array.length/2)];
        System.out.println(mi);
        for(int i=0;i<array.length;i++)
        {
            avn = avn + array[i];
        }
        System.out.println("Average of integer array:");
        System.out.println(avn/5);
        System.out.println("Middle element of float array:");
        mf=arr[(arr.length/2)];
        System.out.println(mf);
        for(int i=0;i<arr.length;i++)
        {
            avf = avf + arr[i];
        }
        /*float average=average()*/
        System.out.println("Average of float array:");
        System.out.println(mf/5.0);




    }
}
