import java.io.IOException;
import java.io.PrintWriter;

import com.bcode.test.mustache.model.utils.FamilleUtils;
import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

/**
 * 
 */

/**
 * @author vickrame
 *
 */
public class JMustache {

	
	public static void main(String [] args){
		

//		f.setNom("UJOODHA");
		
//		MustacheFactory mf = new DefaultMustacheFactory();
//	    Mustache mustache = mf.compile("famille.mustache");
	    
//	    BufferedWriter buffer = null;
	    try {
//	    	System.out.println(mustache.toString());
	    	
//	    	File file = new File("c:\\Dev\\file1.txt");
	    	 
			// if file doesnt exists, then create it
//			if (!file.exists()) {
//				file.createNewFile();
//			}
			
			
//	    	buffer =new BufferedWriter(new FileWriter(file));
//			buffer.write("GO");	    	
//			mustache.execute(buffer, new Famille());
			
//			buffer.write("fin");
//			buffer.flush();
		    MustacheFactory mf = new DefaultMustacheFactory();
//		    Mustache mustache = mf.compile("template.mustache");
		    Mustache mustache = mf.compile("famille.mustache");
	    	System.out.println("avant transformation");
		    mustache.execute(new PrintWriter(System.out), new FamilleUtils()).flush();
		    System.out.println("après transformation");
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			try {
//				buffer.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
