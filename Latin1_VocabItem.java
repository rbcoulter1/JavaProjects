/* File:        Latin1_VocabItem.java
*  Programmer:  Brian Coulter
*  Date:        06/22/2021
*  Purpose:     This class defines a vocabulary item object to store verb forms 
*/ 

public class Latin1_VocabItem {
	protected String latPresActIndInf = "";  
	protected String latFpSingular = "";   
	protected String latSpSingular = "";   
	protected String latTpSingular = "";   
	protected String latFpPlural = "";     
	protected String latSpPlural = "";     
	protected String latTpPlural = "";
	
	protected String engPresActIndInf = "";  
	protected String engFpSingular = "";   
	protected String engSpSingular = "";   
	protected String engTpSingular = "";   
	protected String engFpPlural = "";     
	protected String engSpPlural = "";     
	protected String engTpPlural = "";  
	protected String vocabSource = "";
	
//Constructor
	
public Latin1_VocabItem (String lPAII,String lFPS,String lSPS,String lTPS,String lFPP,String lSPP,String lTPP,//
		String ePAII,String eFPS,String eSPS,String eTPS,String eFPP,String eSPP,String eTPP,String vcS)
	{
		latPresActIndInf = lPAII; 
		latFpSingular = lFPS;      
		latSpSingular = lSPS;      
		latTpSingular = lTPS;      
		latFpPlural = lFPP;        
		latSpPlural = lSPP;        
		latTpPlural = lTPP;        
		                         
		engPresActIndInf = ePAII;  
		engFpSingular = eFPS;      
		engSpSingular = eSPS;      
		engTpSingular = eTPS;      
		engFpPlural = eFPP;        
		engSpPlural = eSPP;        
		engTpPlural = eTPP;     
		vocabSource = vcS;
	}


public String get_lPAII() {
	String lPAII_out = latPresActIndInf;
	return lPAII_out;
}
public String get_lFS() {
	String lFS_out = latFpSingular;
	return lFS_out;
}
public String get_lSS() {
	String lSS_out = latSpSingular;
	return lSS_out;
}
public String get_lTS() {
	String lTS_out = latTpSingular;
	return lTS_out;
}
public String get_lFP() {
	String lFP_out = latFpPlural;
	return lFP_out;
}
public String get_lSP() {
	String lSP_out = latSpPlural;
	return lSP_out;
}
public String get_lTP() {
	String lTP_out = latTpPlural;
	return lTP_out;
}
public String get_ePAII() {
	String ePAII_out = engPresActIndInf;
	return ePAII_out;
}
public String get_eFS() {
	String eFS_out = engFpSingular;
	return eFS_out;
}
public String get_eSS() {
	String eSS_out = engSpSingular;
	return eSS_out;
}
public String get_eTS() {
	String eTS_out = engTpSingular;
	return eTS_out;
}
public String get_eFP() {
	String eFP_out = engFpPlural;
	return eFP_out;
}
public String get_eSP() {
	String eSP_out = engSpPlural;
	return eSP_out;
}
public String get_eTP() {
	String eTP_out = engTpPlural;
	return eTP_out;
}
public String get_vcS() {
	String vsC_out = vocabSource;
	return vsC_out;
}

public void write_lPAII(String lPAII_in) {
	latPresActIndInf = lPAII_in;
}
public void write_lFS(String lFS_in) {
	latFpSingular = lFS_in;
}
public void write_lSS(String lSS_in) {
	latSpSingular = lSS_in;
}
public void write_lTS(String lTS_in) {
	latTpSingular = lTS_in;
}
public void write_lFP(String lFP_in) {
	latFpPlural = lFP_in;
}
public void write_lSP(String lSP_in) {
	latSpPlural = lSP_in;
}
public void write_lTP(String lTP_in) {
	latTpPlural = lTP_in;
}
public void write_ePAII(String ePAII_in) {
	engPresActIndInf = ePAII_in;
}
public void write_eFS(String eFS_in) {
	engFpSingular = eFS_in;
}
public void write_eSS(String eSS_in) {
	engSpSingular = eSS_in;
}
public void write_eTS(String eTS_in) {
	engTpSingular = eTS_in;
}
public void write_eFP(String eFP_in) {
	engFpPlural = eFP_in;
}
public void write_eSP(String eSP_in) {
	engSpPlural = eSP_in;
}
public void write_eTP(String eTP_in) {
	engTpPlural = eTP_in;
}
public void write_vcS(String vcS_in) {
	vocabSource = vcS_in;
}


public String toString() {
	
	String outStr = (latPresActIndInf + "\t" + latFpSingular + "\t" + latSpSingular + "\t" + latTpSingular + "\t" + //
			         latFpPlural + "\t" + latSpPlural + "\t" + latTpPlural + "\t" + engPresActIndInf + "\t" +       //
			         engFpSingular + "\t" + engSpSingular + "\t" + engTpSingular + "\t" + engFpPlural + "\t" +      //
			         engSpPlural + "\t" + engTpPlural + "\t" + vocabSource);
	return outStr;
}
}
