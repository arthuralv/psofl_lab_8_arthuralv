package lab8;

public class FormatterUpper implements FormatterStrategy{
	public String formatString(String text) {
		return text.toUpperCase();
	}
}
