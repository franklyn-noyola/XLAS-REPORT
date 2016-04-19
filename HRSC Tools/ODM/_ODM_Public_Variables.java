package ODM;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class _ODM_Public_Variables {
	public static WebDriver driver = new InternetExplorerDriver();
	public static String baseUrl = "https://odmtest.gmehr.acs.gm.com/";
	public static String Selection;
	public static boolean InvalidYear;
	public static boolean InvalidDate;
	public static String LANG;
	public static String DateToSearch;
	public static String DayToSearch; 
	public static String YearToSearch;
	public static String Sel;
	public static String GMINID;
	public static boolean InvalidGMIN; 
	public static String MonthToSearch; 
	public static String MonthSel; 
	public static String[] CountrySel;
	public static boolean Close;  
	public static boolean Complete;   
	public static String Form;
	public static int FS;  
	public static int DEP;  
	public static String Routable;  
	public static String eFormSelection;
	public static String QueueFound;
	public static String AllDate;
	public static boolean AssertDate;
	public static String DocReturns;
	public static String NotFoundText;
	
//LOGIN Fields
	public static String Usarname					=	"txtUsername";
	public static String Password					=	"txtPassword";
	public static String Login						=	"btnLogin";
	public static String Accept						=	"chkAccept";
	public static String Submit						=	"btnSubmit";	

public static String[] RouteAction					= new String[] {"To Resolution", "Approve", "Reject", "RouteToBuild", "Pending", "Peer Review", "Completed", "Duplicate RouteToBuild"};
	
//Doc Search fields
	public static String Search						=	"btnSearch";
	public static String DCN						=	"DCN";
	public static String DocSubType					=	"Doc_SubType";
	public static String WorkGroup					=	"Doc_Class";
	public static String DocType					=	"Doc_Type";
	public static String StartLoadDate				=	"_Calendar1B";
	public static String ClearStartLoadDate			=   "//a[@onclick='document.frm.InvoiceDtFrom.value']";
	public static String EndLoadDate				=	"_Calendar2B";
	public static String ClearEndLoadDate			=   "//a[@onclick='document.frm.InvoiceDtTo.value']";
	public static String StartEffectiveDate			=	"_Calendar3B";
	public static String ClearStartEffectiveDate	=   "//a[@onclick='document.frm.Index_Field1_From.value']";
	public static String EndEffectiveDate			=	"_Calendar4";
	public static String ClearEndEffectiveDate		=   "//a[@onclick='document.frm.Index_Field1_To.value']";
	public static String ScanID						=	"Index_Field2";
	public static String GMIN						=	"Index_Field3";
	public static String First_Name					=	"Index_Field4";
	public static String Last_Name					=	"Index_Field5";
	public static String Language					=	"Index_Field6";
	public static String MCP2_DCN					=	"Index_Field7";


//Department Country Values
	public static String[] Departments 				= new String[] {"8000",							//AUSTRIA
																  "5000",							//Belgium
																  "3000",							//France
																  "6000",							//Germany
																  "7000",							//Poland
																  "4000",							//Portugal
																  "1000",							//UK
																  "2000"};							//Spain
	

	//WorkGroup Country HR Values
	public static String[] HR						= new String[] {"GAT","GBE","GFR","GDE","GPL","GPT","GUK","GES"};
	
//General Queue buttons
	public static String CloseButton				=	"btnSkip";
	public static String AddNotes					=	"btnAddNotes";
	public static String ModifyDocType				=	"btnModifyDocType";
	public static String UnLink						=	"btnComplete";					//Resolution Queue
	public static String Route						=	"btnComplete";					//Pending Queue
	public static String Completed					=	"btnComplete";					//Data Entry Queue
	public static String UpdateForm					=	"btnSubmit";					//Update Routable Form

	
//Resolution and Pending Queue Buttons
	public static String RouteToBuild				=	"btnCustomAction1";
	public static String Reject						=	"btnCustomAction2";
	public static String R_Pending					=	"btnCustomAction3";

//PeerCheck Queue Buttons
	public static String PeerReview				=	"btnCustomAction1";
	public static String P_Pending					=	"btnCustomAction2";
	
//Approver Queue Buttons
	public static String Approve					=	"btnComplete";
	public static String Reject_Approve				=	"btnReject";
	public static String Indexer_Error				=	"btnCustomAction1";
	
	
	
//UK Routable Form
	public static String[] UKRoutable				= new String[] {"T01208 Defined Contribution Pension Plan Form","T01209 HR Pension Form","T01210 Defined Benefit Pension Plan Form",
															"T00002 Bank Details Change Form","T00009 Maternity Leave Form","T00010 Disciplinary/Attendance Control","T00013 AVC Pension Form",
															"T00014 Recurring/One Off Payment Form","T00017 Repayment Form","T00020 Self Certification Sickness Form","T00027 Grievance Form",
															"T00160 New Hire/Rehire Form","T00162 Termination Form","T00222 Millbrook Return to Work Interview","T00231 Recurring/One Off Deductions Form",
															"T00234 Miscellaneous Deductions Form", "T00243 IBC Return to Work Interview","T00244 EP Return to Work Interview","T00266 Pay Change",
															"T00278 W/House Return to Work Interview","T00287 Emergency Contact Details Form","T00288 Address/Marital Status Change","T00289 Qualification Change Form",
															"T00291 Salary Change & Dept Transfer","T00305 Promotion/Status Change","T00453 Department Transfer","T00465 Intercompany Transfer Form",
															"T00674 Asset Tracking Form"};
//AT Routable Form
	public static String[] ATRoutable				= new String[] {"T00402 Notfall-Kontakt","T00406 Fehlerkorrektur","T00454 Änderung - Bankverbindung",
															"T00750 Änderung - Qualifikation","T00751 Einmalzahlung","T00759 Änderung - Persönliche Daten",
															"T00766 Austritt","T00784 Neueinstellung/Wiedereintritt","T00792 Altersteilzeit","T00813 Unbezahlte Abwesenheit / Rückkehr",
															"T00829 Änderung - Ummeldung","T00918 Änderung - LohnGehalt","T00921 Änderung - Schicht",
															"T00984 Firmeneigentum","T00986 Anmeldung","T00987 Externen Benutzer hinzufügen","T00988 Stornierung/Neubesetzung",
															"T00989 Änderung der Funktion und Zugriffsberechtigung","T00990 Warteliste","T00991 Aktualisierung des persönlichen Trainingspl"};
//FR Routable Form
	public static String[] FRRoutable				= new String[] {"T00089 Embauche/Réembauche","T00090 Changement coord. bancaires","T00163 Désubrogation (GMS)","T00164 Retenue sur Salaire",
															"T00165 Demande d'acompte","T00166 Prêt CE (GMF)","T00167 Changement situation familiale / naissance","T00169 Saisie-arrêt / Pension alimentaire",
															"T00242 Reprise d’activité (susp/reprise longue maladie)","T00247 Renouvellement période dessai","T00254 Suivi des objets en prêt","T00255 Prolongation CDD / Stage",
															"T00257 Changement temps plein / partiel","T00261 Correction paie","T00296 Prime d'astreinte (GMS)","T00297 Prime d'endurance (GMS)","T00298 Prime panier jour sécurité (GMS)",
															"T00301 Changement de cycle / équipe (GMS)","T00302 Avantage en nature","T00304 Reconnaissance inval/incap/hand.","T00307 Indem. temps de voyage (GMS)","T00342 Changement de niveau de formation",
															"T00349 Prime animateur (GMS)","T00350 Prime individuelle","T00362 Changement de salaire/titre (GMS)","T00363 Changement données contractuelles","T00364 Changement contact durgence",
															"T00388 Mi-temps thérapeutique","T00410 CET Ouverture (GMS)","T00411 CET Alimentation (GMS)","T00422 Changement d'adresse","T00468 Départ","T00473 Indemnités de transport (GMF)",
															"T00493 Relevé des heures supplémentaires","T00498 Mesures disciplinaires","T00527 Chang. nationalité / Renouvellement titre séjour","T00528 Régularisation d’absence (GMF)","T00536 Changement de département (GMS)",
															"T00538 Mutation interne (GMS)","T00542 Demande de congés (GMF)","T00554 CET Cessation / Monetisation (GMS)","T00576 Demande de congés spéciaux","T01182 Relevé temps de voyage / HS (GMS)","T01192 Demande de congés (GMS)",
															"T01193 Régularisation d'absence (GMS)","T01194 Monétisation jours CET(GMF)"};
//Germany Routable Form
	public static String[] DERoutable				= new String[] {"T00438 Änderung - Bankverbindung","T00446 Änderung - Krankenkasse","T00449 Notfallkontakt", "T00451 Austritt","T00460 Wehr- und Zivildienst","T00475 Antrag Bildungsurlaub", "T00491 Antrag Nebenbeschäftigung","T00531 Elternzeit",
															"T00775 Ergänzende Zahlungen", "T00776 Wiederkehrende Be-/Abzüge", "T00789 Altersteilzeit (ATZ)","T00854 Änderung - Adresse und Staatsangehörigkeit","T00877 Firmeneigentum","T00887 Mutterschaft","T00890 Eintritt","T00936 Anmeldung",
															"T00941 Aktualisierung des persönlichen Trainingsplans","T00951 Warteliste","T00956 Stornierung/Neubesetzung","T00969 Änderung der Funktion und Zugriffsberechtigung", "T00970 Externen Benutzer hinzufügen", "T00976 Änderung - Angaben zur Familie",
															"T00978 Schwerbehinderung","T00979 Änderung - Schul- und Berufsausbildung", "T00993 Änderung - Qualifikation","T00994 Antrag auf Freistellung zur Weiterbildung", "T00996 Altersvermögenswirksame Leistungen","T01015 Zusätzliche persönliche Altersversorgung",
															"T01020 Änderung - Entgelt, Tätigkeit u. Versetzung","T01023 Änderung - Entgelt, Tätigkeit","T01030 Kostenerstattung Eintritt","T01032 Werkswechsel","T01186 Personalprogramme","T01188 Eintritt - Prak/Dipl/Dok/Azubi Rüsselsheim","T01189 Aktualisierung des Vorgesetzten"};
//Spain Routable Form
	public static String[] ESRoutable				= new String[] {"T00717 Datos bancarios","T00268 Cambio retención IRPF","T00712 Contratación/Recontratación", "T00716 Seguimiento de activos",
															"T00718 Cambio de datos personales/Solicitud de certificados","T00727 Solicitud de excedencia",
															"T00728 Trabajos de superior categoría: Hourly/Salaried a Salaried","T00729 Solicitud de anticipo","T00739 Acciones disciplinarias",
															"T00742 Desvinculación","T00745 Dieta de comida/Ayuda a disminuidos","T00746 Solicitud de ayuda a disminuidos","T00786 Plus transporte propio",
															"T00788 Pluses","T00793 Entrevista de Salida","T00834 Cambio datos de contacto en caso de emergencia","T00933 Cancelación/Sustitución",
															"T00937 Matriculación","T00942 Actualización de formación personal","T00952 Lista de espera","T00971 Agregar usuario externo",
															"T00972 Cambio de role y accesos","T00975 Cambio de datos de formación","T00997 Préstamo vivienda","T01098 Solicitud reducción jornada/turno fijo por estudios",
															"T01102 Cambio de departamento hourly","T01103 Cambio de turno","T01104 Cambio de turno salaried fuera de convenio","T01105 Pensión alimenticia",
															"T01112 Promoción/reclasificación y cambio de dept.","T01115 Modificaciones en el contrato de trabajo","T01117 Pagos/Descuentos",
															"T01137 Promoción/reclasificación hourly","T01166 Reincorporación"};
//Portugal Routable Form
	public static String[] PTRoutable				= new String[] {"T00196 Confirmação de dados bancários","T00197 Contacto de emergência","T00267 Promoções","T00273 Bens atribuídos ao empregado","T00282 Alteração de dados pessoais","T00332 Estatuto/Sub. Trab. Estudante","T00334 Ajustes e aumentos salário","T00335 Descontos","T00359 Pedido de declaração",
															"T00360 Saída da Empresa I","T00365 Pagamentos","T00377 Promoções Cont./Enquadramentos","T00404 Pagamento suplementar de reforma","T00433 Admissão Hourly","T00466 Dados de familiares","T00471 Alteração C. Custo/Horário","T00490 Prorrogação Compl. Doença","T00574 Alteração de departamento","T00647 Saída da Empresa II",
															"T00702 Bens da Empresa","T00764 Entrevista de Saída","T00847 Admissão Salaried","T00900 Cancelamento/Substituição","T00903 Inscrição","T00905 Actualização Ind. do Registo de Formação","T00906 Mudança de Função e de Acesso","T00908 Lista de Espera","T00909 Adicione Utilizador Externo",
															"T01200 Ausência prolongada / Regresso ao trabalho"};
//Poland Routable Form
	public static String[] PLRoutable				= new String[] {"T00911 Aktualizacja historii szkolenia","T00913 Anulowanie/Zastąpienie","T00914 Zapisanie na szkolenie","T00915 Lista rezerwowa","T00973 Dodanie osoby spoza firmy do szkolenia","T00974 Zmiana roli i prawa dostępu","T01124 Zmiana danych adresowych","T01126 Rejestracja Pracownika","T01136 Przedmioty wydane Pracownikowi",
															"T01142 Poprzedni Pracodawca", "T01143 Wykształcenie i znajomość języków","T01145 Stan rodzinny","T01146 Zmiana stanu cywilnego/ Dokumentów tożsamości","T01151 Zmiana statusu Pracownika","T01152 Zmiana lokalizacji płacowej","T01153 Ubezpieczenie społeczne/ Urząd Skarbowy","T01156 Korekta listy płac","T01158 Akcja korygująca",
															"T01162 Kontakt w nagłych przypadkach","T01167 Płatność jednorazowa/ miesięczna","T01170 Rejestracja Zleceniobiorcy","T01171 Wynagrodzenie Zleceniobiorcy","T01172 Ustanie stosunku cywilnoprawnego","T01174 Konto bankowe","T01175 Ustanie stosunku pracy","T01190 Aktualizacja listy pracowników"};
//Belgium Routable Form
public static String[] BelgiumNL			= new String[] {"T00619 Evaluatie PMB","T00623 Uit dienst","T00625 Vervanging leidinggevende","T00626 Vervangingen",
														"T00631 Jobinfo PUB","T00639 Aanwerving PUB","T00641 Tijdskrediet","T00649 Jobinfo PUB transfer",
														"T00655 Aanwerving PMB","T00670 Jobinfo PMB","T00684 Aanvraag Spot&Wax premie","T00705 Uit dienst gesprek",
														"T00719 Aanpassing bankrekening","T00720 Aanvraag educatief verlof","T00721 Aanvraag eenmalige betaling",
														"T00722 Personen ten laste","T00723 Wijziging adres","T00724 Wijziging burgerlijke staat","T00725 Wijziging contactpersoon bij noodgevallen",
														"T00726 Wijziging persoonlijke gegevens","T00876 Activa tracking","T00925 Annulering/Vervanging",
														"T00934 Inschrijving","T00939 Persoonlijk opleidingsplan aanvullen","T00949 Wachtlijst",
														"T00963 Een externe gebruiker toevoegen","T00964 Verandering van rol en toegang","T01173 Uit dienst BP/MP",
														"T01179 Salarisvoorschot"};

public static String[] BelgiumEN			= new String[] {"T00719 Change bank details","T00619 Performance Appraisal Salaried",
														"T00623 Termination","T00625 Replacement of a supervisor","T00626 Replacements",
														"T00631 Job information change hourly","T00639 New Hire/Rehire hourly","T00641 Work time reduction",
														"T00649 Job information change hourly transfer","T00655 New Hire/Rehire","T00670 Job information",
														"T00684 Request for Spot & Wax premium","T00705 Exit Interview","T00720 Request for educational leave",
														"T00721 Request for one off payment","T00722 Dependant Information","T00723 Address change",
														"T00724 Marital status change","T00725 Emergency contact details change","T00726 Personal information change",
														"T00876 Asset tracking","T00925 Cancellation/replacement","T00934 Enrolment","T00939 Personal training record update",
														"T00949 Wait list","T00963 Add an external user","T00964 Role and domain change","T01173 Termination BP/MP","T01179 Salary advance"};

public static String[] C_RouteToBuild			= new String[]	{"Route to Build","Procesar Doc","Weiter","Załącz i Prześlij","Faire Suivre", "Route To Build"};

public static String[] EnMonth					= new String[] 	{"January", "February", "March", "April", "May","June","July","August","September","October", "November", "December"};
public static String[] FrMonth					= new String[]  {"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
public static String[] EsMonth					= new String[] 	{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
public static String[] NlMonth					= new String[]  {"JAN","FEB","MAA","APR","MEI","JUN","JUL","AUG","SEP","OKT","NOV","DEC"};
public static String[] DeMonth					= new String[] 	{"Januar","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
public static String[] PtMonth					= new String[] 	{"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
public static String[] PlMonth					= new String[] 	{"Styczeń","Luty","Marzec","Kwiecień","Maj","Czerwiec","Lipiec","Sierpień","Wrzesień","Październik","Listopad","Grudzień"};
public static String[] Reject_B				= new String[] 	{"Reject", "Rechazar","Ablehnen","Rejeitar","Afwijzen","Odrzuć","Rejeter"};
public static String[] Pending_B				= new String[]	{"Pending", "Suspender", "Unterbrechen","Uitstellen","Oczekujące","Interrompre"};

@Test		
public void Execute() throws Exception{
 	 driver.close();
 	 JOptionPane.showMessageDialog(null,"Sorry. This cannot be executed. This is for Configuration and Variables callouts ", "ERROR", JOptionPane.ERROR_MESSAGE);
 	 driver.quit();
 	 return;
 	 
 }



}
	


