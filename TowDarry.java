class TowDarry
{
public static void main(String args[])
int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
System.out.println("2D arry=");
printArry(arr);
}
public static void printArry(int[][]arr)
{
for (int[] row:arr)
{
for(int num:row)

{
System.out.println(num+"");
}
System.out.println();
}
}
}