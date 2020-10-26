package lab8;

public class FormatterItalic implements FormatterStrategy{
	public String formatString(String text) {
		return "\033[3m" + text +"\033[0m";
	}
}
