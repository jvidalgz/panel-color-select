import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Created by jaime on 11-04-2015.
 */
public class MainFrame extends JFrame {

    public MainFrame() {

        setSize(600, 450);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setResizable(false);

        createHeader();
        createCenter();
        createFooter();


    }

    private void createHeader() {

        JLabel headerLabel = new JLabel("Seleccione un color");
        headerLabel.setFont(new Font("monospace", Font.PLAIN, 32));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);


        Container container = this.getContentPane();
        container.add(headerLabel, BorderLayout.NORTH);


    }
    private void createCenter() {

        final JLabel statusLabel = new JLabel("...");
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);

        JPanel colorsPanel = new JPanel();
        JPanel color[] = new JPanel[9];
        Container container = this.getContentPane();

        statusLabel.setFont(new Font("monospace", Font.PLAIN, 20));
        statusLabel.setSize(120,20);
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setBounds(0, 240, 600, 30);


        colorsPanel.setLayout(new GridLayout(3, 3));
        colorsPanel.setBounds(200, 15, 220, 220);

        for (int i = 0; i < 9; i++) {
            color[i] = new JPanel();
        }

        color[0].setBackground(Color.RED);
        color[1].setBackground(Color.BLUE);
        color[2].setBackground(Color.GREEN);
        color[3].setBackground(Color.BLACK);
        color[4].setBackground(Color.YELLOW);
        color[5].setBackground(Color.CYAN);
        color[6].setBackground(Color.PINK);
        color[7].setBackground(Color.LIGHT_GRAY);
        color[8].setBackground(Color.ORANGE);

        color[0].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Rojo " + getQuote());

            }
        });

        color[1].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Azul " + getQuote() );
            }
        });

        color[2].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e) {
                statusLabel.setText("Verde " + getQuote());
            }
        });

        color[3].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Negro " + getQuote());

            }
        });

        color[4].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Amarillo " + getQuote());
            }
        });

        color[5].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Cyan " + getQuote());
            }
        });

        color[6].addMouseListener(new MouseAdapter(){
            @Override
        public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Rosado " + getQuote());
            }
        });

        color[7].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                statusLabel.setText("Gris " + getQuote());
            }
        });

        color[8].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked( MouseEvent e) {
                statusLabel.setText("Naranjo " + getQuote());
            }
        });

        for (int i = 0; i < 9; i++) {
            colorsPanel.add(color[i]);
        }

        centerPanel.add(colorsPanel);
        centerPanel.add(statusLabel);
        container.add(centerPanel, BorderLayout.CENTER);






    }
    private void createFooter() {

        JButton button = new JButton("Salir");
        button.setSize(120,40);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });

        Container container = this.getContentPane();

        container.add(button, BorderLayout.SOUTH);

    }

    private String getQuote(){
        Random rand = new Random();

         String[] quotes = {"Interesante elección", "Qué bien", "Estás seguro?", "pff", "plz"};
        int randomNum = rand.nextInt(5);

        return quotes[randomNum];
    }




}
