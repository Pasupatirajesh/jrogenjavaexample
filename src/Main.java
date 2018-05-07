import java.util.Iterator;

import javax.naming.ConfigurationException;

import net.ugolok.generation.JROFactory;

public class Main {
public static void main(String[] args) {
		
	 Iterator<JavaGenerator> iterator;
	try {
		iterator = JROFactory.create(JavaGenerator.class).iterator();
		 while (iterator.hasNext()){

	         Jobs j = iterator.next().getJobs();
	         System.out.printf(j.getJobName()+"");
	         System.out.println();
	         
	     }
			
		
	} catch (ConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    
}
}
