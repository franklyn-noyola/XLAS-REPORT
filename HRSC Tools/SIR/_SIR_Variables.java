package SIR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class _SIR_Variables {
	public static WebDriver driver = new InternetExplorerDriver();
	public static int Sel;	
	public static String eFormSelection;
	public static String baseUrl = "https://sirtest.gmehr.acs.gm.com/"; 
	public static String parentHandle = driver.getWindowHandle();
	public static String[] CountrySel;
	
	
	
//Windows Credentials
	public static String username = "Super.User1";
	public static String password = "demo.4321";
	public static String UserName					=	"username";
	public static String Password					=	"password";
	public static String GMIN						=	"SetMap2";
	public static String Login						= 	"button1";
	public static String Accept						= 	"accept";
	public static String Submit 					= 	"submit";
	public static String LookUP 					= 	"Employee Lookup";
	public static String CreationDateFrom			=	"FROM_SetMap12";
	public static String CreationDateTo				= 	"TO_SetMap12";
	public static String CountryF					=	"SetMap13";
	public static String DocType					=	"SetMap22";
	public static String FormType					=	"SetMap11";
	public static String Reject						=	"SetMap16";
	
	
//COUNTRIES LIST
public static String[] ListOfCountry					= new String[] {"GB","ES", "DE","BE",
																"FR","PL","PT","AT"};
public static String[] EnMonth					= new String[] 	{"January", "February", "March", "April", "May","June","July","August","September","October", "November", "December"};

public static String[]RejectOP							= new String[] {"All", "Yes", "No"};


public static String[]BEeForms						= new String[] {"All", "Aanpassing bankrekening"};

public static String[]ESeForms							= new String[]  {"All", "Datos bancarios","Acciones disciplinarias","Actualización de formación personal", "Cambio datos de contacto en caso de emergencia",
			  															  "Cambio de datos de formación", "Cambio de datos personales/Solicitud de certificados", 
			  															  "Cambio de departamento hourly", "Cambio de turno", "Cambio de turno salaried fuera de convenio","Cambio retención IRPF",
			  															  "Cancelación/Sustitución","Contratación/Recontratación", "Desvinculación","Dieta de comida/Ayuda a disminuidos", 
			  															  "Entrevista de Salida","Lista de espera","Matriculación","Modificaciones en el contrato de trabajo",
			  															  "Pagos/Descuentos","Pensión alimenticia","Plus transporte propio","Pluses","Préstamo vivienda",
			  															  "Promoción/reclasificación y cambio de dept./holding","Reincorporación","Seguimiento de activos",
			  															  "Solicitud de anticipo","Solicitud de ayuda a disminuidos","Solicitud de excedencia",
			  															  "Solicitud reducción jornada/turno fijo por estudios","Trabajos de superior categoría: Hourly/Salaried a Salaried"};
		
		
//UK eForms Names
public static String[]UKeForms							= new String[] {"All", "Bank Details Change Form", "Grievance Form","Department Transfer","Address Marital Status Form","HR Pension Form",
																		"Defined Benefit Pension Plan Form","Defined Contribution Pension Plan Form",
																		"Maternity Leave Form", "Disciplinary Attendance Control Form",
																		"AVC Pension Form","Recurring One Off Payment Form", "Repayment Form", "Self Certification Form",
																		"New Hire Form", "Termination Form", "Recurring One Off Deduction Form", 
																		"Miscellaneous Deductions Form form", "IBC Return To Work Form","EP Return To Work Form",
																		"Pay Change Form","WHouse Interview Return To Work Form",
																		"Qualification Form","Salary Department Change Form","Promotion Status Change Form",
																		"Intercompany Transfer Form","Asset Tracking Form"};
		
	public static String[]DEeForms						= new String[] {"All", "Werkswechsel","Eintritt","Änderung - Entgelt, Tätigkeit u. Versetzung",
																		"Änderung - Entgelt, Tätigkeit"};	
		
}