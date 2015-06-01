import com.craam.wellington.interfaces.IInput;
import com.craam.wellington.interfaces.IOutput;
import com.craam.wellington.isrcsr.ISRCSR;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;

import com.craam.wellington.statics.Constants;
import com.craam.wellington.synclab.SyncLab;
import com.craam.wellington.synclab.io.CSVOutput;
import com.craam.wellington.synclab.io.InputData;
import com.craam.wellington.synclab.io.ManualInput;
import com.craam.wellington.utils.*;

public class Sandbox {

	public static void main(String[] args) {
		
		IOutput syncLabOutput = new CSVOutput("synclab-gaus.txt");
		IInput<InputData> syncLabInput = new ManualInput(new HashMap<String, Double>(){{
			put("bmag", 1000.);
			put("ne", 8e8);
			put("tp", 1e-12);
			put("ek", 125.);
			put("kf", 801.);
			put("ny", 200.);
			put("xnisr", 0.0);
			}});
		
		SyncLab syncLab = new SyncLab(syncLabInput, syncLabOutput);
	}

}
