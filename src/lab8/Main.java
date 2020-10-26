package lab8;

import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o texto que deseja formatar: ");
		String text = scan.nextLine();
		menu();
		int opcao = scan.nextInt();
		FormatterType tipoFormato = FormatterType.values()[opcao - 1];

		FormatterStrategy formatter = tipoFormato.getFormatter();
		System.out.println(formatter.formatString(text));
	}

	public static void menu() {
		System.out.println("Digite o tipo de formatação: "
		+ System.lineSeparator() + "(1) Caixa alta"
		+ System.lineSeparator() + "(2) Caixa baixa"
		+ System.lineSeparator() + "(3) Negrito"
		+ System.lineSeparator() + "(4) Italico");
	}

}
