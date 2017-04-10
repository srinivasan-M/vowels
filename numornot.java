import java.util.*;
class numornot
{
public static void main(String args[])
{
char ch;
Scanner s=new Scanner(System.in);
ch=s.next().charAt(0);
ArrayList<Character> al=new ArrayList<Character>();
al.add(ch);
ArrayList<Character> al1=new ArrayList<Character>();
al1.add('a');
al1.add('e');
al1.add('i');
al1.add('o');
al1.add('u');
boolean b=al1.containsAll(al);
if(b)
System.out.println("Vowel");
else
System.out.println("Consonant");}}
