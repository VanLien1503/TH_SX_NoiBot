import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap size list : ");
        int size = scanner.nextInt();

        int [] list = new int[size];
        System.out.println("list size : "+list.length);

        for (int i=0;i<list.length;i++){
            int random= (int) (Math.floor(Math.random()*100)+10);
            list[i]=random;
        }
        System.out.println(" List: ");
        for (int lt:list) {
            System.out.print(lt+" ");
        }
        System.out.println("/n begin : ");
        bubbleSortByStep(list);

        //
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNext = true;
        for (int k=1;k<list.length&&needNext;k++){
            needNext=false;
            for (int i=0;i<list.length-k;i++){
                if (list[i]>list[i]+1){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNext=true;
                }
            }
            if (needNext==false){
                System.out.println("Array may be sorted ");
                break;
            }
            System.out.print("List sau Khi : "+k+"Sort");
            for (int lt :list){
                System.out.print("List : "+lt+" ");
            }
            System.out.println();
        }
    }
}
