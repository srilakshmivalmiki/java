public class StringDemo
{
public static void main(String args[]) {
String str="RavindraDegreeCollege";
int size=str.length();
System.out.println("Size of"+str+"is"+size);
String ustr=str.toUpperCase();
System.out.println("String in uppercase:"+ustr);
boolean eq=str.equalsIgnoreCase(ustr);
if(eq==true)
System.out.println("Strings are same(case ignored)");
else
System.out.println("Strings are not same");
String substr=str.substring(2,6);
System.out.println("Substring:"+substr);
char ch=str.charAt(4);
System.out.println("Character at index 4 is"+ch);
String newstr=str.concat(ustr);
System.out.println("String after concatenation:"+newstr);
}
}