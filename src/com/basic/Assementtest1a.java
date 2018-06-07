package com.basic;
public class Assementtest1a {
	public static void main(String args[])
	{
 	int a=10;
if(a<=0)
{
if(a==0)
{
System.out.println("1 ");
}
else
{
System.out.println("2 ");
}
}
System.out.println("3 ");
	}
}

class selection_statements
{
public static void main(String args[])
{
int var1 = 5;
int var2 = 6;
if ((var2 = 1) == var1)
System.out.print(var2);
else
System.out.print(++var2);
}
}
class comma_operator
{
public static void main(String args[])
{
int sum = 0;
for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
sum += i;
System.out.println(sum);
}
}
class jump_statments
{
public static void main(String args[])
{
int x = 2;
int y = 0;
for ( ; y < 10; ++y)
{
if (y % x == 0)
continue;
else if (y == 8)
break;
else
System.out.print(y + " ");
}
}
}
class Test
{
public static void main(String[] args)
{
int i = 0, j = 9;
do {
i++;
if (j-- < i++) {
break;
}
} while (i < 5);
System.out.println(i + "" + j);
}
}
class Test1
{
public static void main(String[] args)
{
int x = 10;
if (++x < 10 && (x / 0 > 10))
{
System.out.println("Bishal");
}
else
{
System.out.println("GEEKS");
}
}
}
