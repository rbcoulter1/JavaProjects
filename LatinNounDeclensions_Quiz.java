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

public class LatinNounDeclensions_Quiz extends JFrame {
	//Declare the objects and variables we will need
	private static HashMap<String, Latin1_VocabItem_Noun> vocabularyDB = new HashMap<String, Latin1_VocabItem_Noun>();
    private int clicked = 0;
	     
public LatinNounDeclensions_Quiz() {
//Build the Quiz GUI
		JFrame nounCon1 = new JFrame("First Declension Latin Nouns");
		nounCon1.setSize(600,800);
		nounCon1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nounCon1.setVisible(true);
	//	nounCon1.setLayout(new FlowLayout());
	//	nounCon1.setLayout(new GridLayout(4,1,5,10));
		
	JPanel inputPanel = new JPanel();
	inputPanel.setLayout(new GridLayout(16,3,5,10));
	inputPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

		//define the panel layout for the gui	
	    
	//    JPanel buttonPanel = new JPanel();
	//    buttonPanel.setLayout(new GridLayout(1,3,5,10));
	//    buttonPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	//    buttonPanel.setBounds(0,700,600,100);
	    
	//    JPanel singularPanel = new JPanel();
	//    singularPanel.setLayout(new GridLayout(7,3,5,10));
	 //   singularPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    
	//    JPanel pluralPanel = new JPanel();
	//    pluralPanel.setLayout(new GridLayout(6,3,5,10));
	//    pluralPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    
	//    JPanel infoPanel = new JPanel();
	//    infoPanel.setLayout(new GridLayout(1,3,5,10));
	//    infoPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
  //	    buttonPanel.setBounds(0,0,600,100);
	    	    
	    JTextField displayVocabSource = new JTextField();
	    JTextField displayPartOfSpeach = new JTextField();
	    JTextField displayDeclension = new JTextField();
	    		
	    
	    JTextField nomSing_Latin = new JTextField();
	    JTextField genSing_Latin = new JTextField();
	    JTextField datSing_Latin = new JTextField();
	    JTextField accSing_Latin = new JTextField();
	    JTextField ablSing_Latin = new JTextField();
	    JTextField vocSing_Latin = new JTextField();
	    JTextField nomPlur_Latin = new JTextField();
	    JTextField genPlur_Latin = new JTextField();
	    JTextField datPlur_Latin = new JTextField();
	    JTextField accPlur_Latin = new JTextField();
	    JTextField ablPlur_Latin = new JTextField();
	    JTextField vocPlur_Latin = new JTextField();
	    
	    JTextField nomSing_English = new JTextField();
	//    nomSing_English.setEditable(false);
	    JTextField genSing_English = new JTextField();
	//    genSing_English.setEditable(false);
	    JTextField datSing_English = new JTextField();
	    JTextField accSing_English = new JTextField();
	    JTextField ablSing_English = new JTextField();
	    JTextField vocSing_English = new JTextField();
	    JTextField nomPlur_English = new JTextField();
	    JTextField genPlur_English = new JTextField();
	    JTextField datPlur_English = new JTextField();
	    JTextField accPlur_English = new JTextField();
	    JTextField ablPlur_English = new JTextField();
	    JTextField vocPlur_English = new JTextField();
	    
//build the labels for the input text boxes
	    JLabel nmS = new JLabel("Nomitive Singular:");
	    JLabel gnS = new JLabel("Genative Singular:"); 
	    JLabel dtS = new JLabel("Dative Singular:");
	    JLabel acS = new JLabel("Accusitive Singular:");
	    JLabel abS = new JLabel("Ablative Singular:"); 
	    JLabel vcS = new JLabel("Vocative Singular:");
	    JLabel nmP = new JLabel("Nomitive Plural:");
	    JLabel gnP = new JLabel("Genative Plural:"); 
	    JLabel dtP = new JLabel("Dative Plural:");
	    JLabel acP = new JLabel("Accusitive Plural:");
	    JLabel abP = new JLabel("Ablative Plural:"); 
	    JLabel vcP = new JLabel("Vocative Plural:");
	    JLabel engColumn = new JLabel("English");
	    JLabel latColumn = new JLabel("Latin");
	  JLabel dummyOne = new JLabel();
	  JLabel dummyTwo = new JLabel();
	  JLabel dummyThree = new JLabel();
	    
	    String[] vocabNouns = vocabularyDB.keySet().toArray(new String[0]);
	    
class startNextListener implements ActionListener{
	   public void actionPerformed(ActionEvent event) {
		   
	//	   JFrame msgFrame2 = new JFrame();
	//	   JOptionPane.showMessageDialog(msgFrame2, "Looks like you clicked the Start/Next button.");
	
		   if(clicked ==(vocabNouns.length)) {
			  clicked = 0;
		      } 
	            ////// System.out.println(vocabItems[clicked]);
	   			String latinNomForm = vocabNouns[clicked];
	        	if (vocabularyDB.containsKey(latinNomForm)){
	        		Latin1_VocabItem_Noun flashCard = vocabularyDB.get(latinNomForm);
	        		displayVocabSource.setText(flashCard.get_vcS());
	        		displayPartOfSpeach.setText(flashCard.get_pOs());
	        		displayDeclension.setText(flashCard.get_dcln());
	        		nomSing_English.setText(flashCard.get_eNmS());
	        		genSing_English.setText(flashCard.get_eGnS()); 		
	        		datSing_English.setText(flashCard.get_eDtS());
	        		accSing_English.setText(flashCard.get_eAcS()); 
	        		ablSing_English.setText(flashCard.get_eAbS());
	        		vocSing_English.setText(flashCard.get_eVcS());
	        		nomPlur_English.setText(flashCard.get_eNmP());
	        		genPlur_English.setText(flashCard.get_eGnP()); 		
	        		datPlur_English.setText(flashCard.get_eDtP());
	        		accPlur_English.setText(flashCard.get_eAcP()); 
	        		ablPlur_English.setText(flashCard.get_eAbP());
	        		vocPlur_English.setText(flashCard.get_eVcP());
	        		
	        		nomSing_Latin.setText("");
	       			nomSing_Latin.setBackground(Color.WHITE);
 	       			genSing_Latin.setText("");
	       			genSing_Latin.setBackground(Color.WHITE);
	       			datSing_Latin.setText("");
	       			datSing_Latin.setBackground(Color.WHITE);
	       			accSing_Latin.setText("");
	       			accSing_Latin.setBackground(Color.WHITE);
	       			ablSing_Latin.setText("");
	       			ablSing_Latin.setBackground(Color.WHITE);
	       			vocSing_Latin.setText("");
	       			vocSing_Latin.setBackground(Color.WHITE);
	       			nomPlur_Latin.setText("");
	       			nomPlur_Latin.setBackground(Color.WHITE);
	       			genPlur_Latin.setText("");
	       			genPlur_Latin.setBackground(Color.WHITE);
	       			datPlur_Latin.setText("");
	       			datPlur_Latin.setBackground(Color.WHITE);
	       			accPlur_Latin.setText("");
	       			accPlur_Latin.setBackground(Color.WHITE);
	       			ablPlur_Latin.setText("");
	       			ablPlur_Latin.setBackground(Color.WHITE);
	       			vocPlur_Latin.setText("");
	       			vocPlur_Latin.setBackground(Color.WHITE);
	       			clicked++;
	       			}
}
}

class checkAnswerListener implements ActionListener{
	public void actionPerformed(ActionEvent event)
	{
		int currentVocabIndex = clicked - 1;
		Latin1_VocabItem_Noun flashCard = vocabularyDB.get(vocabNouns[currentVocabIndex]);
		
		if(nomSing_Latin.getText().equals(flashCard.get_lNmS()))
		  {nomSing_Latin.setBackground(Color.GREEN);}
		  else {nomSing_Latin.setText(flashCard.get_lNmS());
		        nomSing_Latin.setBackground(Color.RED);}
		if(genSing_Latin.getText().equals(flashCard.get_lGnS()))
		  {genSing_Latin.setBackground(Color.GREEN);}
		  else {genSing_Latin.setText(flashCard.get_lGnS());
		        genSing_Latin.setBackground(Color.RED);}
		if(datSing_Latin.getText().equals(flashCard.get_lDtS()))
		  {datSing_Latin.setBackground(Color.GREEN);}
		  else {datSing_Latin.setText(flashCard.get_lDtS());
		        datSing_Latin.setBackground(Color.RED);}
		if(accSing_Latin.getText().equals(flashCard.get_lAcS()))
		  {accSing_Latin.setBackground(Color.GREEN);}
		  else {accSing_Latin.setText(flashCard.get_lAcS());
		        accSing_Latin.setBackground(Color.RED);}
		if(ablSing_Latin.getText().equals(flashCard.get_lAbS()))
		  {ablSing_Latin.setBackground(Color.GREEN);}
		  else {ablSing_Latin.setText(flashCard.get_lAbS());
		        ablSing_Latin.setBackground(Color.RED);}
		if(vocSing_Latin.getText().equals(flashCard.get_lVcS()))
		  {vocSing_Latin.setBackground(Color.GREEN);}
		  else {vocSing_Latin.setText(flashCard.get_lVcS());
		        vocSing_Latin.setBackground(Color.RED);}
		
		if(nomPlur_Latin.getText().equals(flashCard.get_lNmP()))
		  {nomPlur_Latin.setBackground(Color.GREEN);}
		  else {nomPlur_Latin.setText(flashCard.get_lNmP());
		        nomPlur_Latin.setBackground(Color.RED);}
		if(genPlur_Latin.getText().equals(flashCard.get_lGnP()))
		  {genPlur_Latin.setBackground(Color.GREEN);}
		  else {genPlur_Latin.setText(flashCard.get_lGnP());
		        genPlur_Latin.setBackground(Color.RED);}
		if(datPlur_Latin.getText().equals(flashCard.get_lDtP()))
		  {datPlur_Latin.setBackground(Color.GREEN);}
		  else {datPlur_Latin.setText(flashCard.get_lDtP());
		        datPlur_Latin.setBackground(Color.RED);}
		if(accPlur_Latin.getText().equals(flashCard.get_lAcP()))
		  {accPlur_Latin.setBackground(Color.GREEN);}
		  else {accPlur_Latin.setText(flashCard.get_lAcP());
		        accPlur_Latin.setBackground(Color.RED);}
		if(ablPlur_Latin.getText().equals(flashCard.get_lAbP()))
		  {ablPlur_Latin.setBackground(Color.GREEN);}
		  else {ablPlur_Latin.setText(flashCard.get_lAbP());
		        ablPlur_Latin.setBackground(Color.RED);}
		if(vocPlur_Latin.getText().equals(flashCard.get_lVcP()))
		  {vocPlur_Latin.setBackground(Color.GREEN);}
		  else {vocPlur_Latin.setText(flashCard.get_lVcP());
		        vocPlur_Latin.setBackground(Color.RED);} 
	//	  JFrame msgFrame = new JFrame();
	//	  JOptionPane.showMessageDialog(msgFrame, "Looks like you clicked the Check button.");
		
}
}

class updateListener implements ActionListener{
  public void actionPerformed(ActionEvent event) {
   		
   //		if(editMode.isSelected()) {}
   		String vocabSource = displayVocabSource.getText(); 
   		String partOfSpeach = displayPartOfSpeach.getText();
   		String declension = displayDeclension.getText();
   		
   		//nomSing_English.setEditable(true);
   		
   		String lNmS_in = nomSing_Latin.getText();	
   		String lGnS_in = genSing_Latin.getText();
   		String lDtS_in = datSing_Latin.getText();		
   		String lAcS_in = accSing_Latin.getText();
   		String lAbS_in = ablSing_Latin.getText();
   		String lVcS_in = vocSing_Latin.getText();   
   		String lNmP_in = nomPlur_Latin.getText();	
   		String lGnP_in = genPlur_Latin.getText();
   		String lDtP_in = datPlur_Latin.getText();		
   		String lAcP_in = accPlur_Latin.getText();
   		String lAbP_in = ablPlur_Latin.getText();
   		String lVcP_in = vocPlur_Latin.getText();   
   		
   		String eNmS_in = nomSing_English.getText();
   		String eGnS_in = genSing_English.getText(); 		
   		String eDtS_in = datSing_English.getText();
   		String eAcS_in = accSing_English.getText(); 
   		String eAbS_in = ablSing_English.getText();
   		String eVcS_in = vocSing_English.getText();
   		String eNmP_in = nomPlur_English.getText();
   		String eGnP_in = genPlur_English.getText(); 		
   		String eDtP_in = datPlur_English.getText();
   		String eAcP_in = accPlur_English.getText(); 
   		String eAbP_in = ablPlur_English.getText();
   		String eVcP_in = vocPlur_English.getText();
		
   			
 //check for missing information in the input fields
  		if(
  			vocabSource.contentEquals("")|
  			partOfSpeach.contentEquals("")|
  			declension.contentEquals("")|
			lNmS_in.equals("")|
			lGnS_in.equals("")|
			lDtS_in.equals("")|
			lAcS_in.equals("")|
			lAbS_in.equals("")|
			lVcS_in.equals("")|
			lNmP_in.equals("")|
			lGnP_in.equals("")| 
			lDtP_in.equals("")|
			lAcP_in.equals("")|
			lAbP_in.equals("")|
			lVcP_in.equals("")|
			eNmS_in.equals("")|
			eGnS_in.equals("")|
			eDtS_in.equals("")|
			eAcS_in.equals("")|
			eAbS_in.equals("")|
			eVcS_in.equals("")|
			eNmP_in.equals("")|
			eGnP_in.equals("")| 
			eDtP_in.equals("")|
			eAcP_in.equals("")|
			eAbP_in.equals("")|
			eVcP_in.equals("")
   			) 
   			{
   			JFrame msgFrame1 = new JFrame();
   			JOptionPane.showMessageDialog(msgFrame1, "Please make sure all fields are filled before updating.");
   			}
   			else if(vocabularyDB.containsKey(lNmS_in) == true)
   			{
   		    Latin1_VocabItem_Noun flashCard = vocabularyDB.get(lNmS_in);
   			flashCard.write_vcS(vocabSource);
   			flashCard.write_pOs(partOfSpeach);
   			flashCard.write_lNmS(lNmS_in);
   			flashCard.write_lGnS(lGnS_in);
   			flashCard.write_lDtS(lDtS_in);
  			flashCard.write_lAcS(lAcS_in);
   			flashCard.write_lAbS(lAbS_in);
   			flashCard.write_lVcS(lVcS_in);
   			flashCard.write_lNmP(lNmP_in);
   			flashCard.write_lGnP(lGnP_in);
   			flashCard.write_lDtP(lDtP_in);
  			flashCard.write_lAcP(lAcP_in);
   			flashCard.write_lAbP(lAbP_in);
   			flashCard.write_lVcP(lVcP_in);
   			
   			flashCard.write_eNmS(eNmS_in);
   			flashCard.write_eGnS(eGnS_in);
   			flashCard.write_eDtS(eDtS_in);
  			flashCard.write_eAcS(eAcS_in);
   			flashCard.write_eAbS(eAbS_in);
   			flashCard.write_eVcS(eVcS_in);
   			flashCard.write_eNmP(eNmP_in);
   			flashCard.write_eGnP(eGnP_in);
   			flashCard.write_eDtP(eDtP_in);
  			flashCard.write_eAcP(eAcP_in);
   			flashCard.write_eAbP(eAbP_in);
   			flashCard.write_eVcP(eVcP_in);

   			    JFrame msgFrame3 = new JFrame();
   	   			JOptionPane.showMessageDialog(msgFrame3, "Vocabulary Item Updated Successfully.");
   	   			
   	   			File dataFile_out = new File("C:\\Users\\Brian\\eclipse-workspace\\LatinVerbs_Quiz1\\src\\NounVocab_CardFile.txt");	
   	 	        try {
   	 	             PrintWriter updateVocabFile = new PrintWriter(dataFile_out);
   	 	             System.out.println("Here we are in the code block that writes out updated flashcards to file.");
   	 	                for (String key: vocabularyDB.keySet()) {
   	 	                Latin1_VocabItem_Noun printCard = vocabularyDB.get(key);
   	 			   	    updateVocabFile.println(printCard.toString());
   	 	                }
   	 	             updateVocabFile.close();
   	 	                } catch (IOException e) {
   	 	                 System.out.println("An error occurred.");
   	 	                 e.printStackTrace();
   	 	                 }
     	    }
   			else if(vocabularyDB.containsKey(lNmS_in) == false)
   			{
   				Latin1_VocabItem_Noun newFlashCard = new Latin1_VocabItem_Noun 

(lNmS_in,lGnS_in,lDtS_in,lAcS_in,lAbS_in,lVcS_in,lNmP_in,lGnP_in,lDtP_in,lAcP_in,lAbP_in,lVcP_in,//
 eNmS_in,eGnS_in,eDtS_in,eAcS_in,eAbS_in,eVcS_in,eNmP_in,eGnP_in,eDtP_in,eAcP_in,eAbP_in,eVcP_in,vocabSource, partOfSpeach, declension);
   				vocabularyDB.put(lNmS_in, newFlashCard );
   				  				
   				JFrame msgFrame2 = new JFrame();
   	   			JOptionPane.showMessageDialog(msgFrame2, "New Vocabulary Item Added Successfully.");
   	   		    
   	   			File dataFile_out = new File("C:\\Users\\Brian\\eclipse-workspace\\LatinVerbs_Quiz1\\src\\NounVocab_CardFile.txt");	
   	 	        try {
   	 	             PrintWriter updateVocabFile = new PrintWriter(dataFile_out);
   	 	                for (String key: vocabularyDB.keySet()) {
   	 	                Latin1_VocabItem_Noun printCard = vocabularyDB.get(key);
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
        
        JToggleButton editMode = new JToggleButton("Edit Mode ON/Off");
	    
	    JButton stopStartQuiz = new JButton("Start Quiz/Next Item");
	    stopStartQuiz.addActionListener(new startNextListener()); 
	
	    JButton checkAnswerRequest = new JButton("Check Answers");
	    checkAnswerRequest.addActionListener(new checkAnswerListener()); 
   
	    JButton updateVocabList = new JButton("Update/Add Vocab Item");
	    updateVocabList.addActionListener(new updateListener()); 
		
   
	  //add objects to JPanel
	    inputPanel.add(displayPartOfSpeach);
	    inputPanel.add(dummyOne);
	    inputPanel.add(displayDeclension);
	    
	    inputPanel.add(displayVocabSource);
	    inputPanel.add(engColumn);
	    inputPanel.add(latColumn);
	    inputPanel.add(nmS);
	    inputPanel.add(nomSing_English);
	    inputPanel.add(nomSing_Latin);
	    inputPanel.add(gnS);
	    inputPanel.add(genSing_English);
	    inputPanel.add(genSing_Latin);
	    inputPanel.add(dtS);
	    inputPanel.add(datSing_English);
	    inputPanel.add(datSing_Latin);
	    inputPanel.add(acS);
	    inputPanel.add(accSing_English);
	    inputPanel.add(accSing_Latin);
	    inputPanel.add(abS);
	    inputPanel.add(ablSing_English);
	    inputPanel.add(ablSing_Latin);
	    inputPanel.add(vcS);
	    inputPanel.add(vocSing_English);
	    inputPanel.add(vocSing_Latin);
	    inputPanel.add(nmP);
	    inputPanel.add(nomPlur_English);
	    inputPanel.add(nomPlur_Latin);
	    inputPanel.add(gnP);
	    inputPanel.add(genPlur_English);
	    inputPanel.add(genPlur_Latin);
	    inputPanel.add(dtP);
	    inputPanel.add(datPlur_English);
	    inputPanel.add(datPlur_Latin);
	    inputPanel.add(acP);
	    inputPanel.add(accPlur_English);
	    inputPanel.add(accPlur_Latin);
	    inputPanel.add(abP);
	    inputPanel.add(ablPlur_English);
	    inputPanel.add(ablPlur_Latin);
	    inputPanel.add(vcP);
	    inputPanel.add(vocPlur_English);
	    inputPanel.add(vocPlur_Latin);

	    inputPanel.add(stopStartQuiz);
	    inputPanel.add(checkAnswerRequest);
	    inputPanel.add(updateVocabList);
	    inputPanel.add(dummyTwo);
	    inputPanel.add(editMode);
	    inputPanel.add(dummyThree);
	    
	    
	  //add the JPanel to the JFrame
	    nounCon1.add(inputPanel);
	//    nounCon1.add(infoPanel);
	//    nounCon1.add(singularPanel);
	//    nounCon1.add(pluralPanel);
	//    nounCon1.add(buttonPanel);
	 //  infoPanel.setVisible(true);
	  //  singularPanel.setVisible(true);
	 //   pluralPanel.setVisible(true);;
	 //   buttonPanel.setVisible(true);
	    nounCon1.setVisible(true);
}

	public static void main(String[] args) {
		
		boolean isComplete = false;
		File dataFile = new File("C:\\Users\\Brian\\eclipse-workspace\\LatinVerbs_Quiz1\\src\\NounVocab_CardFile.txt");
			
		try {
			FileReader readDataFile = new FileReader ( dataFile );
			Scanner lineIn = new Scanner( readDataFile);
			String myLine;

			while(isComplete == false) {
				if (lineIn.hasNext()) {
					String thisLine = lineIn.nextLine();
					String[] values = thisLine.split("\t");
					Latin1_VocabItem_Noun newFlashCard = new Latin1_VocabItem_Noun(
			         values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8],values[9],//
					 values[10],values[11],values[12],values[13],values[14],values[15], //
					 values[16],values[17],values[18],values[19],values[20],values[21],values[22],values[23],values[24], //
					 values[25], values[26]);
	  		
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
		
		LatinNounDeclensions_Quiz nounDecQuiz = new LatinNounDeclensions_Quiz();
	}

}
