class comp
{
public static void main(String args[])
{
String S1="abc";
String S2="xyz;
String S3="abc";
int n= S1.compareTo(S2);
if(n>0)
 System.out.println(S1+"is larger than"+S2);
else
 System.out.println(S1+"is smaller than"+S2);
if(n==0)
 System.out.println(S1+"Equal"+S2);
}
}

