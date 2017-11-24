// JavaQuiz.java
// @uthor : Manuel Medina.
// Date : nov 17th 2017.
// app that tests all the knowledge that you learned awhile you read java's books
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class JavaQuiz extends JFrame
{
   private final JTextField textField;
   private final JLabel label1;
   private final JButton button;
   private final JButton answerButton;
   private final JButton resetButton;
   private QuestionandAnswers QA;
   private int counter = 0;
   private int goods = 0;
   private int bads = 0;


   public JavaQuiz()
   {
      super("Java Quiz");
      setLayout(new FlowLayout());

      QA = new QuestionandAnswers();
      Icon cup = new ImageIcon(getClass().getResource("java.png"));
      label1 = new JLabel(QA.getQuestion(0), cup, SwingConstants.RIGHT);
      label1.setToolTipText("This question is easy.");
      add(label1);

      textField = new JTextField(20);
      add(textField);

      button = new JButton("Answer");
      add(button);

      ButtonHandler handler = new ButtonHandler();
      button.addActionListener(handler);

      answerButton = new JButton("See the answer");
      add(answerButton);

      ButtonHandler1 handler1 = new ButtonHandler1();
      answerButton.addActionListener(handler1);

      resetButton = new JButton("Reset");
      add(resetButton);

      ButtonHandler2 handler2 = new ButtonHandler2();
      resetButton.addActionListener(handler2);

   }

   private class ButtonHandler implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent event)
      {
         if(counter < QA.getLength()) {
            if (textField.getText().equals(QA.getAnswer(counter))) {
               JOptionPane.showMessageDialog(JavaQuiz.this, "It's correct!");
               counter++;
               textField.setText("");
               goods++;
               if(counter < QA.getLength())
                  label1.setText(QA.getQuestion(counter));
            } else {
               JOptionPane.showMessageDialog(JavaQuiz.this, "you fail.");
               textField.setText("");
               bads++;
               counter++;
               if(counter < QA.getLength()) {
                  label1.setText(QA.getQuestion(counter));
               }
               if(counter >= QA.getLength()) {
                  double percent = (double) 100/QA.getLength();
                  double answered = (double) goods * percent;
                  String string = String.format("The test has finished.\nThe program will be reseted automatically%nYour score is : %.2f %nYou answered %d of %d Questions.", answered, goods, QA.getLength()  );
                  JOptionPane.showMessageDialog(JavaQuiz.this, string);
                  counter = 0;
                  textField.setText("");
                  label1.setText(QA.getQuestion(counter));
                  bads = 0;
                  goods = 0;
               }
            }
         }
         if(counter >= QA.getLength())
         {
            double percent = (double) 100/QA.getLength();
            double answered = (double) goods * percent;
            String string = String.format("The test has finished.\nThe program will be reseted automatically%nYour score is : %.2f %nYou answered %d of %d Questions.", answered, goods, QA.getLength()  );
            JOptionPane.showMessageDialog(JavaQuiz.this, string);
            counter = 0;
            textField.setText("");
            label1.setText(QA.getQuestion(counter));
            bads = 0;
            goods = 0;
         }
      }
   }

   private class ButtonHandler1 implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent event)
      {
         if(counter < QA.getLength()) {
            String answer = QA.getAnswer(counter);
            JOptionPane.showMessageDialog(JavaQuiz.this, answer);
            counter++;
            textField.setText("");
            label1.setText(QA.getQuestion(counter));
            bads--;
         }
      }
   }

   private class ButtonHandler2 implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent event)
      {
         goods = 0;
         bads = 0;
         counter = 0;
         textField.setText("");
         label1.setText(QA.getQuestion(counter));

      }
   }



}
