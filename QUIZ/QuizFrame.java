import javax.swing.JFrame;
public class QuizFrame
{
   public static void main(String[] args)
   {
      Quiz quiz = new Quiz();
      quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      quiz.setSize(900, 300);
      quiz.setVisible(true);
   }
}
