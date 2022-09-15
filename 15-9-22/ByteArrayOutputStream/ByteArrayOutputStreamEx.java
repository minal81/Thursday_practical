

import java.io.*;
class ByteArrayOutputStreamEx
{
public static void main(String args[]) throws Exception
{
ByteArrayOutputStream f = new ByteArrayOutputStream(12);
System.out.println ("enter 5 characters string");

while (f.size() != 5)
{
f.write(System.in.read( ) );
}

byte b[] = f.toByteArray();
System.out.println("convert into array");
for(int l=0;l<b.length;l++)
{
System.out.println((char)b[l]);
}

ByteArrayInputStream inp = new ByteArrayInputStream(b);
int c;
System.out.println("converted to upper case characters");
for (int i=0;i<1;i++)
{
while((c=inp.read()) != -1)
{
System.out.print(Character.toUpperCase((char)c));
}
System.out.println();
inp.reset();
}
}
}
