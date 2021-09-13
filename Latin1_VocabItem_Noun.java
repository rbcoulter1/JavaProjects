
public class Latin1_VocabItem_Noun {

	//protected String latPresActIndInf = "";  
	protected String latNomSing = "";   
	protected String latGenSing = "";   
	protected String latDatSing = "";   
	protected String latAccSing = "";     
	protected String latAblSing = "";     
	protected String latVocSing = "";
	protected String latNomPlur = "";   
	protected String latGenPlur = "";   
	protected String latDatPlur = "";   
	protected String latAccPlur = "";     
	protected String latAblPlur = "";     
	protected String latVocPlur = "";
	
	//protected String engPresActIndInf = "";  
	protected String engNomSing = "";   
	protected String engGenSing = "";   
	protected String engDatSing = "";   
	protected String engAccSing = "";     
	protected String engAblSing = "";     
	protected String engVocSing = "";  
	protected String engNomPlur = "";   
	protected String engGenPlur = "";   
	protected String engDatPlur = "";   
	protected String engAccPlur = "";     
	protected String engAblPlur = "";     
	protected String engVocPlur = "";  
	
	protected String vocabSource = "";
	protected String partOfSpeach = "";
	protected String declension = "";
	
//Constructor
	
public Latin1_VocabItem_Noun (String lNmS,String lGnS,String lDtS,String lAcS,String lAbS,String lVcS,//
							  String lNmP,String lGnP,String lDtP,String lAcP,String lAbP,String lVcP,//
							  String eNmS,String eGnS,String eDtS,String eAcS,String eAbS,String eVcS,//
							  String eNmP,String eGnP,String eDtP,String eAcP,String eAbP,String eVcP, //
							  String vSc, String pOs, String dcln)
							  
