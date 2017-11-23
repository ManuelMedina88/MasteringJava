import java.security.SecureRandom;

public class QuizQuestionAnswers {

   private String[] questions = { "A ______________ executes when you use the _____ command to launch the JVM.",
      "___________ document programs and improve their redability. the compiler ignores them.",
      "A comment that begins with // is an ______________________ it terminates at the end of the line on which it appears.",
      "__________________ can be spread over several lines and are delimited by /* and */.",
      "__________________, delimited by /** and */, enable you to embed program documentation in your code. The ___________ utility program generates HTML pages based on these comments.",
      "A _______________ also called a ________________,________________or_________________ occurs when the compiler encounters code that violates Java's language rules, It's similar to a grammar error in a natural language.",
      "_______________,________________,_______________ are know as white space. White space makes programs easier to read and is ignored by the compiler.",
      "_______________or______________ are reserved for use by Java and are always spelled with all lowercase letters.",
      "________________ introduces a class declaration.",
      "By convention, all_______________ in Java begin with a capital letter and capitalize the firs letter of each word they include(e.g., SampleClassName).",
      "A Java class name is an ____________ a series of characters consisting of letters, digits, underscores(_) and dollar signs($) that does not begin with a digit and does not containt spaces.",
      "Java is ______________ that is, uppercase and lowercase letters are distinct.",
      "The body of every class declaration is delimited by __________,__ and __.",
      "A __________________ declaration must be saved in a file with the same name as the class followed by the \".java\" file-name extension.",
      "Method _______ is the starting point of every Java application and must begin with _____________________________ otherwise, the JVM will not execute the application.",
      "___________ perform tasks and return information when they complete them. ______________ indicates that a method will perform a task but return no infomation.",
      "______________ instruct the computer to perform actions.",
      "A _____________ in doble quotes is sometimes called a ________________ or _________________.",
      "The _______________________ display characters in the command window.",
      "Method ___________________ display its argument in the command window followed by a newline character to position the output cursor to the beginning of the next line.",
      "You compile a program with the command ______. If the program contains no syntax errors, a __________ containing the Java bytecodes that represent the application is created. These bytecodes are interpreted by the JVM when you execute the program.",
      "To run an application, Type ____ followed by the name of the class that contains the main method.",
      "________________________ displays its argument and positions the output cursor immediately after the last character displayed.",
      "A backslash (\\) in a string is an _______________. Java combines it with the next character to form an _______________, The _________________ \\n represents the newline character.",
      "___________________________ method (\"f means formatted\") displays formatted data.",
      "Method _____________'s first argument is a ______________ containing fixed text and/or ________________. Each format specifier indicates the type of data to output and is a placeholder for a corresponding argument that appears after the format string.",
      "___________________ begin with a percent sign(%) and are followed by a character that represents the data type. The format specifier %s is a placeholder for a string.",
      "The ___________________ is a portable line separator. You cannot use %n in the argument to System.out.print or System.out.println; however, the line separator output bye System.out.println after it displays it argument is portable across operating systems."
   };


   private String[] answers = {"Java application, java", "comments", "end-of-line comments", "traditional comments", "javadoc comment, javadoc", "syntax error, compiler errors, compile-time errors, compilation errors",
      "blank lines, space characters, tab characters", "keywords, reserved words", "keyword class", "class names", "identifier", "case sensitive", "braces, {, }", "public class", "main, public static void main(String[] args)",
      "methods, keyword void", "statements","string, character string, string literal", "standar output object", "System.out.println", "javac, class file", "java", "System.out.print", "escape character, escape sequence, escape sequence", "System.out.printf",
      "printf, format string, format specifiers", "format specifiers", "%n format specifier"
   };


   public QuizQuestionAnswers()
   {
      SecureRandom random = new SecureRandom();
      int counter = 0;
      while(counter < questions.length)
      {
         int index = random.nextInt(questions.length);
         int index1 = random.nextInt(questions.length);
         String temp = questions[index];
         questions[index] = questions[index1];
         questions[index1] = temp;

         String temp1 = answers[index];
         answers[index] = answers[index1];
         answers[index1] = temp1;

         counter++;
      }

   }

   public String getQuestion(int index)
   {
      return questions[index];
   }

   public String getAnswer(int index)
   {
      return answers[index];
   }

   public int getLength()
   {
      return questions.length;
   }
}
