import java.io.*;
class Copy
{
public static void main(String ar[])
{
int a[]= new int [5];
int i,j;
DataInputStream d=new DataInputStrem(System.in);
System.out.println("enter 5 no:");
for(i=0;i<5;i++)
a[i]=Integer.parseInt(d.readLine());
