
interface loginInterface{
	public void test();

}

class In  implements loginInterface {
	String username;
	String password;

	private String correctUsername = "dyahkw";
	private String correctPassword = "dyah";

	public In ( String username, String password ){
		this.username = username;
		this.password = password;
	}

	public void test(){
	
		System.out.println(" Username = ");
	if(this.username == this.correctUsername){
		System.out.println(" Username Sesuai \n ");
	}else{
		System.out.println(" Username tidak sesuai \n ");
	}
		System.out.println(" Login = ");
	if(this.password == this.correctPassword){
		System.out.println(" Login Berhasil \n ");
	}else{
		System.out.println(" Login gagal \n  ");
	}}}

public class Login{
	public static void main(String[] args) {
		String username = "dyahkw";
		String password = "dyah";
		In IN = new In(username,password);
		IN.test();
	}
}
