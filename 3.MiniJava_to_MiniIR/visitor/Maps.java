package visitor;
import java.util.*;

public class Maps{

	public static HashMap<String,ArrayList<String>> clstruct;
	public static HashMap<String,ArrayList<String>> fn_paramlist;
	public static HashMap<String,Integer> fnparam;
	public static HashMap<String,String> cycExtd;
	public static HashMap<String,String> var_type;
	public static HashMap<String,String> fn_type;
	public static ArrayList<String> ext_classes;
	public static HashMap<String,ArrayList<String>> fn_param_types;
	//public static HashMap<String,Integer> arr_size;

	public static void Init_cyc(){
		cycExtd = new HashMap<String,String>();
		fn_param_types = new HashMap<String,ArrayList<String>>();
	}

	public static void Init(){
		var_type = new HashMap<String,String>();
		fn_type = new HashMap<String,String>();
		clstruct = new HashMap<String,ArrayList<String>>();
		fnparam = new HashMap<String,Integer>();
		fn_paramlist = new HashMap<String,ArrayList<String>>();
		ext_classes = new ArrayList<String>();
		//arr_size = new HashMap<String,Integer>();
	}

	public HashMap<String,ArrayList<String>> Assfnpty(){
		return fn_param_types;
	}

	public HashMap<String,ArrayList<String>> AssCls(){
		return clstruct;
	}

	public HashMap<String,ArrayList<String>> AssFnpList(){
		return fn_paramlist;
	}

	public HashMap<String,Integer> AssFnp(){
		return fnparam;
	}

	public HashMap<String,String> AssCyc(){
		return cycExtd;
	}
	
	public HashMap<String,String> AssVart(){
		return var_type;
	}

	public HashMap<String,String> AssFnt(){
		return fn_type;
	}

	public ArrayList<String> AssextCls(){
		return ext_classes;
	}
}
