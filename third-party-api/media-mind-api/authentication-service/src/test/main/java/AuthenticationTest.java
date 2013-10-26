import org.junit.Test;

import com.eyeblaster.api.AuthenticationService;
import com.eyeblaster.api.IAuthenticationService;


public class AuthenticationTest {

	@Test
	public  void authenticationTest() {
		AuthenticationService stub = new AuthenticationService();
		IAuthenticationService clientLogin = stub.getAuthenticationServiceBinding();

		String securityToken = clientLogin.clientLogin("22SQ.API", "Password01", "1a8a4001-9a02-4298-a70c-d72375b82976");
		System.out.println(securityToken);
	}

}
