import javax.swing.JOptionPane;

public class TemperatureConverter {

	public void ConverterCelsiusToFahrenheit(String valorString) {
		double Temperature = Double.parseDouble(valorString);
		Temperature = (Temperature * 9/5) + 32;
		Temperature = (double) Math.round(Temperature * 100d) / 100;//duas casas decimais.
		JOptionPane.showMessageDialog(null, "Temperatura convertida: °F" + Temperature);
	}
	
	public void ConverterCelsiusToKelvin(String valorString) {
		double Temperature = Double.parseDouble(valorString);
		Temperature = Temperature + 273.15;
		Temperature = (double) Math.round(Temperature * 100d) / 100;//duas casas decimais.
		JOptionPane.showMessageDialog(null, "Temperatura convertida: K" + Temperature);
	}
	
	public void ConverterFahrenheitToCelsius(String valorString) {
		double Temperature = Double.parseDouble(valorString);
		Temperature = (Temperature - 32) * 5/9;
		Temperature = (double) Math.round(Temperature * 100d) / 100;//duas casas decimais.
		JOptionPane.showMessageDialog(null, "Temperatura convertida: °C" + Temperature);
	}
	
	public void ConverterKelvinToCelsius(String valorString) {
		double Temperature = Double.parseDouble(valorString);
		Temperature = Temperature - 273.15;
		Temperature = (double) Math.round(Temperature * 100d) / 100;//duas casas decimais.
		JOptionPane.showMessageDialog(null, "Temperatura convertida: °C" + Temperature);
	}
	
}
