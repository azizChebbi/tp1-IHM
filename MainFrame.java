import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.util.StringTokenizer;


public class MainFrame extends JFrame implements
ActionListener {

	JTextField sentence = new JTextField(22);
	JButton Count_Words = new JButton("Count");
	JButton Clear   = new JButton("Clear");
    JLabel report = new JLabel();

    public MainFrame() {

        super("Word Counter");
        setSize(280,165);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();

        JLabel word_Title = new JLabel("   The Word Counter Application   ");
        JLabel word_label = new JLabel(" Enter a Sentence ");

        pane.add(word_Title);
        pane.add(word_label);
        pane.add(sentence);
        pane.add(Count_Words);
        pane.add(Clear);
        pane.add(report);

        Count_Words.addActionListener(this);
        Clear.addActionListener(this);

        add(pane);
        setVisible(true);
    }

public void actionPerformed(ActionEvent e)
	{

			if(Count_Words==e.getSource())
			{

            String sentence2 = sentence.getText();
           	int counter = 0;

            StringTokenizer t = new StringTokenizer(sentence2);

					while(t.hasMoreTokens())
					{
						counter++;
						String word = t.nextToken();

		}

            report.setText("Number of words in a sentence "
                  + counter +".");
             };

			 if(Clear==e.getSource())
			{
				sentence.setText("");
                report.setText("");

		}
	}


public static void main(String[] args)
{
    MainFrame words2 = new MainFrame();
}
}