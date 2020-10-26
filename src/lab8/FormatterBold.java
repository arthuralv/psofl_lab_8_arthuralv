package lab8;

public class FormatterBold implements FormatterStrategy{
	public String formatString(String text) {
		return "\033[1m" + text +"\033[1m";
	}

}
