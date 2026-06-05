public class replace {
	public static void main(String[] args){
	String letter = "Dear <|name|>, Thanks a lot!";
	letter = letter.replace("<|name|>", "Name");
	System.out.println(letter);
    }
}
