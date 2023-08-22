
public class Matrix {

    public static void main(String[] args) {
        int[][] a ={//0 1 2 3 4
                     {1,6,8,9,20},   //0
                     {5,7,10,13,17}, //1
                     {12,14,16,18,21},//2
                     {15,19,22,25,27},//3
                     {23,24,26,28,30} //4
                   };
        int b = 24;
        Search s = new Search(a,b);
        s.todo();
        }
    }

//Class
class Search{
    int[][] a;
    int b;
    public Search(int[][] a,int b){
        this.a = a;
        this.b = b;
    }
    public void todo(){
        int k = a[a.length-1].length-1;
        for (int i = 0; i <a.length; i++) {
            for (int j = k; j>=0; j--) {
                System.out.println(a[i][j]+" "+i+" "+j);
                if (a[i][j] > b) { continue; }
                else if (a[i][j] < b) { k=j; break; }
                else {
                    System.out.println("True");
                    return;
                }
            }
        }
    }
}