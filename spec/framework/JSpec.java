package framework;
import java.util.ArrayList;
import java.util.List;

public abstract class JSpec {

	Class<?> clazz;

	List<Spec> specs = new ArrayList<Spec>();

	public void describe( Class<?> clazz ) {
		this.clazz = clazz;
	}

	public void add( Spec spec ) {
		spec.doIt();
		specs.add( spec );
	}

	public void exec() {
		System.out.println( clazz.getSimpleName() + " specifications: " );
		for (Spec spec : specs) {
			System.out.println( "\t" + spec.text + "... " + format_result( spec ) );
		}
	}

	private String format_result( Spec spec ) {
		return spec.result ? "ok!" : "FAIL!";
	}

}
