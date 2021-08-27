package Admin;
import Consignment.consignment;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import main.main;
import profile.*;
import warehouse.Warehouse;

public class AdminPanel extends JPanel implements ActionListener, MouseListener{
    
    private JLabel LE_Post,IProfile;
    Icon image=new ImageIcon(getClass().getResource("/Images/ProfileImage.png"));
 //   private  JPanel AdminPanel;
    public static JPanel contentForAdmin;
    public static CardLayout adminCard;
    public static  JButton bNew,bOnGoing,bCompleted,bCustomer,bDelivery,bStocks;
    private  int xForInbox=0,xForConsignment=0,xForE_post=0,xForParcel=0,xForProducts=0,xForWallets=0;
    private  JPanel pNewconsignment,pOnGoingConsignment,pCompletedConsignment,pCustomer,pDelivery,pConsignmentDetails,pStocks;
    int X_FORCUSTOMER=55,Y_FORCUSTOMER=150,WIDTHFORCUSTOMER=1260,HIGHTFORCUSTOMER=570;
    int R=34,G=34,B=45;
    private Color Buttoncolor=new Color(240,238,240);
    private JTextArea search;
    private JLabel LAdmin;
    private Font font=new Font("Bold",Font.BOLD,20);
    private JLabel userLogo;
    public static String card;
    
    public AdminPanel(){
    
       setLayout(null);
       adminCard = new CardLayout();
       contentForAdmin = new JPanel(adminCard);
       
       pNewconsignment = new NewConsignment();
       pOnGoingConsignment = new OnGoingConsignment();
       pCompletedConsignment = new CompletedConsignment();
       pCustomer = new customerDetails();
       pDelivery = new deliveryDetails();
       pStocks = new Stocks();
       pConsignmentDetails = new ConsignmentDetails();
       
       //InboxPanel inboxPanel=(InboxPanel)PInbox;
       contentForAdmin.add(pNewconsignment,"NewConsignment");
       contentForAdmin.add(pOnGoingConsignment,"OnGoingConsignment");
       contentForAdmin.add(pCompletedConsignment,"CompletedConsignment");
       contentForAdmin.add(pCustomer,"CustomerDetails");
       contentForAdmin.add(pDelivery,"DeliveryDetails");
       contentForAdmin.add(pStocks,"Stocks");
       contentForAdmin.add(pConsignmentDetails,"ConsignmentDetails");
       
       //contentForCustomer.add(inboxPanel.scroll,"MessagePanel");
       adminCard.first(contentForAdmin);
       contentForAdmin.setBounds(X_FORCUSTOMER,Y_FORCUSTOMER,WIDTHFORCUSTOMER,HIGHTFORCUSTOMER);
       add(contentForAdmin);
       
       this.setPreferredSize(new Dimension(1350,890));
       this.setVisible(true);
       this.setBackground(new Color(R,G,B));
       
       LE_Post=new JLabel("E-Post");
       LE_Post.setFont(new Font("Segoe UI",Font.BOLD,30));
       LE_Post.setBounds(X_FORCUSTOMER, 30,100,30);
       LE_Post.setForeground(Color.WHITE);
       add(LE_Post);
       
       LAdmin=new JLabel("Admin");
       LAdmin.setFont(new Font("Segoe UI",Font.PLAIN,20));
       LAdmin.setBounds(X_FORCUSTOMER+125,32,160,30);
       LAdmin.setForeground(Color.WHITE);
       add(LAdmin);
       
       search=new JTextArea("Search ID...");
       search.setFont(new Font("Segoe UI",Font.PLAIN,18));
       search.setBounds(1000,32,200,30);
       search.addMouseListener(this);
       search.setBorder(BorderFactory.createEmptyBorder(2,5,0,5));
       add(search);
       
       IProfile=new JLabel(image);
       IProfile.addMouseListener(this);
       IProfile.setBounds(1240,22, 50, 50);
       add(IProfile);
     
      
       userLogo=new JLabel();
       userLogo.setFont(new Font("Bold",Font.BOLD,20));
       userLogo.setBounds(1000+90,30,200,30);
       add( userLogo);
       
       bNew = new JButton("New");
       bNew.setFont(font);
       bNew.setBorder(null);
       bNew.setUI(new StyledButtonUi());
       bNew.setBounds(X_FORCUSTOMER,120,160,30);
       bNew.setBackground(Buttoncolor);
       bNew.addActionListener(this);
       add(bNew); 
       
       bOnGoing = new JButton("On Going");
       bOnGoing.setFont(font);
       bOnGoing.setBackground(Buttoncolor);
       bOnGoing.setBounds(X_FORCUSTOMER+180,110,160,30);
       bOnGoing.setUI(new StyledButtonUi());
       bOnGoing.addActionListener(this);
       add(bOnGoing);
       
       bCompleted = new JButton("Completed");
       bCompleted.setFont(font);
       bCompleted.setBackground(Buttoncolor);
       bCompleted.setBounds(X_FORCUSTOMER+180+180,110,160,30);
       bCompleted.setUI(new StyledButtonUi());
       bCompleted.addActionListener(this);
       add(bCompleted);
       
       
       
       bCustomer = new JButton("Customer");
       bCustomer.setFont(font);
       bCustomer.setBackground(Buttoncolor);
       bCustomer.setBounds(X_FORCUSTOMER+180+180+180,110,160,30);
       bCustomer.setUI(new StyledButtonUi());
       bCustomer.addActionListener(this);
       add(bCustomer);
       
       bDelivery = new JButton("Delivery");
       bDelivery.setFont(font);
       bDelivery.setBackground(Buttoncolor);
       bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,110,160,30);
       bDelivery.setUI(new StyledButtonUi());
       bDelivery.addActionListener(this);
       add(bDelivery);
       
