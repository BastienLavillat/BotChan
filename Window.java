import javax.swing.JFrame;

public class Window extends JFrame
{
    private static final String title = "BotChan";

    public Window()
    {
        super(title);
        setSize(500, 500);

        // stop the program when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // center the window inside the screen
        setLocationRelativeTo(null);

        // display the window
        setVisible(true);
    }
}
