package lab8;

public class FormatterLower implements FormatterStrategy{
	public String formatString(String text) {
		return text.toLowerCase();
	}
}