	{
	latNomSing = lNmS;
	latGenSing = lGnS;
	latDatSing = lDtS;
	latAccSing = lAbS;
	latAblSing = lAcS;
	latVocSing = lVcS;
	latNomPlur = lNmP;
	latGenPlur = lGnP;
	latDatPlur = lDtP;
	latAccPlur = lAcP;
	latAblPlur = lAbP;
	latVocPlur = lVcP;
	
	engNomSing = eNmS;
	engGenSing = eGnS;
	engDatSing = eDtS;
	engAccSing = eAbS;
	engAblSing = eAcS;
	engVocSing = eVcS;
	engNomPlur = eNmP;
	engGenPlur = eGnP;
	engDatPlur = eDtP;
	engAccPlur = eAcP;
	engAblPlur = eAbP;
	engVocPlur = eVcP;

	vocabSource = vSc;
	partOfSpeach = pOs;
	declension = dcln;
	}

//get functions for Latin word forms
public String get_lNmS() {
	String lNmS_out = latNomSing;
	return lNmS_out;
}
public String get_lGnS() {
	String lGnS_out = latGenSing;
	return lGnS_out;
}
public String get_lDtS() {
	String lDtS_out = latDatSing;
	return lDtS_out;
}
public String get_lAcS() {
	String lAcS_out = latAccSing;
	return lAcS_out;
}
public String get_lAbS() {
	String lAbS_out = latAblSing;
	return lAbS_out;
}
public String get_lVcS() {
	String lVcS_out = latVocSing;
	return lVcS_out;
}

public String get_lNmP() {
	String lNmP_out = latNomPlur;
	return lNmP_out;
}
public String get_lGnP() {
	String lGnP_out = latGenPlur;
	return lGnP_out;
}
public String get_lDtP() {
	String lDtP_out = latDatPlur;
	return lDtP_out;
}
public String get_lAcP() {
	String lAcP_out = latAccPlur;
	return lAcP_out;
}
public String get_lAbP() {
	String lAbP_out = latAblPlur;
	return lAbP_out;
}
public String get_lVcP() {
	String lVcP_out = latVocPlur;
	return lVcP_out;
}

//get methods for English translations
public String get_eNmS() {
	String eNms_out = engNomSing;
	return eNms_out;
}
public String get_eGnS() {
	String eGnS_out = engGenSing;
	return eGnS_out;
}
public String get_eDtS() {
	String eDtS_out = engDatSing;
	return eDtS_out;
}
public String get_eAcS() {
	String eAcS_out = engAccSing;
	return eAcS_out;
}
public String get_eAbS() {
	String eAbS_out = engAblSing;
	return eAbS_out;
}
public String get_eVcS() {
	String eVcS_out = engVocSing;
	return eVcS_out;
}

public String get_eNmP() {
	String eNms_out = engNomPlur;
	return eNms_out;
}
public String get_eGnP() {
	String eGnS_out = engGenPlur;
	return eGnS_out;
}
public String get_eDtP() {
	String eDtS_out = engDatPlur;
	return eDtS_out;
}
public String get_eAcP() {
	String eAcS_out = engAccPlur;
	return eAcS_out;
}
public String get_eAbP() {
	String eAbS_out = engAblPlur;
	return eAbS_out;
}
public String get_eVcP() {
	String eVcP_out = engVocPlur;
	return eVcP_out;
}

public String get_vcS() {
	String vsC_out = vocabSource;
	return vsC_out;
}

public String get_pOs() {
	String pOs_out = partOfSpeach ;
	return pOs_out;
}

public String get_dcln() {
	String dcln_out = declension;
	return dcln_out;
}

public void write_lNmS(String lNmS_in) {
	latNomSing = lNmS_in;
}
public void write_lGnS(String lGnS_in) {
	latGenSing = lGnS_in;
}
public void write_lDtS(String lDtS_in) {
	latDatSing = lDtS_in;
}
public void write_lAcS(String lAcS_in) {
	latAccSing = lAcS_in;
}
public void write_lAbS(String lAbS_in) {
	latAblSing = lAbS_in;
}
public void write_lVcS(String lVcS_in) {
	latVocSing = lVcS_in;
}
public void write_lNmP(String lNmP_in) {
	latNomPlur = lNmP_in;
}
public void write_lGnP(String lGnP_in) {
	latGenPlur = lGnP_in;
}
public void write_lDtP(String lDtP_in) {
	latDatPlur = lDtP_in;
}
public void write_lAcP(String lAcP_in) {
	latAccPlur = lAcP_in;
}
public void write_lAbP(String lAbP_in) {
	latAblPlur = lAbP_in;
}
public void write_lVcP(String lVcP_in) {
	latVocPlur = lVcP_in;
}

public void write_eNmS(String eNmS_in) {
	engNomSing = eNmS_in;
}
public void write_eGnS(String eGnS_in) {
	engGenSing = eGnS_in;
}
public void write_eDtS(String eDtS_in) {
	engDatSing = eDtS_in;
}
public void write_eAcS(String eAcS_in) {
	engAccSing = eAcS_in;
}
public void write_eAbS(String eAbS_in) {
	engAblSing = eAbS_in;
}
public void write_eVcS(String eVcS_in) {
	engVocSing = eVcS_in;
}
public void write_eNmP(String eNmP_in) {
	engNomPlur = eNmP_in;
}
public void write_eGnP(String eGnP_in) {
	engGenPlur = eGnP_in;
}
public void write_eDtP(String eDtP_in) {
	engDatPlur = eDtP_in;
}
public void write_eAcP(String eAcP_in) {
	engAccPlur = eAcP_in;
}
public void write_eAbP(String eAbP_in) {
	engAblPlur = eAbP_in;
}
public void write_eVcP(String eVcP_in) {
	engVocPlur = eVcP_in;
}

public void write_vcS(String vcS_in) {
	vocabSource = vcS_in;
}

public void write_pOs(String pOs_in) {
	partOfSpeach = pOs_in;
}

public void write_dcln(String dcln_in) {
	declension = dcln_in;
}

public String toString() {
	
	String outStr = (latNomSing + "\t" + latGenSing + "\t" + latDatSing + "\t" + latAccSing + "\t" + latAblSing + "\t" + latVocSing + "\t" +   //
	                 latNomPlur + "\t" + latGenPlur + "\t" + latDatPlur + "\t" + latAccPlur + "\t" + latAblPlur + "\t" + latVocPlur + "\t" +   //
					 engNomSing + "\t" + engGenSing + "\t" + engDatSing + "\t" + engAccSing + "\t" + engAblSing + "\t" + engVocSing + "\t" +   //
	                 engNomPlur + "\t" + engGenPlur + "\t" + engDatPlur + "\t" + engAccPlur + "\t" + engAblPlur + "\t" + engVocPlur + "\t" +   //
					 vocabSource + "\t" + partOfSpeach + "\t" + declension);
	return outStr;
}
}


