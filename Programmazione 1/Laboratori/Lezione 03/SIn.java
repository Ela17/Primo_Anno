
import java.io.*;
import java.util.*;
/****************************************************************
*Class for simple console input.
*A class designed primarily for simple keyboard input of the form
*one input value per line. If the user enters an improper input,
*i.e., an input of the wrong type or a blank line, then the user
*is prompted to reenter the input and given a brief explanation
*of what is required. Also includes some additional methods to
*input single numbers, words, and characters, without going to
*the next line.
***************************************************************/
public class SIn
{
/***********************************************************
*Reads a line of text and returns that line as a String value.
*The end of a line must be indicated either by a new line
*character '\n' or by a carriage return '\r' followed by a
*new line character '\n'. (Almost all systems do this
*automatically. So, you need not worry about this detail.)
*Neither the '\n', nor the '\r' if present, are part of the
*string returned. This will read the rest of a line if the
*line is already partially read.
**********************************************************/
public static String readLine()
{
char nextChar;
String result = "";
boolean done = false;
while (!done)
{
nextChar = readChar(); if (nextChar == '\n')
done = true;
else if (nextChar == '\r')
{
//Do nothing.
//Next loop iteration will detect '\n'
}
else
result = result + nextChar;
}
return result;
}
/************************************************************
*Reads the first string of nonwhite characters on a line and
*returns that string. The rest of the line is discarded. If
*the line contains only white space, then the user is asked
*to reenter the line.
************************************************************/
public static String readLineWord()
{
String inputString = null, result = null;
boolean done = false;
while(!done)
{
inputString = readLine();
StringTokenizer wordSource =
new StringTokenizer(inputString);

if (wordSource.hasMoreTokens())
{
result = wordSource.nextToken();
done = true;
}
else
{
System.out.println(
"Your input is not correct. Your input must");
System.out.println(
"contain at least one nonwhitespace character.");
System.out.println(
"Please, try again. Enter input:");
}
}
return result;
}
/************************************************************
*Precondition: The user has entered a number of type int on
*a line by itself, except that there may be white space before
*and/or after the number.
*Action: Reads and returns the number as a value of type int.
*The rest of the line is discarded. If the input is not
*entered correctly, then in most cases, the user will be
*asked to reenter the input. In particular, this applies to
*incorrect number formats and blank lines.
************************************************************/
public static int readLineInt()
{
String inputString = null; int number = -9999;//To keep the compiler happy.
//Designed to look like a garbage value.
boolean done = false;
while (! done)
{
try
{
inputString = readLine();
inputString = inputString.trim();
number = (Integer.valueOf(inputString).intValue());
done = true;
}
catch (NumberFormatException e)
{
System.out.println(
"Your input number is not correct.");
System.out.println("Your input number must be");
System.out.println("a whole number written as an");
System.out.println("ordinary numeral, such as 42");
System.out.println("Please, try again.");
System.out.println("Enter a whole number:");
}
}
return number;
}
/************************************************************
*Precondition: The user has entered a number of type long on
*a line by itself, except that there may be white space
*before and/or after the number.
*Action: Reads and returns the number as a value of type
*long. The rest of the line is discarded. If the input is not
*entered correctly, then in most cases, the user will be asked
04/10/22, 16:38 https://informatica.i-learn.unito.it/pluginfile.php/341512/mod_resource/content/1/SIn.java
https://informatica.i-learn.unito.it/pluginfile.php/341512/mod_resource/content/1/SIn.java 3/8
*to reenter the input. In particular, this applies to
*incorrect number formats and blank lines.
***********************************************************/
public static long readLineLong()
{
String inputString = null; long number = -9999;//To keep the compiler happy.
//Designed to look like a garbage value.
boolean done = false;
while (! done)
{
try
{
inputString = readLine();
inputString = inputString.trim();
number = (Long.valueOf(inputString).longValue());
done = true;
}
catch (NumberFormatException e)
{
System.out.println(
"Your input number is not correct.");
System.out.println("Your input number must be");
System.out.println("a whole number written as an");
System.out.println("ordinary numeral, such as 42");
System.out.println("Please, try again.");
System.out.println("Enter a whole number:");
}
}
return number;
}
/**********************************************************
*Precondition: The user has entered a number of type double
*on a line by itself, except that there may be white space
*before and/or after the number.
*Action: Reads and returns the number as a value of type
*double. The rest of the line is discarded. If the input is
*not entered correctly, then in most cases, the user will be
*asked to reenter the input. In particular, this applies to
*incorrect number formats and blank lines.
***********************************************************/
public static double readLineDouble()
{
String inputString = null; double number = -9999;//To keep the compiler happy.
//Designed to look like a garbage value.
boolean done = false;
while (! done)
{
try
{
inputString = readLine();
inputString = inputString.trim();
number = (Double.valueOf(inputString).doubleValue());
done = true;
}
catch (NumberFormatException e)
{
System.out.println(
"Your input number is not correct.");
System.out.println("Your input number must be");
System.out.println("an ordinary number either with");
System.out.println("or without a decimal point,");
System.out.println("such as 42 or 9.99");

System.out.println("Please, try again.");
System.out.println("Enter a whole number:");
}
}
return number;
}
/************************************************************
*Precondition: The user has entered a number of type float
*on a line by itself, except that there may be white space
*before and/or after the number.
*Action: Reads and returns the number as a value of type
*float. The rest of the line is discarded. If the input is
*not entered correctly, then in most cases, the user will
*be asked to reenter the input. In particular,
*this applies to incorrect number formats and blank lines.
************************************************************/
public static float readLineFloat()
{
String inputString = null; float number = -9999;//To keep the compiler happy.
//Designed to look like a garbage value.
boolean done = false;
while (! done)
{
try
{
inputString = readLine();
inputString = inputString.trim();
number = (Float.valueOf(inputString).floatValue());
done = true;
}
catch (NumberFormatException e)
{
System.out.println(
"Your input number is not correct.");
System.out.println("Your input number must be");
System.out.println("an ordinary number either with");
System.out.println("or without a decimal point,");
System.out.println("such as 42 or 9.99");
System.out.println("Please, try again.");
System.out.println("Enter a whole number:");
}
}
return number;
}
/************************************************************
*Reads the first Nonwhite character on a line and returns
*that character. The rest of the line is discarded. If the
*line contains only white space, then the user is asked to
*reenter the line.
************************************************************/
public static char readLineNonwhiteChar()
{
boolean done = false;
String inputString = null; char nonWhite = ' ';//To keep the compiler happy.
while (! done)
{
inputString = readLine();
inputString = inputString.trim();
if (inputString.length() == 0)

{
System.out.println(
"Your input is not correct.");
System.out.println("Your input must contain at");
System.out.println(
"least one nonwhitespace character.");
System.out.println("Please, try again.");
System.out.println("Enter input:");
}
else
{
nonWhite = (inputString.charAt(0));
done = true;
}
}
return nonWhite;
}
/***********************************************************
*Input should consists of a single word on a line, possibly
*surrounded by white space. The line is read and discarded.
*If the input word is "true" or "t", then true is returned.
*If the input word is "false" or "f", then false is returned.
*Uppercase and lowercase letters are considered equal. If the
*user enters anything else (e.g. multiple words or different
*words), then, the user is asked to reenter the input.
***********************************************************/
public static boolean readLineBoolean()
{
boolean done = false;
String inputString = null; boolean result = false;//To keep the compiler happy.
while (! done)
{
inputString = readLine();
inputString = inputString.trim();
if (inputString.equalsIgnoreCase("true")
|| inputString.equalsIgnoreCase("t"))
{
result = true;
done = true;
}
else if (inputString.equalsIgnoreCase("false")
|| inputString.equalsIgnoreCase("f"))
{
result = false;
done = true;
}
else
{
System.out.println(
"Your input number is not correct.");
System.out.println("Your input number must be");
System.out.println("one of the following:");
System.out.println("the word true,");
System.out.println("the word false,");
System.out.println("the letter T,");
System.out.println("or the letter F.");
System.out.println("You may use either uppercase");
System.out.println("or lowercase letters.");
System.out.println("Please, try again.");
System.out.println("Enter input:");
}
}
return result;

}
/************************************************************
*Reads the next input character and returns that character. The
*next read takes place on the same line where this one left off.
***********************************************************/
public static char readChar()
{
int charAsInt = -1; //To keep the compiler happy
try
{
charAsInt = System.in.read();
}
catch(IOException e)
{
System.out.println(e.getMessage());
System.out.println("Fatal error. Ending Program.");
System.exit(0);
}
return (char)charAsInt;
}
/***********************************************************
*Reads the next nonwhite input character and returns that
*character. The next read takes place immediately after
*the character read.
**********************************************************/
public static char readNonwhiteChar()
{
char next;
next = readChar();
while (Character.isWhitespace(next))
next = readChar();
return next;
}
/***********************************************************
*The following methods are not used in the text, except for
*a brief reference in Chapter 2. No program code uses them.
*However, some programmers may want to use them.
**********************************************************/
/************************************************************
*Precondition: The next input in the stream consists of an
*int value, possibly preceded by white space, but definitely
*followed by white space.
*Action: Reads the first string of nonwhite characters
*and returns the int value it represents. Discards the first
*whitespace character after the word. The next read takes
*place immediately after the discarded whitespace.
*In particular, if the word is at the end of a line, the
*next reading will take place starting on the next line.
*If the next word does not represent an int value,
*a NumberFormatException is thrown.
***********************************************************/
public static int readInt() throws NumberFormatException
{
String inputString = null; inputString = readWord();
return (Integer.valueOf(inputString).intValue());
}

/************************************************************
*Precondition: The next input consists of a long value,
*possibly preceded by white space, but definitely
*followed by white space.
*Action: Reads the first string of nonwhite characters and
*returns the long value it represents. Discards the first
*whitespace character after the string read. The next read
*takes place immediately after the discarded whitespace.
*In particular, if the string read is at the end of a line,
*the next reading will take place starting on the next line.
*If the next word does not represent a long value,
*a NumberFormatException is thrown.
************************************************************/
public static long readLong()
throws NumberFormatException
{
String inputString = null; inputString = readWord();
return (Long.valueOf(inputString).longValue());
}
/***********************************************************
*Precondition: The next input consists of a double value,
*possibly preceded by white space, but definitely
*followed by white space.
*Action: Reads the first string of nonwhitespace characters
*and returns the double value it represents. Discards the
*first whitespace character after the string read. The next
*read takes place immediately after the discarded whitespace.
*In particular, if the string read is at the end of a line,
*the next reading will take place starting on the next line.
*If the next word does not represent a double value,
*a NumberFormatException is thrown.
************************************************************/
public static double readDouble()
throws NumberFormatException
{
String inputString = null; inputString = readWord();
return (Double.valueOf(inputString).doubleValue());
}
/***********************************************************
*Precondition: The next input consists of a float value,
*possibly preceded by white space, but definitely
*followed by white space.
*Action: Reads the first string of nonwhite characters and
*returns the float value it represents. Discards the first
*whitespace character after the string read. The next read
*takes place immediately after the discarded whitespace.
*In particular, if the string read is at the end of a line,
*the next reading will take place starting on the next line.
*If the next word does not represent a float value,
*a NumberFormatException is thrown.
************************************************************/
public static float readFloat()
throws NumberFormatException
{
String inputString = null; inputString = readWord();
return (Float.valueOf(inputString).floatValue());
}
/***********************************************************
*Reads the first string of nonwhite characters and returns
*that string. Discards the first whitespace character after
04/10/22, 16:38 https://informatica.i-learn.unito.it/pluginfile.php/341512/mod_resource/content/1/SIn.java
https://informatica.i-learn.unito.it/pluginfile.php/341512/mod_resource/content/1/SIn.java 8/8
*the string read. The next read takes place immediately after
*the discarded whitespace. In particular, if the string
*read is at the end of a line, the next reading will take
*place starting on the next line. Note, that if it receives
*blank lines, it will wait until it gets a nonwhitespace
*character.
************************************************************/
public static String readWord()
{
String result = "";
char next;
next = readChar();
while (Character.isWhitespace(next))
next = readChar();
while (!(Character.isWhitespace(next)))
{
result = result + next;
next = readChar();
}
if (next == '\r')
{
next = readChar();
if (next != '\n')
{
System.out.println("Fatal Error in method readWord of class SavitchIn.");
System.exit(1);
}
}
return result;
}
//The following was intentionally not used in the code for
//other methods so that somebody reading the code could more
//quickly see what was being used.
/************************************************************
*Reads the first byte in the input stream and returns that
* byte as an int. The next read takes place where this one
*left off. This read is the same as System.in.read(),
*except that it catches IOExceptions.
************************************************************/
public static int read()
{
int result = -1; //To keep the compiler happy
try
{
result = System.in.read();
}
catch(IOException e)
{
System.out.println(e.getMessage());
System.out.println("Fatal error. Ending Program.");
System.exit(0);
}
return result;
}
}