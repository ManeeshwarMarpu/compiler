package visitor;
import java.util.*;

public class Maps{

	public static HashMap varhm;
	public static HashMap fnhm;
	public static ArrayList clsdec;
	public static HashMap clextd;
	public static HashMap fnparamhm;

	public static void Init(){
		varhm = new HashMap<String,String>();
		fnhm = new HashMap<String,String>();
		clsdec = new ArrayList<String>();
		clextd = new HashMap<String,String>();
		fnparamhm = new HashMap<String,String>();
	}

	public HashMap<String,String> AssVar(){
		return varhm;
	}

	public HashMap<String,String> AssFn(){
		return fnhm;
	}

	public ArrayList<String> AssCls(){
		return clsdec;
	}

	public HashMap<String,String> AssClExtd(){
		return clextd;
	}

	public HashMap<String,String> AssFnparam(){
		return fnparamhm;
	}

}
