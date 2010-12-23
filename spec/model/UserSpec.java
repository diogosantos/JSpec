package model;

import model.User;
import framework.JSpec;
import framework.Spec;

public class UserSpec extends JSpec {

	public UserSpec() {
		describe( User.class );

		add( new Spec( "it should have a name" ) {
			public void doIt() {
				User user = new User();
				user.name = "Diogo";

				should( user.name.equals( "Diogo" ) );
			}
		} );

		add( new Spec( "it should have a surname" ) {
			public void doIt() {
				User user = new User();
				user.surname = "Santos";

				should( user.surname.equals( "Santos" ) );
			}
		} );

		add( new Spec( "it should say his complete name" ) {
			public void doIt() {
				User user = new User();
				user.name = "Diogo";
				user.surname = "Santos";

				should( user.completeName().equals( "Diogo Santos" ) );
			}
		} );

	}

}
