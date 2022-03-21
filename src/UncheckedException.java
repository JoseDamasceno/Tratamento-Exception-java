import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {

		boolean Looping = true;
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");

			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				System.out.println("Resultado: " + resultado);
				Looping = false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
			} catch (ArithmeticException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
			} 
			finally {
				
				System.out.println("Chegou no finally!");
			}
		} while (Looping);

	}

	public static int dividir(int a, int b) {
		return a / b;
	}

}
