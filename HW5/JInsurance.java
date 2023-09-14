package HW5;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JInsurance extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    ButtonGroup insGrp = new ButtonGroup();
    ButtonGroup extraGrp = new ButtonGroup();
    JCheckBox hmo = new JCheckBox("HMO", false);
    JCheckBox ppo = new JCheckBox("PPO", false);
    JCheckBox dental = new JCheckBox("Dental", false);
    JCheckBox vision = new JCheckBox("Vision", false);
    JCheckBox neither = new JCheckBox("Neither Dental Nor Vision", false);
    JTextField insChoice = new JTextField(20);
    static int HMOPRICE = 200;
    static int PPOPRICE = 600;
    static int DENTALPRICE = 75;
    static int VISIONPRICE = 20;
    int totalPrice = 0;

    String output, insChosen;
    public JInsurance() {
        super("Ex8 - Check Boxes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        insGrp.add(hmo);
        hmo.addItemListener(this);
        insGrp.add(ppo);
        ppo.addItemListener(this);
        extraGrp.add(dental);
        dental.addItemListener(this);
        extraGrp.add(vision);
        vision.addItemListener(this);
        extraGrp.add(neither);
        neither.addItemListener(this);
        add(hmo);
        add(ppo);
        add(dental);
        add(vision);
        add(neither);
        insChoice.setText("0");
        add(insChoice);

    }
    public static void main(String[] arguments) {
        JInsurance iFrame = new JInsurance();
        iFrame.setSize(400, 150);
        iFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check) {
    	Object source = check.getItem();
    	if(source == hmo) 
    	{
    		int select = check.getStateChange();
    		if(select == ItemEvent.SELECTED) 
    			totalPrice+=HMOPRICE;
    		else if(select == ItemEvent.DESELECTED)
    				totalPrice -=HMOPRICE;
    				output = " " + totalPrice;
    				insChoice.setText(output);
    		       }
    	else if(source == ppo)
    	{
    		int select = check.getStateChange();
    		if(select == ItemEvent.SELECTED) 
    			totalPrice+=PPOPRICE;
    		else if(select == ItemEvent.DESELECTED)
    				totalPrice -=PPOPRICE;
    				output = " " + totalPrice;
    				insChoice.setText(output);
    	}
    	else if(source == dental)
    	{
    		int select = check.getStateChange();
    		if(select == ItemEvent.SELECTED) 
    			totalPrice+=DENTALPRICE;
    		else if(select == ItemEvent.DESELECTED)
    				totalPrice -=DENTALPRICE;
    				output = " " + totalPrice;
    				insChoice.setText(output);
    	}
    	else if(source == vision)
    	{
    		int select = check.getStateChange();
    		if(select == ItemEvent.SELECTED) 
    			totalPrice+=VISIONPRICE;
    		else if(select == ItemEvent.DESELECTED)
    				totalPrice -=VISIONPRICE;
    				output = " " + totalPrice;
    				insChoice.setText(output);
    	}
    	
    		}
		}

