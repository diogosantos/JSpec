package framework;
public abstract class Spec {

	String text;

	boolean result;

	public Spec( String text ) {
		this.text = text;
	}

	public void should( boolean expression ) {
		result = expression;
	}

	public abstract void doIt();

}
