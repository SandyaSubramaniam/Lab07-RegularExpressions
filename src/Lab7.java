import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String namePrompt = "Please enter a valid Name: ";

		String emailPrompt = "Please enter a valid email: ";

		String phonePrompt = "Please enter a valid phone number: ";

		String datePrompt = "Please enter a valid date: ";

		String htmlPrompt = "Please enter a HTML element to validate: ";

		String nameRegex = ("[A-Z][a-z]{1,29}");

		String nameType = "Name";

		String emailType = "Email";

		String dateType = "Date";

		String phoneType = "Phone";

		String htmlType = "HTML element";

		String emailRegex = ("[a-zA-Z0-9]{5,30}@[a-zA-Z0-9]{5,10}.[a-zA-Z0-9]{1,3}");

		String dateRegex = ("(?:(?:31(\\/)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})");

		String phoneRegex = ("\\(\\d{3}\\)-\\d{3}-\\d{4}");

		String htmlRegex = ("<(\"[^\"]*\"|'[^']*'|[^'\">])*>(.*<(\"[^\"]*\"|'[^']*'|[^'\">])*>)?");

		getStringMatchingRegex(scnr, namePrompt, nameRegex, nameType);
		getStringMatchingRegex(scnr, emailPrompt, emailRegex, emailType);
		getStringMatchingRegex(scnr, datePrompt, dateRegex, dateType);
		getStringMatchingRegex(scnr, phonePrompt, phoneRegex, phoneType);
		getStringMatchingRegex(scnr, htmlPrompt, htmlRegex, htmlType);

	}

	public static String getString(Scanner scnr, String prompt) {
		System.out.print(prompt);
		return scnr.nextLine();
	}

	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex, String type) {

		boolean isValid = false;
		String input;

		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				System.out.println(type + " is valid!");
				isValid = true;
			} else {
				System.out.println("Sorry, " + type + " is not valid!");
				isValid = false;
			}

		} while (!isValid);
		return (input);

	}

}
