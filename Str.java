import java.util.h;
pubic class Str
{
public static void main(String args[])
{
System.out.println("enter the string");
String str=s1.nextLine();
StringBuffer str1=new stringBuffer(str);
for(int i=0;i<str1.length();i++)
{
for(int j=i+1;j<str1.length();j++)
if(str1.charAt(i)==str1.charAt(j))
{
str1=str1.deleteCharAt(j);
j--;
}
}
}
System.out.println("the modified string is");
}
