package com.Singleton_Design_Pattern;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Model.Admin_functions;
import com.Page_Object_Model.Callbacks;
import com.Page_Object_Model.Client_dashboard;
import com.Page_Object_Model.Counselling_consent;
import com.Page_Object_Model.External_Login;
import com.Page_Object_Model.LARC;
import com.Page_Object_Model.Permissions_msi_staff;
import com.Page_Object_Model.QB;
import com.Page_Object_Model.QB2_makesh;
import com.Page_Object_Model.QB_Page;
import com.Page_Object_Model.TOP_Reference_code;
import com.Page_Object_Model.Security_Page;
import com.Page_Object_Model.Setting_Update;
import com.Page_Object_Model.Signup_Page;
import com.Page_Object_Model.TOP_Page;
import com.Page_Object_Model.TOP_step1;
import com.Page_Object_Model.TOP_step2;
import com.Page_Object_Model.TOP_step3;
import com.Page_Object_Model.TOP_step4;
import com.Page_Object_Model.Top_user_edithistory;
import com.Page_Object_Model.Triage_Page;
import com.Page_Object_Model.Upload_Page;
import com.Page_Object_Model.User_creation;
import com.Page_Object_Model.Usereditinfo;
import com.Page_Object_Model.VAS_Page;

public class Singleton_Design_Pattern {
	public WebDriver driver;

	private TOP_Reference_code reference;
	private External_Login external_Login;
	private QB qb;
	private QB_Page Ques_page;
	private Signup_Page sign_page;
	private TOP_Page top_page;
	private VAS_Page vas_page;
	private LARC larc_page;
	private Security_Page secu_page;
	private Triage_Page triage_page;
	private Upload_Page upload_page;
	private Top_user_edithistory topedithistory;
	private Usereditinfo useredit;
	private Callbacks callback;
	private Permissions_msi_staff permissionmsistaff;
	private QB2_makesh qb2;
	private Admin_functions admin_Func;
	private Client_dashboard client_dash;
	private TOP_step1 step1_topEligibility;
	private TOP_step2 step2_Top;
	private TOP_step3 step3_Top;
	private TOP_step4 step4_Top;
	private Counselling_consent coun_Consent;
	private Setting_Update setting_update;
	private User_creation user_creation;

	public TOP_Reference_code getreference() {
		reference = new TOP_Reference_code();
		return reference;
	}
	
	public QB2_makesh getQb2() {
		qb2 = new QB2_makesh();
		return qb2;
	}

	public User_creation getuser_creation() {
		user_creation = new User_creation();
		return user_creation;
	}

	public Setting_Update getSetting_Update() {
		setting_update = new Setting_Update();
		return setting_update;
	}

	public Admin_functions getInstanceAdmin_Func() {
		admin_Func = new Admin_functions();
		return admin_Func;
	}

	public Client_dashboard getInstanceClient_dash() {
		client_dash = new Client_dashboard();
		return client_dash;
	}

	public TOP_step1 getInstanceStep1_topEligibility() {
		step1_topEligibility = new TOP_step1();
		return step1_topEligibility;
	}

	public TOP_step2 getInstanceStep2_Top() {
		step2_Top = new TOP_step2();
		return step2_Top;
	}

	public TOP_step3 getInstanceStep3_Top() {
		step3_Top = new TOP_step3();
		return step3_Top;
	}

	public TOP_step4 getInstanceStep4_Top() {
		step4_Top = new TOP_step4();
		return step4_Top;
	}

	public Counselling_consent getInstanceCoun_Consent() {
		coun_Consent = new Counselling_consent();
		return coun_Consent;
	}

	public Top_user_edithistory gettopedithistory() {
		topedithistory = new Top_user_edithistory();
		return topedithistory;
	}

	public Usereditinfo getuseredit() {
		useredit = new Usereditinfo();
		return useredit;

	}

	public Callbacks getcallback() {
		callback = new Callbacks();
		return callback;

	}

	public Permissions_msi_staff getpermissionmsistaff() {
		permissionmsistaff = new Permissions_msi_staff();
		return permissionmsistaff;
	}

	public QB_Page getQuesPage() {
		Ques_page = new QB_Page();
		return Ques_page;
	}

	public Signup_Page getsignPage() {
		sign_page = new Signup_Page();
		return sign_page;
	}

	public TOP_Page gettop_page() {
		top_page = new TOP_Page();
		return top_page;
	}

	public VAS_Page getvas_page() {
		vas_page = new VAS_Page();
		return vas_page;

	}

	public LARC getlarc_page() {
		larc_page = new LARC();
		return larc_page;

	}

	public Security_Page getsecuPage() {
		secu_page = new Security_Page();
		return secu_page;

	}

	public Triage_Page gettriPage() {
		triage_page = new Triage_Page();
		return triage_page;
	}

	public Upload_Page getuploadPage() {
		upload_page = new Upload_Page();
		return upload_page;
	}

	public External_Login getExternal_Login() {
		external_Login = new External_Login();
		return external_Login;
	}

	public QB getQb() {
		qb = new QB();
		return qb;
	}

}
