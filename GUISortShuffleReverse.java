package seven;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;

public class GUISortShuffleReverse {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        JFrame frame = new JFrame("Numbers GUI");
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(757, 293);
        frame.getContentPane().setLayout(null);
        
        JTextField enteredNumber = new JTextField();
        enteredNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
        enteredNumber.setBounds(12, 20, 159, 34);
        frame.getContentPane().add(enteredNumber);
        enteredNumber.setColumns(10);

        JTextArea displayNumbers = new JTextArea();
        displayNumbers.setForeground(Color.PINK);
        displayNumbers.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 33));
        displayNumbers.setBounds(183, 13, 544, 223);
        frame.getContentPane().add(displayNumbers);

        JButton add = new JButton("Add Number");
        add.setBackground(Color.PINK);
        add.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
        add.setBounds(12, 61, 159, 36);
        
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int index = Collections.binarySearch(list, Integer.parseInt(enteredNumber.getText()));
            	if(index >= 0) {
            		enteredNumber.setText("");
            	} else {
            		list.add(Integer.parseInt(enteredNumber.getText()));
                    String output = "";
                    
                    for (Integer i : list) {
                        output += i + " ";
                    }
                    
                    displayNumbers.setText(output);
                    enteredNumber.setText("");
            	}        	
            }
        });
        
        frame.getContentPane().add(add);
        JButton sort = new JButton("Sort Numbers");
        sort.setBackground(Color.PINK);
        sort.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
        sort.setBounds(12, 110, 159, 40);
        
        sort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.sort(list);
                String output = "";
                for (Integer l : list)
                    output += l + " ";

                displayNumbers.setText(output);
            }
        });
        
        frame.getContentPane().add(sort);

        JButton shuffle = new JButton("Shuffle Numbers");
        shuffle.setBackground(Color.PINK);
        shuffle.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
        shuffle.setBounds(12, 153, 159, 40);
        frame.getContentPane().add(shuffle);
        
        shuffle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.shuffle(list);
                String output = "";
                for (Integer k : list)
                    output += k + " ";

                displayNumbers.setText(output);
            }
        });
 

        JButton btnReverseNumbers = new JButton("Reverse Numbers");
        btnReverseNumbers.setBackground(Color.PINK);
        btnReverseNumbers.setFont(new Font("Malgun Gothic", Font.BOLD, 13));
        btnReverseNumbers.setBounds(12, 196, 159, 40);
        frame.getContentPane().add(btnReverseNumbers);
        frame.setVisible(true);
        
        btnReverseNumbers.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Collections.sort(list, Collections.reverseOrder());
                String output = "";
                for (Integer j : list)
                    output += j + " ";

                displayNumbers.setText(output);
            }
        });
 

    }

 


//    private void displayText() {
//        String output = "";
//        for (Integer e : list)
//            output += e + " ";
//
// 
//
//        displayNumbers.setText(output);
//        enteredNumber.setText("");
//    }
}
