package eTransactions;

import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class _eTransactions_Variables {
	public static WebDriver driver = new InternetExplorerDriver();
	public static boolean NoAgent;
	public static int SQC1=0;
	public static String AgentGMIN;
	public static int SQC2=1;
	public static int SQC3=2;
	public static int SelCountry;
	public static String [] LANSQ;
	public static String [] eFormsC;
	public static int FS;
	public static String eLink;
	public static String 	LanguageSel;
	public static Object 	eFormSelect;
	public static int eFormSel;  
	public static String LAN;
	public static String [] BEEformS;
	public static String GMIN;
	public static String GMINL;
	public static String CountryData;
	public static String Selection;	
	public static String eFormSelection;
	public static String baseUrl = "http://eformtest.gmehr.acs.gm.com"; 
	public static String baseUrlAgent = "http://eformtest.gmehr.acs.gm.com/agent/main.asp";
	public static String whandle = driver.getWindowHandle();
	public static boolean NoCountryMatch;
	public static boolean InvalidGMIN;
	public static Statement stmt;
	public static ResultSet rs;
	public static String queryString;
	public static String PCD;
	public static String parentHandle = driver.getWindowHandle();
	
//Windows Credentials
	public static String username 					= "ACS-BCN\\C9854448";
	public static String password 					= "Frank.2024";
	public static String LookUp						=	"lookitup_affected";
	public static String ApproveName1				=	"approver1";
	public static String ApproveName2				=	"approver2";
	public static String Approve1					= "lookitup1";
	public static String Approve2					= "lookitup2";
	
public static String[] SubmitButton		= new String[] {"//input[@value='Submit Transaction']",
														"//input[@value='Iniciar la transacción']",
														"//input[@value='Formular übermitteln']",
														"//input[@value='Transactie indienen']",
														"//input[contains(@value,'Commencer le cycle')]",
														"//input[@value='Enviar Transacção']",
														"//input[@value='Potwierdź Transakcję']",
														"//input[@value='Formular übermitteln']"};

public static String[] ManagerTab		= new String[]{"Manager","Manager/Supervisor","Vorgesetzter","Manager",
														"Manager","Manager","Przełożony","Vorgesetzter"};

//PORTAL LINK;
public static String[] PortalPage;{
	PortalPage = new String[8];
	PortalPage[0]					=	"http://eformtest.gmehr.acs.gm.com/";
	PortalPage[1]					=	"https://eformtest.gmehr.acs.gm.com/gate/gate.asp?country=ES&lang=5&area=ess";
	PortalPage[2]					=	"https://eformtest.gmehr.acs.gm.com//gate/gate.asp?area=ess&country=de";
	PortalPage[3]					=	"https://eformtest.gmehr.acs.gm.com//gate/gate.asp?area=ess&country=be";
	PortalPage[4]					=	"https://eformtest.gmehr.acs.gm.com//gate/gate.asp?area=ess&country=fr";
	PortalPage[5]					=	"https://eformtest.gmehr.acs.gm.com//gate/gate.asp?area=ess&country=pt";
	PortalPage[6]					=	"https://eformtest.gmehr.acs.gm.com//gate/gate.asp?area=ess&country=pl";
	PortalPage[7]					=	"https://eformtest.gmehr.acs.gm.com//gate/gate.asp?area=ess&country=at";
}

//BUTTONS CLICK
	//LOGIN	  
	public static String[] Login;{
	Login = new String[8];
	Login[0]			 			= "//input[@value='Login']";					//UK
	Login[1]						= "//input[@value='Conectar']";					//Spain
	Login[2]						= "//input[@value='Anmelden']";					//Germany
	Login[3]						= "//input[@value='Aanmelden']";				//Belgium NL
	Login[4]			 			= "//input[@value='Login']";					//France
	Login[5]						= "//input[@value='Iniciar sessão']";			//Portugal
	Login[6]						= "//input[@value='Zaloguj']";					//Poland
	Login[7]						= "//input[@value='Anmelden']";					//Austria
	
	}
	
	//CHECK
	public static String[] Check;{
	Check = new String[8];
	Check[0] 						= "//input[@value='Check']";					//English
	Check[1]						= "//input[@value='Verificar']";				//Spain
	Check[2]						= "//input[@value='Überprüfen']";				//Germany
	Check[3]						= "//input[@value='Controle']";					//Belgium NL
	Check[4]						= "//input[@value='Vérification']";				//France
	Check[5]						= "//input[@value='Verificar']";				//Portugal
	Check[6]						= "//input[@value='Kontrola']";					//Poland
	Check[7]						= "//input[@value='Überprüfen']";				//Austria
	
	
	}
	
//COUNTRY GMINS FOR HR ADMIN:
	public static String[] GMINS;{
	GMINS = new String[8];
	GMINS[0] 				= "115432199";						//GMIN UK
	GMINS[1]				= "568116805";						//GMIN ES
	GMINS[2]				= "914161803";						//GMIN DE
	GMINS[3]				= "213317009";						//GMIN BE
	GMINS[4]				= "312116853";						//GMIN FR
	GMINS[5]				= "309084502";						//GMIN PT
	GMINS[6]				= "219162360";						//GMIN PL
	GMINS[7]				= "916439856";						//GMIN AT
		
	}	


//LANGUAGE eTransaction fast access link
	public static String[] EFA;{
	EFA = new String[8];
	EFA[0]					= "eTransactions fast access";
	EFA[1]					= "Acceso rápido a transacciones";
	EFA[2]					= "Schnellzugang elektronische Transaktionen";
	EFA[3]					= "eTransacties vlugge toegang";
	EFA[4]					= "Accès rapide aux formulaires électroniques";
	EFA[5]					= "Acesso rápido a todas as transacções";
	EFA[6]					= "Szybki dostęp do transakcji";
	EFA[7]					= "Schnellzugang eTransaktionen";
	
	}
//COUNTRIES LIST
public static String[] ListOfCountry	= new String[] {"United Kingdom","Spain", "Germany","Belgium",
														"France","Portugal","Poland","Austria"};

//LINK IN SPECIFIC COUNTRY
	public static String[] Country;{
	Country = new String[8];
	Country[0]			= "HR Admin";
	Country[1]			= "Personal";
	Country[2] 			= "Personalabtlg.";
	Country[3]			= "HR Admin";
	Country[4]			= "Admin RH";
	Country[5]			= "RH Admin";
	Country[6]			= "Dział Personalny";
	Country[7] 			= "Personalabtlg.";
	}
//SQ LANGUAGE
public static String[] ENSQ;{
	ENSQ = new String[3];
// EN QUESTIONS:
	ENSQ[0]				= "What is the name of your primary school?";
	ENSQ[1]				= "What is your favourite animal?";
	ENSQ[2]				= "What is your favourite colour?";
}
//DE QUESTIONS:
public static String[] DESQ;{
		DESQ = new String[3];
	DESQ[0]				= "Wie ist der Name Ihrer ersten Schule?";
	DESQ[1]				= "Welches ist Ihr Lieblingstier?";
	DESQ[2]				= "Welche ist Ihre Lieblingsfarbe?";
}		
//FR QUESTIONS:
public static String[] FRSQ;{
	FRSQ = new String[3];
	FRSQ[0]				= "Quel est le nom de votre école primaire ?";
	FRSQ[1]				= "Quel est votre animal préféré ?";
	FRSQ[2]				= "Quelle est votre couleur préférée ?";
}		
	//POLISH QUESTIONS:
public static String[] PLSQ;{
	PLSQ = new String[3];
	PLSQ[0]				= "W jakim mieście znajduje się szkoła podstawowa, którą ukończyłeś?";
	PLSQ[1]				= "Jakie jest Twoje ulubione zwierzę?";
	PLSQ[2]				= "Jaki jest Twój ulubiony kolor?";
}		
//SPANISH QUESITONS:
public static String[] ESSQ;{
	ESSQ = new String[3];
	ESSQ[0]				= "¿Cuál es el nombre de su primer colegio?";
	ESSQ[1]				= "¿Cuál es su animal favorito?";
	ESSQ[2]				= "¿Cuál es su color favorito?";
}		
	//DEUTCH QUESTIONS:
public static String[] BESQ;{
	BESQ = new String[3];
	BESQ[0]				= "Wat is de naam van uw lagere school?";
	BESQ[1]				= "Wat is uw favoriete dier?";
	BESQ[2]				= "Wat is uw favoriete kleur?";
}		
//PORTUGUESE QUESIONS:
public static String[] PTSQ;{
	PTSQ = new String[3];
	PTSQ[0]				= "Qual é o nome da sua escola primária?";
	PTSQ[1]				= "Qual é o seu animal favorito?";
	PTSQ[2]				= "Qual é a sua cor favorita?";
	}

// LIST OF FORMS LINKED TO ELINKS
	public static String[] FREL;{
	FREL = new String[8];
	FREL[0]				=	 "(//img[@alt='Remplir en ligne'])[13]";					//FR - Embauche_Reembauche
	FREL[1]				= 	 "(//img[@alt='Online ausfüllen'])[7]";						//AT - Anderung_Schicht;
	FREL[2]				=	 "(//img[@alt='Online ausfüllen'])[8]";						//AT - Anderung_Ummeldung;
	FREL[3]				=    "(//img[@alt='Populate Online'])[18]";						//UK - New Hire/Rehire
	FREL[4]				= 	 "(//img[@alt='Online ausfüllen'])[25]";					//DE - Mutterschaft
	FREL[5]				=	 "(//img[@alt='Online ausfüllen'])[12]";					//AT - Einmalzahlung
	FREL[6]				=	 "(//img[@alt='Online ausfüllen'])[22]";					//DE - Ergänzende Zahlungen
	FREL[7]				= 	"(//img[@alt='Remplir en ligne'])[7]";						//Changement données contractuelles
	}

//LIST OF WORKSCHEDULES
	public static String[] WSR;{
		WSR = new String[8];
		WSR[0]				=  "(//img[@alt='files/AT_WSR_v1.htm'])";							//AT WorkSchedule
		WSR[1]				= "(//img[@alt='files/BE_Work schedule rule list_12.04.07.htm')";	//BE WorkSchedule
		WSR[2]				=  "(//img[@alt='files/PT_Regra_horario_trabalho_v1.htm'])";		//PT WorkSchedule
		WSR[3]				=  "(//img[@alt='files/plan_de_roulement_gm2.htm'])";				//FR Plan Roulement
		WSR[4]				=  "(//img[@alt='Files/DE Work Schedule Rule.htm'])";				//DE WorkSchedule
		
		
		}

//LIST OF JOB CODES
	public static String[] JC;{
		JC = new String[8];
		JC[0]				="(//img[@alt='files/AT_Job_Codes_v1.htm'])";						//AT Job Codes
		JC[1]				= "(//img[@alt='files/BE_Job code list.htm'])";						//BE Job Codes
		JC[3]				="//img[@alt='files/FR Job Code (PSFT).htm']";							//FR Job Codes
		JC[5]				= "//img[@alt='files/UK_Jobcode.htm']";								//UK Job Code
			
	}
	
//LIST OF COST CENTERS
	public static String[] CC;{
		CC = new String[8];
		CC[0]				= "//img[@alt='files/AT_CostCenters_v1.htm']";					//AT Cost Center
		CC[1]				= "//img[@alt='files/BE_Cost Center.htm']";						//BE Cost Center
		CC[2]				=  "//img[@alt='files/centro_custo_v1.htm']";						//PT Cost Center
		CC[3]				= "//img[@alt='files/cost_center2.htm']";							//FR Cost Center
		CC[6]				= "//img[@alt='files/PL_Cost_Centre.htm']";						//PL Cost Center
		
	}
public static String[] IT15	=	new String[] {"(//img[@alt='files\\AT_Wagetype_einmalzahlung.htm'])","(//img[@alt='Files/DE_IT15.htm'])"};
	
//LIST OF FORMS
	// France
	public static String[] FREforms;{
		FREforms = new String[23];
		FREforms[0]									= "//img[@alt='Remplir en ligne']";							//Avantage en nature
		FREforms[1]									= "(//img[@alt='Remplir en ligne'])[2]";					//Chang. nationalité / Renouvellement titre séjour
		FREforms[2]									= "(//img[@alt='Remplir en ligne'])[3]";					//Changement contact d'urgence
		FREforms[3]									= "(//img[@alt='Remplir en ligne'])[4]";					//Changement coord. bancaires
		FREforms[4]									= "(//img[@alt='Remplir en ligne'])[5]";					//Changement d'adresse
		FREforms[5]									= "(//img[@alt='Remplir en ligne'])[6]";					//Changement de niveau de formation
		FREforms[6]									= "(//img[@alt='Remplir en ligne'])[7]";					//Changement données contractuelles
		FREforms[7]									= "(//img[@alt='Remplir en ligne'])[8]";					//Changement situation familiale / naissance
		FREforms[8]									= "(//img[@alt='Remplir en ligne'])[9]";					//Congés spéciaux
		FREforms[9]									= "(//img[@alt='Remplir en ligne'])[10]";					//Demande d'acompte
		FREforms[10]								= "(//img[@alt='Remplir en ligne'])[11]";					//Demande de congés
		FREforms[11]								= "(//img[@alt='Remplir en ligne'])[12]";					//Départ
		FREforms[12]								= "(//img[@alt='Remplir en ligne'])[13]";					//Embauche/Réembauche
		FREforms[13]								= "(//img[@alt='Remplir en ligne'])[14]";					//Indemnités de transport
		FREforms[14]								= "(//img[@alt='Remplir en ligne'])[15]";					//Mesures disciplinaires
		FREforms[15]								= "(//img[@alt='Remplir en ligne'])[16]";					//Mi-temps thérapeutique
		FREforms[16]								= "(//img[@alt='Remplir en ligne'])[18]";					//Prêt CE
		FREforms[17]								= "(//img[@alt='Remplir en ligne'])[19]";					//Prime Individuelle
		FREforms[18]								= "(//img[@alt='Remplir en ligne'])[20]";					//Reconnaissance inval/incap/hand.
		FREforms[19]								= "(//img[@alt='Remplir en ligne'])[21]";					//Régularisation d’absence
		FREforms[20]								= "(//img[@alt='Remplir en ligne'])[22]";					//Relevé des heures supplémentaires
		FREforms[21]								= "(//img[@alt='Remplir en ligne'])[23]";					//Retenue sur Salaire
		FREforms[22]								= "(//img[@alt='Remplir en ligne'])[24]";					//Saisie-arrêt / Pension alimentaire
		}
		
	//AT
	public static String[] ATEforms;{
		ATEforms = new String[18];
		ATEforms[0]									= "//img[@alt='Online ausfüllen']";							//Aktualisierung des persönlichen Trainingsplans
		ATEforms[1]									= "(//img[@alt='Online ausfüllen'])[2]";					//Altersteilzeit 
		ATEforms[2]									= "(//img[@alt='Online ausfüllen'])[3]";					//Änderung - Bankverbindung
		ATEforms[3]									= "(//img[@alt='Online ausfüllen'])[4]";					//Änderung - LohnGehalt
		ATEforms[4]									= "(//img[@alt='Online ausfüllen'])[5]";					//Änderung - Persönliche Daten 
		ATEforms[5]									= "(//img[@alt='Online ausfüllen'])[6]";					//Änderung - Qualifikation
		ATEforms[6]									= "(//img[@alt='Online ausfüllen'])[7]";					//Änderung - Schicht
		ATEforms[7]									= "(//img[@alt='Online ausfüllen'])[8]";					//Änderung - Ummeldung
		ATEforms[8]									= "(//img[@alt='Online ausfüllen'])[10]";					//Anmeldung
		ATEforms[9]									= "(//img[@alt='Online ausfüllen'])[11]";					//Austritt
		ATEforms[10]								= "(//img[@alt='Online ausfüllen'])[12]";					//Einmalzahlung
		ATEforms[11]								= "(//img[@alt='Online ausfüllen'])[13]";					//Fehlerkorrektur
		ATEforms[12]								= "(//img[@alt='Online ausfüllen'])[14]";					//Firmeneigentum
		ATEforms[13]								= "(//img[@alt='Online ausfüllen'])[15]";					//Neueinstellung/Wiedereintritt
		ATEforms[14]								= "(//img[@alt='Online ausfüllen'])[16]";					//Notfall-Kontakt
		ATEforms[15]								= "(//img[@alt='Online ausfüllen'])[17]";					//Stornierung/Neubesetzung
		ATEforms[16]								= "(//img[@alt='Online ausfüllen'])[18]";					//Unbezahlte Abwesenheit / Rückkehr
		ATEforms[17]								= "(//img[@alt='Online ausfüllen'])[19]";					//Warteliste
		}
	//UK
	public static String[] UKForms; {
		UKForms = new String[27];	
		UKForms[0]									= "(//img[@alt='Populate Online']";							//Address_Marital_Status_Change
		UKForms[1]									= "(//img[@alt='Populate Online'])[2]";						//Asset_Tracking_Form 				
		UKForms[2]									= "(//img[@alt='Populate Online'])[4]";						//AVC_Pension_Form
		UKForms[3]									= "(//img[@alt='Populate Online'])[5]";						//Bank_Details_Change_Form
		UKForms[4]									= "(//img[@alt='Populate Online'])[6]";						//Defined_Benefit_Pension_Plan
		UKForms[5]									= "(//img[@alt='Populate Online'])[7]";						//Defined_Contribution_Pension_Plan
		UKForms[6]									= "(//img[@alt='Populate Online'])[8]";						//Department_Transfer
		UKForms[7]									= "(//img[@alt='Populate Online'])[9]";						//Disciplinary_Attendance_Control
		UKForms[8]									= "(//img[@alt='Populate Online'])[10]";					//Emergency_Contact_Details_Form
		UKForms[9]									= "(//img[@alt='Populate Online'])[11]";					//EP_Return_to_Work_Interview
		UKForms[10]									= "(//img[@alt='Populate Online'])[12]";					//Grievance_Form
		UKForms[11]									= "(//img[@alt='Populate Online'])[13]";					//HR_Pension_Form
		UKForms[12]									= "(//img[@alt='Populate Online'])[14]";					//IBC_Return_to_Work_Interview
		UKForms[13]									= "(//img[@alt='Populate Online'])[15]";					//Intercompany_Transfer
		UKForms[14]									= "(//img[@alt='Populate Online'])[16]";					//Maternity_Leave_Form
		UKForms[15]									= "(//img[@alt='Populate Online'])[17]";					//Miscellaneous_Deductions_Form
		UKForms[16]									= "(//img[@alt='Populate Online'])[18]";					//New_Hire_Rehire_Form
		UKForms[17]									= "(//img[@alt='Populate Online'])[19]";					//Pay_Change
		UKForms[18]									= "(//img[@alt='Populate Online'])[20]";					//Promotion_Status_Change
		UKForms[19]									= "(//img[@alt='Populate Online'])[21]";					//Qualification_Change_Form
		UKForms[20]									= "(//img[@alt='Populate Online'])[22]";					//Recurring_One_Off_Deductions_Form
		UKForms[21]									= "(//img[@alt='Populate Online'])[23]";					//Recurring_One_Off_Payment_Form
		UKForms[22]									= "(//img[@alt='Populate Online'])[24]";					//Repayment_Form
		UKForms[23]									= "(//img[@alt='Populate Online'])[25]";					//Salary_Change_Dept_Transfer
		UKForms[24]									= "(//img[@alt='Populate Online'])[26]";					//Self_Certification_Sickness_Form
		UKForms[25]									= "(//img[@alt='Populate Online'])[27]";					//Termination_Form
		UKForms[26]									= "(//img[@alt='Populate Online'])[28]";					//WHouse_Return_to_Work_Interview
	}			
	//PT
	public static String[] PTEforms;{
		PTEforms = new String[26];
		PTEforms[0]									= "(//img[@alt='Preencher online']";						//Actualização Ind. do Registo de Formação
		PTEforms[1]									= "(//img[@alt='Preencher online'])[2]";					//Admissão
		PTEforms[2]									= "(//img[@alt='Preencher online'])[3]";					//Ajustes e aumentos salário
		PTEforms[3]									= "(//img[@alt='Preencher online'])[4]";					//Alteração C. Custo/Horário
		PTEforms[4]									= "(//img[@alt='Preencher online'])[5]";					//Alteração de dados pessoais
		PTEforms[5]									= "(//img[@alt='Preencher online'])[6]";					//Alteração de departamento
		PTEforms[6]									= "(//img[@alt='Preencher online'])[7]";					//Ausência prolongada / Regresso ao trabalho
		PTEforms[7]									= "(//img[@alt='Preencher online'])[8]";					//Bens atribuídos ao empregado
		PTEforms[8]									= "(//img[@alt='Preencher online'])[9]";					//Bens da Empresa
		PTEforms[9]									= "(//img[@alt='Preencher online'])[10]";					//Cancelamento/Substituição
		PTEforms[10]								= "(//img[@alt='Preencher online'])[11]";					//Confirmação de dados bancários
		PTEforms[11]								= "(//img[@alt='Preencher online'])[12]";					//Contacto de emergência
		PTEforms[12]								= "(//img[@alt='Preencher online'])[13]";					//Dados de familiares
		PTEforms[13]								= "(//img[@alt='Preencher online'])[14]";					//Descontos
		PTEforms[14]								= "(//img[@alt='Preencher online'])[15]";					//Entrevista de Saída
		PTEforms[15]								= "(//img[@alt='Preencher online'])[16]";					//Estatuto/Sub. Trab. Estudante
		PTEforms[16]								= "(//img[@alt='Preencher online'])[18]";					//Inscrição
		PTEforms[17]								= "(//img[@alt='Preencher online'])[19]";					//Lista de Espera
		PTEforms[18]								= "(//img[@alt='Preencher online'])[20]";					//Pagamento suplementar de reforma
		PTEforms[19]								= "(//img[@alt='Preencher online'])[21]";					//Pagamentos
		PTEforms[20]								= "(//img[@alt='Preencher online'])[22]";					//Pedido de declaração
		PTEforms[21]								= "(//img[@alt='Preencher online'])[23]";					//Promoções
		PTEforms[22]								= "(//img[@alt='Preencher online'])[24]";					//Promoções Cont./Enquadramentos
		PTEforms[23]								= "(//img[@alt='Preencher online'])[25]";					//Prorrogação Compl. Doença
		PTEforms[24]								= "(//img[@alt='Preencher online'])[26]";					//Saída da Empresa I
		PTEforms[25]								= "(//img[@alt='Preencher online'])[27]";					//Saída da Empresa II
	}	
	//PL
	public static String[] PLEforms;{
		PLEforms = new String[23];
		PLEforms[0]									= "(//img[@alt='Rozpowszechnić on-line']";					//Akcja korygująca
		PLEforms[1]									= "(//img[@alt='Rozpowszechnić on-line'])[2]";				//Aktualizacja historii szkolenia
		PLEforms[2]									= "(//img[@alt='Rozpowszechnić on-line'])[3]";				//Aktualizacja listy pracowników
		PLEforms[3]									= "(//img[@alt='Rozpowszechnić on-line'])[4]";				//Anulowanie/Zastąpienie
		PLEforms[4]									= "(//img[@alt='Rozpowszechnić on-line'])[5]";				//Kontakt w nagłych przypadkach
		PLEforms[5]									= "(//img[@alt='Rozpowszechnić on-line'])[6]";				//Konto bankowe
		PLEforms[6]									= "(//img[@alt='Rozpowszechnić on-line'])[7]";				//Korekta listy płac
		PLEforms[7]									= "(//img[@alt='Rozpowszechnić on-line'])[9]";				//Lista rezerwowa
		PLEforms[8]									= "(//img[@alt='Rozpowszechnić on-line'])[10]";				//Płatność jednorazowa/ miesięczna
		PLEforms[9]									= "(//img[@alt='Rozpowszechnić on-line'])[11]";				//Poprzedni Pracodawca
		PLEforms[10]								= "(//img[@alt='Rozpowszechnić on-line'])[12]";				//Rejestracja Pracownika
		PLEforms[11]								= "(//img[@alt='Rozpowszechnić on-line'])[13]";				//Rejestracja Zleceniobiorcy
		PLEforms[12]								= "(//img[@alt='Rozpowszechnić on-line'])[14]";				//Stan rodzinny
		PLEforms[13]								= "(//img[@alt='Rozpowszechnić on-line'])[15]";				//Ubezpieczenie społeczne/ Urząd Skarbowy
		PLEforms[14]								= "(//img[@alt='Rozpowszechnić on-line'])[16]";				//Ustanie stosunku cywilnoprawnego
		PLEforms[15]								= "(//img[@alt='Rozpowszechnić on-line'])[17]";				//Ustanie stosunku pracy
		PLEforms[16]								= "(//img[@alt='Rozpowszechnić on-line'])[18]";				//Wykształcenie i znajomość języków
		PLEforms[17]								= "(//img[@alt='Rozpowszechnić on-line'])[19]";				//Wynagrodzenie Zleceniobiorcy
		PLEforms[18]								= "(//img[@alt='Rozpowszechnić on-line'])[20]";				//Zapisanie na szkolenie
		PLEforms[19]								= "(//img[@alt='Rozpowszechnić on-line'])[21]";				//Zmiana danych adresowych
		PLEforms[20]								= "(//img[@alt='Rozpowszechnić on-line'])[22]";				//Zmiana lokalizacji płacowej
		PLEforms[21]								= "(//img[@alt='Rozpowszechnić on-line'])[23]";				//Zmiana stanu cywilnego/ Dokumentów tożsamości
		PLEforms[22]								= "(//img[@alt='Rozpowszechnić on-line'])[24]";				//Zmiana statusu Pracownika
	}		
	//ES
	public static String[] ESEforms;{
		ESEforms = new String[31];
		ESEforms[0]									= "//img[@alt='Rellenar en línea']";						//Acciones Disciplinarias
		ESEforms[1]									= "(//img[@alt='Rellenar en línea'])[2]";					//Actualización de formación personal 
		ESEforms[2]									= "(//img[@alt='Rellenar en línea'])[3]";					//Cambio datos de contacto en caso de emergencia 
		ESEforms[3]									= "(//img[@alt='Rellenar en línea'])[4]";					//Cambio de datos de formación 
		ESEforms[4]									= "(//img[@alt='Rellenar en línea'])[5]";					//Cambio de datos personales/Solicitud de certificados 
		ESEforms[5]									= "(//img[@alt='Rellenar en línea'])[6]";					//Cambio de departamento hourly 
		ESEforms[6]									= "(//img[@alt='Rellenar en línea'])[7]";					//Cambio de turno
		ESEforms[7]									= "(//img[@alt='Rellenar en línea'])[8]";					//Cambio de turno salaried fuera de convenio 
		ESEforms[8]									= "(//img[@alt='Rellenar en línea'])[9]";					//Cambio retención IRPF
		ESEforms[9]									= "(//img[@alt='Rellenar en línea'])[10]";					//Cancelación/Sustitución
		ESEforms[10]								= "(//img[@alt='Rellenar en línea'])[11]";					//Contratación/Recontratación
		ESEforms[11]								= "(//img[@alt='Rellenar en línea'])[12]";					//Datos Bancarios
		ESEforms[12]								= "(//img[@alt='Rellenar en línea'])[13]";					//Desvinculacion
		ESEforms[13]								= "(//img[@alt='Rellenar en línea'])[14]";					//Dieta de comida/Ayuda a disminuidos
		ESEforms[14]								= "(//img[@alt='Rellenar en línea'])[15]";					//Entrevista de Salida
		ESEforms[15]								= "(//img[@alt='Rellenar en línea'])[17]";					//Lista de Espera
		ESEforms[16]								= "(//img[@alt='Rellenar en línea'])[18]";					//Matriculacion
		ESEforms[17]								= "(//img[@alt='Rellenar en línea'])[19]";					//Modificaciones en el contrato de trabajo 
		ESEforms[18]								= "(//img[@alt='Rellenar en línea'])[20]";					//Pagos/Descuentos
		ESEforms[19]								= "(//img[@alt='Rellenar en línea'])[21]";					//Pensión alimenticia
		ESEforms[20]								= "(//img[@alt='Rellenar en línea'])[22]";					//Plus transporte propio
		ESEforms[21]								= "(//img[@alt='Rellenar en línea'])[23]";					//Pluses
		ESEforms[22]								= "(//img[@alt='Rellenar en línea'])[24]";					//Préstamo vivienda
		ESEforms[23]								= "(//img[@alt='Rellenar en línea'])[25]";					//Promoción/reclasificación y cambio de dept./holding
		ESEforms[24]								= "(//img[@alt='Rellenar en línea'])[26]";					//Reincorporacion
		ESEforms[25]								= "(//img[@alt='Rellenar en línea'])[27]";					//Seguimiento de activos
		ESEforms[26]								= "(//img[@alt='Rellenar en línea'])[28]";					//Solicitud de anticipo
		ESEforms[27]								= "(//img[@alt='Rellenar en línea'])[29]";					//Solicitud de ayuda a disminuidos
		ESEforms[28]								= "(//img[@alt='Rellenar en línea'])[30]";					//Solicitud de excedencia
		ESEforms[29]								= "(//img[@alt='Rellenar en línea'])[31]";					//Solicitud reducción jornada/turno fijo por estudios
		ESEforms[30]								= "(//img[@alt='Rellenar en línea'])[32]";					//Trabajos de superior categoría: Hourly/Salaried a Salaried
	}
//DE
	public static String[] DEEforms;{
		DEEforms = new String[33];
		DEEforms[0]									= "//img[@alt='Online ausfüllen']";							//Aktualisierung des persönlichen Trainingsplans
		DEEforms[1]									= "(//img[@alt='Online ausfüllen'])[2]";					//Aktualisierung des Vorgesetzten
		DEEforms[2]									= "(//img[@alt='Online ausfüllen'])[3]";					//Altersteilzeit (ATZ)
		DEEforms[3]									= "(//img[@alt='Online ausfüllen'])[4]";					//Altersvermögenswirksame Leistungen
		DEEforms[4]									= "(//img[@alt='Online ausfüllen'])[5]";					//Änderung - Adresse und Staatsangehörigkeit
		DEEforms[5]									= "(//img[@alt='Online ausfüllen'])[6]";					//Änderung - Angaben zur Familie
		DEEforms[6]									= "(//img[@alt='Online ausfüllen'])[7]";					//Änderung - Bankverbindung
		DEEforms[7]									= "(//img[@alt='Online ausfüllen'])[8]";					//Änderung - Entgelt, Tätigkeit
		DEEforms[8]									= "(//img[@alt='Online ausfüllen'])[9]";					//Änderung - Entgelt, Tätigkeit u. Versetzung
		DEEforms[9]									= "(//img[@alt='Online ausfüllen'])[10]";					//Änderung - Krankenkasse
		DEEforms[10]								= "(//img[@alt='Online ausfüllen'])[11]";					//Änderung - Qualifikation
		DEEforms[11]								= "(//img[@alt='Online ausfüllen'])[12]";					//Änderung - Schul- und Berufsausbildung
		DEEforms[12]								= "(//img[@alt='Online ausfüllen'])[14]";					//Anmeldung
		DEEforms[13]								= "(//img[@alt='Online ausfüllen'])[15]";					//Antrag auf Freistellung zur Weiterbildung
		DEEforms[14]								= "(//img[@alt='Online ausfüllen'])[16]";					//Antrag Bildungsurlaub
		DEEforms[15]								= "(//img[@alt='Online ausfüllen'])[17]";					//Antrag Nebenbeschäftigung
		DEEforms[16]								= "(//img[@alt='Online ausfüllen'])[18]";					//Austritt
		DEEforms[17]								= "(//img[@alt='Online ausfüllen'])[19]";					//Eintritt
		DEEforms[18]								= "(//img[@alt='Online ausfüllen'])[20]";					//Eintritt - Prak/Dipl/Dok/Azubi Rüsselsheim
		DEEforms[19]								= "(//img[@alt='Online ausfüllen'])[21]";					//Elternzeit
		DEEforms[20]								= "(//img[@alt='Online ausfüllen'])[22]";					//Ergänzende Zahlungen
		DEEforms[21]								= "(//img[@alt='Online ausfüllen'])[23]";					//Firmeneigentum
		DEEforms[22]								= "(//img[@alt='Online ausfüllen'])[24]";					//Kostenerstattung Eintritt
		DEEforms[23]								= "(//img[@alt='Online ausfüllen'])[25]";					//Mutterschaft
		DEEforms[24]								= "(//img[@alt='Online ausfüllen'])[26]";					//Notfallkontaktangaben
		DEEforms[25]								= "(//img[@alt='Online ausfüllen'])[27]";					//Personalprogramme
		DEEforms[26]								= "(//img[@alt='Online ausfüllen'])[28]";					//Schwerbehinderung
		DEEforms[27]								= "(//img[@alt='Online ausfüllen'])[29]";					//Stornierung/Neubesetzung
		DEEforms[28]								= "(//img[@alt='Online ausfüllen'])[30]";					//Warteliste
		DEEforms[29]								= "(//img[@alt='Online ausfüllen'])[31]";					//Wehr- und Zivildienst
		DEEforms[30]								= "(//img[@alt='Online ausfüllen'])[32]";					//Werkswechsel
		DEEforms[31]								= "(//img[@alt='Online ausfüllen'])[33]";					//Wiederkehrende Be-/Abzüge
		DEEforms[32]								= "(//img[@alt='Online ausfüllen'])[34]";					//Zusätzliche persönliche Altersvorsorge
	}
//BELGIUM NL
	public static String[] BEEformsNL;{
		BEEformsNL = new String[20];	
		BEEformsNL[0]								= "//img[@alt='Gelieve online in te vullen']";				//Aanpassing bankrekening
		BEEformsNL[1]								= "(//img[@alt='Gelieve online in te vullen'])[2]";			//Aanvraag educatief verlof
		BEEformsNL[2]								= "(//img[@alt='Gelieve online in te vullen'])[3]";			//Aanvraag éénmalige betaling
		BEEformsNL[3]								= "(//img[@alt='Gelieve online in te vullen'])[4]";			//Aanwerving
		BEEformsNL[4]								= "(//img[@alt='Gelieve online in te vullen'])[5]";			//Activa tracking
		BEEformsNL[5]								= "(//img[@alt='Gelieve online in te vullen'])[6]";			//Annulering/vervanging
		BEEformsNL[6]								= "(//img[@alt='Gelieve online in te vullen'])[8]";			//Inschrijving
		BEEformsNL[7]								= "(//img[@alt='Gelieve online in te vullen'])[9]";			//Jobinfo
		BEEformsNL[8]								= "(//img[@alt='Gelieve online in te vullen'])[10]";		//Personen ten laste
		BEEformsNL[9]								= "(//img[@alt='Gelieve online in te vullen'])[11]";		//Persoonlijk opleidingsplan aanvullen
		BEEformsNL[10]								= "(//img[@alt='Gelieve online in te vullen'])[12]";		//Salarisvoorschot
		BEEformsNL[11]								= "(//img[@alt='Gelieve online in te vullen'])[13]";		//Tijdskrediet
		BEEformsNL[12]								= "(//img[@alt='Gelieve online in te vullen'])[14]";		//Uit dienst
		BEEformsNL[13]								= "(//img[@alt='Gelieve online in te vullen'])[15]";		//Uit dienst SWT/MP
		BEEformsNL[14]								= "(//img[@alt='Gelieve online in te vullen'])[16]";		//Vervanging leidinggevende
		BEEformsNL[15]								= "(//img[@alt='Gelieve online in te vullen'])[17]";		//Wachtlijst
		BEEformsNL[16]								= "(//img[@alt='Gelieve online in te vullen'])[18]";		//Wijziging adres
		BEEformsNL[17]								= "(//img[@alt='Gelieve online in te vullen'])[19]";		//Wijziging burgerlijke staat
		BEEformsNL[18]								= "(//img[@alt='Gelieve online in te vullen'])[20]";		//Wijziging contactpersoon bij noodgevallen
		BEEformsNL[19]								= "(//img[@alt='Gelieve online in te vullen'])[21]";		//Wijziging persoonlijke gegevens
	}	
//BELGIUM EN
	public static String [] BEEformsEN;{
		BEEformsEN = new String[20];
		BEEformsEN[0]								= "(//img[@alt='Populate Online']";							//Address change
		BEEformsEN[1]								= "(//img[@alt='Populate Online'])[2]";						//Asset tracking
		BEEformsEN[2]								= "(//img[@alt='Populate Online'])[4]";						//Cancellation/replacement
		BEEformsEN[3]								= "(//img[@alt='Populate Online'])[5]";						//Change Bank Details
		BEEformsEN[4]								= "(//img[@alt='Populate Online'])[6]";						//Dependant Information
		BEEformsEN[5]								= "(//img[@alt='Populate Online'])[7]";						//Emergency contact details change
		BEEformsEN[6]								= "(//img[@alt='Populate Online'])[8]";						//Enrolment
		BEEformsEN[7]								= "(//img[@alt='Populate Online'])[9]";						//Job information
		BEEformsEN[8]								= "(//img[@alt='Populate Online'])[10]";					//Marital status change
		BEEformsEN[9]								= "(//img[@alt='Populate Online'])[11]";					//New Hire/Rehire
		BEEformsEN[10]								= "(//img[@alt='Populate Online'])[12]";					//Personal information change
		BEEformsEN[11]								= "(//img[@alt='Populate Online'])[13]";					//Personal training record update
		BEEformsEN[12]								= "(//img[@alt='Populate Online'])[14]";					//Replacement of a supervisor
		BEEformsEN[13]								= "(//img[@alt='Populate Online'])[15]";					//Request for educational leave
		BEEformsEN[14]								= "(//img[@alt='Populate Online'])[16]";					//Request for one off payment
		BEEformsEN[15]								= "(//img[@alt='Populate Online'])[17]";					//Salary advance
		BEEformsEN[16]								= "(//img[@alt='Populate Online'])[18]";					//Termination
		BEEformsEN[17]								= "(//img[@alt='Populate Online'])[19]";					//Termination BP/MP
		BEEformsEN[18]								= "(//img[@alt='Populate Online'])[20]";					//Wait list
		BEEformsEN[19]								= "(//img[@alt='Populate Online'])[21]";					//Work time reduction
	}
//COUNTRY eLINKS
	//UK eLINKS
		public static String Functional_Partition 				= "//img[@alt='files/UK_Functional_Partition.htm']";				//Functional Partition
		public static String Job_Code 							= "//img[@alt='files/UK_Jobcode.htm']";								//Job Code
		public static String School_Code						= "//img[@alt='files/UK School Code-2.htm']";						//School Code
		
		
	//PL eLINKS
		public static String Kod_szkolenia						= "(//img[@alt='http://www.gmu-europe.com'])";				//Kod szkolenia, Nazwa skolenia, Kod sesji
		public static String Data_Konocowa						= "(//img[@alt='files/PL_Wage_Types.htm'])";				//PL Wage Types
		public static String Miejsce_powstawania				= "(//img[@alt='files/PL_Cost_Centre.htm'])";				//Cost Center
		public static String PL_Functional_Partition 			= "(//img[@alt='files/PL_Functional_partition.htm'])";		//Functional Partition
		public static String Kod_Administradora					= "(//img[@alt='files/PL_Time_admin.htm'])";				//PL Time Admin
		public static String Kierunek_studiow_PS				= "(//img[@alt='files/PL_Major code.htm'])";				//PL Major Code
		public static String Uczelnia_PS						= "(//img[@alt='files/PL_School code.htm'])";				//PL School Code
		public static String Kud_Urzelu							= "(//img[@alt='files/PL Tax Offices.htm'])";				//PL Tax Offices
		public static String Kod_departamentu					= "(//img[@alt='files/PL_Department_Code.htm'])";			//Department Code
		
	//DE eLINKS
		public static String Krankenkasse						= "(//img[@alt='Files/DE_Krankenkassen.htm'])";							//Krankenkassen
		public static String DE_GMU_EUROPE						= "(//img[@alt='https://www.gmu-europe.com'])";							//Titer der Lernaktivität, Code der Lernaktivität and Veranstaltungscode
		public static String Austrittsgrund					= "(//img[@alt='files/DE Austrittsgrund.htm'])";						//Austrittsgrund
		public static String Department_ID						= "(//img[@alt='files/DE BU_Department1.mht'])";						//DE Department ID
		public static String Mitarbeiterkreis					= "(//img[@alt='Files/DE_Mitarbeiterkreis.htm'])";						//Mitarbeiterkreis
		public static String Funktionsfach						= "(//img[@alt='files/DE_functional_partition.html'])";					//DE Functional Partitions
		public static String Lohnart_IT15						= "(//img[@alt='Files/DE_IT15.htm'])";									//DE IT15
		public static String Arbeitszeitplanregel				= "(//img[@alt='Files/DE Work Schedule Rule.htm'])";					//DE WorkSchedule
		public static String Lohnart_IT14						= "(//img[@alt='Files/DE_IT14.htm'])";									//DE IT14
		
	//PT eLINKS
		public static String Distancia							= "(//img[@alt='files/PT_distancia_km.htm'])";				//Distancia
		public static String Numero_Autocarro					= "(//img[@alt='files/Numero_autocarro_v1.htm'])";			//Numero Autocarro
		public static String Centro_Custo						= "(//img[@alt='files/centro_custo_v1.htm'])";				//Centro Custo
		public static String PT_Departamento					= "(//img[@alt='files/PT_Departamento_v2.htm'])";			//PT Departamento
		public static String Regra_horario_trabajo				= "(//img[@alt='files/PT_Regra_horario_trabalho_v1.htm'])";	//PT WorkSchedule
		public static String Posicion_Interna					= "(//img[@alt='files/PT_Functional_partition.htm'])";		//PT Functional Partition.
		public static String Cat_Prof_9001						= "(//img[@alt='files/Cat_prof_9001_v3.htm'])";				//Cat. Prof. 9001
		public static String Cat_Prof_337						= "(//img[@alt='files/Cat_prof_337_v1.htm'])";				//Cat. Prof. 337
		public static String Codigo_CNP						= "(//img[@alt='files/PT_Codigo CNP_V1.htm'])";				//Codigo CNP
		public static String Grau_Instruccio					= "(//img[@alt='files/PT_Grau_instruçao.htm'])";			//Grau Instruccion
		public static String Reparticao						= "(//img[@alt='files/PT_Repartiçao_v1.htm'])";				//Reparticao
		public static String Codigo_de_Funcao					= "(//img[@alt='files/PT_Codigo_da_funçao_v1.htm'])";		//Codigo de Funcao
		public static String PT_GMU_EUROPE						= "(//img[@alt='https://www.gmu-europe.com'])";				//Titulo da Accao de Formacao, Codigo de Accao de Formacao, Codigo da sessao
		
	//FR eLINKS
		public static String Centre_de_Cout					= "(//img[@alt='files/cost_center2.htm'])";					//FR Cost Centre
		public static String Departmenent_PSFT					= "(//img[@alt='files/GM-FR-Department-PS-Global.htm'])";	//FR Departement (PSFT)
		public static String Code_Emploi_PSFT					= "(//img[@alt='files/FR Job Code (PSFT).htm'])";			//FR Code Emploi PSFT
		public static String Repartition_fonctionnelle			= "(//img[@alt='files/FR_Functional_partition.htm'])";		//FR Functional Partition
		public static String Plan_Roulement					= "(//img[@alt='files/plan_de_roulement_gm2.htm'])";		//FR Plan de Roulement
		
	//ES eLINKS
		public static String ES_Departamento					= "(//img[@alt='files/ES_departamento.htm'])";				//ES Departamento
		public static String Turno								= "(//img[@alt='files/ES_turno.htm'])";						//Turno
		public static String ES_GMU_EUROPE						= "(//img[@alt='https://www.gmu-europe.com'])";				//Codigo de la actividad formativa, Título de la actividad formativa and Código de sesión 
		public static String Nivel_Personal					= "(//img[@alt='files/ES_nivel personal.htm'])";			//Nivel Personal
		public static String Estado_Empleo						= "(//img[@alt='files/ES_estado empleo hire.htm'])";		//Estado de Empleo
		public static String Area_Funcional					= "(//img[@alt='files/ES_Functional_partition.htm.htm'])";	//Area Funcional
		public static String Categoria_Profesional				= "(//img[@alt='files/ES_categoria prof.htm'])";			//Categoria Profesional
		
	//AT eLINKS
		public static String Kostenstelle						= "(//img[@alt='files\\AT_CostCenters_v1.htm'])";					//AT Cost Centre
		public static String Abteilung							= "(//img[@alt='files/AT_Departments_v1.htm]')";					//AT AT Department
		public static String Tatigkeitsschlussel				= "(//img[@alt='files/AT_Job_Codes_v1.htm')";						//AT Job Codes
		public static String Funktionsteilbereich				= "(//img[@alt='files/AT_functional_partition.html')";				//AT Functional Partitions
		public static String AT_Arbeitszeitplanregel			= "(//img[@alt='files/AT_WSR_v1.htm'])";							//AT WorkSchedule
		public static String AT_GMU_EUROPE						= "(//img[@alt='https://www.gmu-europe.com'])";						//Titer der Lernaktivität, Code der Lernaktivität and Veranstaltungscode
		public static String AT_Lohnart							= "(//img[@alt='files\\AT_Wagetype_einmalzahlung.htm')";				//AT Lohnart
		
	//BE eLINKS
		public static String Plaats_van_tewerkstelling			= "(//img[@alt='files/BE_Workplace list_12.04.07.htm')";			//BE Workplace List
		public static String Code_werkschema					= "(//img[@alt='files/BE_Work schedule rule list_12.04.07.htm')";	//BE WorkSchedule
		public static String Functie_indeling					= "(//img[@alt='files/BE_Functional_partition.htm')";				//BE Functional Partitions
		public static String gelieve_functiecode				= "(//img[@alt='files/BE_Job code list.htm')";						//BE JOb Codes List
		public static String PS_Job_Code						= "(//img[@alt='files/BE PS Job Code.htm')";						//BE PS JOb Codes List
		public static String BE_GMU_EUROPE						= "(//img[@alt='https://www.gmu-europe.com'])";						//Cursuscode, Cursustitel, Sessiecode
		public static String Kostenplaats						= "(//img[@alt='files/BE_Cost Center.htm')";						//BE Cost Centre
	
//ES eForm Names
		public static String[]ESeForms							= new String[]  {"Datos Bancarios","Acciones disciplinarias","Actualización de formación personal", "Cambio datos de contacto en caso de emergencia",
																		  "Cambio de datos de formación", "Cambio de datos personales/Solicitud de certificados", 
																		  "Cambio de departamento hourly", "Cambio de turno", "Cambio de turno salaried fuera de convenio","Cambio retención IRPF",
																		  "Cancelación/Sustitución","Contratación/Recontratación", "Desvinculación","Dieta de comida/Ayuda a disminuidos", 
																		  "Entrevista de Salida","Lista de espera","Matriculación","Modificaciones en el contrato de trabajo",
																		  "Pagos/Descuentos","Pensión alimenticia","Plus transporte propio","Pluses","Préstamo vivienda",
																		  "Promoción/reclasificación y cambio de dept./holding","Reincorporación","Seguimiento de activos",
																		  "Solicitud de anticipo","Solicitud de ayuda a disminuidos","Solicitud de excedencia",
																		  "Solicitud reducción jornada/turno fijo por estudios","Trabajos de superior categoría: Hourly/Salaried a Salaried"};
//NLBE eForms Names
		public static String[]BEeFormsNL						= new String[] {"Aanpassing bankrekening","Aanvraag educatief verlof","Aanvraag éénmalige betaling","Aanwerving","Activa tracking",
																				"Annulering/vervanging","Inschrijving","Jobinfo","Personen ten laste","Persoonlijk opleidingsplan aanvullen","Salarisvoorschot",
																				"Tijdskrediet","Uit dienst","Uit dienst SWT/MP","Vervanging leidinggevende","Wachtlijst","Wijziging adres","Wijziging burgerlijke staat","Wijziging contactpersoon bij noodgevallen"};
//ENBE eForms Names
		public static String[]BEeFormsEN						= new String[] {"Change bank details","Address change","Asset tracking","Cancellation/replacement","Dependant Information","Emergency contact details change","Enrolment",
																				"Job information","Marital status change","New Hire/Rehire","Personal information change","Personal training record update","Replacement of a supervisor",
																				"Request for educational leave","Request for one off payment","Salary advance","Termination","Termination BP/MP","Wait list","Work time reduction"};		
//UK eForms Names
		public static String[]UKeForms							= new String[] {"Bank Details Change", "Grievance Form","Department Transfer","Address Marital Status","HR Pension Form",
																				"Defined Benefit Pension Plan","Defined Contribution Pension Plan",
																				"Maternity Leave Form", "Disciplinary Attendance Control",
																				"AVC Pension Form","Recurring One Off Payment", "Repayment Form", "Self Certification Form",
																				"New Hire", "Termination Form", "Recurring One Off Deduction", 
																				"Miscellaneous Deductions Form", "IBC Return To Work","EP Return To Work",
																				"Pay Change Form","WHouse Interview Return To Work",
																				"Qualification Form","Salary Department Change","Promotion Status Change",
																				"Intercompany Transfer","Asset Tracking"};
//DE eForms Names		
		public static String[]DEeForms							= new String[] {"Aktualisierung des persönlichen Trainingsplans","Aktualisierung des Vorgesetzten","Altersteilzeit (ATZ)","Altersvermögenswirksame Leistungen",
																				"Änderung - Adresse und Staatsangehörigkeit","Änderung - Angaben zur Familie","Änderung - Bankverbindung","Änderung - Entgelt, Tätigkeit",
																				"Änderung - Entgelt, Tätigkeit u. Versetzung","Änderung - Krankenkasse","Änderung - Qualifikation","Änderung - Schul- und Berufsausbildung",
																				"Anmeldung","Antrag auf Freistellung zur Weiterbildung","Antrag Bildungsurlaub","Antrag Nebenbeschäftigung","Austritt","Eintritt",
																				"Eintritt - Prak/Dipl/Dok/Azubi Rüsselsheim","Elternzeit","Ergänzende Zahlungen","Firmeneigentum","Kostenerstattung Eintritt","Mutterschaft",
																				"Notfallkontaktangaben","Personalprogramme","Schwerbehinderung","Stornierung/Neubesetzung","Warteliste","Wehr- und Zivildienst",
																				"Werkswechsel","Wiederkehrende Be-/Abzüge","Zusätzliche persönliche Altersvorsorge"};
//AT eForms Names
		public static String[]ATeForms							= new String[] {"Änderung - Bankverbindung", "Aktualisierung des persönlichen Trainingsplans","Altersteilzeit","Änderung - LohnGehalt",
																				"Änderung - Persönliche Daten","Änderung - Qualifikation","Änderung - Schicht","Änderung - Ummeldung","Anmeldung",
																				"Austritt","Einmalzahlung","Fehlerkorrektur","Firmeneigentum","Neueinstellung/Wiedereintritt","Notfall-Kontakt",
																				"Stornierung/Neubesetzung","Unbezahlte Abwesenheit / Rückkehr","Warteliste"};
//FR eForms Names		
		public static String[]FReForms							= new String[] {"Avantage en nature","Chang. nationalité / Renouvellement titre séjour","Changement contact d'urgence","Changement coord. bancaires",
																				"Changement d'adresse","Changement de niveau de formation","Changement données contractuelles","Changement situation familiale / naissance",
																				"Congés spéciaux","Demande d'acompte","Demande de congés","Départ","Embauche/Réembauche","Indemnités de transport","Mesures disciplinaires",
																				"Mi-temps thérapeutique","Prêt CE","Prime Individuelle","Reconnaissance inval/incap/hand.","Régularisation d’absence","Relevé des heures supplémentaires",
																				"Retenue sur Salaire","Saisie-arrêt / Pension alimentaire"};
//PL eForms Names		
		public static String[]PLeForms							= new String[] {"Akcja korygująca","Aktualizacja historii szkolenia","Aktualizacja listy pracowników","Anulowanie/Zastąpienie","Kontakt w nagłych przypadkach",
																				"Konto bankowe","Korekta listy płac","Lista rezerwowa","Płatność jednorazowa/ miesięczna","Poprzedni Pracodawca","Rejestracja Pracownika","Rejestracja Zleceniobiorcy",
																				"Stan rodzinny","Ubezpieczenie społeczne/ Urząd Skarbowy","Ustanie stosunku cywilnoprawnego","Ustanie stosunku pracy","Wykształcenie i znajomość języków",
																				"Wynagrodzenie Zleceniobiorcy","Zapisanie na szkolenie","Zmiana danych adresowych"};
//PT eForms Names		
		public static String[]PTeForms							= new String[] {"Actualização Ind. do Registo de Formação","Admissão","Ajustes e aumentos salário","Alteração C. Custo/Horário","Alteração de dados pessoais","Alteração de departamento",
																				"Ausência prolongada / Regresso ao trabalho","Bens atribuídos ao empregado","Bens da Empresa","Cancelamento/Substituição","Confirmação de dados bancários","Contacto de emergência",
																				"Dados de familiares","Descontos","Entrevista de Saída","Estatuto/Sub. Trab. Estudante","Inscrição","Lista de Espera","Pagamento suplementar de reforma","Pagamentos",
																				"Pedido de declaração","Promoções","Promoções Cont./Enquadramentos","Prorrogação Compl. Doença","Saída da Empresa I","Saída da Empresa II"};

		
}