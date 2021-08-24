package e_post;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author htara
 */
public class PaymentEPost extends JPanel
{
    
    Color background_Color = new Color(34,34,45);
    Color on_background_Color = new Color(254,254,254);
    Color primary_Color = new Color(71,63,145);
    
    JPanel p_payment_Panel;
    private JScrollPane sbrText;

    JLabel e_payment_title;
    JButton e_payment_btn_confirm;
    JButton e_payment_btn_back;
    
    JPopupMenu e_payment_authentication;
    
    //Left Label
    JLabel e_payment_beneficiary;
    JLabel e_payment_amount;
    JLabel e_payment_to;
    JLabel e_payment_contact;
    JLabel e_payment_type;
    JLabel e_payment_firstName;
    JLabel e_payment_lastName;
    JLabel e_payment_address;
    JLabel e_payment_state;
    JLabel e_payment_district;
    JLabel e_payment_pincode;
    JLabel e_payment_message;
    
    //Content Label
    JLabel e_payment_beneficiary_info;
    JLabel e_payment_amount_info;
    JLabel e_payment_to_info;
    JLabel e_payment_contact_info;
    JLabel e_payment_type_info;
    JLabel e_payment_firstName_info;
    JLabel e_payment_lastName_info;
    JTextArea e_payment_address_info;
    JLabel e_payment_state_info;
    JLabel e_payment_district_info;
    JLabel e_payment_pincode_info;
    JTextArea e_payment_message_info;

    
    int X_FORCUSTOMER=0,Y_FORCUSTOMER=100,WIDTHFORCUSTOMER=1260,HIGHTFORCUSTOMER=750;
    
