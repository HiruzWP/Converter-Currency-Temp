import javax.swing.JOptionPane;

public class CurrencyConverter {
	
	public void ConverterRealToDollar(String valorString) {
		//converte de String para Double.
		double valor = Double.parseDouble(valorString);
		
		double Currency = valor / 5.15;
		Currency = (double) Math.round(Currency * 100d) / 100;//duas casas decimais.
		JOptionPane.showMessageDialog(null, "Valor convertido: $" + Currency);
	}
	
	public void ConverterRealToEuro(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor / 5.10;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: €" + Currency);
	}
	
	public void ConverterRealToPoundSterling(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor / 5.82;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: £" + Currency);
	}
	
	public void ConverterRealToArg(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor * 28.50;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: ARS$" + Currency);
	}
	
	public void ConverterRealToCh(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor * 181.10;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: CLP$" + Currency);
	}

	public void ConverterDolarToReal(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor * 5.15;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: R$" + Currency);
	}
	
	public void ConverterEuroToReal(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor * 5.10;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: R$" + Currency);
	}
	
	public void ConverterLibraEToReal(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor * 5.82;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: R$" + Currency);
	}
	
	public void ConverterPesoArgToReal(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor / 28.50;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: R$" + Currency);
	}
	
	public void ConverterPesoChToReal(String valorString) {
		double valor = Double.parseDouble(valorString);
		double Currency = valor / 181.10;
		Currency = (double) Math.round(Currency * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Valor convertido: R$" + Currency);
	}
	
	
	
}