       bStocks = new JButton("Stocks");
       bStocks.setBackground(Buttoncolor);
       bStocks.setFont(font);
       bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,110,160,30);
       bStocks.setUI(new StyledButtonUi());
       bStocks.addActionListener(this);
       add(bStocks);
       
       
   }
          
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o=e.getSource();
        
        if(o == bNew){
            adminCard.show(contentForAdmin,"NewConsignment");
            bNew.setBounds(X_FORCUSTOMER,120,160,30);
            bOnGoing.setBounds(X_FORCUSTOMER+180,110,160,30);
            bCompleted.setBounds(X_FORCUSTOMER+180+180,110,160,30);
            bCustomer.setBounds(X_FORCUSTOMER+180+180+180,110,160,30);
            bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,110,160,30);
            bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,110,160,30);
           
        }
        else if(o == bOnGoing){

            adminCard.show(contentForAdmin,"OnGoingConsignment");
            
            bNew.setBounds(X_FORCUSTOMER,110,160,30);
            bOnGoing.setBounds(X_FORCUSTOMER+180,120,160,30);
            bCompleted.setBounds(X_FORCUSTOMER+180+180,110,160,30);
            bCustomer.setBounds(X_FORCUSTOMER+180+180+180,110,160,30);
            bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,110,160,30);
            bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,110,160,30);
            consignment.setOngoingAdminConsignmentDetails();
        }    
        else if(o == bCompleted) {
            consignment.setCompletedAdminConsignmentDetails();
            adminCard.show(contentForAdmin,"CompletedConsignment");

            bNew.setBounds(X_FORCUSTOMER,110,160,30);
            bOnGoing.setBounds(X_FORCUSTOMER+180,110,160,30);
            bCompleted.setBounds(X_FORCUSTOMER+180+180,120,160,30);
            bCustomer.setBounds(X_FORCUSTOMER+180+180+180,110,160,30);
            bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,110,160,30);
            bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,110,160,30);
        }
        else if(o == bCustomer)  {
            profile.CustomerProfile.setCustomerDetails();
            adminCard.show(contentForAdmin,"CustomerDetails");
                
            bNew.setBounds(X_FORCUSTOMER,110,160,30);
            bOnGoing.setBounds(X_FORCUSTOMER+180,110,160,30);
            bCompleted.setBounds(X_FORCUSTOMER+180+180,110,160,30);
            bCustomer.setBounds(X_FORCUSTOMER+180+180+180,120,160,30);
            bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,110,160,30);
            bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,110,160,30);
                }
        else if(o == bDelivery){
                profile.DeliveryProfile.setDeliveryDetails();
                adminCard.show(contentForAdmin,"DeliveryDetails");
            
                bNew.setBounds(X_FORCUSTOMER,110,160,30);
                bOnGoing.setBounds(X_FORCUSTOMER+180,110,160,30);
                bCompleted.setBounds(X_FORCUSTOMER+180+180,110,160,30);
                bCustomer.setBounds(X_FORCUSTOMER+180+180+180,110,160,30);
                bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,120,160,30);
                bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,110,160,30);
        }
        else if(o == bStocks){
            adminCard.show(contentForAdmin,"Stocks");
            Warehouse.setStocks();
            
            bNew.setBounds(X_FORCUSTOMER,110,160,30);
            bOnGoing.setBounds(X_FORCUSTOMER+180,110,160,30);
            bCompleted.setBounds(X_FORCUSTOMER+180+180,110,160,30);
            bCustomer.setBounds(X_FORCUSTOMER+180+180+180,110,160,30);
            bDelivery.setBounds(X_FORCUSTOMER+180+180+180+180,110,160,30);
            bStocks.setBounds(X_FORCUSTOMER+180+180+180+180+180,120,160,30);
        }
    
    }  

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==search){
            search.setText("");
        }
        else if(e.getSource() == IProfile){
            profile.AdminProfile.setAdminProfile(Login.login.user_ID);
            main.switchPage("AdminProfileView");
        }
        }

    @Override
    public void mousePressed(MouseEvent e) {
            }

    @Override
    public void mouseReleased(MouseEvent e) {
            }

    @Override
    public void mouseEntered(MouseEvent e) {
           }

    @Override
    public void mouseExited(MouseEvent e) {
     }  
    
}
