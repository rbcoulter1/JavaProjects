/*File: LatinVerbs_1
 * Programmer: Brian Coulter
 * Date: 6/15/2021
 * Purpose: A program to test knowledge of Latin present indicative active verb conjugations
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.RandomAccessFile;


@SuppressWarnings("unused")
public class LatinVerbs_1 extends JFrame {
//Declare the objects and variables we will need
	private static HashMap<String, Latin1_VocabItem> vocabularyDB = new HashMap<String, Latin1_VocabItem>();
	
	private static JTextField displayVocabSource;
	private static JTextField displayLatInfinitive;
	private static JTextField displayEngInfinitive;
	
    private static JTextField fpSingular_English;
    private static JTextField spSingular_English;
    private static JTextField tpSingular_English;
    private static JTextField fpPlural_English;
    private static JTextField spPlural_English;
    private static JTextField tpPlural_English;
    
    private static JTextField fpSingular_Latin;
    private static JTextField spSingular_Latin;
    private static JTextField tpSingular_Latin;
    private static JTextField fpPlural_Latin;
    private static JTextField spPlural_Latin;
    private static JTextField tpPlural_Latin;
    
    private int clicked = 0;
     
 
public LatinVerbs_1() {
//Build the Quiz GUI
	JFrame verbCon1 = new JFrame("Latin Verbs - First Conjugation Quiz");
	verbCon1.setSize(500,600);
	verbCon1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	verbCon1.setVisible(true);
	
//define the panel layout for the gui	
    JPanel inputPanel = new JPanel();
    inputPanel.setLayout(new GridLayout(9,3,5,10));
    inputPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    
//build the text fields
     
    displayVocabSource = new JTextField();
    displayLatInfinitive = new JTextField();
    displayEngInfinitive = new JTextField();
    fpSingular_English = new JTextField();
    spSingular_English = new JTextField();
    tpSingular_English = new JTextField();
    fpPlural_English = new JTextField();
    spPlural_English = new JTextField();
    tpPlural_English = new JTextField();
    fpSingular_Latin = new JTextField();
    spSingular_Latin = new JTextField();
    tpSingular_Latin = new JTextField();
    fpPlural_Latin =  new JTextField();
    spPlural_Latin = new JTextField();
    tpPlural_Latin = new JTextField();
    
//build the labels for the input text boxes
    JLabel fPS = new JLabel("First Person Singular:");
    JLabel sPS = new JLabel("Second Person Singular:"); 
    JLabel tPS = new JLabel("Third Person Singular:");
    JLabel fPP = new JLabel("First Person Plural:");
    JLabel sPP = new JLabel("Second Person Plural:"); 
    JLabel tPP = new JLabel("Third Person Plural:");
    JLabel engColumn = new JLabel("English");
    JLabel latColumn = new JLabel("Latin");
    JLabel inf = new JLabel("Infinitive:");
    JLabel dummyOne = new JLabel();
 // JLabel dummyTwo = new JLabel();
  
	String[] vocabItems = vocabularyDB.keySet().toArray(new String[0]);
	
//build the listener process
 class updateListener implements ActionListener{
   	public void actionPerformed(ActionEvent event) {
   		
   		String vocabSource = displayVocabSource.getText();    
    	String inf_LatinInput = displayLatInfinitive.getText();
	    String inf_EnglishInput = displayEngInfinitive.getText();
   		String fps_EnglishInput = fpSingular_English.getText();
   		String sps_EnglishInput = spSingular_English.getText(); 		
   		String tps_EnglishInput = tpSingular_English.getText();
   		String fpp_EnglishInput = fpPlural_English.getText(); 
   		String spp_EnglishInput = spPlural_English.getText();
   		String tpp_EnglishInput = tpPlural_English.getText();
   		String fps_LatinInput = fpSingular_Latin.getText();	
   		String sps_LatinInput = spSingular_Latin.getText();
   		String tps_LatinInput = tpSingular_Latin.getText();		
   		String fpp_LatinInput = fpPlural_Latin.getText();
   		String spp_LatinInput = spPlural_Latin.getText();
   		String tpp_LatinInput = tpPlural_Latin.getText();   		
   			
 //check for missing information in the input fields
  		if(
  			vocabSource.contentEquals("")|
			inf_LatinInput.equals("")|
			inf_EnglishInput.equals("")|
			fps_EnglishInput.equals("")|
			sps_EnglishInput.equals("")|
			tps_EnglishInput.equals("")|
			fpp_EnglishInput.equals("")|
			spp_EnglishInput.equals("")|
			tpp_EnglishInput.equals("")|
			fps_LatinInput.equals("")|
			sps_LatinInput.equals("")| 
			tps_LatinInput.equals("")|
			fpp_LatinInput.equals("")|
			spp_LatinInput.equals("")|
			tpp_LatinInput.equals("")
   			) 
   			{
   			JFrame msgFrame1 = new JFrame();
   			JOptionPane.showMessageDialog(msgFrame1, "Please make sure all fields are filled before updating.");
   			}
   			else if(vocabularyDB.containsKey(inf_LatinInput) == true)
   			{
   			Latin1_VocabItem flashCard = vocabularyDB.get(inf_LatinInput);
   			flashCard.write_vcS(vocabSource);
   			flashCard.write_lPAII(inf_LatinInput);
   			flashCard.write_lFS(fps_LatinInput);
   			flashCard.write_lSS(sps_LatinInput);
  			flashCard.write_lTS(tps_LatinInput);
   			flashCard.write_lFP(fpp_LatinInput);
   			flashCard.write_lSP(spp_LatinInput);
   			flashCard.write_lTP(tpp_LatinInput); 
   			flashCard.write_ePAII(inf_EnglishInput);
   			flashCard.write_eFS(fps_EnglishInput); 
   			flashCard.write_eSS(sps_EnglishInput); 
   			flashCard.write_eTS(tps_EnglishInput);
   			flashCard.write_eFP(fpp_EnglishInput);
   			flashCard.write_eSP(spp_EnglishInput);
   			flashCard.write_eTP(tpp_EnglishInput);
				
   			    JFrame msgFrame3 = new JFrame();
   	   			JOptionPane.showMessageDialog(msgFrame3, "Vocabulary Item Updated Successfully.");
   	   			
   	   			File dataFile_out = new File("C:\\Users\\Brian\\eclipse-workspace\\LatinVerbs_Quiz1\\src\\Vocab1_CardFile.txt");	
   	 	        try {
   	 	             PrintWriter updateVocabFile = new PrintWriter(dataFile_out);
   	 	             System.out.println("Here we are in the code block that writes out updated flashcards to file.");
   	 	                for (String key: vocabularyDB.keySet()) {
   	 			   		Latin1_VocabItem printCard = vocabularyDB.get(key);
   	 			   	    updateVocabFile.println(printCard.toString());
   	 	                }
   	 	             updateVocabFile.close();
   	 	                } catch (IOException e) {
   	 	                 System.out.println("An error occurred.");
   	 	                 e.printStackTrace();
   	 	                 }
     	    }
   			else if(vocabularyDB.containsKey(inf_LatinInput) == false)
   			{
   				Latin1_VocabItem newFlashCard = new Latin1_VocabItem (inf_LatinInput,fps_LatinInput,sps_LatinInput,tps_LatinInput,//
   						fpp_LatinInput,spp_LatinInput,tpp_LatinInput,inf_EnglishInput,fps_EnglishInput,//
   						sps_EnglishInput,tps_EnglishInput,fpp_EnglishInput,spp_EnglishInput,tpp_EnglishInput,vocabSource);
   				vocabularyDB.put(inf_LatinInput, newFlashCard );
   				  				
   				JFrame msgFrame2 = new JFrame();
   	   			JOptionPane.showMessageDialog(msgFrame2, "New Vocabulary Item Added Successfully.");
   	   		    
   	   			File dataFile_out = new File("C:\\Users\\Brian\\eclipse-workspace\\LatinVerbs_Quiz1\\src\\Vocab1_CardFile.txt");	
   	 	        try {
   	 	             PrintWriter updateVocabFile = new PrintWriter(dataFile_out);
   	 	                for (String key: vocabularyDB.keySet()) {
   	 			   		Latin1_VocabItem printCard = vocabularyDB.get(key);
   	 			   	    updateVocabFile.println(printCard.toString());
   	 	                }
   	 	             updateVocabFile.close();
   	 	            } catch (IOException e) {
   	 	               System.out.println("An error occurred.");
   	 	               e.printStackTrace();
   	 	               }
   			}
    }
}
class checkAnswerListener implements ActionListener{
   public void actionPerformed(ActionEvent event) 
   {
   		   	       int currentVocabIndex = clicked - 1;
	    	       Latin1_VocabItem flashCard = vocabularyDB.get(vocabItems[currentVocabIndex]);
	    	       
	        		if(displayLatInfinitive.getText().equals(flashCard.get_lPAII()))
	        		  {displayLatInfinitive.setBackground(Color.GREEN);}
	        		  else {displayLatInfinitive.setText(flashCard.get_lPAII());
	        		        displayLatInfinitive.setBackground(Color.RED);}
	        		if(fpSingular_Latin.getText().equals(flashCard.get_lFS()))
	                  {fpSingular_Latin.setBackground(Color.GREEN);}
	        		  else {fpSingular_Latin.setText(flashCard.get_lFS());
	        		       fpSingular_Latin.setBackground(Color.RED);}
	        		if(spSingular_Latin.getText().equals(flashCard.get_lSS()))
	        		  {spSingular_Latin.setBackground(Color.GREEN);}
	        		  else {spSingular_Latin.setText(flashCard.get_lSS());
	        		        spSingular_Latin.setBackground(Color.RED);}
	        		if(tpSingular_Latin.getText().equals(flashCard.get_lTS()))
	        		  {tpSingular_Latin.setBackground(Color.GREEN);}
	        		  else {tpSingular_Latin.setText(flashCard.get_lTS());
	        		        tpSingular_Latin.setBackground(Color.RED);}
	        		if(fpPlural_Latin.getText().equals(flashCard.get_lFP()))
	        		  {fpPlural_Latin.setBackground(Color.GREEN);}
	        		  else {fpPlural_Latin.setText(flashCard.get_lFP());
	        		        fpPlural_Latin.setBackground(Color.RED);}
	        		if(spPlural_Latin.getText().equals(flashCard.get_lSP()))
	        		  {spPlural_Latin.setBackground(Color.GREEN);}
	        		  else {spPlural_Latin.setText(flashCard.get_lSP());
	        		        spPlural_Latin.setBackground(Color.RED);}
	        		if(tpPlural_Latin.getText().equals(flashCard.get_lTP()))
	        		  {tpPlural_Latin.setBackground(Color.GREEN);}
	        		  else {tpPlural_Latin.setText(flashCard.get_lTP());
	        		        tpPlural_Latin.setBackground(Color.RED);}
                    //////Text fields for English words maybe needed for Latin-to-English quiz
	    	        //		displayEngInfinitive.setText(flashCard.get_ePAII());
	    	       	//		fpSingular_English.setText(flashCard.get_eFS());
	    	       	//		spSingular_English.setText(flashCard.get_eSS()); 		
	    	       	//		tpSingular_English.setText(flashCard.get_eTS());
	    	       	//		fpPlural_English.setText(flashCard.get_eFP()); 
	    	       	//		spPlural_English.setText(flashCard.get_eSP());
	    	       	//		tpPlural_English.setText(flashCard.get_eTP());
	    	       	//		displayLatInfinitive.setText(flashCard.get_lPAII());
	    	        /////////////				System.out.println(flashCard.toString());	
	    	    	/////////////               JOptionPane.showMessageDialog(msgFrame, flashCard);
	          		////////////             	JOptionPane.showMessageDialog(msgFrame, "Looks like you clicked the Check button.");
   		}
}
    
class startNextListener implements ActionListener{
   public void actionPerformed(ActionEvent event) {
  	  // System.out.println("vocabItems.length: " + vocabItems.length);
	   if(clicked ==(vocabItems.length)) {
		  clicked = 0;
	      } 
            ////// System.out.println(vocabItems[clicked]);
   			String inf_LatinInput = vocabItems[clicked];
        	if (vocabularyDB.containsKey(inf_LatinInput)){
        		Latin1_VocabItem flashCard = vocabularyDB.get(inf_LatinInput);
        		displayVocabSource.setText(flashCard.get_vcS());
        		displayEngInfinitive.setText(flashCard.get_ePAII());
       			fpSingular_English.setText(flashCard.get_eFS());
       			spSingular_English.setText(flashCard.get_eSS()); 		
       			tpSingular_English.setText(flashCard.get_eTS());
       			fpPlural_English.setText(flashCard.get_eFP()); 
       			spPlural_English.setText(flashCard.get_eSP());
       			tpPlural_English.setText(flashCard.get_eTP());
       			displayLatInfinitive.setText("");
       			displayLatInfinitive.setBackground(Color.WHITE);
       			fpSingular_Latin.setText("");
       			fpSingular_Latin.setBackground(Color.WHITE);
       			spSingular_Latin.setText("");
       			spSingular_Latin.setBackground(Color.WHITE);
       			tpSingular_Latin.setText("");
       			tpSingular_Latin.setBackground(Color.WHITE);
       			fpPlural_Latin.setText("");
       			fpPlural_Latin.setBackground(Color.WHITE);
       			spPlural_Latin.setText("");
       			spPlural_Latin.setBackground(Color.WHITE);
       			tpPlural_Latin.setText("");
       			tpPlural_Latin.setBackground(Color.WHITE);
       			clicked++;
        	}
   		}
    }
    
//build the check answers button
    JButton checkAnswerRequest = new JButton("Check Answers");
    checkAnswerRequest.addActionListener(new checkAnswerListener()); 
    JButton stopStartQuiz = new JButton("Start Quiz/Next Item");
    stopStartQuiz.addActionListener(new startNextListener()); 
    JButton updateVocabList = new JButton("Edit/Add Vocab Item");
    updateVocabList.addActionListener(new updateListener()); 

//add objects to JPanel
    inputPanel.add(displayVocabSource);
    inputPanel.add(engColumn);
    inputPanel.add(latColumn);
    inputPanel.add(inf);
    inputPanel.add(displayEngInfinitive);
    inputPanel.add(displayLatInfinitive);
    inputPanel.add(fPS);
    inputPanel.add(fpSingular_English);
    inputPanel.add(fpSingular_Latin);
    inputPanel.add(sPS);
    inputPanel.add(spSingular_English);
    inputPanel.add(spSingular_Latin);
    inputPanel.add(tPS);
    inputPanel.add(tpSingular_English);
    inputPanel.add(tpSingular_Latin);
    inputPanel.add(fPP);
    inputPanel.add(fpPlural_English);
    inputPanel.add(fpPlural_Latin);
    inputPanel.add(sPP);
    inputPanel.add(spPlural_English);
    inputPanel.add(spPlural_Latin);
    inputPanel.add(tPP);
    inputPanel.add(tpPlural_English);
    inputPanel.add(tpPlural_Latin);
    inputPanel.add(stopStartQuiz);
    inputPanel.add(checkAnswerRequest);
    inputPanel.add(updateVocabList);
    
//add the JPanel to the JFrame
    verbCon1.add(inputPanel);
    inputPanel.setVisible(true);
    verbCon1.setVisible(true);
}
	
public static void main(String[] args) {
		
//Build the database of vocabulary items from the file storing the vocabulary information
	boolean isComplete = false;
	File dataFile = new File("C:\\Users\\Brian\\eclipse-workspace\\LatinVerbs_Quiz1\\src\\Vocab1_CardFile.txt");
		
	try {
		FileReader readDataFile = new FileReader ( dataFile );
		Scanner lineIn = new Scanner( readDataFile);
		String myLine;

		while(isComplete == false) {
			if (lineIn.hasNext()) {
				String thisLine = lineIn.nextLine();
				String[] values = thisLine.split("\t");
				Latin1_VocabItem newFlashCard = new Latin1_VocabItem (
						values[0],values[1],values[2],values[3],values[4],//
						values[5],values[6],values[7],values[8],values[9],//
						values[10],values[11],values[12],values[13],values[14]);
  		
				vocabularyDB.put(values[0], newFlashCard);
				//System.out.println(values[0]);
			} 
			else
			{ 
				isComplete = true;
			}
		    }
		lineIn.close();
	}
	catch (FileNotFoundException e) {
				System.out.println("File Not Found");
	}
	
	LatinVerbs_1 verbConQuiz = new LatinVerbs_1();
}
}