    public PaymentEPost()
    { 
            
        p_payment_Panel = new JPanel();
        
        
        e_payment_btn_confirm = new JButton();
        e_payment_btn_back = new JButton();
        
        //Label
        e_payment_title = new JLabel("Payment");
        e_payment_beneficiary = new JLabel("Beneficiary");
        e_payment_amount = new JLabel("Amount");
        e_payment_to = new JLabel("To");
        e_payment_contact = new JLabel("Contact No.");
        e_payment_type = new JLabel("Type");
        e_payment_firstName = new JLabel("First Name");
        e_payment_lastName = new JLabel("Last Name");
        e_payment_address = new JLabel("Address");
        e_payment_state = new JLabel("State");
        e_payment_district = new JLabel("District");
        e_payment_pincode = new JLabel("Pincode");
        e_payment_message = new JLabel("Subject");
        
        
        //Content Label
        e_payment_beneficiary_info = new JLabel();
        e_payment_amount_info = new JLabel();
        e_payment_to_info = new JLabel();
        e_payment_contact_info = new JLabel();
        e_payment_type_info = new JLabel();
        e_payment_firstName_info = new JLabel();
        e_payment_lastName_info = new JLabel();
        e_payment_address_info = new JTextArea();
        e_payment_state_info = new JLabel();
        e_payment_district_info = new JLabel();
        e_payment_pincode_info = new JLabel();
        e_payment_message_info = new JTextArea();
        
        
        e_payment_address_info.setBackground(background_Color);
        e_payment_address_info.setEditable(false);
        e_payment_address_info.setHighlighter(null);
        e_payment_address_info.setLineWrap(true);
        
        e_payment_message_info.setBackground(background_Color);
        e_payment_message_info.setEditable(false);
        e_payment_message_info.setHighlighter(null);
        e_payment_message_info.setLineWrap(true);
        
        //Content Label Text
        e_payment_beneficiary_info.setText("Admin");
        e_payment_amount_info.setText("12345");
        e_payment_to_info.setText("User_369");
        e_payment_contact_info.setText("1234567890");
        e_payment_type_info.setText("Hard Copy");
        e_payment_firstName_info.setText("Hello");
        e_payment_lastName_info.setText("World");
        e_payment_address_info.setText("Sai Leo Nagar,West Tambaram Poonthandalam, Village, Chennai Tamil Nadu 602109.");
        e_payment_state_info.setText("Tamil Name");
        e_payment_district_info.setText("Salem");
        e_payment_pincode_info.setText("123456");
        e_payment_message_info.setText("Hello!!!  Sai Leo Nagar,West Tambaram Poonthandalam, Village");
        
        //Button and title
        e_payment_title.setBounds(585, 25, 200, 50);
        e_payment_btn_confirm.setBounds(585,755 + 10,150,40);
        e_payment_btn_confirm.setBackground(primary_Color);
        e_payment_btn_confirm.setText("Confirm");
        e_payment_btn_confirm.setForeground(on_background_Color);
        e_payment_btn_confirm.setBorder(null);
        
        e_payment_btn_back.setBounds(25,25,40,40);
        e_payment_btn_back.setBackground(null);
        e_payment_btn_back.setBorder(null);
        try 
        {
          Image img = ImageIO.read(getClass().getResource("/Images/arroe_back_button.png"));
          e_payment_btn_back.setIcon(new ImageIcon(img));
        } 
        catch (Exception ex) 
        {
          System.out.println(ex);
        }
        
        //Label Bounds
        e_payment_beneficiary.setBounds(120, 80, 150, 50);
        e_payment_amount.setBounds(120, 50 + 80, 150, 50);
        e_payment_to.setBounds(120,100 + 80,150,50);
        e_payment_contact.setBounds(120,150 + 80,150,50);
        e_payment_type.setBounds(120,200 + 80,150,50);
        e_payment_firstName.setBounds(120,250 + 80,150,50);
        e_payment_lastName.setBounds(120,300 + 80,150,50);
        e_payment_address.setBounds(120,350 + 80,150,50);
        e_payment_state.setBounds(120,450 + 80,150,50);
        e_payment_district.setBounds(120,500 + 80,150,50);
        e_payment_pincode.setBounds(120,550 + 80,150,50);
        e_payment_message.setBounds(120,600 + 80,150,50);
        
        //Content Label Bounds
        e_payment_beneficiary_info.setBounds(400, 0 + 80, 150, 50);
        e_payment_amount_info.setBounds(400, 50 + 80, 150, 50);
        e_payment_to_info.setBounds(400,100 + 80,150, 50);
        e_payment_contact_info.setBounds(400,150 + 80,150, 50);
        e_payment_type_info.setBounds(400,200 + 80,150, 50);
        e_payment_firstName_info.setBounds(400,250 + 80,150, 50);
        e_payment_lastName_info.setBounds(400,300 + 80,150, 50);
        e_payment_address_info.setBounds(400,360 + 80,800,90);
        e_payment_state_info.setBounds(400,450 + 80,150, 50);
        e_payment_district_info.setBounds(400,500 + 80,150, 50);
        e_payment_pincode_info.setBounds(400,550 + 80,150, 50);
        e_payment_message_info.setBounds(400,610 + 80,800, 90);
        
        
        //Label Text Color
        e_payment_title.setForeground(on_background_Color);
        e_payment_beneficiary.setForeground(on_background_Color);
        e_payment_amount.setForeground(on_background_Color);
        e_payment_to.setForeground(on_background_Color);
        e_payment_contact.setForeground(on_background_Color);
        e_payment_type.setForeground(on_background_Color);
        e_payment_firstName.setForeground(on_background_Color);
        e_payment_lastName.setForeground(on_background_Color);
        e_payment_address.setForeground(on_background_Color);
        e_payment_state.setForeground(on_background_Color);
        e_payment_district.setForeground(on_background_Color);
        e_payment_pincode.setForeground(on_background_Color);
        e_payment_message.setForeground(on_background_Color);
        
        //Content Label Text Color
        e_payment_beneficiary_info.setForeground(on_background_Color);
        e_payment_amount_info.setForeground(on_background_Color);
        e_payment_to_info.setForeground(on_background_Color);
        e_payment_contact_info.setForeground(on_background_Color);
        e_payment_type_info.setForeground(on_background_Color);
        e_payment_firstName_info.setForeground(on_background_Color);
        e_payment_lastName_info.setForeground(on_background_Color);
        e_payment_address_info.setForeground(on_background_Color);
        e_payment_state_info.setForeground(on_background_Color);
        e_payment_district_info.setForeground(on_background_Color);
        e_payment_pincode_info.setForeground(on_background_Color);
        e_payment_message_info.setForeground(on_background_Color);
        
        //Label Font
        e_payment_title.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        e_payment_beneficiary.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_amount.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_to.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_contact.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_type.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_firstName.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_lastName.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_address.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_state.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_district.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_pincode.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_message.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        
        //Content Label Font
        e_payment_beneficiary_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_amount_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_to_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_contact_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_type_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_firstName_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_lastName_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_address_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_state_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_district_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_pincode_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        e_payment_message_info.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        
//        p_payment_Panel.setBounds(X_FORCUSTOMER,Y_FORCUSTOMER,WIDTHFORCUSTOMER,HIGHTFORCUSTOMER);  
//        p_payment_Panel.setPreferredSize(new Dimension(1350, 890));
        
        //Add to Panel
        add(e_payment_title);
        add(e_payment_beneficiary); 
        add(e_payment_amount); 
        add(e_payment_to); 
        add(e_payment_contact); 
        add(e_payment_type); 
        add(e_payment_firstName); 
        add(e_payment_lastName); 
        add(e_payment_address); 
        add(e_payment_state);
        add(e_payment_district);
        add(e_payment_pincode);
        add(e_payment_message);        
        
        add(e_payment_beneficiary_info); 
        add(e_payment_amount_info); 
        add(e_payment_to_info); 
        add(e_payment_contact_info); 
        add(e_payment_type_info); 
        add(e_payment_firstName_info); 
        add(e_payment_lastName_info); 
        add(e_payment_address_info);
        add(e_payment_state_info); 
        add(e_payment_district_info); 
        add(e_payment_pincode_info);
        add(e_payment_btn_confirm);
        add(e_payment_message_info); 
        
        //Panel
        setLayout(null);
        setBackground(background_Color);
        setSize(1350, 890);
        
        //Popup
        e_payment_authentication = new JPopupMenu("Authentication");
        
        e_payment_authentication.setBackground(background_Color);
        e_payment_authentication.setBounds(X_FORCUSTOMER, Y_FORCUSTOMER, 1000, 1000);
        e_payment_authentication.setLayout(null);
        
        e_payment_btn_back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(null, "This goes Back to E-Post panel");
            }
            
        });
        
        e_payment_btn_confirm.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                //e_payment_authentication.show(p_payment_Panel, 500, 500);
                new Authentication();
            }
            
        });  
        
        
        //Frame
         
    }
    
//    public static void main(String arg[])
//    {
//        JFrame frame= new JFrame();
//        PaymentEPost paymentEPost = new PaymentEPost();
//        
//        JScrollPane scroll=new JScrollPane(paymentEPost,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//        scroll.setBounds(0,0,1320,850);
//        frame.add(scroll);
//        //frame.add(e_payment_title);
//       
//        frame.setSize(1350,890);
//        //frame.getContentPane().setBackground(background_Color);
//        frame.setLayout(null);
//        frame.setVisible(true);   
//    }
    
}