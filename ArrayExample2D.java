public class ArrayExample2D {
public static void main(String[] args) {
int[][] a1 = new int[2][2];
a1[0] [0] = 10;
a1[0] [1] =  11;

a1[1][0] = 20;
a1[1][1] = 21;

for (int i=0; i < a1.length; i++) {
    System.out.println();
for (int j=0; j < a1[i].length; j++) {
System.out.print(a1[i][j] + " ");
}
}
}
}