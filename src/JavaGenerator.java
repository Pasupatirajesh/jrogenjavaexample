import net.ugolok.generation.annotations.Generate;
import net.ugolok.generation.annotations.Generator;
import net.ugolok.generation.providers.FileStringProvider;
import net.ugolok.generation.providers.IntegerProvider;

@Generator
public class JavaGenerator {

	    public static final int N_JOBS = 20;
	    public static final int N_JOBID = 1, M_JOBID = 100;

	    @Generate(provider = FileStringProvider.class, source = "isr-names.dta")
	    String jobName;

	    @Generate(provider = IntegerProvider.class, min=N_JOBID, max=M_JOBID,
	    unique = true, quantity = N_JOBS)
	    int jobid;

	    @Generate(provider = FileStringProvider.class, source = "isr-cities.dta")
	    String location;



	    public Jobs getJobs(){
	        return new Jobs(jobName, jobid, location);
	    }


}
