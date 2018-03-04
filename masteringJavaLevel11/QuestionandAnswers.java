import java.security.SecureRandom;

public class QuestionandAnswers {

   private String[] questions = {"Is a computer program that executes when you use the java command to launch the java Vitual Machine(JVM).",
      "It terminates at the end of the line on which begins with //, indicating that it's an : ", "Java also has another type of comment which can be spread over several lines, These begins and end with delimiters, /* and */.",
      "It implements an interface and provides a default imprementation (with an empty method body) of each method in the interface.",
      "Java provides comments of a third type, These are delimited by /** and */.",
      "Occurs when the compiler encounters code that violates Java's language rules(i.e., its syntax). the rules are similiar to a natural language's grammar rules specifying sentence structure.",
      "They make programs easier to read. Together, they're Known as white space(or whitespace). The compiler ignores white space.",
      "It introduces a class declaration and is immediately followed by the class name.",
      "They are reserved for use by java and are always spelled with all lowercase letters.",
      "It must be placed in a file that has a filename of the form ClassName.java, so class Welcome1 is stored in the file Welcome1.java.",
      "By convention, they begin with a capital letter and capitalize the first letter of each word the include(e.g., HelloWorld).",
      "Are a series of characters consisting of letters, digits, underscores ( _ ) and dollar signs ( $ ) that does not begin with a digit and does not contain spaces.",
      "Java is ________________ uppercase and lowercase letter are distinct -so value and Value are different (but both valid) identifiers.",
      "A __________, begins the body of every class declaration. A corresponding ___________, must end each class declaration.",
      "Is the starting point of every Java application", "The __________ after the identifier main indicate that it's a program building block called a ______.",
      "Keyword______indicates that this method will not return any information.",
      "____________________ instructs the computer to perform an action--namely, to display the characters contained between the doble quatation marks.",
      "The characters contained between the double quotation marks. Together, the quotation marks and the characters between then are a _____ also known as a ______________ or a ______________.",
      "The ___________ object--which is predefined for you--is known as the ____________________. ",
      "To compile the program, type ____ ClassName.java if the program contains no compilation errors, this command creates a new file ClassName.class known as the ____________ containing the platform-independent Java bycodes that represent our application.",
      "______ ClassName. This command launches the JVM, which loads the ClassName.class file."
   };

   private String[] answers = {"a Java application", "end-of-line comments", "traditional comments","an adapter class", "Javadoc comments", "syntax error, compiler errors, compile-time errors, compilation errors",
      "blank lines, space characters, tabs", "class keyword", "keywords, reserved words", "a public class", "class names", "identifiers",
      "case sensitive", "left brace, right brace", "public static void main(String[] args)", "parentheses, method", "void", "System.out.println","string, character string, string literal",
      "System.out, standar output object", "javac, class file", "java"};


   public QuestionandAnswers()
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
